package com.extension.tntExtension.services;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.order.*;
import com.extension.tntExtension.Client;
import com.extension.tntExtension.Constants;
import com.extension.tntExtension.dto.RequestOrderDto;
import com.extension.tntExtension.providers.OrderDataProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@Service
public class OrderService {
    ProjectApiRoot apiRoot = new Client().createApiClient();
    OrderDataProvider provider = new OrderDataProvider();
    public Order setOrderLineItemCustomType(RequestOrderDto dto)
    {
        String orderNumber = dto.getOrderNumber();


        OrderUpdate update = OrderUpdate.builder().version(dto.getVersion())
                .actions(OrderUpdateAction.setLineItemCustomTypeBuilder().lineItemId(dto.getLineItemId())
                        .type(typeBuilder-> typeBuilder.key("lineItemDeliveryTrackInfo"))
                        .fields(fieldBuilder -> fieldBuilder.addValue(Constants.latitude,dto.getLatitude()).addValue(Constants.expectedDeliveryTime,dto.getFormattedExpectedDeliveryTime())
                                .addValue(Constants.longitude,dto.getLongitude()).addValue(Constants.reason,dto.getReason())
                                .addValue(Constants.deliveryImage,dto.getDeliveryImage()).addValue(Constants.consignmentCode,dto.getConsingmentCode())
                                .addValue(Constants.shipmentStatus,dto.getShipmentStatus())).build()).build();

        return provider.setOrderLineItemCustomType(update,orderNumber);
    }

}
