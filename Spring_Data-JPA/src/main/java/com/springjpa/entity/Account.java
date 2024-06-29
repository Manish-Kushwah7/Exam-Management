package com.springjpa.entity;

import java.util.Date;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Table(name="aa")
@Data
@Entity
public class Account {

private String username;
@GeneratedValue( strategy = GenerationType.IDENTITY    )
private Integer accountnumber;

//@Column( name = "unqiue_Id")
//@GenericGenerator(name = "uniqueid_gen" ,strategy = "com.springjpa.entity.UniqueidGenerator" )
//@GeneratedValue(generator ="uniqueid_gen" ,strategy = GenerationType.IDENTITY  )
@Id
@GeneratedValue(generator ="a")
@GenericGenerator(name="a" ,type = UniqueidGenerator.class)
private String unqiueId;

@Temporal(TemporalType.DATE)
private Date   opendate;


@Override
public String toString() {
	return "Account [username=" + username + ", accountnumber=" + accountnumber + ", unqiueId=" + unqiueId + "]";
}

public String getUnqiueId() {
	return unqiueId;
}

public void setUnqiueId(String unqiueId) {
	this.unqiueId = unqiueId;
}

public Date getOpendate() {
	return opendate;
}

public void setOpendate(Date opendate) {
	this.opendate = opendate;
}

public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public Integer getAccountnumber() {
	return accountnumber;
}
public void setAccountnumber(Integer accountnumber) {
	this.accountnumber = accountnumber;
}
	
	
}
