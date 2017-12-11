package org.spring.springboot.service;

import org.spring.springboot.domain.UserDto;

/**
 * 
 * <Description> 用户管理 <br> 
 *  
 * @author atian <br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2017年11月12日 <br>
 * @see org.spring.springboot.service <br>
 */
public interface IUserService {

	/**
	 * 
	 * Description: 根据用户名称查询用户信息 <br> 
	 *  
	 * @author atian <br>
	 * @param userName 用户名 <br>
	 * @return UserDto <br>
	 */
	UserDto findUserByUserName(String userName);
	
	/**
	 * 
	 * Description: 增加用户信息 <br> 
	 *  
	 * @author atian <br>
	 * @param userDto <br>
	 * @return <br>
	 */
	int addUser(UserDto userDto);
	
	/**
	 * 
	 * Description: 批量加入用户 <br> 
	 *  
	 * @author atian <br>
	 * @param userList <br>
	 */
	void addUserList();
}
