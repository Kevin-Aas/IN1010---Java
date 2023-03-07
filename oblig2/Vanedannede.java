public class Vanedannede extends Legemiddel{
    public final int styrke;

    public Vanedannede(String navn, int pris, double virkestoff, int styrke) {
        super(navn, pris, virkestoff);
        this.styrke = styrke;
    }

    public String toString() {
        return "--------------------------\n" +
               "Id: " + id + "\n" +
               "Navn: " + navn + "\n" +
               "Pris: " + pris + " NOK\n" +
               "Virkestoff: " + virkestoff + " mg\n" + 
               "Styrke: " + styrke + "\n" + 
               "--------------------------";
    }
}
