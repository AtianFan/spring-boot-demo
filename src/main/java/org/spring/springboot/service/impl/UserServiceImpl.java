package org.spring.springboot.service.impl;

import org.spring.springboot.dao.cluster.ICityDAO;
import org.spring.springboot.dao.master.IUserDAO;
import org.spring.springboot.domain.CityDto;
import org.spring.springboot.domain.UserDto;
import org.spring.springboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * <Description> <br> 
 *  
 * @author atian <br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2017年11月12日 <br>
 * @see org.spring.springboot.service.impl <br>
 */
@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	IUserDAO userDAO;
	
	@Autowired
	ICityDAO cityDAO;

	@Override
	public UserDto findUserByUserName(String userName) {
		
		UserDto userDto = userDAO.findUserByUserName(userName);
		
		CityDto cityDto = cityDAO.findCityById(userDto.getCityId());
		userDto.setCityDto(cityDto);
		
		return userDto;
	}

	@Override
	public int addUser(UserDto userDto) {
		CityDto cityDto = userDto.getCityDto();
		cityDAO.addCity(cityDto);
		userDto.setCityId(cityDto.getId());
		
		userDAO.addUser(userDto);
		return userDto.getUserId().intValue();
	}
}
