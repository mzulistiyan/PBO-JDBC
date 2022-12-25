/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_1301204037_jdbc.dao;
import java.util.ArrayList;
import tp_1301204037_jdbc.model.Pegawai;
import java.util.List;
/**
 *
 * @author izuli
 */
public interface interfacePegawai <T> {
    ArrayList<T> getAll();
    
    int edit(T updatedModel);
    
    int insert(T newModel);
    
    int delete(int idModel);
}
