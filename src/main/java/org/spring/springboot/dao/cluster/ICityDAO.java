package org.spring.springboot.dao.cluster;

import org.spring.springboot.domain.CityDto;

/**
 * 
 * <Description> <br> 
 *  
 * @author atian <br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2017年11月12日 <br>
 * @see org.spring.springboot.dao.cluster <br>
 */
public interface ICityDAO {

	/**
	 * 
	 * Description: 根据城市标识查询城市信息 <br> 
	 *  
	 * @author atian <br>
	 * @param cityId 城市标识 <br>
	 * @return CityDto <br>
	 */
	CityDto findCityById(Integer cityId);
	
	/**
	 * 
	 * Description: 增加城市信息 <br> 
	 *  
	 * @author atian <br>
	 * @param cityDto <br>
	 * @return Integer 城市标识<br>
	 */
	Integer addCity(CityDto cityDto);
}
