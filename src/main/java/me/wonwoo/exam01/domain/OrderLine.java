package me.wonwoo.exam01.domain;

/**
 * Created by wonwoo on 2016. 6. 9..
 */
public class OrderLine {

  private Product product;
  private int price;
  private int quantity;
  private int amounts;

  public OrderLine(Product product, int price, int quantity) {
    this.product = product;
    this.price = price;
    this.quantity = quantity;
    this.amounts = calculateAmounts();
  }

  public int calculateAmounts(){
    return price * quantity;
  }

  public int getAmounts(){

  }
}
