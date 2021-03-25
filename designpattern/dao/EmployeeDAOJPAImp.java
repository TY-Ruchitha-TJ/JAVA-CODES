package com.tyss.designpattern.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jboss.jandex.Main;

import com.tyss.designpattern.dto.EmployeePrimaryInfo;
//import com.tyss.jpawithhibernate1.dto.Person;


public class EmployeeDAOJPAImp implements EmployeeDAO {

	public EmployeePrimaryInfo getDetailsByEmployeeID(int  emp_id) {
	
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");
			EntityManager manager = factory.createEntityManager();
			EmployeePrimaryInfo record= manager.find(EmployeePrimaryInfo.class, emp_id);

			
			return record;
			
			}

	public boolean deleteByEmployeeId(int emp_id) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager manager = null;
		EntityTransaction transaction = null;
		try {
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			String jpql = "delete from EmployeePrimaryInfo e where e.emp_id=:idd";
			transaction.begin();
			Query query = manager.createQuery(jpql);
			query.setParameter("idd", emp_id);
			int record = query.executeUpdate();
			transaction.commit();
			if (record != 0) {
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();

		}
		manager.close();
		return false;
	}
	
	public boolean createEmployeeDetail(EmployeePrimaryInfo info) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager manager = null;
		EntityTransaction transaction = null;
		System.out.println("i m in try block");

		try {
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(info);
			transaction.commit();
			manager.close();
			System.out.println("i m in try block");
			return true;
		} catch (Exception e) {
			System.out.println("i m in catch");
			transaction.rollback();
			e.printStackTrace();
			manager.close();
			return false;
		}
		
	

	}


	public boolean updateEmployeeDetail(EmployeePrimaryInfo info) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager manager = null;
		EntityTransaction transaction = null;

		try {
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();

			String jpql = "update EmployeePrimaryInfo e set  e.name=:ename where e.emp_id=:id";
			transaction.begin();
			Query query = manager.createQuery(jpql);
			query.setParameter("id", info.getEmp_id());
			query.setParameter("ename", info.getName());
			int record = query.executeUpdate();
			transaction.commit();
			if (record != 0) {
				manager.close();

				return true;
			} else {
				manager.close();

				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			manager.close();

			return false;

		}
	}


	public List<EmployeePrimaryInfo> getAllDetailEmployee() {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager manager = factory.createEntityManager();
		String jpql ="select e from EmployeePrimaryInfo e ";
		Query query =manager.createQuery(jpql);
		
		List<EmployeePrimaryInfo> emp = query.getResultList();
		
		return emp;
	}



}


