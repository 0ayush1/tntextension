package com.extension.tntExtension.providers;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.models.cart.LineItemDraft;
import com.commercetools.api.models.order.Order;
import com.commercetools.api.models.order.OrderSetLineItemCustomFieldAction;
import com.commercetools.api.models.order.OrderUpdate;
import com.commercetools.api.models.order.OrderUpdateAction;
import com.extension.tntExtension.Client;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderDataProvider {
    ProjectApiRoot apiRoot = new Client().createApiClient();


    public Order setOrderLineItemCustomType(OrderUpdate update, String orderNumber) {
        return apiRoot.orders().withOrderNumber(orderNumber).post(update).executeBlocking().getBody();
    }



}
