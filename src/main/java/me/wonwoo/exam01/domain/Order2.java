package me.wonwoo.exam01.domain;

import java.util.List;

/**
 * Created by wonwoo on 2016. 6. 9..
 */
public class Order2 {

  private List<OrderLine> orderLines;
  private int totalAmounts;
  private ShippingInfo shippingInfo;

  public Order2(List<OrderLine> orderLines, ShippingInfo shippingInfo) {
    setShippingInfo(shippingInfo);
    setOrderLinse(orderLines);
  }

  private void setShippingInfo(ShippingInfo shippingInfo){
    if(shippingInfo == null){
      throw new IllegalArgumentException("no ShippingInfo");
    }
    this.shippingInfo = shippingInfo;
  }

  private void setOrderLinse(List<OrderLine> orderLinse) {
    //...
  }
}
