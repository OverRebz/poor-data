package DBUtil;
import java.sql.*;
public class Util {
public Connection getConn() {
	Connection conn=null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/webtest129?unicode=true&characterEncoding=utf-8","root","zber1574");
	} catch (Exception e) {
		// TODO �Զ����ɵ� catch ��
		e.printStackTrace();
	}
	if(conn==null) {
		System.out.println("kong***********************");
	}
	return conn;
}
public static void close(Statement state,Connection conn)//�رպ���
{
    if(state!=null)//ֻ��״̬������ʱ���ȹر�״̬
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
    if(rs!=null)//�н������״̬������ʱ���ȹرս�������ڹر�״̬���ڹر�����
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
