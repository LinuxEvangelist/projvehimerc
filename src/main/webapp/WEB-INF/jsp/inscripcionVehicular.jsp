<!-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Inscripcion Vehicular de Vehiculos de Mercancias</title>
    <style>
	.error {
	color: #ff0000;
	font-weight: bold;
	}
	</style>
</head>
<body>
 
<h1>Prueba 1</h1>
 
<h3>Prueba Join</h3>
<form:form method="post" modelAttribute="inscripcion">
    <form:errors path="*" cssClass="error"/>
    <table>
    <tr>
        <td><form:label path="num_poliza">Numero Poliza</form:label></td>
        <td><form:input path="num_poliza" /></td>
    </tr>
    <tr>
        <td><form:label path="num_expediente">Numero de Banco</form:label></td>
        <td><form:textarea path="num_expediente" cssStyle=" height : 28px;"/></td>
    </tr>
   <tr>
<td colspan="3"><input type="submit" /></td>
</tr>
   
</table>
</form:form>

</html>
-->