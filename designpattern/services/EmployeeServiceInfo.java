package com.tyss.designpattern.services;

import java.util.List;

import com.tyss.designpattern.dao.EmployeeDAO;
import com.tyss.designpattern.dao.EmployeeDAOFactory;
import com.tyss.designpattern.dto.EmployeePrimaryInfo;

public class EmployeeServiceInfo implements EmployeeServiceImp1 {
	EmployeeDAO dao = EmployeeDAOFactory.getInstance();

	public EmployeePrimaryInfo getDetailsByEmployeeID(int id) {
		if (id != 0)
			return dao.getDetailsByEmployeeID(id);
		else
			return null;
	}

	public boolean deleteByEmployeeId(int eid) {
		
		return dao.deleteByEmployeeId(eid);
	}

	public boolean createEmployeeDetail(EmployeePrimaryInfo info) {
		// TODO Auto-generated method stub
		return dao.createEmployeeDetail(info);
	}

	public boolean updateEmployeeDetail(EmployeePrimaryInfo info) {
		// TODO Auto-generated method stub
		return dao.updateEmployeeDetail(info);
	}

	public List<EmployeePrimaryInfo> getAllDetailEmployee() {
		// TODO Auto-generated method stub
		return dao.getAllDetailEmployee();
	}

//	@Override
//	public EmployeePrimaryInfo getDetailsByEmployeeID(int id) {
//		if(id != 0) {
//			return dao.getDetailsByEmployeeID(id);
//		}
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public boolean deleteByEmployeeId(int eid) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean createEmployeeDetail(EmployeePrimaryInfo info) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean updateEmployeeDetail(EmployeePrimaryInfo info) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public List<EmployeePrimaryInfo> getAllDetailEmployee() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
