import java.util.Scanner;

public class pertanyaanpercobaan2 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        boolean keanggotaan;
        int jmlKopi,jmlTeh,jmlRoti,nominalInt;
        double hargaKopi = 12000.0,hargaTeh = 7000.0,hargaRoti = 20000.0, totalHarga,nominalbayar;
        float diskon = 10/100;
        byte totalByte;
        System.out.print(" Masukkan keanggotaan (true/false): ");
        keanggotaan = input.nextBoolean();
        System.out.print("Masukkan jumlah pembelian kopi: ");
        jmlKopi= input.nextInt();
        System.out.print("Masukkan jumlah Pembelian teh: ");
        jmlTeh =  input.nextInt();
        System.out.print("Masukkan jumlah pembelian roti: ");
        jmlRoti = input.nextInt();
        totalHarga = (jmlKopi*hargaKopi)+(jmlTeh*hargaTeh)+(jmlRoti*hargaRoti);
        totalByte = (byte) totalHarga;
        nominalbayar = totalByte - (diskon *totalByte);
        nominalInt= (int) nominalbayar;
        System.out.println("Keanggotaan pelanggan " + keanggotaan);
        System.out.println(" Item pembelian " +  jmlKopi+ " kopi, " + jmlTeh + " teh, " + jmlRoti + " roti ");
        System.out.println("Nominal bayar Rp " + nominalInt);

    }
}