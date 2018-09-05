<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Details for Particular Product</title>
</head>
<body>
	 <table border="1" style="width: 100%">
		<tr>
			<th>merchantId</th>
			<th>merchantName</th>
			<th>phoneNo</th>
			<th>type</th>
			<!-- <th>quantity</th>
			<th>discountId</th>
			<th>promoCode</th> -->
			
		</tr>
		
			<tr>
				<td>${customer.emailId}</td>
				<td>${customer.merchantName}</td>
				<td>${customer.phoneNo}</td>
				<td>${customer.type}</td>
				
			</tr>
		
	</table> 
	<a href="merchant" name="Back">Back to Particular Product Page</a></br>
	
</body>
</html>