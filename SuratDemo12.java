import java.util.Scanner;
public class SuratDemo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat12 stackSurat = new StackSurat12(5); 
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Izin");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("ID Surat: ");
                    String idSurat = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenisIzin = sc.nextLine().charAt(0);
                    System.out.print("Durasi izin (hari): ");
                    int durasi = sc.nextInt();
                    sc.nextLine();

                    Surat12 suratBaru = new Surat12(idSurat, nama, kelas, jenisIzin, durasi);
                    stackSurat.push(suratBaru);
                    break;

                case 2:
                    stackSurat.pop();
                    break;

                case 3:
                    Surat12 suratTerakhir = stackSurat.peek();
                    if (suratTerakhir != null) {
                        System.out.println("Surat izin terakhir:");
                        suratTerakhir.tampilkanSurat();
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String cariNama = sc.nextLine();
                    stackSurat.cariSurat(cariNama);
                    break;

                case 5:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);
    }
}