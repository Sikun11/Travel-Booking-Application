package com.tour;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class PackageDAO {
public int k=0;

public int planing(Userbean ub)
{
	try {
		
		Connection con = DB_con.getCon();
		PreparedStatement ps = con.prepareStatement("insert into ourtourist values(?,?,?,?,?,?,?,?)");
		ps.setString(1,ub.getName());
		ps.setString(2, ub.getMid());
		ps.setString(3, ub.getCnt());
		ps.setString(4, ub.getDt());
		ps.setLong(5, ub.getMobno());
		ps.setString(6, ub.getSt());
		ps.setString(7, ub.getPack());
		ps.setInt(8, ub.getDys());
		k=ps.executeUpdate();
	} catch (Exception e) {
		e.printStackTrace();
	}
	return k;
}
	
}

