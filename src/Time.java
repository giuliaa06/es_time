public class Time {
    protected int minuti;
    protected int ore;
    protected int secondi;


    /**
     * 
     * @return minuti 
     */
    public int getMinuti() {
        return minuti;
    }

    /**
     * 
     * @return ore 
     */
    public int getOre() {
        return ore;
    }

    /**
     * 
     * @return secondi 
     */
    public int getSecondi() {
        return secondi;
    }

/** La classe addSecondi addiziona il numero di secondi specificati, normalizzando il tempo in automatico
 * 
 * @param secondi
 */

public void addSecondi(int secondi) {
        this.secondi += secondi;


        while (this.secondi >= 60) {
            this.secondi -= 60;
            this.minuti++;
        }

      
        while (this.minuti >= 60) {
            this.minuti -= 60;
            this.ore++;
        }
    }

}