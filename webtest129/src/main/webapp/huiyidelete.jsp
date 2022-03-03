<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="servlet?method=huiyidelete" method="post">
<table align="center" border="1" width="300" >
<tr>
            <td> 输入需要删除的会议编号：</td>
<td>     <input type="text" name="RID">  </td>
</tr>
<tr align="center">
<td colspan="2"><input type="submit" value="删除"></td></tr>
</table>
</form>
</body>
</html>