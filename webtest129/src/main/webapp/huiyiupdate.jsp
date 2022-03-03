<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="servlet?method=updatehuiyi" method="post">
 <table align="center" border="1" width="500">
         <tr>
                <td>输入修改会议编号: </td>
                <td>
                    <input type="text" name="RID" />
                </td>
            </tr>
            <tr>
                <tr>
                <td>需要更改会议室名称: </td>
                <td>
                    <input type="text" name="Rname" />
                </td>
            </tr>
            <tr>
             <tr>
                <td>需要更改的会议室地点: </td>
                <td>
                    <input type="text" name="Rloc" />
                </td>
            </tr>
            <tr>
             <tr>
                <td>可用状态: </td>
                <td>
                    <input type="text" name="Rzt" />
                </td>
            </tr>
            <tr>
             <tr>
                <td>目前状态: </td>
                <td>
                    <input type="text" name="Rusezt" />
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