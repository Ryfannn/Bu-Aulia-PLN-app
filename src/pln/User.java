package pln;

import java.util.ArrayList;

public class User {
    private ArrayList<String> nama = new ArrayList<>();
    private ArrayList<String> alamat = new ArrayList<>();
    private ArrayList<String> jk = new ArrayList<>();
    
    public User(){
        this.nama.add("Pelanggan 1");
        this.alamat.add("Alamat Pelanggan 1");
        this.jk.add("Kelamin Pelanggan 1");

        this.nama.add("Pelanggan 2");
        this.alamat.add("Alamat Pelanggan 2");
        this.jk.add("Kelamin Pelanggan 2");

        this.nama.add("Pelanggan 3");
        this.alamat.add("Alamat Pelanggan 3");
        this.jk.add("Kelamin Pelanggan 3");
        
        this.nama.add("Pelanggan 4");
        this.alamat.add("Alamat Pelanggan 4");
        this.jk.add("Kelamin Pelanggan 4");
    }

    public ArrayList<String> getAlamat() {
        return alamat;
    }

    public ArrayList<String> getJk() {
        return jk;
    }

    public ArrayList<String> getNama() {
        return nama;
    }
}
