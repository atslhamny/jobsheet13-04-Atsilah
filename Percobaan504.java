public class Percobaan504 {
    public static void main(String[] args) {
        Tampil("Daspro 2023", 100, 200);
        Tampil("Teknologi Informasi", 1, 2, 3, 4, 5);
        Tampil("Polinema");

    }
    static void Tampil(String str, int...a){
        System.out.println("String: " + str);
        System.out.println("Jumlah Argumen/Parameter: " + a.length);

        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
