package models;

import org.junit.Assert;
import org.junit.Test;

public class BurgerTest {
    @Test
    public void setNameTest(){
    //given
     Burger burger = new Burger();
     String expected = "Cheese Burger";
     burger.setName(expected);
    //when
       String actual = burger.getName();
    //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setToppingsTest(){
     //given
        Burger burger = new Burger();
       int expected = 5;
       burger.setToppings(expected);
     //when
     int actual = burger.getToppings();
     //then
       Assert.assertEquals(expected,actual);
    }

    @Test
    public void setPriceTest(){
      //given
      Burger burger = new Burger();
      int expected = 15;
      burger.setPrice(expected);
      //when
      int actual = burger.getPrice();
      //then
      Assert.assertEquals(expected, actual);
    }

    @Test
    public void setQtyTest(){
    //given
    Burger burger = new Burger();
    int expected = 2;
    burger.setQty(expected);
    //when
    int actual = burger.getQty();
    //then
      Assert.assertEquals(expected, actual);
    }


    @Test
    public void constructorTest(){
    //given
    int expectedQty = 3;
    int expectedPrice = 15;
    int expectedToppings = 4;
    String expectedName = "Cheese Burger";
    Burger burger = new Burger(expectedQty, expectedPrice,expectedToppings, expectedName);
    //when
    int actualQty = burger.getQty();
    int actualPrice = burger.getPrice();
    int actualToppings = burger.getToppings();
    String actualName = burger.getName();

    //then
     Assert.assertEquals(expectedQty, actualQty);
     Assert.assertEquals(expectedPrice, actualPrice);
     Assert.assertEquals(expectedToppings, actualToppings);
     Assert.assertEquals(expectedName, actualName);
    }

}
