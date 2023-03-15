package pln;

import java.util.Scanner;

public class Pembayaran {
    public static void main(String[] args) {
        int jumlahPakai;

        Scanner in = new Scanner(System.in);

        Pelanggan pelanggan = new Pelanggan();

        System.out.println("No\tNama Identitas\t\tJenis Kelamin\tAlamat\t\t\tGolongan");
        for (int i=0;i<pelanggan.getNama().size();i++){
            System.out.println(i+1+"\t"+pelanggan.getNama().get(i)+"\t"+pelanggan.getJk().get(i)+"\t"+pelanggan.getAlamat().get(i)+"\t    "+pelanggan.getGolongan().get(i));
        }

        System.out.println("Masukkan id :");
        int id = in.nextInt();
        
        System.out.println("Golongan\tHarga\n1\t\tRp.1000/kwh\n2\t\tRp.3500/kwh\n3\t\tRp.7000/kwh");
        
        System.out.println("Masukkan jumlah penggunaan : ");
        jumlahPakai = in.nextInt();
        pelanggan.hitung(pelanggan.getGolongan().get(id-1), jumlahPakai);
    }
}
