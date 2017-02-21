package com.service.sql;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.sql.UserMasterDao;
import com.model.sql.UserMaster;

   
@Service
@Transactional
public class UserMasterServiceImpl implements UserMasterService{
	final static Logger logger = Logger.getLogger(UserMasterServiceImpl.class);
	
	@Autowired
	private UserMasterDao userDao;

	

	@Override
	public UserMaster saveUser(UserMaster user) {
		logger.info("inside save service method:::::");
		return userDao.saveUser(user);
	}

	

	@Override
	public List<UserMaster> getUser() {
		// TODO Auto-generated method stub
		return userDao.getUser();
	}




	

	
}
