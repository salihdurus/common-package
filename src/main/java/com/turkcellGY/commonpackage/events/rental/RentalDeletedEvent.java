package com.turkcellGY.commonpackage.events.rental;

import com.turkcellGY.commonpackage.events.Event;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RentalDeletedEvent implements Event {
    private UUID carId;
}
