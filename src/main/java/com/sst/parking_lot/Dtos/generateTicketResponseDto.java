package com.sst.parking_lot.Dtos;

import com.sst.parking_lot.Models.Ticket;

public class generateTicketResponseDto {

   private Ticket ticket;

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    private ResponseStatus responseStatus;


}
