<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%String user=request.getParameter("UserID");%>
<% out.print(user);%>
<table align="center" border="1" width="300" >
<tr align="center" border="1" width="300"> <td >
<form action="servlet?method=chaxun" method="post"><a href="http://localhost:8080/webtest123/chaxun.jsp" ><button>查询个人信息</button></a>
</td></tr>
</form>

</table>



</body>
</html>