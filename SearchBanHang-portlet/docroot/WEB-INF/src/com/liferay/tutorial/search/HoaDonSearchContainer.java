package com.liferay.tutorial.search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;

import com.liferay.portal.kernel.dao.search.DisplayTerms;
import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.tutorial.model.HoaDon;
//HoaDonSearchContainer kế thừa SearchContainer<HoaDon>
//chứa các thông tin: số bản ghi/trang, Thông điệp khi không tìm thấy kết quả,
//tiêu đề của các cột, sắp xếp dữ liệu theo cột

public class HoaDonSearchContainer extends SearchContainer<HoaDon> {
	static List<String> headerNames = new ArrayList<>();
	static Map<String, String> orderableHeader = new HashMap<>();

	static {
		headerNames.add("soHD");
		headerNames.add("thayDoiNN");
		headerNames.add("tongTien");
		headerNames.add("ngayDat");
		headerNames.add("ngayGiao");
		headerNames.add("tinhTrangDH");
		headerNames.add("maNVGiao");
		headerNames.add("maKH");
	}

	public static final String EMPTY_RESULTS_MESSAGE = "Khong tim thay ket qua nao";

	public HoaDonSearchContainer(PortletRequest portletRequest, PortletURL iteratorURL) {
		super(portletRequest, new HoaDonDisplayTerms(portletRequest), 
				new HoaDonSearchTerms(portletRequest), DEFAULT_CUR_PARAM, DEFAULT_DELTA,
				iteratorURL, headerNames, EMPTY_RESULTS_MESSAGE);
				//DEFAULT_CUR_PARAM: tên biến lưu trữ chỉ số bản ghi
				//DEFAULT_DELTA: số lượng bản ghi / trang
				//headerNames: tiêu đề của các cột
				//EMPTY_RESULTS_MESSAGE: thông điệp khi không có kq tìm kiếm.
		
		HoaDonDisplayTerms hoaDonDisplayTerms = (HoaDonDisplayTerms) getDisplayTerms();
		iteratorURL.setParameter("soHD", String.valueOf(hoaDonDisplayTerms.getSoHD()));
		iteratorURL.setParameter("thayDoiNN", String.valueOf(hoaDonDisplayTerms.isThayDoiNN()));
		iteratorURL.setParameter("tongTien", String.valueOf(hoaDonDisplayTerms.getTongTien()));
		iteratorURL.setParameter("ngayDat", String.valueOf(hoaDonDisplayTerms.getNgayDat()));
		iteratorURL.setParameter("ngayGiao", String.valueOf(hoaDonDisplayTerms.getNgayGiao()));
		iteratorURL.setParameter("tinhTrangDH", hoaDonDisplayTerms.getTinhTrangDH());
		iteratorURL.setParameter("maNVGiao", String.valueOf(hoaDonDisplayTerms.getMaNVGiao()));
		iteratorURL.setParameter("maKH", String.valueOf(hoaDonDisplayTerms.getMaKH()));
	}

}
