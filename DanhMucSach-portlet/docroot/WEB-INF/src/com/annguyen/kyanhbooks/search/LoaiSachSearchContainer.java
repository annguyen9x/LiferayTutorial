/**
 * Copyright 2015 Chi Ngo (chingovan@gmail.com, chingovan.blogspot.com)
 */
package com.annguyen.kyanhbooks.search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;

import com.annguyen.kyanhbooks.model.LoaiSach;
import com.liferay.portal.kernel.dao.search.SearchContainer;

public class LoaiSachSearchContainer extends SearchContainer<LoaiSach> {

	static List<String> headerNames = new ArrayList<String>();
	static Map<String, String> orderableHeaders = new HashMap<String, String>();

	static {
		headerNames.add("Danh Muc Sach");
	}

	public static final String EMPTY_RESULTS_MESSAGE = "Khong tim thay ket qua nao";

	public LoaiSachSearchContainer(PortletRequest portletRequest,
			PortletURL iteratorURL) {

		super(portletRequest, new LoaiSachDisplayTerms(portletRequest),
				new LoaiSachSearchTerms(portletRequest), DEFAULT_CUR_PARAM,
				DEFAULT_DELTA, iteratorURL, headerNames, EMPTY_RESULTS_MESSAGE);

		LoaiSachDisplayTerms displayTerms = (LoaiSachDisplayTerms) getDisplayTerms();

		iteratorURL.setParameter("tenLoaiSach", displayTerms.getTenLoaiSach());
	}

}
