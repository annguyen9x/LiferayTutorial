package com.liferay.tutorial;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.liferay.tutorial.model.HoaDon;
import com.liferay.tutorial.search.HoaDonDisplayTerms;
import com.liferay.tutorial.search.HoaDonSearchContainer;
import com.liferay.tutorial.search.HoaDonSearchTerms;

//Lớp cung cấp dữ liệu giống DB
public class BanHangUtil {
	private static List<HoaDon> hoaDons = null;
	
	//Lớp khởi tạo dữ liệu cho mảng HoaDon
	private static void initData(){
		Date ngayDat= null;
		Date ngayGiao = null;
		
		//HD1
		try {
			ngayDat = HoaDonDisplayTerms.DATE_FORMAT.parse("22-12-2019");
		} catch (ParseException e) {
			System.out.println("error-ngaydat");
			e.printStackTrace();
		}
		
		try {
			ngayGiao = HoaDonDisplayTerms.DATE_FORMAT.parse("25-12-2019");
		} catch (ParseException e) {
			System.out.println("error-ngaygiao");
			e.printStackTrace();
		}
		
		hoaDons.add(new HoaDon(101, true, 100.5F, ngayDat, ngayGiao, 
				"doi Xac Nhan Don Hang", 201, 301));
		
		//HD2
		try {
			ngayDat = HoaDonDisplayTerms.DATE_FORMAT.parse("01-01-2020");
		} catch (ParseException e) {
			System.out.println("error-ngaydat");
			e.printStackTrace();
		}
		
		try {
			ngayGiao = HoaDonDisplayTerms.DATE_FORMAT.parse("05-01-2020");
		} catch (ParseException e) {
			System.out.println("error-ngaygiao");
			e.printStackTrace();
		}
		
		hoaDons.add(new HoaDon(102, false, 250F, ngayDat, ngayGiao, 
				"doi Xac Nhan Don Hang", 202, 302));
		
		//HD3
		try {
			ngayDat = HoaDonDisplayTerms.DATE_FORMAT.parse("10-01-2020");
		} catch (ParseException e) {
			System.out.println("error-ngaydat");
			e.printStackTrace();
		}
		
		try {
			ngayGiao = HoaDonDisplayTerms.DATE_FORMAT.parse("17-01-2020");
		} catch (ParseException e) {
			System.out.println("error-ngaygiao");
			e.printStackTrace();
		}
		
		hoaDons.add(new HoaDon(103, true, 500.7F, ngayDat, ngayGiao, 
				"doi Xac Nhan Don Hang", 203, 303));
	}
	
	private static List<HoaDon> getHoaDons(HoaDonSearchContainer hoaDonSearchContainer){
		//Khởi tạo dữ liệu cho mảng (Demo loading dữ liệu từ database)
		initData();
		
		HoaDonSearchTerms hoaDonSearchTerms = (HoaDonSearchTerms) hoaDonSearchContainer.getSearchTerms();
		List<HoaDon> results = new ArrayList<HoaDon>();
		
		//Tìm kiếm theo điều kiện có cùng maHD, tinhTrangDH (hoặc chuỗi con trong chuỗi)
		//Dùng: contains tìm kiếm chuỗi kí tự trong chuỗi
		for(HoaDon hd : hoaDons){
			boolean isMatched = true;
			
			if( !hd.getSoHD().contains(hoaDonSearchTerms.getSoHD())){
				isMatched = false;
			}
		}
		
	}
}
