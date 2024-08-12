package com.tour;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.tour.DB_con;
import com.tour.Userbean;

public class LoginDAO {
	public Userbean ub = null;

	public Userbean login(String uname, String pwd) {
		try {
			Connection con = DB_con.getCon();
			PreparedStatement ps = con.prepareStatement("select* from userbhadrak where uname=? and pwd=?");
			ps.setString(1, uname);
			ps.setString(2, pwd);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				ub = new Userbean();
				ub.setUname(rs.getString(1));
				ub.setPwd(rs.getString(2));
				ub.setName(rs.getString(3));
				ub.setMid(rs.getString(4));
				ub.setMobno(rs.getLong(5));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return ub;
	}

}
