package pln;

import java.util.ArrayList;

public class Pelanggan extends User {
    private ArrayList<Integer> golongan = new ArrayList<>();

    public Pelanggan(){
        super();
        this.golongan.add(1);
        this.golongan.add(2);
        this.golongan.add(3);
        this.golongan.add(1);
    }

    public ArrayList<Integer> getGolongan() {
        return this.golongan;
    }

    public int hitung(int gol, int jumlahPakai){
        int golBiaya = 0;
        if (gol == 1) {
            golBiaya = 1000;
        } else if (gol == 2) {
            golBiaya = 3500;
        } else {
            golBiaya = 7000;
        }
        System.out.println("Jumlah pakai : Rp."+(golBiaya*jumlahPakai)+",-");
        return golBiaya * jumlahPakai;
    }
}
