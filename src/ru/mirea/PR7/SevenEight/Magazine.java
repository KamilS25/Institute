package ru.mirea.PR7.SevenEight;

public class Magazine implements Printable {

    private String nameMag;

    public Magazine(String nameMag){
        this.nameMag = nameMag;
    }

    public Magazine(){}


    public void printMagazines(Printable[] printables){
        for (Printable p: printables){
            if (p instanceof Magazine)
                p.print();
        }
    }

    public String getNameMag() {
        return nameMag;
    }

    @Override
    public void print() {
        System.out.println("Magazines: " + getNameMag());
    }
}
