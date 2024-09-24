package br.edu.fatecgru.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class ConnectionFactory {
	public static Connection getConnection() throws Exception {
		try {
			/* indica qual é o banco de dados que estou 
			utilizando e seu driver */
			Class.forName("com.mysql.cj.jdbc.Driver");

			// estabelece a conexao e retorna uma conexao
			String url = "jdbc:mysql://localhost:3306/dbalunos";
			String userName = "root";
			String password	= ""; 
			
			return DriverManager.getConnection(url, userName,password);					
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	public static void main(String[] args) {
		try {
			Connection conn = ConnectionFactory.getConnection();
			System.out.println("Deu certo");
		}catch (Exception e1) {
			System.out.println(e1.getMessage());
		}
	}
	
	// fecha uma conexão de três formas: conn, stmt, rs

		public static void closeConnection(Connection conn, Statement stmt,
				ResultSet rs) throws Exception {
			close(conn, stmt, rs);
		}

		public static void closeConnection(Connection conn, Statement stmt)
				throws Exception {
			close(conn, stmt, null);
		}

		public static void closeConnection(Connection conn) throws Exception {
			close(conn, null, null);
		}

		private static void close(Connection conn, Statement stmt, ResultSet rs)
				throws Exception {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				throw new Exception(e.getMessage());
			}
		}
}