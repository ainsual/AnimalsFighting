package controlWork;

public class ElevatorForEmployee extends Elevator {
    final typeOfElevator type = typeOfElevator.EMPLOYEE;
    private ElevatorState status;
    public int currentFloor;
    public Integer reqFloor;

    public ElevatorForEmployee() {
        status = ElevatorState.IDLE;
        currentFloor = 1;
    }

    public boolean canHandle(typeOfElevator type) {
        return this.type == type;
    }
}
