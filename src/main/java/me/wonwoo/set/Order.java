package me.wonwoo.set;

import me.wonwoo.exam01.domain.OrderLine;
import me.wonwoo.exam01.domain.OrderState;
import me.wonwoo.exam01.domain.ShippingInfo;


/**
 * Created by wonwoo on 2016. 7. 5..
 */
public class Order {

  public Order(Orderer orderer, List<OrderLine> line, ShippingInfo info, OrderState state){
    //...
    //...
  }

  public static void main(String[] args) {
    Order order = new Order();
    order.setOrderLine(line);
    order.setShippingInfo(sinfo);
    order.setState(OrderState.PREPARING);


  Order order1 = new Order(orderer, line, sinfo, OrderState.PREPARING);
  }
}
