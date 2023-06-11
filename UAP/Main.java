import java.util.*;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Selamat datang di Pemesanan Tiket Coldplay!");
        System.out.print("Masukkan nama pemesan: ");
        String nama;

        try {
            nama = in.nextLine();
            if (!cek(nama)) {
                throw new IllegalArgumentException("Nama pemesan hanya boleh berisi huruf");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }

        try {
            System.out.println("Pilih jenis tiket:\n1. CAT 8\n2. CAT 1\n3. FESTIVAL\n4. VIP\n5. UNLIMITED EXPERIENCE");
            System.out.print("Masukkan pilihan:");
            int pilih = in.nextInt();

            if (pilih < 1 || pilih > 5) {
                throw new IllegalArgumentException("Inputan salah. Harap masukkan angka 1-5.");
            }

            HargaTiket tiket;
            switch (pilih) {
                case 1:
                    tiket = new CAT8();
                    tiket.detailPesanan(nama);
                    break;
                case 2:
                    tiket = new CAT1();
                    tiket.detailPesanan(nama);
                    break;
                case 3:
                    tiket = new FESTIVAL();
                    tiket.detailPesanan(nama);
                    break;
                case 4:
                    tiket = new VIP();
                    tiket.detailPesanan(nama);
                    break;
                case 5:
                    tiket = new VVIP();
                    tiket.detailPesanan(nama);
                    break;
            }
        } catch (Exception e) {
            System.out.println("\nInputan salah");
        }

    }

    private static boolean cek(String nama) {
        return nama.matches("[a-zA-Z]+");
    }

    public static void detailPesanan(String nama, String namaTiket, float hargaTiket) {
        System.out.println("----- Detail Pemesanan -----");
        System.out.println("Nama Pemesan: " + nama);
        System.out.println("Kode Booking: " + generateKodeBooking());
        System.out.println("Tanggal Pesanan: " + getCurrentDate());
        System.out.println("Tiket yang dipesan: " + namaTiket);
        System.out.println("Total harga: " + hargaTiket + " USD");
    }

    /*
     * Jangan ubah isi method dibawah ini, nama method boleh diubah
     * Method ini dipanggil untuk mendapatkan kode pesanan atau kode booking
     * Panggil method ini untuk kelengkapan mencetak output nota pesanan
     */
    public static String generateKodeBooking() {
        StringBuilder sb = new StringBuilder();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        int length = 8;

        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            sb.append(characters.charAt(index));
        }

        return sb.toString();
    }

    /*
     * Jangan ubah isi method dibawah ini, nama method boleh diubah
     * Method ini dipanggil untuk mendapatkan waktu terkini
     * Panggil method ini untuk kelengkapan mencetak output nota pesanan
     */
    public static String getCurrentDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date currentDate = new Date();
        return dateFormat.format(currentDate);
    }
}