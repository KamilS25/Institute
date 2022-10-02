package ru.mirea.PR4.Second;

public enum Sizes {
    XXS(32) {
        public String getDesription() {
            return "Детский размер";
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40),
    ;

    private final int euroSize;

    Sizes(int euroSize){
        this.euroSize = euroSize;
    }

    public String getDescription(){
        return "Взроcлый размер";
    }


}

