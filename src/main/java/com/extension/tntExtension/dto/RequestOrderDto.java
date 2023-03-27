package com.extension.tntExtension.dto;

import com.commercetools.api.models.common.LocalizedString;
import lombok.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

@Data
public class RequestOrderDto {

    private String shipmentStatus;
    private Date expectedDeliveryTime;
    private Number latitude;
    private Number longitude;
    private LocalizedString reason;
    private String deliveryImage;
    private String consingmentCode;
    private String orderNumber;
    private Long version;
    private String lineItemId;

    public String getFormattedExpectedDeliveryTime() {
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        return formatter.format(expectedDeliveryTime);
    }
}
