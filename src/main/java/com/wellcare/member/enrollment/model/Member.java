package com.wellcare.member.enrollment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Member {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String dob;
	private Boolean status;

	public Member() {
		super();
	}

	public Member(Long id, String name, String dob) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.status = status;
	}

	public Member(String name, String dob) {
		super();
		this.name = name;
		this.dob = dob;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "Member{" +
				"id=" + id +
				", name='" + name + '\'' +
				", dob='" + dob + '\'' +
				", status=" + status +
				'}';
	}

}
