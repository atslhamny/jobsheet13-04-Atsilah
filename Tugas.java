import java.util.Scanner;

public class Tugas {
    static Scanner scanner = new Scanner(System.in);
    static int jumlahMahasiswa;
    static int jumlahMinggu;

    static String[] namaMahasiswa;
    static int[][] nilaiMahasiswa;
    
    public static void main(String[] args) {

        System.out.print("Masukkan Jumlah Mahasiswa: ");
        jumlahMahasiswa = scanner.nextInt();

        System.out.print("Masukkan Jumlah Tugas/Minggu: ");
        jumlahMinggu = scanner.nextInt();

        namaMahasiswa = new String[jumlahMahasiswa];
        nilaiMahasiswa = new int[jumlahMahasiswa][jumlahMinggu];


        InputDataMahasiswa();
        TampilkanNilaiMahasiswa();
        cariHariNilaiTertinggi();
        tampilkanMahasiswaNilaiTertinggi();
    }

    static void InputDataMahasiswa() {
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa[i] = scanner.next();
            for (int j = 0; j < jumlahMinggu; j++) {
                System.out.print("Masukkan nilai mahasiswa " + namaMahasiswa[i] + " untuk minggu ke-" + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = scanner.nextInt();
            }
        }
    }

    static void TampilkanNilaiMahasiswa() {
        System.out.println("Nilai Mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print(namaMahasiswa[i] + ": ");
            for (int j = 0; j < jumlahMinggu; j++) {
                System.out.print(nilaiMahasiswa[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Fungsi untuk mencari hari keberapa terdapat nilai tertinggi
    static void cariHariNilaiTertinggi() {
        double nilaiTertinggi = Double.MIN_VALUE;
        int hariTertinggi = -1;

        int j;
        int i;
        for ( j = 0; j < jumlahMinggu; j++) {
            double nilaiMinggu = 0;
            for ( i = 0; i < jumlahMahasiswa; i++) {
                nilaiMinggu += nilaiMahasiswa[i][j];
            }

            if (nilaiMinggu > nilaiTertinggi) {
                nilaiTertinggi = nilaiMinggu;
                hariTertinggi = j + 1;
            }
        }

        System.out.println("\nNilai tertinggi terdapat pada hari ke-" + hariTertinggi);
    }

    // Fungsi untuk menampilkan mahasiswa yang memiliki nilai tertinggi
    static void tampilkanMahasiswaNilaiTertinggi() {
        double nilaiTertinggi = Double.MIN_VALUE;
        int mahasiswaTertinggi = -1;
        int mingguTertinggi = -1;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            for (int j = 0; j < jumlahMinggu; j++) {
                if (nilaiMahasiswa[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiMahasiswa[i][j];
                    mahasiswaTertinggi = i;
                    mingguTertinggi = j + 1;
                }
            }
        }

        System.out.println("\nMahasiswa dengan nilai tertinggi adalah " + namaMahasiswa[mahasiswaTertinggi] +
                " pada minggu ke-" + mingguTertinggi + " dengan nilai " + nilaiTertinggi);
    }
}
