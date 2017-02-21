package com.dao.sql;

import java.io.Serializable;
import java.util.List;
 
import com.model.sql.UserMaster;



public interface UserMasterDao extends Serializable
{
	UserMaster  authenticateUser(UserMaster user);
	UserMaster validateUser(String password,String email);
	UserMaster saveUser(UserMaster user);
    List<UserMaster> getUser();
}
