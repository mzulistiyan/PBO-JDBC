/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_1301204037_jdbc.model;

import java.util.Date;

/**
 *
 * @author izuli
 */
public class Pegawai {
    private int id;
    private String nama;
    private String posisi;
    private Date tgl_lahir;

    
    @Override
    public String toString() {
        return nama;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String name) {
        this.nama = name;
    }

    public String getPosisi() {
        return posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    public Date getTgl_lahir() {
        return tgl_lahir;
    }

    public void setTgl_lahir(Date tgl_lahir) {
        this.tgl_lahir = tgl_lahir;
    }
}
