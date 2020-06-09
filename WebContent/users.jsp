<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<html>
<head>
<title>Users</title>
</head>

<body>
	<sql:setDataSource var="snapshot"
		driver="com.microsoft.sqlserver.jdbc.SQLServerDriver"
		url="jdbc:sqlserver://localhost;databaseName=JAVA_LEARNING" user="sa"
		password="anshul.123" />

	<sql:query dataSource="${snapshot}" var="result">
         SELECT * from Customers;
      </sql:query>

	<table border="1" width="100%">
		<tr>
			<th>CustomerId</th>
			<th>Name</th>
			<th>City</th>
		</tr>

		<c:forEach var="row" items="${result.rows}">
			<tr>
				<td><c:out value="${row.CustomerId}" /></td>
				<td><c:out value="${row.CustomerName}" /></td>
				<td><c:out value="${row.City}" /></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>