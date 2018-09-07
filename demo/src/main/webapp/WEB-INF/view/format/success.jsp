<%@page language="java" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
totalCount:
<spring:bind path="model.totalCount">${status.value}</spring:bind>
<br />
discount:
<spring:bind path="model.discount">${status.value}</spring:bind>
<br />
sumMoney:
<spring:bind path="model.sumMoney">${status.value}</spring:bind>
<br />
phoneNumber:
<spring:bind path="model.phoneNumber">${status.value}</spring:bind>
<br />
<br />

<br />

<br />
<br />
<form:form modelAttribute="model">
	<form:input path="phoneNumber" />
	<br />
	<form:input path="sumMoney" />
</form:form>
