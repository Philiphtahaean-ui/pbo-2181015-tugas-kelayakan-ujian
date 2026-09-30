import java.util.Scanner;

public class KelayakanUjian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kehadiran (%)   : ");
        int kehadiran = input.nextInt();
        System.out.print("Nilai tugas     : ");
        int nilaiTugas = input.nextInt();
        System.out.print("Dispensasi      : ");
        boolean dispensasi = input.nextBoolean();

        boolean a = kehadiran >= 75 && nilaiTugas >= 60 || dispensasi;
        boolean b = (kehadiran >= 75 && nilaiTugas >= 60) || dispensasi;
        boolean c = kehadiran >= 75 && (nilaiTugas >= 60 || dispensasi);
        boolean tidakDispensasi = !dispensasi;

        int cek = 0;
        boolean x = (kehadiran >= 75) && (cek++ >= 0);
        boolean y = (nilaiTugas >= 60) || (cek++ >= 0);

        System.out.println();
        System.out.println("===== KELAYAKAN UJIAN =====");
        System.out.println("Kehadiran   : " + kehadiran + "%");
        System.out.println("Nilai tugas : " + nilaiTugas);
        System.out.println("Dispensasi  : " + dispensasi);
        System.out.println();
        System.out.println("a (tanpa kurung)      : " + a);
        System.out.println("b (kurung precedence) : " + b);
        System.out.println("c (kurung digeser)    : " + c);
        System.out.println("!dispensasi           : " + tidakDispensasi);
        System.out.println("cek dipanggil         : " + cek);

        /*
         * Yang hasilnya sama dengan a: b (selalu).
         * c bisa berbeda, mis. kehadiran 60, nilai 80, dispensasi true -> a true, c false.
         * Kesimpulan: && mengikat lebih kuat daripada ||, jadi Java membaca a persis seperti b.
         *
         * Short-circuit:
         * x: kehadiran >= 75 false, jadi && sudah pasti false, sisi kanan (cek++) dilewati.
         * y: nilaiTugas >= 60 true, jadi || sudah pasti true, sisi kanan (cek++) dilewati.
         * Keduanya dilewati, maka cek tetap 0 (untuk input 60, 80).
         * Dengan input lain cek bisa 1 atau 2, tergantung sisi kiri mana yang memicu evaluasi kanan.
         */
    }
}