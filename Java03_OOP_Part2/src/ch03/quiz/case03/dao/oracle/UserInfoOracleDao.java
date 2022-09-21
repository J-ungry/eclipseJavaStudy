package ch03.quiz.case03.dao.oracle;

import ch03.quiz.case03.dao.UserInfoDao;
import ch03.quiz.case03.domain.UserInfo;

public class UserInfoOracleDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("insert into Oracle DB userId = "+userInfo.getUserId());		
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("update Oracle DB userPw = "+userInfo.getUserPw());			
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("delete from Oracle DB userName = "+userInfo.getUserName());			
	}

}
