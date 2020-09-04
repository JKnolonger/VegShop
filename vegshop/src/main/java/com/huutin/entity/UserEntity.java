package com.huutin.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserEntity extends BaseEntity{
	
	@Column(name = "username")
	private String userName;
	
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	@Column(name = "email")
	private String email;
	
	@Column(name = "phone")
	private String phone;

	@Column(name = "password")
	private String password;

	@Column(name = "fullname")
	private String fullName;

	@Column
	private Integer status;


 @ManyToMany(fetch = FetchType.LAZY)
 @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "userid"),
 inverseJoinColumns = @JoinColumn(name = "roleid")) private List<RoleEntity>
 roles = new ArrayList<>();

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

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	
	public List<RoleEntity> getRoles() {
		  return roles;
		  }
	  
	public void setRoles(List<RoleEntity> roles) { 
		  this.roles = roles; 
		  }
	 
}