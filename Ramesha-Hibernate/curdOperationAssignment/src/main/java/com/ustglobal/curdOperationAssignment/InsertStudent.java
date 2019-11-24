package com.ustglobal.curdOperationAssignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.curdOperationAssignment.dto.Student;

public class InsertStudent {

	public static void main(String[] args) {

		Student stu = new Student();
		stu.setId(2);
		stu.setName("Mahesha");
		stu.setMarks(89);

		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("student");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(stu);
			entityTransaction.commit();
			System.out.println("Student data Inseted Successfully");

		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}//end of try and catch block
		entityManager.close();
	}//end of main()
}//end of InsertStudent
