package com.liferay.tutorial.search;

import javax.portlet.PortletRequest;

import com.liferay.portal.kernel.util.ParamUtil;

//chúng ta sẽ thấy StudentSearchTerms không có bất kỳ mở rộng
//nào so với StudentDisplayTerms. Tuy nhiên, ở các form tìm 
//kiếm phức tạp, chẳng hạn tìm kiếm theo ngày/tháng/năm thì 
//dữ liệu chuyển xuống chỉ là các con số, ta phải tổng hợp lại 
//thành kiểu Date thì lúc này mới có nhiều khác biệt giữa hai lớp này
public class StudentSearchTerms extends StudentDisplayTerms {
	public StudentSearchTerms(PortletRequest portletRequest) {
		super(portletRequest);

		code = ParamUtil.getString(portletRequest, "code");
		name = ParamUtil.getString(portletRequest, "name");
		gender = ParamUtil.getInteger(portletRequest, "gender");
	}
}
