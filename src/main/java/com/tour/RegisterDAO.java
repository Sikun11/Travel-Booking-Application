package com.tour;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class RegisterDAO {
public int k=0;

public int insert(Userbean ub)
{
	try {
		
		Connection con = DB_con.getCon();
		PreparedStatement ps = con.prepareStatement("insert into userbhadrak values(?,?,?,?,?)");
		ps.setString(1,ub.getUname());
		ps.setString(2, ub.getPwd());
		ps.setString(3, ub.getName());
		ps.setString(4, ub.getMid());
		ps.setLong(5, ub.getMobno());
		k=ps.executeUpdate();
	} catch (Exception e) {
		e.printStackTrace();
	}
	return k;
}
	
}
