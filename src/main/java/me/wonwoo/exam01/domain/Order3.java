package me.wonwoo.exam01.domain;

/**
 * Created by wonwoo on 2016. 6. 9..
 */
public class Order3 {
  private OrderState state;

  public void changeShippingInfo(ShippingInfo newShippingInfo){
    veriyNotYetShipped();
    setShippingInfo(newShippingInfo);
  }

  public void cancel(){
    veriyNotYetShipped();
    this.state = OrderState.CANCELED;
  }

  private void veriyNotYetShipped() {
    if(state != OrderState.PAYMET_WATTING && state != OrderState.PREPARING){
      throw new IllegalStateException("aleady shipped");
    }
  }
}
