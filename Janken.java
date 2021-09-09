import java.util.Random;

public class Janken {
    public static void main(String args[]) {

        Random rand = new Random(Integer.valueOf(args[0]));
        int comA = rand.nextInt(3);
        int comB = rand.nextInt(3);
        String strA, strB;
        strA = "";
        strB = "";
        switch(comA){
            case 0 :
                strA = "グー";
                break;

            case 1 :
                strA = "チョキ";
                break;

            case 2 :
                strA = "パー";
                break;

            default:
                strA = "";
                break;
        }
        switch(comB){
            case 0 :
                strB = "グー";
                break;
            case 1 :
                strB = "チョキ";
                break;
            case 2 :
                strB = "パー";
                break;

            default:
                strB = "";
                break;
        }
        if(comA == comB){
            System.out.println(
                    "コンピュータA:" + strA
                    );
            System.out.println(
                    "コンピュータB:" + strB
                    );
            System.out.println(
                    "あいこ"
                    );
        }
        else if(((comA == 0) && (comB == 1)) || ((comA == 1) && (comB == 2)) || ((comA == 2) && (comB == 0))){
            System.out.println(
                    "コンピュータA:" + strA
                    );
            System.out.println(
                    "コンピュータB:" + strB
                    );
            System.out.println(
                    "コンピュータAの勝ち"
                    );
        }
        else{
            System.out.println(
                    "コンピュータA:" + strA
                    );
            System.out.println(
                    "コンピュータB:" + strB
                    );
            System.out.println(
                    "コンピュータAの負け"
                    );
        }
    }
}
