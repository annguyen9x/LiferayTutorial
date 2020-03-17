<%@ include file="/html/formvalidate/init.jsp" %>

<portlet:renderURL var="addStudentURL">
	<portlet:param name="mvcPath" value="/html/formvalidate/edit.jsp"/>
</portlet:renderURL>

<%-- <liferay-ui:icon iconCssClass="plus" message="Add a Student" label="true" url="<%= addStudentURL %>"/> --%>
<liferay-ui:icon iconCssClass="plus" label="true" message="Add a Student" url="<%=addStudentURL %>" />