package latihanpbo;

public class ProgramStudi {

    int kode_prodi;
    String nama_prodi;
    String ketua_prodi;

    public ProgramStudi(int kode, String np, String kp) {
        kode_prodi = kode;
        nama_prodi = np;
        ketua_prodi = kp;
    }

    public int kodeProdi() {

        return kode_prodi;
    }

    public String namaProdi() {

        return nama_prodi;
    }

    public String ketuaProdi() {
        return ketua_prodi;
    }
}
