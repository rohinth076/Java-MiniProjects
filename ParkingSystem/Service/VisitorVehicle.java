package ParkingSystem.Service;

public class VisitorVehicle extends Vehicle{
    private int visitingFlatNumber;
    private int inTime;
    private int outTime;

    public VisitorVehicle(String regNumber, String ownerName, long mobileNo, int visitingFlatNumber, int inTime) {
        super(regNumber, ownerName, mobileNo);
        this.visitingFlatNumber = visitingFlatNumber;
        this.inTime = inTime;
    }

    public int getVisitingFlatNumber() {
        return visitingFlatNumber;
    }

    public void setVisitingFlatNumber(int visitingFlatNumber) {
        this.visitingFlatNumber = visitingFlatNumber;
    }

    public int getInTime() {
        return inTime;
    }

    public void setInTime(int inTime) {
        this.inTime = inTime;
    }

    public int getOutTime() {
        return outTime;
    }

    public void setOutTime(int outTime) {
        this.outTime = outTime;
    }

}
