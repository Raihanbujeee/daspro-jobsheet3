import java.util.Scanner;

public class kafe24 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        boolean keanggotaan;
        int jmlKopi,jmlTeh,jmlRoti;
        double hargaKopi = 12000.0,hargaTeh = 7000.0,hargaRoti = 20000.0, totalHarga,nominalbayar;
        float diskon = 10/100f;
        System.out.print(" Masukkan keanggotaan (true/false): ");
        keanggotaan = input.nextBoolean();
        System.out.print("Masukkan jumlah pembelian kopi: ");
        jmlKopi= input.nextInt();
        System.out.print("Masukkan jumlah Pembelian teh: ");
        jmlTeh =  input.nextInt();
        System.out.print("Masukkan jumlah pembelian roti: ");
        jmlRoti = input.nextInt();
        totalHarga = (jmlKopi*hargaKopi)+(jmlTeh*hargaTeh)+(jmlRoti*hargaRoti);
        nominalbayar = totalHarga - (diskon *totalHarga);
        System.err.println("Keanggotaan pelanggan " + keanggotaan);
        System.out.println(" Item pembelian " +  jmlKopi+ " kopi, " + jmlTeh + " teh, " + jmlRoti + " roti ");
        System.out.println("Nominal bayar Rp " + nominalbayar);

    }
}