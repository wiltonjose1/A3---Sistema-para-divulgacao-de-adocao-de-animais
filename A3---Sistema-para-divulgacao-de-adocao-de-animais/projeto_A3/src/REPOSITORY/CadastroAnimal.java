
package REPOSITORY;

import projeto_a3.Animais;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

class CadastroAnimal {
    Connection conexao;
    
    public void createCadastro(Animais cadastro){
        try {
            String sql = "insert into Cadastro(especie, idade, raca, vacinacao, castracao, sexo, porte, endereco, telefone)values(?,?,?,?)";
            
            conexao = new Conexao().conectaBD();
            
            PreparedStatement statement = conexao.prepareStatement(sql);
            statement.setString(1,cadastro.getEspecie());
            statement.setString(2,cadastro.getIdade());
            statement.setString(3,cadastro.getRaca());
            statement.setString(7,cadastro.getSexo());
            statement.setString(8,cadastro.getDescricao());
            statement.setString(9,cadastro.getEndereco());
            statement.setInt(10,cadastro.getTelefone());
            
            
            statement.execute();
            statement.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Não foi possível cadastrar animal!");
            Logger.getLogger(cadastroRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Animais>readAllCadastros(){
            
            return null;
            
    }
        
    public void updateCadastro(Animais cadastro){
            
    }
    public void deleteCadastro(Animais cadastro){
            
    }
}
