package com.sst.parking_lot.Repositories;

import com.sst.parking_lot.Models.Gates;

import java.util.*;

public class GateRepository {
    private Map<Long, Gates> gates = new HashMap<>();
    public Optional<Gates> findById(Long gateId) {
        if (gates.containsKey(gateId)) {
            return Optional.of(gates.get(gateId));
        }

            return Optional.empty();
    }

}
