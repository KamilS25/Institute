package ru.mirea.PR6.Ten;

public class Processor{

    private int cores;
    private int ghz;

    public Processor(int cores, int ghz) {
        this.cores = cores;
        this.ghz = ghz;
    }

    public int getCores(int cores){
        return cores;
    }

    public int getGhz() {
        return ghz;
    }
}
