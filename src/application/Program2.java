package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entites.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		Department dep = departmentDao.findByld(3);
		System.out.println("=== TEST 1: seller findById =====");
		System.out.println(dep);
		
		
	}

}
