import java.util.Scanner;

public class pertanyaanpercobaan1 {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String nama,nim;
        String  kelas;
        byte absen;
        double nilaiKuis,nilaiTugas,nilaiUas,nilaiUts;
        double nilaiAkhir;
        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan Nim: ");
        nim = sc.nextLine();
        System.out.print("Masukkan Kelas: ");
        kelas = sc.nextLine();
        System.out.print("Masukkan absen: ");
        absen = sc.nextByte();
        System.out.print("masukkan nilai kuis: ");
        nilaiKuis = sc.nextInt();
        System.out.print("Masukkan nilai Tugas:");
        nilaiTugas =sc.nextInt();
        System.out.print("masukkan nilai UTS: ");
        nilaiUts = sc.nextInt();
        System.out.print("Masukkan Nilai UAS:");
        nilaiUas =sc.nextInt();
        nilaiAkhir = (nilaiKuis *0.20 ) +(nilaiTugas*0.15) + (nilaiUas*0.3)+(nilaiUts*0.35) ;
        System.out.println("Nama : "+ nama +  " Nim:" + nim);
        System.out.println("Kelas: "+kelas   + " Absen:" +absen);
        System.out.println("Nilai Akhir: "+ nilaiAkhir);


    }
}

