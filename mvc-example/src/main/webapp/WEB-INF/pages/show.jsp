<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Details</title>
<style type="text/css">

table{
border: 2px solid #0000FF;
margin-left:auto;
margin-right: auto;
border-collapse: collapse;
}

tr,td,th{
border: 2px solid #0000FF;
}
</style>
</head>
<body>
<h1 style="text-align: center;">Loan Application Details</h1>
<table>

<thead>
<tr>
	<th>Loan Number</th>
	<th>Applicant Name</th>
	<th>Application Date</th>
	<th>Loan Type</th>
	<th>Loan Amount</th>
</tr>
</thead>
<tbody>
<c:forEach items="${list}" var="item">

<tr>
	<td>${item.loanNumber}</td>
	<td>${item.applicantName}</td>
	<td>${item.applicationDate}</td>
	<td>${item.loanType}</td>
	<td>${item.loanAmount}</td>
</tr>
</c:forEach>
</tbody>
</table>

</body>
</html>