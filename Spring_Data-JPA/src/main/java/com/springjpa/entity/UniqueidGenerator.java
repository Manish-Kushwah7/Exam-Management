package com.springjpa.entity;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.UUID;

import org.hibernate.Session;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class UniqueidGenerator implements IdentifierGenerator{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7255858275402351448L;

	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) {

		
		
		return  "MK_"+UUID.randomUUID().toString();
	}


	
	
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Override
//	public Serializable generate(SharedSessionContractImplementor session, Object object) {
//		String prefix="MK_";
//		String suffix=" ";
//		String query="SELECT MAX(unqiue_id) FROM IDGEN11 ";
//		try {
//		Connection connection =  session.getJdbcConnectionAccess().obtainConnection();
//		PreparedStatement statement= connection.prepareStatement(query);
//		
//		ResultSet rs= statement.executeQuery();
//	if (rs.next()) {
//			int sequence=rs.getInt(1);
//		suffix=String.valueOf(sequence);
//		}
//		
//		} 
//		catch (Exception e) {
//	e.printStackTrace();
//			// TODO: handle exception
//		}
//		// TODO Auto-generated method stub
//		return prefix + "-"+suffix;
//	}

	


	
	

