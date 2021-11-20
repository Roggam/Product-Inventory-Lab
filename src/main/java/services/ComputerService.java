package services;

import models.Computer;

import javax.security.auth.login.CredentialException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComputerService {
    private static int nextId = 1;  // (1)

    private List<Computer> inventory = new ArrayList<>();

    //1
    public Computer create( int expectedStorage, int expectedRam, int expectedScreenSize,
                           int expectedPrice, String expectedBrand, String expectedModel) {
        //2
        Computer createdComputer = new Computer(this.nextId++, expectedStorage, expectedRam, expectedScreenSize, expectedPrice, expectedBrand, expectedModel);
        //3
        inventory.add(createdComputer);
        //4
        return createdComputer;
    }

    public Computer findComputer(int id) {

        for (Computer computer : inventory) {
            if (computer.getId() == id) {
               return computer;
            }
        }
        return null;
    }

    public Computer[] findAll() {
        return inventory.toArray(new Computer[0]);
    }

    public boolean delete(int id) {

        for (Computer pc : inventory) {
            if (id == pc.getId()) {
                inventory.remove(pc);
                return true;
            }
        }
        return false;
    }
}
