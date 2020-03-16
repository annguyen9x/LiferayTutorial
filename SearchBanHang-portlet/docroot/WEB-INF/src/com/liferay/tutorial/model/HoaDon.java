package com.liferay.tutorial.model;

import java.util.Date;

public class HoaDon {
	private int soHD;
	private boolean thayDoiNN;
	private float tongTien;
	private Date ngayDat;
	private Date ngayGiao;
	private String tinhTrangDH;
	private int maNVGiao;
	private int maKH;

	public HoaDon() {
		super();
	}

	public HoaDon(int soHD, boolean thayDoiNN, float tongTien, Date ngayDat,
			Date ngayGiao, String tinhTrangDH, int maNVGiao, int maKH) {
		super();
		this.soHD = soHD;
		this.thayDoiNN = thayDoiNN;
		this.tongTien = tongTien;
		this.ngayDat = ngayDat;
		this.ngayGiao = ngayGiao;
		this.tinhTrangDH = tinhTrangDH;
		this.maNVGiao = maNVGiao;
		this.maKH = maKH;
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
