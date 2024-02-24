package com.mayank.notificationservice;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class OrderPlacedEvent {
    private String orderNumber;
}
