package org.spring.springboot.domain;

public class CityDto {

	/**
	 * id(主键标识)
	 */
	private Integer id;
	
	/**
	 * 省会标识
	 */
	private Integer provinceId;
	
	/**
	 * 城市名称
	 */
	private String cityName;
	
	/**
	 * 城市描述
	 */
	private String description;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(Integer provinceId) {
		this.provinceId = provinceId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
