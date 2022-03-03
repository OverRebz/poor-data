<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="servlet?method=addzhiyuan" method="post">
 <table align="center" border="1" width="500">
         <tr>
                <td>职员工号: </td>
                <td>
                    <input type="text" name="ID" />
                </td>
            </tr>
            <tr>
                <tr>
                <td>职员姓名: </td>
                <td>
                    <input type="text" name="name" />
                </td>
            </tr>
            <tr>
             <tr>
                <td>性别: </td>
                <td>
                    <input type="text" name="sex" />
                </td>
            </tr>
            <tr>
             <tr>
                <td>部门: </td>
                <td>
                    <input type="text" name="bumen" />
                </td>
            </tr>
            <tr>
             <tr>
                <td>手机号码: </td>
                <td>
                    <input type="text" name="phone" />
                </td>
            </tr>
            <tr>
             <tr>
                <td>职位: </td>
                <td>
                    <input type="text" name="zhiwei" />
                </td>
            </tr>
            
            <tr>
            <tr align="center">
                <td colspan="2">
                    <input type="submit" value="提交" />
                    <input type="reset" value="重置" />
               </td>
            </tr>
        </table>
        </form>
</body>
</html>