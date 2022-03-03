package DBUtil;
import java.sql.*;
public class Util {
public Connection getConn() {
	Connection conn=null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/webtest129?unicode=true&characterEncoding=utf-8","root","zber1574");
	} catch (Exception e) {
		// TODO 自动生成的 catch 块
		e.printStackTrace();
	}
	if(conn==null) {
		System.out.println("kong***********************");
	}
	return conn;
}
public static void close(Statement state,Connection conn)//关闭函数
{
    if(state!=null)//只有状态和连接时，先关闭状态
    {
        try
        {
            state.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    if(conn!=null)
    {
        try
        {
            conn.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
}
public static void close(ResultSet rs,Statement state,Connection conn)
{
    if(rs!=null)//有结果集，状态和连接时，先关闭结果集，在关闭状态，在关闭连接
    {
        try
        {
            rs.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    if(state!=null)

    {
        try
        {
            state.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    if(conn!=null)
    {
        try
        {
            conn.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
}
}
