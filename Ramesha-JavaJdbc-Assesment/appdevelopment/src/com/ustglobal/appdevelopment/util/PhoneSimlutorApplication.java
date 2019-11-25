package com.ustglobal.appdevelopment.util;

import com.ustglobal.appdevelopment.dao.PhoneSimulatorDao;
import com.ustglobal.appdevelopment.dao.PhoneSimulatorDaoImpl;

public class PhoneSimlutorApplication {
	private PhoneSimlutorApplication() {

	}
	public static PhoneSimulatorDao getPhoneSimulatorDao() {
		return new PhoneSimulatorDaoImpl();
	}
}
