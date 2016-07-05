package me.wonwoo.exam01.value;

import me.wonwoo.exam01.domain.OrderLine;

/**
 * Created by wonwoo on 2016. 7. 5..
 */
public class Money {
  private int value;

  public Money(int value) {
    this.value = value;
  }

  public Money add(Money money){
    return new Money(this.value * money.value);
  }

  public Money multiply(int multiplier){
    return new Money(value * multiplier);
  }

  public int getValue() {
    return value;
  }

  public static void main(String[] args) {
    Money price = new Money(100);
    OrderLine orderLine = new OrderLine(product, price, quantity);
    price.setValue(200);
  }
}
