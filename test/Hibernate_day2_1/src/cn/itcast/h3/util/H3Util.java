package cn.itcast.h3.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class H3Util {
	private static SessionFactory sf = new Configuration().configure().buildSessionFactory();
	public static Session getSession(){
		return sf.openSession();
	}
}
