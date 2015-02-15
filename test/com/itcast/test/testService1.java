package com.itcast.test;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("testService")
public class testService1 {
  @Resource
	private SessionFactory sessionFactory;
  @Transactional
  public void saveTwoUsers()
  {
	       Session session = sessionFactory.getCurrentSession();
	       session.save(new User());
	      // int a=1/0;
	       session.save(new User());
  }  
}
