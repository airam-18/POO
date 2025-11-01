public class Rezervor {
    private int capacitate_max;
    private int nivel_curent;

    public Rezervor(int capacitate_max, int nivel_curent) {
        this.capacitate_max = capacitate_max;
        this.nivel_curent = nivel_curent;
    }

    public void umplere(int litri)
    {
        if(nivel_curent+litri <=capacitate_max)
            nivel_curent+=litri;
        else nivel_curent=capacitate_max;
    }
    public void golire(int litri)
    {
        if(nivel_curent-litri>0)
            nivel_curent-=litri;
        else nivel_curent=0;
    }
    public void afisare_stare()
    {
        System.out.println("nivelul curent de combustibil este:"+nivel_curent);
    }
}
