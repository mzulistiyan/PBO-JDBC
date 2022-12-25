/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_1301204037_jdbc;
import tp_1301204037_jdbc.controller.DBConfig;
import java.sql.Connection;
import tp_1301204037_jdbc.controller.DBConfig;
import tp_1301204037_jdbc.dao.daoPegawai;
import tp_1301204037_jdbc.view.PegawaiView;
import java.sql.Connection;
import javax.swing.UIManager;
/**
 *
 * @author izuli
 */
public class TP_1301204037_JDBC {

    public static String POSISI_STAFF;
    public static String POSISI_MANAGER;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection connection = DBConfig.getConnection();
        daoPegawai pegawaiRepository = new daoPegawai(connection);
        
        PegawaiView main = new PegawaiView(connection, pegawaiRepository);
        main.setLocationRelativeTo(null);
        main.setVisible(true);
    }
    
}
