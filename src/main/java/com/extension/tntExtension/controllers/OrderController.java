package com.extension.tntExtension.controllers;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.cart.LineItem;
import com.commercetools.api.models.order.Order;
import com.commercetools.api.models.order.OrderPagedQueryResponse;
import com.extension.tntExtension.Client;
import com.extension.tntExtension.dto.RequestOrderDto;
import com.extension.tntExtension.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/responseOrder")
public class OrderController {

    @Autowired
    OrderService service;
    ProjectApiRoot apiRoot = new Client().createApiClient();

    @PostMapping()
    public Order setOrderLineItemCustomType(@RequestBody RequestOrderDto dto)
    {
        return service.setOrderLineItemCustomType(dto);
    }

}
