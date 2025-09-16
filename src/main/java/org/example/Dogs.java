  package org.example;

  /**
   * 犬の特徴(親クラス)
   */
  public class Dogs implements Animal {

    public String dogsCry(String cry) {
      return "犬の鳴き声は、" + cry;
    }


    @Override
    public String cry(String cyanCry) {
      return cyanCry;
    }

    @Override
    public int age(int age) {
      return age ;
    }
  }
