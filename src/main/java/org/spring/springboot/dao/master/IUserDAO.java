package org.spring.springboot.dao.master;

import java.util.List;

import org.spring.springboot.domain.UserDto;

/**
 * 
 * <Description> <br> 
 *  
 * @author atian <br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2017年11月12日 <br>
 * @see org.spring.springboot.dao.master <br>
 */
public interface IUserDAO {

	/**
	 * 
	 * Description: <br> 
	 *  
	 * @author atian <br>
	 * @param userName <br>
	 * @return <br>
	 */
	UserDto findUserByUserName(String userName);
	
	/**
	 * 
	 * Description: 增加用户 <br> 
	 *  
	 * @author atian <br>
	 * @param userDto <br>
	 * @return <br>
	 */
	Integer addUser(UserDto userDto);
	
	/**
	 * 
	 * Description: 批量增加user<br> 
	 *  
	 * @author atian <br>
	 * @param userList <br>
	 */
	void addUserList(List<UserDto> userList);
}
