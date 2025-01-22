package lab16;

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[10];
        for (int i = 0; i < 10; i++) {
            cars[i] = new Car();
        }
        int stepKm = 100;
        for (int km = stepKm; km <= 1000; km += stepKm) {
            System.out.println("Проехали: " + km + " км");
            for (Car car: cars) {
                try {
                    car.checkCar();
                } catch (CarBrakeDown e) {
                    System.out.println(e.getMessage());
                    ifCarBrakeDown(cars);
                    if (cars[0].countPeople == 0){
                        System.out.println("Экспедиция не удачна");
                        return;
                    }
                }
            }
        }
        System.out.println("Экспедиция прошла успешно!");
    }

    public static void ifCarBrakeDown(Car[] cars) {
        int a = 2;
        for (Car car: cars) {
            if (car.flag && car.countPeople + a < 6) {
                car.changeCount(a);
                a = 0;
                break;
            } else if (car.flag && car.countPeople + 1 < 6) {
                car.changeCount(1);
                a--;
            }
            if (a == 0) break;
        }
        if (a != 0) cars[0].countPeople = 0;
    }
}
/*
System.out.println(e.getMessage());
                    int a = 2;
                    for (int i = 0; i < 10; i++) {
                        if (cars[i].flag) {
                            if (cars[i].countPeople + a < 6) {
                                cars[i].changeCount(a);
                                break
                            } else if (cars[i].countPeople + 1 < 6) {
                                cars[i].changeCount(--a);
                            }
                        }
 */