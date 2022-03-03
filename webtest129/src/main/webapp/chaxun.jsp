<%@page import="Dao.dao"%>
<%@page import="Bean.zhiyuan"%>
<%@page import="java.sql.*"%>
<%@page import="DBUtil.Util"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
ResultSet rs=dao.chaxun();
while(rs.next()){%>
<tr>
<td>
<% out.print("************");%>
<%out.print(rs.getString("ID"));%>
<%out.print(rs.getString("Name"));%>
<%out.print(rs.getString("sex"));%>
<%out.print(rs.getString("zhiwei"));%>
<%out.print(rs.getString("bumen"));%>
<%out.println(rs.getString("phone"));%>
</td>
</tr>
<%}%>
<a href="http://localhost:8080/webtest129/zhiyuan.jsp">
			<button>返回</button></td></a>
</body>
</html>