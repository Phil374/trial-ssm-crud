package cn.itphil.bean;

public class Employee {
    private Integer id;

    private Integer age;

    private String username;

    private String sax;

    private String address;

    public Employee(Integer id, Integer age, String username, String sax, String address) {
		super();
		this.id = id;
		this.age = age;
		this.username = username;
		this.sax = sax;
		this.address = address;
	}

	public Employee() {
		super();
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getSax() {
        return sax;
    }

    public void setSax(String sax) {
        this.sax = sax == null ? null : sax.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", username=" + username + ", sax=" + sax + ", address="
				+ address + "]";
	}
    
    
}