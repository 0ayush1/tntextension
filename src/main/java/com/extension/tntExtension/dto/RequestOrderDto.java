package com.extension.tntExtension.dto;

import lombok.*;

@Data
public class RequestOrderDto {

    private Object shipmentStatus;
    private Object expectedDeliveryTime;
    private Object latitude;
    private Object longitude;
    private Object reason;
    private Object deliveryImage;
    private Object consingmentCode;
    private String orderNumber;
    private Long version;
    private String lineItemId;
}
