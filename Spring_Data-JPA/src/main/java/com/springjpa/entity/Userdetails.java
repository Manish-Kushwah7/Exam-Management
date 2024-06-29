package com.springjpa.entity;

import java.sql.Date;
import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.bytecode.internal.bytebuddy.PrivateAccessorException;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name="User_tb2")
@Entity
@Data
public class Userdetails {

	@Id
	@SequenceGenerator( name="id_seq" , initialValue = 1000, allocationSize = 1 )
	@GeneratedValue( strategy = GenerationType.IDENTITY  ,generator = "id_seq"  )
	private Integer userid;
	
	@Id
	@GenericGenerator(name = "uniqueid_gen" ,strategy = "com.springjpa.entity.UniqueidGenerator")
	@GeneratedValue(generator ="uniqueid_gen"  )
	private Integer unqiueId;
	private  String userName;
	private  Double userSalary;
	private String  userGender; 
	private String userdept;
	
	@CreationTimestamp
	@Column(name="joinDate" ,updatable=false)
	private LocalDate joinDate;
	
	@UpdateTimestamp
	@Column( name="lastDate", insertable=false )
	private LocalDate lastDate;
	
	
	
	@Override
	public String toString() {
		return "  \n\n ====>   Userdetails [userid=" + userid + ", userName=" + userName + ", userSalary=" + userSalary
				+ ", userGender=" + userGender + ", userdept=" + userdept + "] \n";
	}


	public Userdetails() {
		// TODO Auto-generated constructor stub
	}
	
	public Integer getUserid() {
		return userid;
	}


	public void setUserid(Integer userid) {
		this.userid = userid;
	}


	public Userdetails(Integer userid, String userName, Double userSalary, String userGender, String userdept) {
		super();
		this.userid = userid;
		this.userName = userName;
		this.userSalary = userSalary;
		this.userGender = userGender;
		this.userdept = userdept;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public Double getUserSalary() {
		return userSalary;
	}


	public void setUserSalary(Double userSalary) {
		this.userSalary = userSalary;
	}


	public String getUserGender() {
		return userGender;
	}


	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}


	public String getUserdept() {
		return userdept;
	}


	public void setUserdept(String userdept) {
		this.userdept = userdept;
	}
	
	
	
	
	
	
	
}
