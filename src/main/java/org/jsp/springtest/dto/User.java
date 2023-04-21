package org.jsp.springtest.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
@Entity

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
   private int id;
   private String name;
   private int age;
   private long phone;
   private String password;
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
   @Override
public String toString() {
	
	return this.getId()+","+this.getName()+","+this.getAge()+","+this.getPhone()+","+this.getPassword();
}
}
