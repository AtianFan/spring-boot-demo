package org.spring.springboot.controller;

import org.spring.springboot.domain.CityDto;
import org.spring.springboot.domain.UserDto;
import org.spring.springboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * <Description> <br> 
 *  
 * @author atian <br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2017年11月12日 <br>
 * @see org.spring.springboot.controller <br>
 */
@RestController
public class UserRestController {

	@Autowired
	IUserService userService;

	@RequestMapping(value="/api/queryUser", method=RequestMethod.GET)
	public UserDto findUserByUserName(@RequestParam(value="userName", required = true) String userName) {
		UserDto userDto = userService.findUserByUserName(userName);
		return userDto;
	}
	
	@RequestMapping(value="/api/addUser", method=RequestMethod.GET)
	public int addUser(@RequestParam(value="userName") String userName) {
		
		UserDto userDto = new UserDto();
		userDto = new UserDto();
		userDto.setUserName(userName);
		userDto.setDescription("comes from Canada.");
		
		CityDto cityDto = new CityDto();
		cityDto.setProvinceId(2);
		cityDto.setCityName("duolunduo");
		cityDto.setDescription("Canada's capital.");
		userDto.setCityDto(cityDto);
		
		int userId = userService.addUser(userDto);
		
		return userId;
	}
}
