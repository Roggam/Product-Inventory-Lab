package models;

public class Burger {
  private  int qty;
  private  int price;
  private  int toppings;
  private String name;


  public Burger(){
  }

  public Burger(int qty, int price, int toppings, String name) {
    this.qty = qty;
    this.price = price;
    this.toppings = toppings;
    this.name = name;
  }

  public int getQty() {
    return qty;
  }

  public void setQty(int qty) {
    this.qty = qty;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getToppings() {
    return toppings;
  }

  public void setToppings(int toppings) {
    this.toppings = toppings;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
