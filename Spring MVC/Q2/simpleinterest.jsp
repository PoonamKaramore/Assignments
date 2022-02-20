<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Simple Interest</title>
</head>
<body>
		<form method = "post" action="simpleinterest" >
		   <h2>
                Principle :<input type="text" placeholder="Enter the principal amount" name="principal" >
           </h2>

            <h2>
                Rate:<input type="text" placeholder="Enter the rate of interest" name="rate" >
            </h2>

            <h2>
                Time Period:<input type="text" placeholder="Enter the time period" name="time">
           </h2>
    
        <div class="button">
            <input type="submit" value="Calculate Simple Interest">
        </div>
    </form>
		<h1>Simple interest is: ${simpleinterest}</h1>

</body>
</html>