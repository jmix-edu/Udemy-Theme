package com.company.orders.view.order;

import com.company.orders.entity.Order;
import com.company.orders.entity.OrderStatus;
import com.company.orders.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.component.textfield.TypedTextField;
import io.jmix.flowui.view.*;

@Route(value = "orders/:id", layout = MainView.class)
@ViewController(id = "Order_.detail")
@ViewDescriptor(path = "order-detail-view.xml")
@EditedEntityContainer("orderDc")
public class OrderDetailView extends StandardDetailView<Order> {

    @ViewComponent
    private TypedTextField<Long> orderNumberField;

    @Subscribe
    public void onInitEntity(final InitEntityEvent<Order> event) {
        event.getEntity().setStatus(OrderStatus.NEW);
        orderNumberField.setVisible(false);
    }
}