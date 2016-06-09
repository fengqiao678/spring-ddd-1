package me.wonwoo.exam01.domain;

import java.util.List;

/**
 * Created by wonwoo on 2016. 6. 9..
 */
public class Order1 {

  private List<OrderLine> orderLines;
  private int totalAmounts;

  public Order1(List<OrderLine> orderLines) {
    this.orderLines = orderLines;
  }

  private void setOrderLines(List<OrderLine> orderLines){
    verifyAtLeastOneOrMoreOrderLines(orderLines);
    this.orderLines = orderLines;
    calculateTotalAmounts();
  }

  private void calculateTotalAmounts() {
    this.totalAmounts = new Money(orderLines.stream()
    .mapToInt(x -> x.getAmounts()).sum());
  }

  private void verifyAtLeastOneOrMoreOrderLines(List<OrderLine> orderLines) {
    if(orderLines == null || orderLines.isEmpty()){
      throw new IllegalArgumentException("no OrderLine");
    }
  }
}
