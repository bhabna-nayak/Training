
public class User 
{
	private int id;
	private String name1;
	private String name2;
	private String password;
	
	public String toString() {
		return "Product [id=" + id + ", name1=" + name1 + ", name2=" + name2 + ", password=" + password + "]";
	}
	public User() {
		super();
	}
	public User(int id, String name1,String name2, String password) {
		super();
		this.id = id;
		this.name1 = name1;
		this.name2 = name2;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	public String getName2() {
		return name2;
	}
	public void setName2(String name2) {
		this.name2 = name2;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
