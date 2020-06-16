<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/31
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="test0510.bean.Users" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   <%
       request.setAttribute("uid","abc");
       session.setAttribute("uage",20);
       request.setAttribute("uage",21);

       Users u=new Users();
       u.setLoginId("admin");
       u.setLoginPwd("111");
       u.setNickName("李四");
       u.setTel("139");
       request.setAttribute("myUsers",u);
   %>

uid:  ${uid}    <br/>
request uage: ${requestScope.uage}   <br/>
session uage: ${sessionScope.uage}   <br/>

users loginId:${myUsers.loginId}  <br/>
users nickName:${myUsers.nickName} <br/>

${empty myUsers}
${empty myUsers2}
${uid==null}
</body>
</html>
