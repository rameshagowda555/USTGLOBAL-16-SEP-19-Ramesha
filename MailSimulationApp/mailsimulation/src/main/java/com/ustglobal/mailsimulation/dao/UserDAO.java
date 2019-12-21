package com.ustglobal.mailsimulation.dao;

import java.util.List;

import com.ustglobal.mailsimulation.dto.Mail_info;
import com.ustglobal.mailsimulation.dto.User_info;

public interface UserDAO {
	public User_info loginUser(String email,String password);
	public boolean registerUser(User_info user);
	public boolean changePassword(User_info user);
	public List<Mail_info> getAllMail(int from_id);
	public boolean sendMail(Mail_info bean, User_info to,User_info from);
	public boolean deleteMail(Mail_info bean);
	public boolean draftMail(Mail_info bean, User_info to, User_info from);
	public List<Mail_info> deletedMail(Mail_info info);
	public List<Mail_info> sent(Mail_info info);
	public List<Mail_info> draft(Mail_info info);
}
