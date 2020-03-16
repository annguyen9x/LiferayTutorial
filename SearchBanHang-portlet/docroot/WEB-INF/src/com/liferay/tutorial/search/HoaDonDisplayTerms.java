package com.liferay.tutorial.search;

import javax.portlet.PortletRequest;

import com.liferay.portal.kernel.dao.search.DisplayTerms;

//Chứa các tham số phục vụ cho việc lọc dữ liệu (tìm kiếm)
//DisplayTerms sẽ vẫn hiển thị từ khóa khi có kết quả tìm kiếm
public class HoaDonDisplayTerms extends DisplayTerms {//Terms:Điều kiện/chỉ định 

	public HoaDonDisplayTerms(PortletRequest portletRequest) {
		super(portletRequest);
	}

}
