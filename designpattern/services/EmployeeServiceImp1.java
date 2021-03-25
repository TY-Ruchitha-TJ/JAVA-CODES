package com.tyss.designpattern.services;

import java.util.List;

import com.tyss.designpattern.dao.EmployeeDAO;
import com.tyss.designpattern.dto.EmployeePrimaryInfo;

public interface EmployeeServiceImp1 extends EmployeeDAO{
	 public EmployeePrimaryInfo getDetailsByEmployeeID(int id);
	 public boolean deleteByEmployeeId(int eid);
	 public boolean createEmployeeDetail(EmployeePrimaryInfo info);
	 public boolean updateEmployeeDetail(EmployeePrimaryInfo info);
	 
	 public List<EmployeePrimaryInfo> getAllDetailEmployee();


}
