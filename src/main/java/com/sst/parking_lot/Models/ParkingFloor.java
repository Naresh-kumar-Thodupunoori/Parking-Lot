package com.sst.parking_lot.Models;

import java.util.List;

public class ParkingFloor  extends BaseModel{
    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public List<ParkingSpots> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpots> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }



    private  int floorNumber;
    private List<ParkingSpots> parkingSpots;

    public ParkingFloorStatus getParkingFloorStatus() {
        return ParkingFloorStatus;
    }

    public void setParkingFloorStatus(ParkingFloorStatus parkingFloorStatus) {
        ParkingFloorStatus = parkingFloorStatus;
    }

    private ParkingFloorStatus ParkingFloorStatus;
}
