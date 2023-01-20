package com.alura.jdbc.pruebas;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.alura.jdbc.factory.ConnectionFactory;

public class PruebaDelete {
	
	public static void main(String[] args) throws SQLException {
		
Connection con = new ConnectionFactory().recuperarConexion();
		
		Statement statement = con.createStatement();
		
		statement.execute("DELETE FROM PRODUCTO WHERE ID = 99");
		
		ResultSet resulSet = statement.getResultSet();
		
		 System.out.println(statement.getUpdateCount());
	}

}
