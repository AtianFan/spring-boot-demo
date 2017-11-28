package org.spring.springboot.domain;

public class UserDto {

	
	/**
	 * 用户标识
	 */
	private Long userId;
	
	/**
	 * 用户名称
	 */
	private String userName;
	
	/**
	 * 城市标识
	 */
	private Integer cityId;
	
	/**
	 * 用户描述
	 */
	private String description;
	
	/**
	 * 居住城市信息
	 */
	private CityDto cityDto;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public CityDto getCityDto() {
		return cityDto;
	}

	public void setCityDto(CityDto cityDto) {
		this.cityDto = cityDto;
	}
}
