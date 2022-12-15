
package REPOSITORY;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import MODELS.Usuario;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class cadastroRepository {
    
    Connection conexao;
    
    public void createCadastro(Usuario cadastro){
        try {
            String sql = "insert into Cadastro(nome,cpf,email,senha)values(?,?,?,?)";
            
            conexao = new Conexao().conectaBD();
            
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1,cadastro.getNome());
            statement.setString(2,cadastro.getCpf());
            statement.setString(3,cadastro.getEmail());
            statement.setString(4,cadastro.getSenha());
            
            statement.execute();
            statement.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Não foi possível cadastrar usuário");
            Logger.getLogger(cadastroRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Usuario>readAllCadastros(){
            
            return null;
            
    }
        
    public void updateCadastro(Usuario cadastro){
            
    }
    public void deleteCadastro(Usuario cadastro){
            
    }
}
