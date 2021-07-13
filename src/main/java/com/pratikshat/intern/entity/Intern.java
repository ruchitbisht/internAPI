package com.pratikshat.intern.entity;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Intern {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int internId;
	private String internFirstName;
	private String internLastName;
	private long internMobileNo;
	private String internProfile;
	private Timestamp internDOB;
	
	public Intern(String internFirstName,String internLastName,long internMobileNo,String internProfile,Timestamp internDOB ) {
		
		this.internFirstName=internFirstName;
		this.internLastName=internLastName;
		this.internMobileNo=internMobileNo;
		this.internProfile=internProfile;
		this.internDOB=internDOB;
	}
	
	public Intern() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getInternId() {
		return internId;
	}
	public void setInternId(int internId) {
		this.internId=internId;
	}

	public String getInternFirstName() {
		return internFirstName;
	}

	public void setInternFirstName(String internFirstName) {
		this.internFirstName = internFirstName;
	}

	public String getInternLastName() {
		return internLastName;
	}

	public void setInternLastName(String internLastName) {
		this.internLastName = internLastName;
	}

	public long getInternMobileNo() {
		return internMobileNo;
	}

	public void setInternMobileNo(long internMobileNo) {
		this.internMobileNo = internMobileNo;
	}

	public String getInternProfile() {
		return internProfile;
	}

	public void setInternProfile(String internProfile) {
		this.internProfile = internProfile;
	}

	public Timestamp getInternDOB() {
		return internDOB;
	}

	public void setInternDOB(Timestamp internDOB) {
		this.internDOB = internDOB;
	}

	@Override
	public String toString() {
		return "Intern [internId=" + internId + ", internFirstName=" + internFirstName + ", internLastName="
				+ internLastName + ", internMobileNo=" + internMobileNo + ", internProfile=" + internProfile
				+ ", internDOB=" + internDOB + "]";
	}	
	
}
