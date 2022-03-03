<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="servlet?method=register" method="post">
<table align="center" border="1" width="300" >
<tr>
            <td> 用户名：</td>
<td>     <input type="text" name="UserID">  </td>
</tr>
<tr>
<td>密码：</td>
<td><input type="text" name="PassWord"></td>
</tr>
<tr align="center">
<td colspan="2"><input type="submit" value="注册"></td></tr>
</table>
</form>
</body>
</html>