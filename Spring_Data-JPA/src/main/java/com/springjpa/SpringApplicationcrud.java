package com.springjpa;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.slf4j.helpers.Reporter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplication.AbandonedRunException;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.springjpa.entity.Account;
import com.springjpa.entity.UniqueidGenerator;
import com.springjpa.entity.Userdetails;
import com.springjpa.repo.EmployeeRepository;
import com.springjpa.repo.UserdetailsRepoistory;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@SpringBootApplication
public class SpringApplicationcrud  {

	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctxt=SpringApplication.run( SpringApplicationcrud.class  ,args);

		
		System.out.println(" running spring boot");

		
	UserdetailsRepoistory repo =	ctxt.getBean(UserdetailsRepoistory.class);

	
	
//		Userdetails user = new Userdetails (101, "Ram ", 1800000.00, "Male", "CEO");
//		Userdetails user2 = new Userdetails(102, " Lux ", 1400000.00, "Male", "sales");
//		Userdetails user3 = new Userdetails(103, "laxman ", 1300000.00, "Male", "sales");
//		Userdetails user4= new Userdetails(104, "Rahul ", 1200000.00, "Male", "HR");
//		Userdetails user5 = new Userdetails(105, "Shyam ", 1100000.00, "Male", "HR");
//		Userdetails user6 = new Userdetails(106, "Radha ", 1000000.00, "feMale", "sales");
//		Userdetails user7 = new Userdetails(107, "Rani ", 900000.00, "feMale", "HR");
//		
// repo.saveAll(Arrays.asList(user,user2,user6,user7));
//	//repo.save(user);	
	
///============================	 Sorting 	========= Sorting ====== Sorting  ============ Sorting =========== Sorting ====== Sorting ========== Sorting ===============
		
 //Sort.by("user_name").ascending;
 
 
 //Sort sort =  Sort.by("userName").descending();  // variable name
 
//	Sort sort =  Sort.by("userName" ,"userSalary").descending();
// 
// List<Userdetails> userdetails=   repo.findAll(sort);
// 
// userdetails.forEach(System.out::println);
 
 
//========== PAGEINATION  ============== PAGEINATION  ========= PAGEINATION  ============= PAGEINATION  ========
// int page1 =1;
// PageRequest page  = PageRequest.of(page1-1, 3); 
//
//
//Page<Userdetails> userdetails=   repo.findAll(page);  /// return page object 
//
//userdetails.forEach(System.out::println);
// 
	
	
// ============== Dyanmic Query Button   ============== Dyanmic Query Button   ============== Dyanmic Query Button   ============== Dyanmic Query Button  
//============== Dyanmic Query Button   ============== Dyanmic Query Button  
	
//Userdetails userdetails= new Userdetails();
//userdetails.setUserGender("Male");
////userdetails.setUserdept("sales");
//userdetails.setUserdept("HR");
//
//Example<Userdetails> example= Example.of(userdetails);
//	
//List<Userdetails> userdetails1=   repo.findAll(example);
//
//userdetails1.forEach(System.out::println);
//	
	
//=====================================================================================================================================

 
// =====  Generators  ==============  Generators  =====  Generators  =====  Generators  =====  Generators  =====  Generators  
 

//		@Id
//		@SequenceGenerator( name="id_seq" , initialValue = 1000, allocationSize = 1 )
//		@GeneratedValue( strategy = GenerationType.IDENTITY  ,generator = "id_seq"  )
//		private Integer userid;

//===========  Custom Generator ===========  Custom Generator ===========  Custom Generator ===========  Custom Generator ===========  Custom Generator  
//	           	===========  Custom Generator ===========  Custom Generator ===========  Custom Generator ===========  Custom Generator 
 
//	Userdetails user7 = new Userdetails(108, "Maharaja ", 1900000.00, "feMale", "Manager" );
////	
//  Userdetails userdetails=  repo.save(user7);
// 
// System.out.println(userdetails);
// 
 
// 
// Account account=new Account();
//	
// account.setAccountnumber(102);
// account.setUsername("Raja");
//account.setOpendate(new Date());
//Account account2 =repo.save(account); 
//
//System.out.println(account2);
//
	
	 Account account=new Account();
		
	 account.setUsername("a");
	account.setOpendate(new Date());
	repo.save(account);	

	ctxt.close();
	}

// =================================== CUSTOM QUERY BY UUID	
///	===================================  MK_764aee2e-318e-4842-b93b-0a795f1ebd0c========================================
	
}
