package com.example.staybooking.model;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Embeddable
public class StayReserveDateKey implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long stay_id;
    private LocalDate date;

    public StayReserveDateKey() {
    }

    public StayReserveDateKey(Long stay_id, LocalDate date) {
        this.stay_id = stay_id;
        this.date = date;
    }

    public Long getStay_id() {
        return stay_id;
    }

    public StayReserveDateKey setStay_id(Long stay_id) {
        this.stay_id = stay_id;
        return this;
    }

    public LocalDate getDate() {
        return date;
    }

    public StayReserveDateKey setDate(LocalDate date) {
        this.date = date;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || o.getClass() != getClass()) return false;
        StayReserveDateKey currDate = (StayReserveDateKey) o;
        return stay_id.equals(currDate.stay_id) && date.equals(currDate.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stay_id, date);
    }
}
