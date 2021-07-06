package com.cen.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

//To store these data in redis as hash so use annotaion as RedishHash with name
@RedisHash("Student")
public class Student implements Serializable {

	@Id
	private Integer studentId;

	private String name;
	private String address;
	private String email;
	private String gender;
	private long mobileNo;

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Student(Integer studentId, String name, String address, String email, String gender, long mobileNo) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.address = address;
		this.email = email;
		this.gender = gender;
		this.mobileNo = mobileNo;
	}

	public Student() {

	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", address=" + address + ", email=" + email
				+ ", gender=" + gender + ", mobileNo=" + mobileNo + "]";
	}

}
