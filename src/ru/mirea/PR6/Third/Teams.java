package ru.mirea.PR6.Third;

public class Teams implements Nameable {

    protected String nameTeams;

    public Teams(String nameTeams){
        this.nameTeams = nameTeams;
    }


    @Override
    public void getName() {
        System.out.println("Team: " + nameTeams);
    }
}
