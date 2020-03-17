package com.liferay.tutorial.search;

import javax.portlet.PortletRequest;

import com.liferay.portal.kernel.util.ParamUtil;

//Với tìm kiếm chưa phức tạp ta không thấy bất kì sự mở rộng nào của
//HoaDonSearchTerms so với HoaDonDisplayTerms
//Tuy nhiên với form tìm kiếm phức tạp sẽ có khác biệt giữa HoaDonDisplayTerms và HoaDonSerchTerms
//Ví dụ: Tìm kiếm theo ngày, tháng, năm thì dữ liệu chuyển xuống là các con số. 
//Ta phải tổng hợp thành kiểu Date => có sự khác biệt giữa 2 lớp
public class HoaDonSearchTerms extends HoaDonDisplayTerms{//Terms: Điều kiện/chỉ định

	public HoaDonSearchTerms(PortletRequest portletRequest) {
		super(portletRequest);
		
		soHD = ParamUtil.getInteger(portletRequest, "soHD");
		thayDoiNN = ParamUtil.getBoolean(portletRequest, "thayDoiNN");
		tongTien = ParamUtil.getFloat(portletRequest, "tongTien");
		ngayDat = ParamUtil.getDate(portletRequest, "ngayDat", DATE_FORMAT);
		ngayGiao = ParamUtil.getDate(portletRequest, "ngayGiao", DATE_FORMAT);
		tinhTrangDH = ParamUtil.getString(portletRequest, "tinhTrangDH");
		maNVGiao = ParamUtil.getInteger(portletRequest, "maNVGiao");
		maKH = ParamUtil.getInteger(portletRequest, "maKH");
	}

}
