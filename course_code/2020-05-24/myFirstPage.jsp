<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/23
  Time: 17:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Date" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   <!-- html注释 -->
    hello jsp!<br/>
    <%
        int num1=20;
        int num2=30;
        int sum=num1+num2;
    %>
   <%--  jsp注释   实现计算加法--%>
    <%=num1%>+<%=num2%>=<%=sum%>
     <br/>

     <%
         /*
            获取当前的系统日期时间
          */
         Date date=new Date();
     %>
     当前日期和时间：<%=date%>
    <br/>
    <%
        int age=1;
        if(age>=10){
    %>
            年龄在10岁以上，可以玩过山车！
    <%
        }else{
    %>
            年龄在10岁以下，不可以玩过山车！
    <%
        }
    %>
<br/>
  <%!  String getAgeInfo(int age){//获取年龄信息
         if(age>=10){
             return "年龄在10岁以上";
         }else{
             return "年龄在10岁以下";
         }
  }

  %>

<%=getAgeInfo(12)%>
<%=getAgeInfo(5)%>

<%! int abc=20; %>
</body>
</html>
