package com.springjpa;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.springjpa.entity.Employee;
import com.springjpa.entity.Userdetails;
import com.springjpa.repo.EmployeeRepository;
import com.springjpa.repo.UserdetailsRepoistory;


@SpringBootApplication
public class SpringApplication_custom {

	
	public static void main(String[] args) {

		//ConfigurableApplicationContext ctxt=SpringApplication.run(SpringDataJpaApplication.class, args);
		
//		EmployeeRepository  repo  = ctxt.getBean(EmployeeRepository.class);

		//ConfigurableApplicationContext ctxt=SpringApplication.run( SpringApplication_custom.class  ,args);

		//		Employee emp= new Employee();
//		
//		emp.setEmpgender("Male");
//		emp.setEmpid(101);
//		emp.setEmpname("Ram ji");
//		emp.setSalary(650000.00);
//		
//		
//		Employee emp2= new Employee();
//		
//		emp2.setEmpgender("Male");
//		emp2.setEmpid(102);
//		emp2.setEmpname("Laxman ji");
//		emp2.setSalary(750000.00);
//
//
//		//repo.save(emp);
//
//
//repo.saveAll(Arrays.asList(emp,emp2));


		System.out.println(" \n runing spring ============\n");
		
	//// ====== FindBY method ================  FindBY method    ========  FindBY method========== FindBY method ====
	//// ====== FindBY method ================  FindBY method    ========  FindBY method========== FindBY method ====
	//// ====== FindBY method ================  FindBY method    ========  FindBY method========== FindBY method ====
		
		
//		List<Employee> employ=repo.findByempidLessThan(102);
//		 
//		for (Employee employee : employ) {
//			System.out.println(employee);
//		}
//		
		
//		List<Employee> employ2=repo.findByempgenderEquals("Male");
//		 
//		for (Employee employee : employ2) {
//			System.out.println(employee);
//		}
		
//		List<Employee> employ3=repo.findBysalaryGreaterThan(750000.00);
//		 
//		for (Employee employee : employ3) {
//			System.out.println(employee);
//		}
	
	//// ====== FindBY method ================  FindBY method    ========  FindBY method========== FindBY method ====
	//// ====== FindBY method ================  FindBY method    ========  FindBY method========== FindBY method ====
				
		
		
		
//  Custom Query=================	  Custom Query=================	  Custom Query=================	  Custom Query=================	  Custom Query=================	 
		
//	List<Employee> detialsEmployees= repo.getallDetaEmployees();	
//		for (Employee employee : detialsEmployees) {
//			System.out.println(employee);
//		}
//		
		
//		List<Employee> allEmployees= repo.getallDetaEmployees();
//for (Employee employee : allEmployees) {
//	System.out.println(employee);
//}		
		
	//  ===== Custom Query=================	  Custom Query=================	  Custom Query=================	  Custom Query=================	  Custom Query=================	 

		
		
		
//		Integer empid, String empnameS, String empgender, Double salary, Long accNumber)
//	
//		Account account= new Account(  101 ,"Ram ji" , " Male" , 35000.00 ,1000001 );
//		Account account2= new Account(  102 ,"Shyam ji" , " Male" , 45000.00 ,1000002 );
//		Account account3= new Account(  103 ,"Luxman ji" , " Male" , 55000.00 ,10000003 );
//		Account account4= new Account(  104 ,"Ganesh ji" , " Male" , 65000.00 ,10000004 );
//		Account account5= new Account(  105 ,"Krishna ji" , " Male" , 75000.00 ,10000005 );
//		Account account6= new Account(  106 ,"Mahesh ji" , " Male" , 85000.00 ,100000006 );
//		
//	//	repo.saveAll();
//		repoJPA.saveAll(Arrays.asList(account,account2,account3,account4,account5,account6));

//============ PAGING AND SORTING   ============ PAGING AND SORTING  ============ PAGING AND SORTING  ============ PAGING AND SORTING   ============ PAGING AND SORTING  ============ PAGING AND SORTING  ============ PAGING AND SORTING		
//                             ============ PAGING AND SORTING============ PAGING AND SORTING============ PAGING AND SORTING
		
		
	}
		
}



