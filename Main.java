public class Main {
  public static void main(String[] args){
    //インスタンス生成
    Hero h = new Hero(); 

    //フィールドへの値代入
    h.name ="ミナト";
    h.hp = 100;
    System.out.println("勇者"+h.name+"を生み出しました！");

    //勇者のメソッド呼び出し
    h.sit(5);
    h.slip();
    h.sit(25);
    h.run();
  }
}
