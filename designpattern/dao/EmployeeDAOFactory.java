package com.tyss.designpattern.dao;

public class EmployeeDAOFactory {
	static String dbInteractionType = "HIBERNATE";
	private  EmployeeDAOFactory() {
		
	}
	public static EmployeeDAO getInstance() {
		EmployeeDAO dao = null;
		if(dbInteractionType.equalsIgnoreCase("JDBC")) {
			System.out.println("create JDBC Object");
			dao = new EmployeeDAOJDBCImp1();
		}else if(dbInteractionType.equalsIgnoreCase("HIBERNATE")){
			System.out.println("create HIBERNATE Object");
		dao = new EmployeeDAOJPAImp();	
		}else {
			System.out.println("create SPRING Object");
			dao = new EmployeeDAOSPRINGJDBDIMPL();
		}
		return dao;
		
	}//end of method

}//end of class
