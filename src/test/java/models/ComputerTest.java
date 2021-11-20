package models;

import org.junit.Assert;
import org.junit.Test;
import services.ComputerService;

public class ComputerTest {

    @Test
    public void setBrandTest(){
        //given
     Computer pc = new Computer();
     String expected = "Apple";
     pc.setBrand(expected);
     //when
      String actual = pc.getBrand();

      //then
        Assert.assertEquals(expected, actual);

    }


    @Test
    public void setModelTest(){
        //given
        Computer pc = new Computer();
        String expected = "Mac";
        pc.setModel(expected);
        //when
        String actual = pc.getModel();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setPriceTest(){
      //given
      Computer pc = new Computer();
      int expected = 1500;
      pc.setPrice(expected);
      //when
      int actual = pc.getPrice();
      //then
     Assert.assertEquals(expected,actual);
    }

    @Test
    public void setStorageTest(){
        //given
        Computer pc = new Computer();
        int expected = 500;
        pc.setStorage(expected);
        //when
        int actual = pc.getStorage();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setRamTest(){
        //given
        Computer pc = new Computer();
        int expected = 34;
        pc.setRam(expected);
        //when
        int actual = pc.getRam();
        //then
        Assert.assertEquals(expected,actual);
    }


    @Test
    public void setScreenSizeTest(){
        //given
        Computer pc = new Computer();
        int expected = 17;
        pc.setScreenSize(expected);
        //when
        int actual = pc.getScreenSize();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void constructorTest(){
     //given
        int expectedId = 2;
        int expectedStorage = 500;
        int expectedRam = 32;
        int expectedScreenSize = 17;
        int expectedPrice = 1500;
        String expectedBrand = "Apple";
        String expectedModel = "Mac";
        ComputerService pcServices = new ComputerService();
        Computer pc = new Computer(expectedId,expectedStorage,expectedRam,expectedScreenSize,
                                    expectedPrice,expectedBrand, expectedModel);
     //when
        int actualId = pc.getId();
        int actualStorage = pc.getStorage();
        int actualRam = pc.getRam();
        int actualScreenSize = pc.getScreenSize();
        int actualPrice = pc.getPrice();
        String actualBrand = pc.getBrand();
        String actualModel = pc.getModel();
     //then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedStorage, actualStorage);
        Assert.assertEquals(expectedRam, actualRam);
        Assert.assertEquals(expectedScreenSize, actualScreenSize);
        Assert.assertEquals(expectedPrice, actualPrice);
        Assert.assertEquals(expectedBrand, actualBrand);
        Assert.assertEquals(expectedModel, actualModel);

    }
}
