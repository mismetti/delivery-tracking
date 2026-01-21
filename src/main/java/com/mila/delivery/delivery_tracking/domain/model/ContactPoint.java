package com.mila.delivery.delivery_tracking.domain.model;

import lombok.*;

@EqualsAndHashCode
@AllArgsConstructor
@Builder
@Getter
public class ContactPoint {
    private String zipCode;
    private String street;
    private String number;
    private String complement;
    private String name;
    private String phone;
}
