package ru.mirea.PR4.First;

public enum Seasons {
    WINTER(-11),
    SPRING(12.5),
    SUMMER(25) {
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(9),
    ;
    private final double avg;

    Seasons(double avg) {
        this.avg = avg;
    }

    public double getAvg() {
        return avg;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}
