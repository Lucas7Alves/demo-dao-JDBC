package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		/*
		System.out.println("===== TEST 1: INSERT DEPARTMENT =====");
		Department department = new Department(null, "Music");
		departmentDao.insert(department);
		System.out.println("Insert Completed");
		 */

		System.out.println("===== TEST 2: FIND BY ID DEPARTMENT =====");
		Department dep = departmentDao.findById(5);
		System.out.println(dep);
		
		
		sc.close();

	}

}
