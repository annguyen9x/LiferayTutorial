package com.liferay.tutorial.search;

import javax.portlet.PortletRequest;

//Với tìm kiếm chưa phức tạp ta không thấy bất kì sự mở rộng nào của
//HoaDonSearchTerms so với HoaDonDisplayTerms
//Tuy nhiên với form tìm kiếm phức tạp sẽ có khác biệt giữa HoaDonDisplayTerms và HoaDonSerchTerms
//Ví dụ: Tìm kiếm theo ngày, tháng, năm thì dữ liệu chuyển xuống là các con số. 
//Ta phải tổng hợp thành kiểu Date => có sự khác biệt giữa 2 lớp
public class HoaDonSearchTerms extends HoaDonDisplayTerms{//Terms: Điều kiện/chỉ định

	public HoaDonSearchTerms(PortletRequest portletRequest) {
		super(portletRequest);
	}

}
