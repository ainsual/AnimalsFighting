package controlWork;

public class ElevatorForEvenNumFloors extends Elevator {
    final typeOfElevator type = typeOfElevator.EVEN;
    private ElevatorState status;
    public int currentFloor;
    public Integer reqFloor;

    public ElevatorForEvenNumFloors() {
        status = ElevatorState.IDLE;
        currentFloor = 1;
    }

    public boolean canHandle(typeOfElevator type) {
        return this.type == type;
    }
}
