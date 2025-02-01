package controlWork;

public class Call implements CallElevator {
    public typeOfElevator type;
    public int destinationFloor;


    @Override
    public typeOfElevator callType() {
        return type;
    }

    @Override
    public int destinationFloor() {
        return destinationFloor;
    }

    public  Elevator findElevaor(Elevator[] elevators) throws NoAvailableElevatorException {
        for(Elevator elevator: elevators) {
            if (elevator.state() == ElevatorState.IDLE && elevator.canHandle(type)) {
                return elevator;
            }
        }
        throw new NoAvailableElevatorException("No elevators");
    }
}


