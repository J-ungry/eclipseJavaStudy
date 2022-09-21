package ch03.quiz.case03.dao;

import ch03.quiz.case03.domain.UserInfo;

public interface UserInfoDao {

	void insertUserInfo(UserInfo userInfo);
	void updateUserInfo(UserInfo userInfo);
	void deleteUserInfo(UserInfo userInfo);
}
