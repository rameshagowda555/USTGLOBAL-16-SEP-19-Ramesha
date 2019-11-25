package com.ustglobal.appdevelopment.dao;

import java.util.List;

import com.ustglobal.appdevelopment.dto.PhoneSimulatorBean;

public interface PhoneSimulatorDao {
	public List<PhoneSimulatorBean> showAllContacts();
	public PhoneSimulatorBean searchForContact(String name);
	public int addContact(PhoneSimulatorBean bean);
	public int deleteContact(PhoneSimulatorBean bean);
	public int editContact(PhoneSimulatorBean bean);

}
