public class Hero {
 /* 属性 */
  String name;
  int hp;
 /* 属性 */

 /* 動作 */
  void run(){
    System.out.println(this.name +"は、逃げ出した！");
    System.out.println("GAME OVER");
    System.out.println("最終HPは" + this.hp +"でした");
  }
  void sit(int sec){
    this.hp +=sec;
    System.out.println(this.name + sec +"秒座った！");
    System.out.println("HPが" + sec +"ポイント回復した！");
  }
  void slip(){
    this.hp -=5;
    System.out.println(this.name +"は、転んだ！");
    System.out.println("5のダメージ！");
  }
  void sleep(){
    this.hp = 100;
    System.out.println(this.name + "は眠って回復した！");
  }
 /* 動作 */
}