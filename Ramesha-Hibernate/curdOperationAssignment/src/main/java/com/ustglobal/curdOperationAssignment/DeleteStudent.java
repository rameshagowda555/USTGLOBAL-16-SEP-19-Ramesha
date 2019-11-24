package com.ustglobal.curdOperationAssignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.curdOperationAssignment.dto.Student;

public class DeleteStudent {
	public static void main(String[] args) {

		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("student");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			Student stu = entityManager.find(Student.class, 2);
			entityManager.remove(stu);
			System.out.println("Student data Deleted Successfully");
			entityTransaction.commit();

		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}//end of try and catch block
	}//end of main()
}//end of DeleteStudnet
