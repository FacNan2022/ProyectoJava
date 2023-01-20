package com.alura.jdbc.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
	
	private DataSource dataSource;
	
	public ConnectionFactory() {
		var pooledDataSourse = new ComboPooledDataSource();
		pooledDataSourse.setJdbcUrl("jdbc:mysql://localhost/control_de_stock?useTimeZone=true&serverTimeZone=UTC");
		pooledDataSourse.setUser("root");
		pooledDataSourse.setPassword("1234");
		pooledDataSourse.setMaxPoolSize(10);
		
		this.dataSource = pooledDataSourse;
	}
	
	public Connection recuperarConexion() {
		
		try {
			return this.dataSource.getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}

}
