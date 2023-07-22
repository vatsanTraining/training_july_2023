<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${title}</h1>
<div style="width: 50%">
<form:form action="/add" method="post" modelAttribute="command">

<div class="form-group">
<label>Loan Number</label>
<form:input path="loanNumber"  class="form-control"/>
</div>
<div>
<label>Applicant Name</label>
<form:input path="applicantName"   class="form-control"/>
</div>
<div class="form-group">
<label>Application Date</label>
<form:input path="applicationDate" type="date"/>
</div>
<div class="form-group">

<label>Loan Amount</label>
<form:input path="loanAmount"   class="form-control"/>
</div>
<div class="form-group">

<label>Loan Type</label>
<form:input path="loanType"   class="form-control"/>
</div>
<div class="form-group">

<input type="submit" value="Add" class ="btn btn-info">
</div>
</form:form>

</div>
</body>
</html>