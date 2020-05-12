public class Asisten extends Hasil {
    public int microteaching;
    public double rata;

    @Override
    public void setNama(String nama) {
        super.setNama(nama);
    }

    @Override
    public void setNim(String nim) {
        super.setNim(nim);
    }

    @Override
    public void setTulis(int tulis) {
        super.setTulis(tulis);
    }

    @Override
    public void setCoding(int coding) {
        super.setCoding(coding);
    }

    @Override
    public void setWawancara(int wawancara) {
        super.setWawancara(wawancara);
    }

    public void setMicroteaching(int microteaching) {
        this.microteaching = microteaching;
        if(this.microteaching<0){
            throw new IllegalArgumentException("\t\tNilai Tes Microteaching yang anda inputkan tidak benar");
        }
    }

    @Override
    public String getNim() {
        return super.getNim();
    }

    @Override
    public double getTulis() {
        return super.getTulis();
    }

    @Override
    public double getCoding() {
        return super.getCoding();
    }

    @Override
    public double getWawancara() {
        return super.getWawancara();
    }

    public int getMicroteaching() {
        return microteaching;
    }

    public double hitungRata(){
        rata = (this.getTulis() + this.getCoding() + this.getWawancara() + this.getMicroteaching())/4;
        return rata;
    }
}
