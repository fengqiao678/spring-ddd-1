package me.wonwoo.exam01.value;

import java.util.Objects;

/**
 * Created by wonwoo on 2016. 7. 5..
 */
public class Receiver {

  private String name;
  private String phoneNumber;

  public Receiver(String name, String phoneNumber) {
    this.name = name;
    this.phoneNumber = phoneNumber;
  }

  public String getName() {
    return name;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Receiver)) return false;
    Receiver receiver = (Receiver) o;
    return Objects.equals(name, receiver.name) &&
      Objects.equals(phoneNumber, receiver.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, phoneNumber);
  }
}
