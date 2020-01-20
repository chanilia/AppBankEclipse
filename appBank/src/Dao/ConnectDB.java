package Dao;


import java.awt.EventQueue; 
import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.Statement;

public class ConnectDB {
	
	// La methode qui appelera la fonction run
	public static void ConnectDB (String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run () {
			
			
// Information de connexion a la base dedonnées
	String BDD = "applibank";
	String url = "jdbc:mysql://localhost:3306/" + BDD;
	String user = "root";
	String passwd = "";
//L'essaie de conexion à votre base de donées	
			
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url, user, passwd);
		System.out.println("Connecter");
	
	}  catch (Exception e) {
		e.printStackTrace();
		System.out.println("Erreur");
		System.exit(0);
	}
	
 }	
      
		});
	}
		
}

