import java.util.Scanner;

public class Ucapan_04 {
    public static void main(String[] args) {
        String namaOrang = PenerimaUcapan();
        System.out.println("Terimakasih " +namaOrang+"\n Sehat Selalu");
    }

    public static String PenerimaUcapan(){
        Scanner input = new Scanner(System.in);
        System.out.println("Tuliskan Nama orang yang ingin anda berikan ucapan : ");
        String nama = input.nextLine();
        input.close();
        return nama;
    }
}
