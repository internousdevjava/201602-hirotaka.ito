package com.internousdev.jissenkadai4.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.jissenkadai4.util.DBConnector;

public class LoginDAO {

	private String admin_name;

	public boolean select(String userId, String password) {
		System.out.println(userId+ ":" + password);
		Connection conn = null;
		boolean ret = false;
		try {
			conn = (Connection) DBConnector.getConnection();
			//sqlを実行して、その結果ひとつでもレコードが取れたらretにsuccessが入り、認証されたと設定する。
			String sql = "select * from test_table where user_name = ? and password = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, userId);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				admin_name = rs.getString("user_name");
				ret = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conn.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return ret;
	}

	public String getAdmin_name() {
		return admin_name;
	}

	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}

}
