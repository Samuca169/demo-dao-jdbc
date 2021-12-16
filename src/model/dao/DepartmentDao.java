package model.dao;

import java.util.ArrayList;
import java.util.List;

import model.entites.Department;

public interface DepartmentDao {

	void insert(Department obj);
	void update(Department obj);	
	void deleteById(Integer Id);
	Department findByld(Integer Id);
	List<Department> fildAll();
}

