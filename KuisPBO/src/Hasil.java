public class Hasil implements Nilai {
    public String nim, nama;
    public int tulis, coding, wawancara;

    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public void setNim(String nim) {
        this.nim = nim;
    }

    @Override
    public void setTulis(int tulis) {
        this.tulis = tulis;
        if(this.tulis<0){
            throw new IllegalArgumentException("\t\tNilai Tes Tulis yang anda inputkan tidak benar");
        }
    }

    @Override
    public void setCoding(int coding) {
        this.coding = coding;
        if(this.coding<0){
            throw new IllegalArgumentException("\t\tNilai Tes Coding yang anda inputkan tidak benar");
        }
    }

    @Override
    public void setWawancara(int wawancara) {
        this.wawancara = wawancara;
        if(this.wawancara<0){
            throw new IllegalArgumentException("\t\tNilai Tes Wawancara yang anda inputkan tidak benar");
        }
    }

    @Override
    public String getNim() {
        return nim;
    }

    @Override
    public double getTulis() {
        return this.tulis;
    }

    @Override
    public double getCoding() {
        return this.coding;
    }

    @Override
    public double getWawancara() {
        return this.wawancara;
    }
}
