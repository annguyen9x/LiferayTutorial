package com.annguyen.kyanhbooks.search;

import javax.portlet.PortletRequest;

import com.liferay.portal.kernel.dao.search.DisplayTerms;
import com.liferay.portal.kernel.util.ParamUtil;

public class LoaiSachDisplayTerms extends DisplayTerms {

	protected String tenLoaiSach;

	public LoaiSachDisplayTerms(PortletRequest portletRequest) {
		super(portletRequest);

		tenLoaiSach = ParamUtil.getString(portletRequest, "tenLoaiSach");
	}

	public String getTenLoaiSach() {
		return tenLoaiSach;
	}

	public void setTenLoaiSach(String tenLoaiSach) {
		this.tenLoaiSach = tenLoaiSach;
	}
	
}
