package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;

    private String status;

    private List<OrderItem> orderItems;

    private Client client;
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    public Order(String status, Client client) {
        orderItems = new ArrayList<>();
        this.moment = new Date();
        this.status = status;
        this.client = client;
    }

    public void addItem (OrderItem item) {
        orderItems.add(item);
    }

    public void removeItem(OrderItem item) {
        orderItems.remove(item);
    }

    public double total(){
        double total = orderItems.stream().mapToDouble(OrderItem::subTotal).sum();
        return total;
    }

    @Override
    public String toString(){
        StringBuilder msg = new StringBuilder();
        msg.append("Order moment: " );
        msg.append(sdf.format(moment));
        msg.append(System.getProperty("line.separator"));
        msg.append("Order status: " );
        msg.append(status);
        msg.append(System.getProperty("line.separator"));
        msg.append("Client: ");
        msg.append(client);
        msg.append(System.getProperty("line.separator"));
        msg.append("Order items: \n");
        for (OrderItem item: orderItems) {
            msg.append(item);
        }
        msg.append("\n");
        msg.append("Total Price: ");
        msg.append(this.total());
        return msg.toString();
    }


}
