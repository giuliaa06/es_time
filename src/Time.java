/*
 *La classe rappresenta e gestisce dati di tipo temporale
 * 
 * @author Scarsi Giulia,Foglia Mattia
 * @version 1.0
 * @since 07/02/2025
 */
public class Time {
    protected int minuti;
    protected int ore;
    protected int secondi;

    /*
     * Costruisce un oggetto Time dato in ingresso il numero di secondi.
     */
    public Time(int secondi) {
        this.minuti = 0;
        this.ore = 0;
        this.secondi = secondi;
    }

    

    /*
     * Costruisce un oggetto Time dato in ingresso ore, minuti e secondi.
     */
    public Time(int minuti, int ore, int secondi) {
        this.minuti = minuti;
        this.ore = ore;
        this.secondi = secondi;
    }



    /*
     * Esprime le ore, i minuti e i secondi dell'oggetto Time in secondi. Esempio. 1
     * ora, 20 min, 10 secondi -> 4810s
     * 
     * @return il numero totale dei secondi
     */
    public int convertiSecondi() {

        return 0;
    }

    /*
     * @Deprecated
     */
    public void setMinuti(int minuti) {
        this.minuti = minuti;
    }

    /*
     * @Deprecated
     */
    public void setOre(int ore) {
        this.ore = ore;
    }

    /*
     * @Deprecated
     */
    public void setSecondi(int secondi) {
        this.secondi = secondi;
    }

}
