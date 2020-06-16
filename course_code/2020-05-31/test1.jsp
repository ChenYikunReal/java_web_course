<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/31
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    //request.getRequestDispatcher("test2.jsp").forward(request,response);
%>
<jsp:forward page="test2.jsp">
    <jsp:param name="info" value="aaa"></jsp:param>
</jsp:forward>

</body>
</html>
