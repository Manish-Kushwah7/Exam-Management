package com.springjpa.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springjpa.entity.Account;
import com.springjpa.entity.Userdetails;

public interface UserdetailsRepoistory extends JpaRepository<Account, String> {

	
	
	
	
}
