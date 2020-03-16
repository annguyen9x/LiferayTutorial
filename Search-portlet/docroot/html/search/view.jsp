<%@include file="/html/search/init.jsp"%>

<%
	PortletURL portletURL = renderResponse.createRenderURL();
	String portletURLString = portletURL.toString();
	StudentSearchContainer studentSearchContainer = new StudentSearchContainer(renderRequest, portletURL);	
%>
<aui:form action="<%=portletURLString  %>" method="post" name="fm">
<liferay-ui:search-container searchContainer="<%= studentSearchContainer %>">
	<liferay-ui:search-form page="/html/search/search.jsp" servletContext="<%=application %>" />
	<liferay-ui:search-container-results
		results="<%= DemoStudentUtil.search( studentSearchContainer) %>"
		total="<%= DemoStudentUtil.count(studentSearchContainer) %>"
	/>

	<liferay-ui:search-container-row
		className="com.liferay.tutorial.model.Student"
		modelVar="student"
	>
	
		<liferay-ui:search-container-column-text property="code" />

		<liferay-ui:search-container-column-text property="fullname" />

		<liferay-ui:search-container-column-text name="gender" value='<%= student.isGender() == true ? "Nam" : "Nu" %>' />

		<liferay-ui:search-container-column-text property="address" />

	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />
</liferay-ui:search-container>
</aui:form>