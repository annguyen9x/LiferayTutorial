package com.liferay.tutorial.search;

import javax.portlet.PortletRequest;

import com.liferay.portal.kernel.dao.search.DisplayTerms;
import com.liferay.portal.kernel.util.ParamUtil;

//chứa các tham số phục vụ cho việc lọc dữ liệu

//DisplayTerms Sẽ vẫn hiển thị từ khóa sau khi có kết quả tìm kiếm
public class StudentDisplayTerms extends DisplayTerms {
	protected String code;
	protected String name;
	protected int gender;
	
	public StudentDisplayTerms(PortletRequest portletRequest) {
		super(portletRequest);

		code = ParamUtil.getString(portletRequest, "code");
		name = ParamUtil.getString(portletRequest, "name");
		gender = ParamUtil.getInteger(portletRequest, "gender");
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getGender() {
		return gender;
	}
	
	public void setGender(int gender) {
		this.gender = gender;
	}
}
