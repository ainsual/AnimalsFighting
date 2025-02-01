package controlWork;

abstract class Elevator implements ElevatorStateProvider, Step{
    private ElevatorState status;
    public int currentFloor;
    public Integer reqFloor;

    public Elevator() {
        currentFloor = 1;
        reqFloor = null;
        status = ElevatorState.IDLE;
    }

    public ElevatorState state() {
        return this.status;
    }

    public void step() {
        if (reqFloor!=null && currentFloor > reqFloor) {
            status = ElevatorState.MOVING_UP;
            currentFloor++;
        } else if (reqFloor!= null && currentFloor < reqFloor){
            status = ElevatorState.MOVING_DOWN;
            currentFloor--;
        }
    }

    abstract public boolean canHandle(typeOfElevator type);
}
