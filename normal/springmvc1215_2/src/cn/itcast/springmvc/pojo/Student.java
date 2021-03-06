package cn.itcast.springmvc.pojo;
import java.util.Date;
public class Student {
	public Student() {}
	public Student(String name) {
		this.name = name;
	}
	private String id;
	private String name;
	private Integer age;
	private Date birthday;
	private String address;
	private Boolean userstate;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", birthday="
				+ birthday + ", address=" + address + "]";
	}
	public Boolean getUserstate() {
		return userstate;
	}
	public void setUserstate(Boolean userstate) {
		this.userstate = userstate;
	}
}