
package com.annguyen.kyanhbooks.search;

import javax.portlet.PortletRequest;

import com.liferay.portal.kernel.util.ParamUtil;

public class LoaiSachSearchTerms extends LoaiSachDisplayTerms {

	public LoaiSachSearchTerms(PortletRequest portletRequest) {
		super(portletRequest);

		tenLoaiSach = ParamUtil.getString(portletRequest, "tenLoaiSach");
	}

}
