package com.dong.service.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.dayatang.utils.Page;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dong.application.dto.BlogDTO;
import com.dong.application.dto.BlogTypeDTO;
import com.dong.domain.Blog;
import com.dong.service.BlogApplication;

@Service("blogApplication")
@Transactional
public class BlogApplicationImpl extends BaseApplicationImpl implements BlogApplication {
	
	private static final Logger log = LoggerFactory.getLogger(BlogApplicationImpl.class);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public BlogDTO get(Long pk) {
		Blog blog = Blog.get(Blog.class, pk);
		BlogDTO blogDTO = new BlogDTO();
		try {
			BeanUtils.copyProperties(blogDTO, blog);	
		} catch(Exception e) {
			e.printStackTrace();
		}
		blogDTO.setId(blog.getId());
		return blogDTO;
	}

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<BlogDTO> findAll() {
		List<BlogDTO> list = new ArrayList<BlogDTO>();
		List<Blog> all = Blog.findAll(Blog.class);
		for (Blog blog : all) {
			BlogDTO blogDTO = new BlogDTO();
			try {
				BeanUtils.copyProperties(blogDTO, blog);	
			} catch(Exception e) {
				e.printStackTrace();
			}
			list.add(blogDTO);
		}
		return list;
	}

	public BlogDTO save(BlogDTO t) {
		Blog blog = new Blog();
		try {
			BeanUtils.copyProperties(blog, t);
		} catch(Exception e) {
			e.printStackTrace();
		}
		blog.save();
		t.setId(blog.getId());
		return t;
	}

	public boolean update(BlogDTO t) {
		Blog blog = Blog.get(Blog.class, t.getId());
		boolean isSuccess;
		try {
			BeanUtils.copyProperties(blog, t);
			isSuccess = true;
		} catch(Exception e) {
			e.printStackTrace();
			isSuccess = false;
		}
		return isSuccess;
	}

	public void remove(Long pk) {
		removes(new Long[]{pk});
	}

	public void removes(Long[] pks) {
		for (int i = 0; i < pks.length; i++) {
			Blog blog = Blog.load(Blog.class, pks[i]);
			blog.remove();
		}
	}

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Page<BlogDTO> pageQuery(BlogDTO dto, int currentPage, int pageSize) {
		List<BlogDTO> list = new ArrayList<BlogDTO>();
		StringBuilder jpql = new StringBuilder("select _blog from Blog _blog");
		if (dto.getBlogType() != null) {
			jpql.append(" where _blog.blogType.id = ").append(dto.getBlogType().getId());
		}
		jpql.append(" order by _blog.releaseDate desc");
/*		ChannelQuery<?> query = this.getQueryChannelService().createJpqlQuery(jpql.toString());
		if (dto.getBlogType() != null) {
			query.addParameter("id", dto.getBlogType().getId());
		}*/
		@SuppressWarnings("unchecked")
		Page<Blog> pages = this.getQueryChannelService().createJpqlQuery(jpql.toString()).setPage(currentPage, pageSize).pagedList();
		List<Blog> blogs = pages.getData();
		log.info(pages.getData().size()+"========>"+jpql.toString()+"=============>"+"currentPage=========>"+currentPage+"pageSize=====>"+pageSize);
		for (Blog blog : blogs) {
			BlogDTO blogDTO = new BlogDTO();
			try {
				BeanUtils.copyProperties(blogDTO, blog);
				BlogTypeDTO typeDTO = new BlogTypeDTO();
				BeanUtils.copyProperties(typeDTO, blog.getBlogType());
				blogDTO.setBlogTypeDTO(typeDTO);
			} catch(Exception e) {
				e.printStackTrace();
			}
			list.add(blogDTO);
		}
		return new Page<BlogDTO>(pages.getStart(), pages.getResultCount(), pageSize, list);
	}

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Page<BlogDTO> pageQuery(Map<String, Object> map, int currentPage, int pageSize) {
		List<BlogDTO> list = new ArrayList<BlogDTO>();
		StringBuilder jpql = new StringBuilder("select _blog from Blog _blog where 1=1");
		if (map.get("orderType") != null) {
			if (map.get("orderType").toString().equals("clickHit")) {
				jpql.append(" order by _blog.clickHit desc");
			} else if (map.get("orderType").toString().equals("releaseDate")) {
				jpql.append(" order by _blog.releaseDate desc");
			}
		}
		@SuppressWarnings("unchecked")
		Page<Blog> pages = this.getQueryChannelService().createJpqlQuery(jpql.toString()).setPage(currentPage, pageSize).pagedList();
		for (Blog blog : pages.getData()) {
			BlogDTO blogDTO = new BlogDTO();
			try {
				BeanUtils.copyProperties(blogDTO, blog);	
			} catch(Exception e) {
				e.printStackTrace();
			}
			list.add(blogDTO);
		}
		return new Page<BlogDTO>(pages.getStart(), pages.getResultCount(), pageSize, list);
	}

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public BigInteger getTotal(Map<String, Object> params) {
		String sql = "SELECT COUNT(*) FROM t_blog";
		if (params.containsKey("typeId")) { //根据博客类型查询总数
			sql = sql + " WHERE typeId="+params.get("typeId");
		} else if (params.containsKey("title")) {
			sql = sql + " WHERE title LIKE '" + params.get("title") +"'"; //根据关键字查询总数
		} else if (params.containsKey("releaseDateStr")) {
			sql = sql + " WHERE DATE_FORMAT(releaseDate, '%Y年%m月')=" + params.get("releaseDateStr"); //根据日期查询总数
		}
		return (BigInteger) this.getQueryChannelService().createSqlQuery(sql).list().get(0);
	}

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public BlogDTO getLastBlog(Long id) {
		String jpql = "select _blog.id, _blog.title from Blog _blog where _blog.id < "+id+" order by _blog.id desc";
		Object[] blog =  (Object[]) this.getQueryChannelService().createJpqlQuery(jpql).setPage(0, 1).singleResult();
		BlogDTO dto = new BlogDTO();
		if (blog != null) {
			dto.setId((Long)blog[0]);
			dto.setTitle(blog[1].toString());
		}
		return dto;
	}

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public BlogDTO getNextBlog(Long id) {
		String jpql = "select _blog.id, _blog.title from Blog _blog where _blog.id>"+id+" order by _blog.id asc";
		Object[] blog =  (Object[]) this.getQueryChannelService().createJpqlQuery(jpql).setPage(0, 1).singleResult();
		BlogDTO dto = new BlogDTO();
		if (blog != null) {
			dto.setId((Long)blog[0]);
			dto.setTitle(blog[1].toString());
		}
		return dto;
	}

	public List<BlogDTO> getBlogByTypeId(Long typeId) {
		String jpql = "select _blog from Blog _blog where _blog.blogType.id="+typeId;
		@SuppressWarnings("unchecked")
		List<Blog> list = this.getQueryChannelService().createJpqlQuery(jpql).list();
		List<BlogDTO> dtos = new ArrayList<BlogDTO>();
		for (Blog blog : list) {
			BlogDTO dto = new BlogDTO();
			try {
				BeanUtils.copyProperties(dto, blog);
			} catch(Exception e) {
				e.printStackTrace();
			}
			dtos.add(dto);
		}
		return dtos;
	}
}
