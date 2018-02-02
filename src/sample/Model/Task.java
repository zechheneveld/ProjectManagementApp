package sample.Model;

import java.util.Random;

public class Task {

    public int points;

    public Task() {
            Random diceRoll = new Random();
            this.points = diceRoll.nextInt(25) + 25;

    }
    public String name;
    public int hours;


    public Task(String EmployeeName, int hours){
        this.name = EmployeeName;
        this.hours = hours;
    }

}
