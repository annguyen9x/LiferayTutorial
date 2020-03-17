package com.liferay.tutorial.search;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.portlet.PortletRequest;

import com.liferay.portal.kernel.dao.search.DisplayTerms;
import com.liferay.portal.kernel.util.ParamUtil;

//Chứa các tham số phục vụ cho việc lọc dữ liệu (tìm kiếm)
//DisplayTerms sẽ vẫn hiển thị từ khóa khi có kết quả tìm kiếm
public class HoaDonDisplayTerms extends DisplayTerms {//Terms:Điều kiện/chỉ định 
	public static DateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
	
	protected int soHD;
	protected boolean thayDoiNN;
	protected float tongTien;
	protected Date ngayDat;
	protected Date ngayGiao;
	protected String tinhTrangDH;
	protected int maNVGiao;
	protected int maKH;
	
	public HoaDonDisplayTerms(PortletRequest portletRequest) {
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

	public static DateFormat getDATE_FORMAT() {
		return DATE_FORMAT;
	}

	public static void setDATE_FORMAT(DateFormat dATE_FORMAT) {
		DATE_FORMAT = dATE_FORMAT;
	}

	public int getSoHD() {
		return soHD;
	}

	public void setSoHD(int soHD) {
		this.soHD = soHD;
	}

	public boolean isThayDoiNN() {
		return thayDoiNN;
	}

	public void setThayDoiNN(boolean thayDoiNN) {
		this.thayDoiNN = thayDoiNN;
	}

	public float getTongTien() {
		return tongTien;
	}

	public void setTongTien(float tongTien) {
		this.tongTien = tongTien;
	}

	public Date getNgayDat() {
		return ngayDat;
	}

	public void setNgayDat(Date ngayDat) {
		this.ngayDat = ngayDat;
	}

	public Date getNgayGiao() {
		return ngayGiao;
	}

	public void setNgayGiao(Date ngayGiao) {
		this.ngayGiao = ngayGiao;
	}

	public String getTinhTrangDH() {
		return tinhTrangDH;
	}

	public void setTinhTrangDH(String tinhTrangDH) {
		this.tinhTrangDH = tinhTrangDH;
	}

	public int getMaNVGiao() {
		return maNVGiao;
	}

	public void setMaNVGiao(int maNVGiao) {
		this.maNVGiao = maNVGiao;
	}

	public int getMaKH() {
		return maKH;
	}

	public void setMaKH(int maKH) {
		this.maKH = maKH;
	}
	
}
