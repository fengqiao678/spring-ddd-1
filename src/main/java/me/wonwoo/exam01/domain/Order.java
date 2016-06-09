package me.wonwoo.exam01.domain;

/**
 * Created by wonwoo on 2016. 6. 9..
 */
public class Order {

  private OrderState state;
  private ShippingInfo shippingInfo;

  public void changeSippingInfo(ShippingInfo newShippingInfo){
    if(state.isShippingChangeable()){
      throw new IllegalStateException("can't change shipping in " + state);
    }
    this.shippingInfo = newShippingInfo;
  }
//
//  public void changeShipped(){
//    this.state = OrderState.SHIPPED;
//  }

  public void cancel(){}
  public void completePayment(){}
  private boolean isShippingChangeable(){
    return state == OrderState.PAYMET_WATTING || state == OrderState.PREPARING;
  }
}
