public class Admin extends Hasil {
    public int praktek;
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

    public void setPraktek(int praktek) {
        this.praktek = praktek;
        if(this.praktek<0){
            throw new IllegalArgumentException("\t\tNilai Tes Praktek Jaringan yang anda inputkan tidak benar");
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

    public int getPraktek() {
        return praktek;
    }

    public double hitungRata(){
        rata = (this.getTulis() + this.getCoding() + this.getWawancara() + this.getPraktek())/4;
        return rata;
    }
}
