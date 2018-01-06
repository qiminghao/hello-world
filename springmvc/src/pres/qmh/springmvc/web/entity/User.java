package pres.qmh.springmvc.web.entity;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 3678970696489874937L;

	private Long id;
	private String userName;
	private String password;

	public User() {

	}

	public User(User user) {
		this.id = user.getId();
		this.userName = user.getUserName();
		this.password = user.getPassword();
	}

	public User(Long id, String userName, String password) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + "]";
	}

}
