package banca.en.línea;

import static banca.en.línea.Transferenciadv.driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Edgardo
 */


public class Conexion {
    public static final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String usuario = "username";
    private static String contraseña = "password";
    private static final String url ="jdbc:sqlserver://ref_desktop; Database=your_db" ;
    
    
    public Connection Conectarse() {
        
        Connection cn = null;
        
        try {
            
            Class.forName(driver);
            cn = DriverManager.getConnection(url, usuario, contraseña);
            
        }catch (Exception e) {
            
            e.printStackTrace( );
        }
        
    return cn;
    }
    }
