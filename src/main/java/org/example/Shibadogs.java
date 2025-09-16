package org.example;

/**
 * 柴犬の特徴(子クラス)
 */
public class Shibadogs extends Dogs{
  public String animalVoice(String voice) {
    return "柴犬の鳴き声は、"  +  voice;
  }

  public int ageDogs(int age) {
    return age;
  }
}
