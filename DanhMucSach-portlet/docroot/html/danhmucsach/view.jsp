<%@include file="/html/danhmucsach/init.jsp"%>

<%
	PortletURL portletURL = renderResponse.createRenderURL();
	
	String portletURLString = portletURL.toString();
	LoaiSachSearchContainer loaiSachSearchContainer = new LoaiSachSearchContainer(renderRequest, portletURL);
	LoaiSachDisplayTerms displayTerms = (LoaiSachDisplayTerms)loaiSachSearchContainer.getDisplayTerms();
%>

<aui:form action="<%= portletURLString %>" method="post" name="fm">
	<liferay-ui:search-container searchContainer="<%=loaiSachSearchContainer %>" >
		<liferay-ui:search-form page="/html/danhmucsach/search.jsp" servletContext="<%= application %>" />
		<liferay-ui:search-container-results
			results="<%= LoaiSachLocalServiceUtil.getLoaiSachs(searchContainer.getStart(), searchContainer.getEnd())%>"
			total="<%= LoaiSachLocalServiceUtil.getLoaiSachsCount()%>"
		/>
	
		<liferay-ui:search-container-row className="com.annguyen.kyanhbooks.model.LoaiSach"
			modelVar="LoaiSach"	>
			<liferay-ui:search-container-column-text property="tenLoaiSach" />
	
		</liferay-ui:search-container-row>
	
		<liferay-ui:search-iterator />
	</liferay-ui:search-container>
</aui:form>