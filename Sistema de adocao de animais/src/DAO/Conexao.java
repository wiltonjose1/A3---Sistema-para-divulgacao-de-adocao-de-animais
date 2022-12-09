
package DAO;

import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;

public class Conexao {
   
    
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/sistemadeadocao";
    public static final String USER = "root";
    public static final String PASS = "sistemaadocaoA3";
    
    public static Connection getConnection(){
    try{
    Class.forName(DRIVER);
    return (Connection) DriverManager.getConnection(URL, USER, PASS);
    
    
    } catch (Exception e){
        throw new RuntimeException("Erro  na conexao com o banco de dados", e);
    }
    
        
        
    }
    
    
}
