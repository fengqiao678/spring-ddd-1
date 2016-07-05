package me.wonwoo.exam01.entity;

import java.util.Objects;

/**
 * Created by wonwoo on 2016. 7. 5..
 */
public class Order {
  private String orderNumber;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Order)) return false;
    Order order = (Order) o;
    return Objects.equals(orderNumber, order.orderNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderNumber);
  }
}
