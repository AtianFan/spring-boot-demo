package org.spring.springboot.dao.master;

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
}
