package com.sst.parking_lot.Services;

import com.sst.parking_lot.Exceptions.InvalidException;
import com.sst.parking_lot.Models.Gates;
import com.sst.parking_lot.Models.Ticket;
import com.sst.parking_lot.Models.Vehicle;
import com.sst.parking_lot.Models.VehicleType;
import com.sst.parking_lot.Repositories.GateRepository;
import com.sst.parking_lot.Repositories.VehicleRepository;

import java.util.Date;
import java.util.Optional;

public class TicketService {
    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;


    public  TicketService(GateRepository gateRepository, VehicleRepository vehicleRepository){
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
    }
    public Ticket generateTicket(Long gateId, String VehicleNumber, VehicleType vehicleType, String ownerName) throws InvalidException {
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());
        Optional<Gates> optionalGate = gateRepository.findById(gateId);
        if(optionalGate.isEmpty()){
           throw new InvalidException("Invalid Gate Id");
        }

        Gates gate = optionalGate.get();
        ticket.setGenratedAt(gate);
        ticket.setGenratedBy(gate.getOperator());

        Optional<Vehicle> optionalVehicle = vehicleRepository.findByNumber(VehicleNumber);
        Vehicle vehicle ;
        if(optionalVehicle.isPresent()){
            vehicle = optionalVehicle.get();
        }
        else{
             vehicle = new Vehicle();
            vehicle.setOwnerName(ownerName);
            vehicle.setVehiclenumber(VehicleNumber);
            vehicle.setVehicleType(vehicleType);
            vehicleRepository.save(vehicle);
            ticket.setVehicle(vehicle);



        }
        return ticket;
    }
}
