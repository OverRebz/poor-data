package Dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Bean.jiben;
import Bean.zhiyuan;
import DBUtil.Util;
public class dao {
	public static PreparedStatement util(String sql) {
		Util ut=new Util();
		Connection conn=ut.getConn();
		PreparedStatement pt=null;
		try {
			pt=conn.prepareStatement(sql);
		} catch (SQLException e) {
			System.out.println("1236546");
			e.printStackTrace();
		}
		return pt;
	}
	public static String login(String user,String root,String password) {
		Statement st=null;
		ResultSet rs=null;
		Util ut=new Util();
		Connection conn=ut.getConn();
		String sql="select * from "+user+" where root='"+root+"' and password='"+password+"'";
		System.out.println(sql);
		try {
			st=conn.createStatement();
			rs=st.executeQuery(sql);
			if(rs.next()) {
				return user;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return "Ê§°Ü";
		
	}
	public static ResultSet chaxun() {
		Bean.zhiyuan z=new zhiyuan();
		PreparedStatement pt=null;
		ResultSet rs=null;
		String sql="select ID,Name,sex,bumen,phone,zhiwei from zhiyuan";
		pt=util(sql);
		try {
			rs=pt.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	public static void zhiyuanadd(zhiyuan h) {
		PreparedStatement pt=null;
		pt=util("insert into zhiyuan(ID,Name,sex,bumen,phone,zhiwei) values(?,?,?,?,?,?)");
		try {
			pt.setString(1, h.getID());
			pt.setString(2, h.getName());
			pt.setString(3, h.getSex());
			pt.setString(4, h.getBumen());
			pt.setString(5, h.getPhone());
			pt.setString(6, h.getZhiwei());
			int count=pt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Ê§°Ü¶÷°¡°¡°¡°¡°¡°¡°¡°¡°¡°¡°¡°¡°¡°¡°¡°¡°¡°¡");
			e.printStackTrace();
		}
	}
	public static void register(Bean.root ro) {
		PreparedStatement pt=null;
		pt=util("insert into login (UserID,PassWord) values(?,?)");
		try {
			pt.setString(1, ro.getUserID());
			pt.setString(2, ro.getPassWord());
			int count=pt.executeUpdate();
		} catch (SQLException e) {
			// TODO ×Ô¶¯Éú³ÉµÄ catch ¿é
			e.printStackTrace();
		}
	}
	public static void huiyiadd(jiben j) {
		PreparedStatement pt=null;
		pt=util("insert into »áÒéÊÒ»ù±¾ÐÅÏ¢(RID,Rname,Rloc,Rzt,Rnum,Rusezt) values(?,?,?,?,?,?)");
		try {
			pt.setString(1, j.getRid());
			pt.setString(2, j.getRname());
			pt.setString(3, j.getRloc());
			pt.setString(4, j.getRzt());
			pt.setString(5, j.getRnum());
			pt.setString(6, j.getRusezt());
			int count=pt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Ê§°Ü¶÷°¡°¡°¡°¡°¡°¡°¡°¡°¡°¡°¡°¡°¡°¡°¡°¡°¡°¡");
			e.printStackTrace();
		}
		
	}
	public static void huiyidelete(String a) {
		PreparedStatement pt=null;
		String sql="delete from »áÒéÊÒ»ù±¾ÐÅÏ¢ where RID ='"+a+"'";
		pt=util(sql);
		System.out.println(sql);
		try {
			int count=pt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
}
