package ontologia;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import dao.ConnectionBD;
import model.Person;
import controller.ManterUserController;

public class Ontologia {

    public static void main(String[] args) {

        ConnectionBD conn = new ConnectionBD();
        conn.conecta();
        conn.desconecta();
       
       Person person1 = new Person();
       ManterUserController manterUserController = new ManterUserController();
       person1 = manterUserController.ReadUsuario();
       
     //  manterUserController.salvar(person1);
         
       

        //   connection.closeConnection(connection, comando);

        //LER SOFTWARE BUILD 
        //LER TESTING SUITE
    }

}
