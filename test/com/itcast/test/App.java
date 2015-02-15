package com.itcast.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

public class App {

	private static SessionFactory sessionFactory;

	static {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); // 读取指定的主配置文件
		sessionFactory = cfg.buildSessionFactory(); // 根据生成Session工厂
	}

	@Test
	public void testSave() throws Exception {
		User user = new User();
		user.setName("张三");

		// 保存
		Session session = sessionFactory.openSession(); // 打开一个新的Session
		Transaction tx = session.beginTransaction(); // 开始事务

		session.save(user);

		tx.commit(); // 提交事务
		session.close(); // 关闭Session，释放资源
	}

}
