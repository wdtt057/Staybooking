package com.example.staybooking.model;

import javax.persistence.EmbeddedId;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import java.io.Serializable;

public class StayReserveDate implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private StayReserveDateKey id;

    @MapsId("stay_id")
    @ManyToOne
    private Stay stay;

    public StayReserveDate() {
    }

    public StayReserveDate(StayReserveDateKey id, Stay stay) {
        this.id = id;
        this.stay = stay;
    }

    public StayReserveDateKey getId() {
        return id;
    }

    public Stay getStay() {
        return stay;
    }
}
