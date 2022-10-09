package ru.mirea.PR41.Second;

public class Phone {

    String model;
    String number;
    int weight;

    public Phone(String model, String number, int weight){
        this.model = model;
        this.number = number;
        this.weight = weight;
    }


    public Phone(String model, String number){
        this.model = model;
        this.number = number;
    }

    public Phone(){}

    public String receiveCall(String name){
        return "Звонит {" + name + "}";
    }

    public String getNumber() {
        return number;
    }

    public String receiveCall(String name, String number){
        return "Звонит {" + name + "}" + "\n" + number;
    }

    public void sendMessage(String... numbers){
        System.out.println("Сообщение от номера: " + numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Номер #%d -> %s\n", i + 1, numbers[i]);
        }
    }
}
