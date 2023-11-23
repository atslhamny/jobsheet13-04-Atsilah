import java.util.Scanner;

public class UcapanTerimakasih_04 {

    public static void main(String[] args) {
        UcapanTerimakasih();
        String Ucapan = "Terimakasih Bapak...Ibu...Semoga Sehat selalu";
        UcapanTambahan(Ucapan);

    }

    public static void UcapanTambahan(String Ucapan) {
        System.out.println(Ucapan);
    }
    public static void UcapanTerimakasih() {
        String nama = PenerimaUcapan();
        System.out.println("Terimakasih "+nama+ " telah menjadi guru terbaik di dunia ini.\n" +"Beliau Sangat menginspirasi saya untuk terus belajar dan membuat saya tidak ragu untuk terus bertanya.");
    }

    public static String PenerimaUcapan(){
        Scanner input = new Scanner(System.in);
        System.out.println("Tuliskan Nama Orang yang ingin anda berikan ucapan: ");
        String NamaOrang = input.nextLine();
        input.close();
        //System.out.println(NamaOrang);
        return NamaOrang;
    }
}
