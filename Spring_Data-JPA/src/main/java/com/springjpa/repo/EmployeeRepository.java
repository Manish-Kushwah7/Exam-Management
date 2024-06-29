package com.springjpa.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.springjpa.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {

//// ====== FindBY method ================  FindBY method    ========  FindBY method========== FindBY method ====
	
	
//    public List <Employee> findBysalaryGreaterThan(Double salary);
//	public List <Employee> findByempidLessThan(Integer salary);
//	public List <Employee> findByempgenderEquals(String salary);
	
	
// Custom Query=================	 Custom Query=================	  Custom Query=================	  Custom Query=================	  Custom Query=================	  Custom Query=================	  

	
	@Query(value = "select * from emp_table3", nativeQuery=true )
	public List< Employee> getallDetaEmployees();
	
	
	@Query("from Employee")/// not table name     *****only entity class*****
public List<Employee> getall();
	
	
	
}
