package com.service.sql;

import java.util.List;

import com.model.sql.UserMaster;

public interface UserMasterService
{
  
	UserMaster saveUser(UserMaster user);
	List<UserMaster> getUser();
}
 