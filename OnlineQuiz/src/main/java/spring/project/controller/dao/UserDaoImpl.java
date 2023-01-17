package spring.project.controller.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import spring.project.model.User;

@Component
public class UserDaoImpl {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void insert(User user) {
		this.hibernateTemplate.saveOrUpdate(user);
	}
	
	public List<User> getAllUser(){
		return this.hibernateTemplate.loadAll(User.class);
	}

}
