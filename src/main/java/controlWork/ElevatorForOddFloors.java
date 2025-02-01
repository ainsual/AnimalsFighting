package controlWork;

public class ElevatorForOddFloors extends Elevator{
    final typeOfElevator type = typeOfElevator.ODD;
    private ElevatorState status;
    public int currentFloor;
    public Integer reqFloor;

    public ElevatorForOddFloors() {
        status = ElevatorState.IDLE;
        currentFloor = 1;
    }

    public boolean canHandle(typeOfElevator type) {
        return this.type == type;
    }
}
