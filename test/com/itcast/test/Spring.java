package com.itcast.test;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Spring {
private ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
@Test
public void testBean()throws Exception
{
	   Stru struAction =(Stru) ac.getBean("stru");
	   System.out.println(struAction);
}
@Test
public void testSessionFactory() throws Exception {
	         SessionFactory sesFactory=(SessionFactory) ac.getBean("sessionFactory");
	     System.out.println(sesFactory);
}
@Test
public void testTransaction() throws Exception
{
	       testService1 testSerivice = (testService1)ac.getBean("testService");
	       testSerivice.saveTwoUsers();
}
}