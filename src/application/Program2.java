package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entites.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		Department dep = departmentDao.findByld(3);
		System.out.println("=== TEST 1: Department findById =====");
		System.out.println(dep);
		
		System.out.println("\n=== TEST 2: Department findAll =====");
		List<Department> list = departmentDao.fildAll();
		for (Department department : list) {
			System.out.println(department);
		}

		System.out.println("\n=== TEST 3: Department insert =====");
		Department newDepartment = new Department(null, "Cars");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		
		System.out.println("\n=== TEST 4: Department update =====");
		dep = departmentDao.findByld(4);
		dep.setName("books/notebooks");
		departmentDao.update(dep);
		System.out.println("Update completed");

		System.out.println("\n=== TEST 5: Department delete =====");
		System.out.print("Enter id for delete test: ");
		int Id = sc.nextInt();
		departmentDao.deleteById(Id);
		System.out.println("Delete completed");
		
		sc.close();
	}

}
