package services;

import models.Computer;
import org.junit.Assert;
import org.junit.Test;

public class ComputerServiceTest {
    @Test
    public void createTest() {
        //given

        int expectedStorage = 500;
        int expectedRam = 32;
        int expectedScreenSize = 17;
        int expectedPrice = 1500;
        String expectedBrand = "Apple";
        String expectedModel = "Mac";
        ComputerService pcServices = new ComputerService();
        Computer pc = pcServices.create(expectedStorage, expectedRam, expectedScreenSize,
                expectedPrice, expectedBrand, expectedModel);
        //when
        int actualId = pc.getId();
        int actualStorage = pc.getStorage();
        int actualRam = pc.getRam();
        int actualScreenSize = pc.getScreenSize();
        int actualPrice = pc.getPrice();
        String actualBrand = pc.getBrand();
        String actualModel = pc.getModel();
        //then
        Assert.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assert.assertEquals(expectedStorage, actualStorage);
        Assert.assertEquals(expectedRam, actualRam);
        Assert.assertEquals(expectedScreenSize, actualScreenSize);
        Assert.assertEquals(expectedPrice, actualPrice);
        Assert.assertEquals(expectedBrand, actualBrand);
        Assert.assertEquals(expectedModel, actualModel);

    }


    @Test
    public void findComputerTest() {
        //given
        ComputerService computerService = new ComputerService();

        computerService.create(120, 16, 13,
                1500, "Apple", "Macbook");
        computerService.create(120, 16, 15,
                1500, "Apple", "Mac");
        computerService.create(500, 34, 25,
                3000, "Apple", "Mac Pro");
        Integer expectedId = 3;
        //when
        Computer computer = computerService.findComputer(3);
        Integer actualId = computer.getId();
        //then
        Assert.assertEquals(expectedId, actualId);
    }

    @Test

    public void findAll() {
        //Given

        ComputerService computerService = new ComputerService();
        computerService.create(120, 16, 13,
                1500, "Apple", "Macbook");
        computerService.create(120, 16, 15,
                1500, "Apple", "Mac");
        computerService.create(500, 34, 25,
                3000, "Apple", "Mac Pro");
        Integer expected = 3;
        //When
        Integer actual = computerService.findAll().length;
        //Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void deleteTest() {
        //Given
        ComputerService computerService = new ComputerService();
        Boolean expected = true;
        computerService.create(120, 16, 13,
                1500, "Apple", "Macbook");
        computerService.create(120, 16, 15,
                1500, "Apple", "Mac");
         //When
        Boolean actual = computerService.delete(2);
          //Then
        Assert.assertEquals(true, actual);


    }
}
