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
		cfg.configure("hibernate.cfg.xml"); // ��ȡָ�����������ļ�
		sessionFactory = cfg.buildSessionFactory(); // ��������Session����
	}

	@Test
	public void testSave() throws Exception {
		User user = new User();
		user.setName("����");

		// ����
		Session session = sessionFactory.openSession(); // ��һ���µ�Session
		Transaction tx = session.beginTransaction(); // ��ʼ����

		session.save(user);

		tx.commit(); // �ύ����
		session.close(); // �ر�Session���ͷ���Դ
	}

}
