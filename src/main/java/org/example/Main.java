package org.example;


/**
 * 課題 1.実践したものを一通り、実装して下さい。 GreetingクラスとSpeakingクラスは使わずにinterfaceと実装を組み合わせて作ってみてください。
 * 2.interfaceの実装は、２つ以上作ってください。 継承を使ってください。
 * 3.extendsは、上記で作った、２つ以上の実装クラスのどちらかを継承してクラスを作って実際にメソッドを呼び出してください。 メソッドの呼び出しは、親子のどちらとも呼び出してください。
 */
public class Main {

  public static void main(String[] args) {

    // 犬クラスのインスタンス
    Animal animalDogs = new Dogs();

    // 猫クラスのインスタンス
    Animal animalCats = new Cats();

    Cats  cat = new Cats();

    // 柴犬のインスタンス
    Shibadogs sibaken = new Shibadogs();

    System.out.println(animalDogs.cry("わんわん"));

    System.out.println(animalCats.cry("ニャー"));

    System.out.println(sibaken.animalVoice("ワオーン"));

    // 犬の年齢
    System.out.println("犬の年齢は、" + animalDogs.age(5) + "歳です。");

    System.out.println("柴犬の年齢は、" + sibaken.ageDogs(5) + "歳です。");

    // 親クラスの呼び出し(Dogsクラス)
    System.out.println(sibaken.dogsCry("ウォーン"));
    //　子クラスの呼び出し
    System.out.println(sibaken.cry("うわーん"));

    System.out.println(cat.catsCry("にゃお"));




  }
}
