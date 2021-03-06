package junit.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.atguigu.orm.bean.Student;
import com.atguigu.orm.bean.Teacher;

public class HibernateTest {
	
	@Test
	public void test02() {
		//实验2.测试懒加载查询
		Student student = (Student) session.get(Student.class, 1);
		System.out.println("=================================");
		Set<Teacher> teacherSet = student.getTeacherSet();
		System.out.println("size="+teacherSet.size());
	}
	
	@Test
	public void test01() {
		//实验1.测试保存操作看生成的SQL和保存的先后顺序是否有关
		//1.创建对象
		Teacher t01 = new Teacher(null, "t04");
		Teacher t02 = new Teacher(null, "t05");
		Teacher t03 = new Teacher(null, "t06");
		
		Student s01 = new Student(null, "s04");
		Student s02 = new Student(null, "s05");
		Student s03 = new Student(null, "s06");
		
		//2.设定关联关系
		Set<Teacher> teacherSet = new HashSet<Teacher>();
		teacherSet.add(t01);
		teacherSet.add(t02);
		teacherSet.add(t03);
		
		s01.setTeacherSet(teacherSet);
		s02.setTeacherSet(teacherSet);
		s03.setTeacherSet(teacherSet);
		
		//3.保存
		//保存n个Student对象和m个Teacher对象，假设它们都是和对方全部对象有关联，则向中间表插入数据的SQL语句是n*m条
		//与Student和Teacher保存的先后顺序无关
		session.save(s01);
		session.save(s02);
		session.save(s03);
		
		session.save(t01);
		session.save(t02);
		session.save(t03);
	}
	
	private SessionFactory factory;
	private Session session;
	private Transaction transaction;
	
	@Before
	public void init() {
		Configuration configuration = new Configuration().configure();
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
		factory = configuration.buildSessionFactory(serviceRegistry);
		session = factory.openSession();
		transaction = session.beginTransaction();
	}
	
	@After
	public void destroy() {
		transaction.commit();
		session.close();
		factory.close();
	}

	@Test
	public void createTable() {}

}
