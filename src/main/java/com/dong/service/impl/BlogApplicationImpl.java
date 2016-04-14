package com.dong.service.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.dayatang.querychannel.ChannelQuery;
import org.dayatang.utils.Page;
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

	public void update(BlogDTO t) {
		Blog blog = Blog.get(Blog.class, t.getId());
		try {
			BeanUtils.copyProperties(blog, t);
		} catch(Exception e) {
			e.printStackTrace();
		}
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
			jpql.append(" join _Blog.blogType _type where _type.id = :id");
		}
		jpql.append(" order by _blog.releaseDate desc");
		ChannelQuery<?> query = this.getQueryChannelService().createJpqlQuery(jpql.toString());
		if (dto.getBlogType() != null) {
			query.addParameter("id", dto.getBlogType().getId());
		}
		@SuppressWarnings("unchecked")
		Page<Blog> pages = this.getQueryChannelService().createJpqlQuery(jpql.toString()).setPage(currentPage, pageSize).pagedList();
		List<Blog> blogs = pages.getData();
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
	public int count(Long typeId) {
		String sql;
		if (typeId != null) {
			sql = "SELECT COUNT(*) FROM t_blog WHERE typeId="+typeId;
		} else {
			sql =  "SELECT COUNT(*) FROM t_blog";
		}
		return ((BigInteger) this.getQueryChannelService().createSqlQuery(sql).list().get(0)).intValue();
	}

}
