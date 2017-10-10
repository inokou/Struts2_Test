package com.tutorialspoint.struts2.DataList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DatabaseDataGet {

	public static void main(String[] args) throws Exception {
		Dataselect("ssssss");
	}

	public static void Dataselect(String tablename) throws Exception {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		try {
			// -----------------
			// 接続
			// -----------------

			// JDBCドライバの登録
			//String driver = "org.postgresql.Driver";
			//Class.forName(driver);


			String server = "localhost:5432"; 					// PostgreSQL サーバ ( IP または ホスト名 )
			String dbname = "postgres"; 							// データベース名
			String url = "jdbc:postgresql://" + server + "/" + dbname;

			String user = "postgres"; // データベース作成ユーザ名
			String password = "admin"; // データベース作成ユーザパスワード

			connection = DriverManager.getConnection(url, user, password);

			// connection = DriverManager.getConnection(
			// "jdbc:postgresql://localhost:5432/postgres", //
			// "jdbc:postgresql://[場所(Domain)]:[ポート番号]/[DB名]"
			// "postgres", // ログインロール
			// "admin"); // パスワード

			statement = connection.createStatement();

			// -----------------
			// SQLの発行
			// -----------------
			// ユーザー情報のテーブル
			resultSet = statement.executeQuery("SELECT * FROM m_itemcode");

			// -----------------
			// 値の取得
			// -----------------
			// フィールド一覧を取得
			List<String> fields = new ArrayList<String>();
			ResultSetMetaData rsmd = resultSet.getMetaData();
			for (int i = 1; i <= rsmd.getColumnCount(); i++) {
				fields.add(rsmd.getColumnName(i));
			}

			// 結果の出力
			int rowCount = 0;
			while (resultSet.next()) {
				rowCount++;

				System.out.println("---------------------------------------------------");
				System.out.println("--- Rows:" + rowCount);
				System.out.println("---------------------------------------------------");

				// 値は、「resultSet.getString(<フィールド名>)」で取得する。
				for (String field : fields) {
					System.out
							.println(field + ":" + resultSet.getString(field));
				}
			}

		} catch (SQLException e ) {
			e.printStackTrace();

		} catch (Exception e ) {
			e.getMessage();

		} finally {
			// 接続を切断する
			if (resultSet != null) {
				resultSet.close();
			}
			if (statement != null) {
				statement.close();
			}
			if (connection != null) {
				connection.close();
			}
		}
	}

}
