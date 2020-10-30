package ParkingSystem.Service;

import ParkingSystem.Exceptions.ParkingSlotNotAvailableException;
import ParkingSystem.Exceptions.VehicleNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ParkingManagement {
    private List<Vehicle> allVehicles;
    public ParkingManagement() {
        allVehicles = new ArrayList<Vehicle>();
    }
    public String addVehicle(Vehicle vehicle) throws ParkingSlotNotAvailableException {
        if(allVehicles.stream().count()>=10)
            throw new ParkingSlotNotAvailableException();
        allVehicles.add(vehicle);
        return "Vehicle parked at parking slot No:"+allVehicles.size();
    }
    public String setVisitorVehicleOutTime(String regNumber,int outTime) throws VehicleNotFoundException {
      List<Vehicle> ve =  allVehicles.stream().filter(i->i instanceof VisitorVehicle)
                         .filter(j->j.getRegNumber().equalsIgnoreCase(regNumber)).
                          collect(Collectors.toList());
      if(ve.isEmpty())
          throw new VehicleNotFoundException();
        ((VisitorVehicle)ve.get(0)).setOutTime(outTime);
      return "Vehicle with RegNo: "+regNumber+" updated successfully";
    }
    public int getParkedResidentVehicleCount()
    {
     return (int) allVehicles.stream().filter(i->i instanceof ResidentVehicle)
                .filter(j->((ResidentVehicle) j).isParkingStatus()).count();
    }
    public void displayAllVehicles()
    {
        allVehicles.stream().forEach(System.out::println);
    }
}
