# 課題
## インターフェースと継承を使って、動物のオブジェクトを実装する。
---


## 目次
- [はじめに](#はじめに)
- [開発環境](#開発環境)
- [実行方法](#実行方法)
- [プログラムの内容](#プログラムの内容)
- [実行結果](#実行結果)
- [終わりに](#終わりに)
---




## 📖はじめに
### このプロジェクトは、Java を用いて「インターフェースと継承を使って、動物オブジェクト呼び出し」を行うプログラムです。
---



## 🛠開発環境
- 使用OS:Windows11
- 使用言語:Java
- JDK: Windows版のOracle JDK 21.0.8 (LTS)　⚠️LTSサポート有効期間:2026年9月まで
- 使用IDE:IntelliJ IDEA Commnunity Edition(無料版)

---



## 🚀実行方法
・Windowsの場合
「Shift + F10」のキーボードを同時に押して実行して下さい。



・Macの場合
「Control + R 」のキーボードを同時に押して実行して下さい。


---


## 💻プログラムの内容

1.Animalインターフェースにそれぞれの動物クラスに対しての共通ルールの処理を書く。














<img width="658" height="243" alt="スクリーンショット 2025-09-17 221316" src="https://github.com/user-attachments/assets/4d02eeda-778d-4ad2-9241-1fd6c62a2934" />






















2.Dogsクラスは、親クラスなので、インタフェースのルールに従う処理を書く為に、「implements 」を追加する。














<img width="636" height="91" alt="スクリーンショット 2025-09-18 081339" src="https://github.com/user-attachments/assets/80722962-8b42-4833-942f-e53cf77de91a" />














3.DogsクラスのdogsCryは、親クラスのメソッドで、cryやageのメソッドは、@Overrideを付けているので、子クラスにメソッドを引き継がせる継承メソッドです。









<img width="410" height="388" alt="スクリーンショット 2025-09-18 200427" src="https://github.com/user-attachments/assets/cb656fe2-66ff-4be1-8f4a-16b515b4dca1" />








4. Shibadogsクラスでは、extends(継承)を使って、Dogsクラスのメソッドやフィールドを継承しています。








<img width="623" height="240" alt="スクリーンショット 2025-09-18 204329" src="https://github.com/user-attachments/assets/ae079a8e-50f9-462a-971e-bd3e5b167f3a" />










 
5.Animalインタフェースは、Dogsクラスの他にもCatsクラスにも適用され、implementsを追加して、処理を書きます。








<img width="556" height="485" alt="スクリーンショット 2025-09-18 204451" src="https://github.com/user-attachments/assets/3c021fd8-48e5-485f-b3c6-61a0a122cfba" />

















































6.Main.javaクラスにAnimalインタフェースのルールに従って、インスタンスを作る。







<img width="362" height="147" alt="スクリーンショット 2025-09-18 204714" src="https://github.com/user-attachments/assets/9a86b647-9c29-4297-a0d3-ba2de0c4b1bc" />








7.Main.javaクラスにCatsクラスは、親クラスのみのインスタンスを作る。










<img width="252" height="36" alt="スクリーンショット 2025-09-18 204816" src="https://github.com/user-attachments/assets/dfc981fb-abec-4376-9501-880d80811493" />











8.Main.javaクラスにDogsクラスのメソッドやフィールドを継承した子クラスであるShibadogsクラスのインスタンスを作る。










<img width="385" height="66" alt="スクリーンショット 2025-09-18 204905" src="https://github.com/user-attachments/assets/1d04f4a6-32d2-4510-9e4d-d7cf67ce007b" />










9.ターミナルに動物の特徴を表示させます。








<img width="720" height="300" alt="スクリーンショット 2025-09-18 205427" src="https://github.com/user-attachments/assets/20e59429-1889-47ba-97d8-c86a82490c67" />












<img width="535" height="172" alt="スクリーンショット 2025-09-18 205513" src="https://github.com/user-attachments/assets/960a91a2-031f-41b4-9534-76f582dacac2" />




---
## ✅実行結果
### 

9.ターミナルに動物の特徴の結果が表示されます。








<img width="259" height="218" alt="スクリーンショット 2025-09-18 205638" src="https://github.com/user-attachments/assets/85bd1f3c-203a-4024-99b9-738aff5ffba2" />







---
## 🔚終わりに
これは、Javaの基本文法を学習する事を目的としています。
