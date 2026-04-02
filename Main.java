public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Docker Java!");
    }

    public static void main(String[] args) { 
      int isHungry = 1;
      String food = "ラーメン";
      
      
    System.out.println("こんにちは");
    
    if(isHungry == 0) {
        System.out.println("おなかいっぱいです");    
        
    }else {
        System.out.println("はらぺこです"); 
        
    }
    
    if(isHungry == 1) {
        System.out.println(food + "をいただきます"); 
          
    }
    System.out.println("ごちそうさまでした"); 
    
  }

    public static void main(String[] args) { 
        
        System.out.println("【数あてゲーム】"); 
        int ans = new java.util.Random().nextInt(10);
        
        for(int i = 0; i < 5; i++) {
            System.out.println("0~9の数字を入力してください"); 
            int num = new java.util.Scanner(System.in).nextInt();
            
            if(ans == num) {
                System.out.println("あたり"); 
                break;

            }else {
                System.out.println("違います");  
            }
        }
        System.out.println("ゲームを終了します"); 
    }


}



public class Main {
  public static void main(String[] args) { 
    //配列宣言するとき
    int [] points = new int [4];
    double [] weights = new double [5];
    boolean [] answers = new boolean [3];
    String [] names = new String [3];
    
  }
}

public class Main {
  public static void main(String[] args) { 
    int [] arrayA = {1,2,3};
    int [] arrayB;
    arrayB = arrayA;
    arrayB[0] = 100;

    //arrayB = arrayA;することでメモリが一緒になる。そのため1ではなく100が表示される
    System.out.println(arrayA[0]); 
    
  }
}


public class Main {
    //あらかじめ格納されている配列を宣言するとき
    int [] moneyList = {121902,8302,55100};
    
    for (int i = 0; i < moneyList.length; i++) {
        System.out.println(moeyList[i]); 

    }
    
    //拡張for構文　mは任意の変数名やからなんでもいい
    for (int m : moneyList) {
        System.out.println(m);
    }
    
        
}
