<%@ include file="/html/formvalidate/init.jsp" %>
<%@ page import="com.liferay.tutorial.model.impl.Validator_StudentImpl"%>
<%@ page import="com.liferay.tutorial.model.Validator_Student"%>

<%
Validator_Student validator_Student = new Validator_StudentImpl();
%>

<portlet:actionURL name="editStudent" var="editStudentURL" />

<aui:form method="post" action="<%=editStudentURL %>" name="fm">
	<aui:model-context bean="<%=validator_Student %>" model="<%=Validator_Student.class %>"></aui:model-context>
	<aui:row>
		<aui:col span="6">
			<aui:input name="code" label="Code">
				<aui:validator name="required" errorMessage="Khong duoc rong"></aui:validator>
				<aui:validator name="maxLength">8</aui:validator>
				<aui:validator name="minLength">20</aui:validator>
				<aui:validator name="alphanum"></aui:validator>
			</aui:input>
		</aui:col>
		
		<aui:col span="6">
			<aui:input name="fullname" label="Full Name">
				<aui:validator name="required"></aui:validator>
				<aui:validator name="maxLength">50</aui:validator>
				<aui:validator name="minLength">1</aui:validator>
				<aui:validator name="alpha"></aui:validator>
			</aui:input>
		</aui:col>
	</aui:row>
	
	<aui:row>
		<aui:col span="6">
			<aui:input name="gender" laber="Gender"></aui:input>
		</aui:col>
		<aui:col span="6">
			<aui:input name="birthday" laber="Birthday">
				<aui:validator name="required"></aui:validator>
				<aui:validator name="date"></aui:validator>
			</aui:input>
		</aui:col>
	</aui:row>
	
	<aui:row>
		<aui:col span="6">
			<aui:input name="email" laber="Email">
				<aui:validator name="email" errorMessage="Phai nhap dung dinh dang email"></aui:validator>
				<aui:validator name="maxLength">50</aui:validator>
			</aui:input>
		</aui:col>
		<aui:col span="6">
			<aui:input name="address" laber="Address">
				<aui:validator name="required"></aui:validator>
			</aui:input>
		</aui:col>
	</aui:row>
	
	<aui:row>
		<aui:col span="6">
			<aui:input name="blog" laber="Blog Address">
				<aui:validator name="url"></aui:validator>
				<aui:validator name="maxLength">255</aui:validator>
			</aui:input>
		</aui:col>
		<aui:col span="6">
			<aui:input name="mark" laber="Mark">
				<aui:validator name="number"></aui:validator>
				<aui:validator name="min"></aui:validator>
				<aui:validator name="max"></aui:validator>
			</aui:input>
		</aui:col>
	</aui:row>
	
	<aui:button type="submit"></aui:button>
</aui:form>