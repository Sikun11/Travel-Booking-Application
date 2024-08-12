package com.tour;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.tour.DB_con;
public class ForgetDAO {

public static int update(String emailId,String password)
{   int k=0;
	try {
		Connection con = DB_con.getCon();
		PreparedStatement ps = con.prepareStatement("update userbhadrak set pwd=? where mid=?");
		
		ps.setString(1,password );
		ps.setString(2,emailId );
		k=ps.executeUpdate();
	} catch (Exception e) {
		e.printStackTrace();
	}
	return k;
}
}