package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		Department department = new Department(null, "Music");

		System.out.println("===== TEST 1: INSERT DEPARTMENT =====");
		departmentDao.insert(department);
		System.out.println("Insert Completed");


		System.out.println("===== TEST 2: FIND BY ID DEPARTMENT =====");
		Department dep = departmentDao.findById(5);
		System.out.println(dep);

		System.out.println("===== TEST 3: UPDATE DEPARTMENT =====");
		dep.setName("Toys");
		departmentDao.update(dep);
		System.out.println("Update Completed");
		sc.close();

		System.out.println("===== TEST 4: DELETE DEPARTMENT =====");
		departmentDao.deleteById(3);
		System.out.println("Delete completed");

		System.out.println("===== TEST 5: LIST DEPARTMENT =====");
		List<Department> list = departmentDao.findAll();
		for (Department dp : list) {
			System.out.println(dp);
		}
	}

}
