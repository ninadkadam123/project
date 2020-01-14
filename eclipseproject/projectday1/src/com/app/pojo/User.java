package com.app.pojo;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
    private Integer uid;
	private String email,password;
	private UserType userType;
	
	public User()
	{}
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}
    @Column(length = 20,nullable = false)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
    @Column(length = 20,nullable = false)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
    @Enumerated(EnumType.STRING)
    @Column(name = "user_type",length = 20)
	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", email=" + email + ", password=" + password + ", userType=" + userType + "]";
	}
    
	
}
