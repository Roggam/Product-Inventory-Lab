package models;

public class Computer {
    private int id;
    private int storage;
    private int ram;
    private int screenSize;
    private int price;
    private String brand;
    private String model;

    public Computer(){

    }

    public Computer(int id, int storage, int ram, int screenSize, int price, String brand, String model) {
        this.id = id;
        this.storage = storage;
        this.ram = ram;
        this.screenSize = screenSize;
        this.price = price;
        this.brand = brand;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
