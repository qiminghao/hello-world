package pres.qmh.springmvc.web;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import pres.qmh.springmvc.web.entity.User;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


class TestHibernate {

	private static SessionFactory sessionFactory;
	private static Session session;
	private static Transaction transaction;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		Configuration configuration = new Configuration().configure();
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		session = sessionFactory.getCurrentSession();
		transaction = session.beginTransaction();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		transaction.commit();
	}

	@Test
	void test() {
		User user = new User();
		user.setPassword("0000000");
		user.setUserName("root");
		session.save(user);
	}

}
