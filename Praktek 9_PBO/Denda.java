public class Denda {
    private Peminjaman peminjam;
    private int hariTerlambat;
    private static final int TARIF_DENDA = 10000;

    public Denda(Peminjaman peminjam, int hariTerlambat) {
        this.peminjam = peminjam;
        this.hariTerlambat = hariTerlambat;
    }

    public Peminjaman getPeminjaman() {
        return peminjam;
    }

    public int getTagihan() {
        return hariTerlambat * TARIF_DENDA;
    }
}