package org.example;

/**
 * 猫の特徴
 */
public class Cats implements Animal{

  public String catsCry(String cry) {
    return "猫の鳴き声での挨拶は、" + cry;
  }

  @Override
  public String cry(String nearCry) {
    return nearCry;
  }

  @Override
  public int age(int age) {
    return 7;
  }
}
