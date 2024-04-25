package com.sst.parking_lot.Models;

import com.sst.parking_lot.Models.Payment;
import java.util.List;

public class Bill {
    private int id;
    private Ticket ticket;
    private String exitTime;
    private int amount;
    private List<Payment> payments;
    private PaymentStatus billStatus;

}
