package controlWork;

public interface CallElevator {
    typeOfElevator callType();
    int destinationFloor();
}

enum typeOfElevator {
    EVEN,
    ODD,
    EMPLOYEE
}
