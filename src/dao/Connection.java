/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Camila
 */
public class ConnectionBD {

    public Statement stm;
    public ResultSet rs;
    private String driver = "com.mysql.jdbc.Driver";
    private String caminho = "jdbc:mysql://localhost/provdmtest";
    private String usuario = "root";
    private String senha = "";
    public Connection conn;

    public ConnectionBD() {
    }
    
    public void conecta() {
        try {
            System.setProperty("jdbc.Drivers", driver);
            conn = DriverManager.getConnection(caminho, usuario, senha);
            //JOptionPane.showMessageDialog(null, "Conctado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexão: \n Erro:" + ex.getMessage());
        }
    }

    public void desconecta() {
       try {
            conn.close();
            //JOptionPane.showMessageDialog(null, "Desconectado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão: \n Erro:" + ex.getMessage());
        }

    }
    
    public static void executa (String sql) throws Exception{
        Statement st = null;
   //     st = conn.createStatement();
        st.executeUpdate(sql);
    }
}

