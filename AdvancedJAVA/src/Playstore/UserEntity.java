package Playstore;

public class UserEntity {
	private int id;
	private String name;
	private String username;
	private String password;
	private String user_type;

	public UserEntity(int id, String name, String username, String password, String user_type) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.user_type = user_type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUser_type() {
		return user_type;
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password
				+ ", user_type=" + user_type + "]";
	}

}
