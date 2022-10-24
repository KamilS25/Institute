package ru.mirea.PR6.Ten;

public class Computer {

    private Models models;
    private Processor processor;
    private Monitor monitor;
    private Memory memory;

    private int price;
    public Computer(Models models, Processor processor, Monitor monitor, Memory memory, int price){

        this.models = models;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
        this.price = price;

    }

    public int getPrice() {
        return price;
    }

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }
}
