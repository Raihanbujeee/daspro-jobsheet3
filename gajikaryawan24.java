import java.util.Scanner;
public class gajikaryawan24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        short jumlahJamKerja;
        float totalGajiKotor,totalGaji,totalGajiBersih, bonus=10/100f,pajak=5/100f;
        int upahPerJam,totalInt;

        System.out.print("Masukkan upah per jam: Rp. ");
        upahPerJam = input.nextShort();
        System.out.print("Masukkan jam kerja: ");
        jumlahJamKerja = input.nextShort();
        totalGaji = upahPerJam*jumlahJamKerja ;

        totalGajiKotor = totalGaji + (totalGaji * bonus);
        totalGajiBersih = totalGajiKotor + (totalGajiKotor * pajak);
        totalInt = (int) totalGajiBersih;

        System.out.println("Jumlah gaji karyawan sebesar: Rp. " + totalInt);
    }
}
