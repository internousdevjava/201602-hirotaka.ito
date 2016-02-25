/**
 *
 */
package com.internousdev.jissenkadai4.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author internous
 *mysqlへ接続する、conオブジェクトを返すためのクラス
 */
public class DBConnector {

	private static String driverName = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/test_table";

	//適宜各自の環境に応じた設定にしてください（特にいじっていないのであればこのままでOK）
	private static String user = "root";
	private static String password = "mysql";

	public static Connection con = null;

	public static Connection getConnection() {
		try {
			Class.forName(driverName);
			con = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

}
