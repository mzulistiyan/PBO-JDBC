/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_1301204037_jdbc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import tp_1301204037_jdbc.model.Pegawai;

/**
 *
 * @author hilmantm
 */
public class daoPegawai implements interfacePegawai<Pegawai> {

    private Connection connection;
    
    public daoPegawai(Connection connection) {
        this.connection = connection;
    }

    @Override
    public ArrayList<Pegawai> getAll() {
        ArrayList<Pegawai> employees = new ArrayList<>();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM pegawai");
            while (rs.next()) {
                Pegawai currentEmployee = new Pegawai();
                currentEmployee.setId(rs.getInt(1));
                currentEmployee.setNama(rs.getString(2));
                currentEmployee.setPosisi(rs.getString(3));
                currentEmployee.setTgl_lahir(rs.getDate(4));
                
                employees.add(currentEmployee);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return employees;
    }

    @Override
    public int edit(Pegawai updatedModel) {
        try {
            String query = "UPDATE pegawai SET nama=?, posisi=?, tgl_lahir=? WHERE id=?";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, updatedModel.getNama());
            stmt.setString(2, updatedModel.getPosisi());
            stmt.setDate(3, (Date) updatedModel.getTgl_lahir());
            stmt.setInt(4, updatedModel.getId());
            
            return stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

    @Override
    public int insert(Pegawai newModel) {
        try {
            String query = "INSERT INTO pegawai (nama, posisi, tgl_lahir) "
                    + "VALUES (?, ?, ?)";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, newModel.getNama());
            stmt.setString(2, newModel.getPosisi());
            stmt.setDate(3, (Date) newModel.getTgl_lahir());
            
            return stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

    @Override
    public int delete(int idModel) {
        try {
            String query = "DELETE FROM pegawai WHERE id=?";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setInt(1, idModel);
            
            return stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }
    
    
    
}