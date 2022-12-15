
package REPOSITORY;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Conexao {
    public Connection conectaBD(){
        Connection conexao = null;
        try { 
            String url=
                    "jdbc:mysql://localhost:3306/sitema_animais_adocao?user=root&password=981442834.Cba273";
            
            conexao = DriverManager.getConnection(url);
            
            return conexao;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Não foi possível conectar com o banco de dados");
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return conexao;
 
    }
}
