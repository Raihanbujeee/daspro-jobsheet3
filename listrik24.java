import java.util.Scanner;

public class listrik24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kwh,tarifperkwh = 1500,totalTagihan;
        boolean melebihibatas;
        
        System.out.print("Masukkan Jumlah KWh: ");
        kwh = input.nextInt();
        totalTagihan = kwh*tarifperkwh;
        System.out.println(" Harga yang anda bayar adalah: Rp" + totalTagihan);
        melebihibatas = kwh>50;
        System.out.print(" KWH Anda melebihi batas " + melebihibatas);


    }
}
