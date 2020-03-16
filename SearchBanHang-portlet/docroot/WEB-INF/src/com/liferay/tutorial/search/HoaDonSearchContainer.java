package com.liferay.tutorial.search;

import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.tutorial.model.HoaDon;
//HoaDonSearchContainer kế thừa SearchContainer<HoaDon>
//chứa các thông tin: số bản ghi/trang, Thông điệp khi không tìm thấy kết quả,
//tiêu đề của các cột, sắp xếp dữ liệu theo cột
public class HoaDonSearchContainer  extends SearchContainer<HoaDon>{

}
