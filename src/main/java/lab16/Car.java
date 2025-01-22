package lab16;

import java.util.Random;

public class Car {
    public int countPeople;
    public boolean flag;

    public Car(){
        this.countPeople = 2;
        this.flag = true;
    }
    /*
    public boolean getFlag() { return flag;}

    public int getCountPeople() {
        return countPeople;
    }
     */

    public void changeCount(int a) {
        this.countPeople += a;
    }

    public void checkCar() throws CarBrakeDown{
        Random random = new Random();
        if (flag && random.nextInt(9) + 1 < 6) {
            flag = false;
            throw new CarBrakeDown();
        }
    }

}
