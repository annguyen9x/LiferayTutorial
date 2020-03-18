<%@include file="/html/danhmucsach/init.jsp"%>

<%
	String redirect = ParamUtil.getString(request, "redirect");
	LoaiSachSearchContainer searchContainer = (LoaiSachSearchContainer)request.getAttribute("liferay-ui:search:searchContainer");
	LoaiSachDisplayTerms displayTerms = (LoaiSachDisplayTerms)searchContainer.getDisplayTerms();

%>
<aui:row>
	<aui:col span="4">
		<aui:input name="tenLoaiSach" label="Ten Loai Sach" inlineField="true" inlineLabel="left" />
	</aui:col>
</aui:row>
<aui:row>
	<aui:button type="submit" value="Search" icon="icon-search" /> 
</aui:row>
