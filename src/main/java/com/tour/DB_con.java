package com.tour;

import static com.tour.DB_info.dburl;
import static com.tour.DB_info.pwd;
import static com.tour.DB_info.uname;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB_con {
	private static Connection con = null;

	public DB_con() {
	}

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(dburl, uname, pwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getCon() {
		return con;
	}

}
