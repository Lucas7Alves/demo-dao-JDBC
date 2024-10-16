package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("===== TEST 1: FIND BY ID =====");
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		System.out.println("===== TEST 2: FIND BY DEPARTMENT ID =====");
		Department dep = new Department(2, null);
		
		List<Seller> list = sellerDao.findByDepartment(dep);
		
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("===== TEST 3: FIND ALL =====");
		
		list = sellerDao.findAll();
		
		for (Seller obj : list) {
			System.out.println(obj);
		}	
		
		System.out.println("===== TEST 4: INSERT SELLER =====");
		Seller newSeller = new Seller(null, "Lucas", "Lucas@gmail.com", new Date(), 2000.0, dep);
		
		sellerDao.insert(newSeller);
		System.out.println("Inserted seller! With id: " + newSeller.getId());
		
		System.out.println("===== TEST 5: UPDATE SELLER =====");
		seller = sellerDao.findById(1);
		seller.setName("Mathias");
		sellerDao.update(seller);
		System.out.println("Update Completed"); 
		
		System.out.println("===== TEST 6: DELETE SELLER =====");
		System.out.println("Enter with id for delete: ");
		int id = sc.nextInt();
		
		sellerDao.deleteById(id);
		System.out.println("Delete completed");
		sc.close();
	}

}
