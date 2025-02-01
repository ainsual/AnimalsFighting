package controlWork;

import java.util.Random;

public class DynamicProcess {
    public static void main(String[] args) {
        ElevatorForEvenNumFloors[] elevatorForEvenNumFloors = {
            new ElevatorForEvenNumFloors(),
            new ElevatorForEvenNumFloors(),
            new ElevatorForEvenNumFloors()
        };
        ElevatorForOddFloors[] elevatorForOddFloors = {
            new ElevatorForOddFloors(),
            new ElevatorForOddFloors(),
            new ElevatorForOddFloors()
        };
        ElevatorForEmployee[] elevatorForEmployees = { new ElevatorForEmployee()};
        Elevator[][] elevators = {
                elevatorForEvenNumFloors,
                elevatorForOddFloors,
                elevatorForEmployees
        };
        Random random = new Random();
        for (int i = 0; i < 10_000; i++) {
            if (i % 20 == 0) {
                int reqFloor = random.nextInt(1, 20);
                Call call = new Call();
                call.type = (reqFloor % 2 == 0) ? typeOfElevator.EVEN : typeOfElevator.ODD;
                try {
                    Elevator elevator = call.findElevaor( elevators[reqFloor%2] );

                } catch (NoAvailableElevatorException e) {
                    System.out.println(e.getMessage());
                }
            }
            for (Elevator[] elevator : elevators) {
                for (int j= 0; j < elevator.length; j ++) {
                    if (elevator[j] != null) {
                        elevator[j].step();
                    }
                }
            }
        }
    }
}
