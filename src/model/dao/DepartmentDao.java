package model.dao;

import java.util.ArrayList;
import java.util.List;

import model.entites.Department;

public interface DepartmentDao {

	void insert(Department dep);
	void update(Department dep);	
	void deleteById(Integer Id);
	Department findByld(Integer Id);
	List<Department> fildAll();
}

