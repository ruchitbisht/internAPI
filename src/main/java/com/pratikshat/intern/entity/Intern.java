package com.pratikshat.intern.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.springframework.data.annotation.TypeAlias;
import org.springframework.lang.NonNull;

@Entity
public class Intern {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int internId;
	@NonNull
	@Pattern(regexp="^[a-zA-Z]*" )
	private String internFirstName;
	@NonNull
	@NotBlank
	private String internLastName;
	@NonNull
	private long internMobileNo;
	@NonNull
	private String internProfile;
	@NonNull
	@Past
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
