package model.dao;

import java.util.List;

import model.entites.Department;
import model.entites.Seller;

public interface SellerDao {
	
	void insert(Seller obj);
	void update(Seller obj);	
	void deleteById(Integer Id);
	Seller findByld(Integer Id);
	List<Seller> fildAll();
	List<Seller> findByDepartment(Department department);
}
