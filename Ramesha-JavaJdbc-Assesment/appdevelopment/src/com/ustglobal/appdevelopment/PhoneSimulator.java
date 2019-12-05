package com.ustglobal.appdevelopment;

import java.util.List;
import java.util.Scanner;

import com.ustglobal.appdevelopment.dao.PhoneSimulatorDao;
import com.ustglobal.appdevelopment.dto.PhoneSimulatorBean;
import com.ustglobal.appdevelopment.util.PhoneSimlutorApplication;

public class PhoneSimulator {
	public static void main(String[] args) {


		while(true) {
			System.out.println("Press 1 to Show all Contacs");
			System.out.println("Press 2 to Search for Contact(using name)");
			System.out.println("Press 3 to Operate on Contact");
			System.out.println("********************************************");

			Scanner scn = new Scanner(System.in);
			System.out.println("Enter Your Option");
			int option = scn.nextInt();
			switch(option) {
			case 1 :
				PhoneSimulatorDao dao1 = PhoneSimlutorApplication.getPhoneSimulatorDao();
				List<PhoneSimulatorBean>result = dao1.showAllContacts();

				for(PhoneSimulatorBean bean1 : result) {
					System.out.println("Name: "+bean1.getName());
					System.out.println("Number: "+bean1.getNumber());
					System.out.println("Salary: "+bean1.getGroupName());
					System.out.println("------------------------------------");
				}
				break;
			case 2 :
				PhoneSimulatorDao dao2 = PhoneSimlutorApplication.getPhoneSimulatorDao();
				System.out.println("Enter Name");
				String name = scn.next();
				PhoneSimulatorBean bean2 = dao2.searchForContact(name);
				if(bean2!=null) {		
					System.out.println("Name: "+bean2.getName());
					System.out.println("Number: "+bean2.getNumber());
					System.out.println("GroupName: "+bean2.getGroupName());
					System.out.println("------------------------------------");	
				}else {
					System.out.println("No Contact Found for this Name "+name);
				}

				while(true)
				{
					System.out.println("Press 1 to call");
					System.out.println("Press 2 to message");
					System.out.println("Press 3 to go back to main");
					Scanner scanner = new Scanner(System.in);
					int option1 = scanner.nextInt();
					if(option1==1) {
						System.out.println("Calling "+bean2.getName());
						System.out.println("Press 1 to End call");
						Scanner scn1 = new Scanner(System.in);
						int check = scn1.nextInt();
						if(check==1) {
							System.out.println(" Call ended Ending");

						}
					}
					else
						if(option1==2) {
							System.out.println("Enter txt msg");
							String msg = scn.next();
							System.out.println("Messege sent :"+msg);

						}
						else if(option1==3) {
							break;
						}
				}

				break;
			case 3 :
				while(true) {
					PhoneSimulatorDao dao3 = PhoneSimlutorApplication.getPhoneSimulatorDao();
					System.out.println("Press 1 to add Contact");
					System.out.println("Press 2 to delete Contact");
					System.out.println("Press 3 to edit Contact");
					System.out.println("Press 4 go to Main main");
					System.out.println("***********************************************");
					System.out.println("Enter Your Option");
					int opt = scn.nextInt();

					if(opt==1) {
						PhoneSimulatorBean beanadd = new PhoneSimulatorBean();
						int count = dao3.addContact(beanadd);
						System.out.println(count+" contact added");
					}
					else if(opt==2) {
						PhoneSimulatorBean beandelete = new PhoneSimulatorBean();
						int count = dao3.deleteContact(beandelete);
						System.out.println(count+" contact deleted");
					}else if(opt==3) {
						PhoneSimulatorBean beanedit = new PhoneSimulatorBean();
						int count = dao3.editContact(beanedit);
						System.out.println(count+" contact edited");
					}else {
						break;
					}
				}
				break;
			default :
				System.out.println("Invalid Option please Enter Valid Option");
				break;
			}

		}
	}
}