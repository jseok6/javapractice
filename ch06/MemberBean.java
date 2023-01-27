package ch06;

public class MemberBean {
	private String id;
	private int age;
	
	public String getId() {
		return id;//this 쓰는 이유 필드를 구분하기위해
	}
	public void setID(String id) {
		this.id=id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
}
