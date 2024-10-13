package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("===== TEST 1: INSERT DEPARTMENT =====");
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Department department = new Department(null, "Music");
		departmentDao.insert(department);
		System.out.println("Insert Completed");
		*/
		sc.close();

	}

}
