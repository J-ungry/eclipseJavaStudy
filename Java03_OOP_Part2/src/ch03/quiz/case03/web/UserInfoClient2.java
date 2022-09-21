package ch03.quiz.case03.web;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import ch03.quiz.case03.dao.UserInfoDao;
import ch03.quiz.case03.dao.mysql.UserInfoMysqlDao;
import ch03.quiz.case03.dao.oracle.UserInfoOracleDao;
import ch03.quiz.case03.domain.UserInfo;

public class UserInfoClient2 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("db.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		
		String dbType = prop.getProperty("DBTYPE");
		
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId("Jungry");
		userInfo.setUserPw("1234");
		userInfo.setUserName("정구리");
		
		UserInfoDao userInfoDao = null;

		if(dbType.equals("MYSQL")) {
			userInfoDao = new UserInfoMysqlDao();
		}else if(dbType.equals("ORACLE")) {
			userInfoDao = new UserInfoOracleDao();
		}else {
			System.out.println("DB support Error !!");
			return;
		}
		
		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);
	}

}
