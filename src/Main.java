import java.util.Random;
import java.util.Scanner;

class Main{
	public static void main (String []args) {
		
		Random rand =new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("じゃんけんをしましょう！\n0 ＝ パー, 1 = チョキ, 2 = パー️");
	//見かけ上のじゃんけん
		String janken = scan.next();
	int commputer = rand.nextInt(2) ;
		
	//引き分け判定
	while(commputer == 0 ){
		System.out.println("引き分けです！もう一回！");
		
		int commputer_next = rand.nextInt(2) ;
		String janken_next = scan.next();
		if(commputer_next != 0) {
			break;
		}
	}
	//勝利判定乱数を生成
	int commputer_3rd = rand.nextInt(2)+1;
	//Senko_koko 変数の初期値は変更の有無を確認するため、2に設定しています。
	int Senko_koko = 2 ;
	
	if(commputer_3rd == 1) {
		System.out.println("貴方の勝ちです！\n貴方が先攻です！");
		Senko_koko = 0 ;
		
	}else if(commputer_3rd == 2) {
		System.out.println("貴方の負けです！\n貴方が後攻です！");
		Senko_koko = 1 ;
		
	}
	System.out.println(Senko_koko);
	
	String a1 = "-",a2 = "-", a3 = "-", b1 = "-", b2 = "-", b3 = "-", c1 = "-", c2 = "-", c3 = "-";
	
	String[][] bord_sample = {{"a1","a2","a3"},{"b1","b2","b3"},{"c1","c2","c3"}};

	
	System.out.println("これが、ボードの座標です。マークを置きたい場所の座標を設定してください");
	System.out.println(java.util.Arrays.deepToString(bord_sample).replace("], [", "\n").replace("[", "").replace("]", "").replace(",", ""));
	
	System.out.println("ゲームを開始しますか？\n y/n");
	String YorN = scan.next();
	if(YorN.equals("y")) {	
		
	}else if(YorN.equals("n")) {
		System.out.println("ゲームを終了しました。");
		System.exit(0);
	}else {
		System.out.println("入力条件に合わないため、処理を停止します");
		System.exit(0);
	}
	//丸バツゲーム開始
	
	if(Senko_koko == 0) {
		//じゃんけん勝ちの場合
			for(;;) {
				
				System.out.println(a1 + a2 + a3);
				System.out.println(b1 + b2 + b3);
				System.out.println(c1 + c2 + c3);
				
				
				
				System.out.println("入力してください");
				
				String sentaku = scan.next();
					if(sentaku.equals("a1")) {
						a1 = "O";
					}else if(sentaku.equals("a2")){
						a2 = "O";
					}else if(sentaku.equals("a3")){
						a3 = "O";
					}else if(sentaku.equals("b1")){
						b1 = "O";
					}else if(sentaku.equals("b2")) {
						b2 = "O";
					}else if(sentaku.equals("b3")) {
						b3 = "O";
					}else if(sentaku.equals("c1")) {
						c1 = "O";
					}else if(sentaku.equals("c2")) {
						c2 = "O";
					}else if(sentaku.equals("c3")) {
						c3 = "O";
					}else {System.out.println("正常な入力ではありません");}
					
					int X_select = rand.nextInt(8);
					if(X_select == 0) {
						a1 = "X";
					}else if(X_select == 1){
						a2 = "X";
					}else if(X_select == 2){
						a3 = "X";
					}else if(X_select == 3){
						b1 = "X";
					}else if(X_select == 4) {
						b2 = "X";
					}else if(X_select == 5) {
						b3 = "X";
					}else if(X_select == 6) {
						c1 = "X";
					}else if(X_select == 7) {
						c2 = "X";
					}else if(X_select == 8) {
						c3 = "X";
					
					}
					if(a1.equals("O") && a2.equals("O") && a3.equals("O")
					|| b1.equals("O") && b2.equals("O") && b3.equals("O")
					|| c1.equals("O") && c2.equals("O") && c2.equals("O")
					|| a1.equals("O") && b1.equals("O") && c1.equals("O")
					|| a2.equals("O") && b2.equals("v") && c2.equals("O")
					|| a3.equals("O") && b3.equals("O") && c3.equals("O")
					|| a1.equals("O") && b2.equals("O") && c3.equals("O")
					|| a3.equals("O") && b2.equals("O") && c1.equals("O")
					|| a1.equals("X") && a2.equals("X") && a3.equals("X")
					|| b1.equals("X") && b2.equals("X") && b3.equals("X")
					|| c1.equals("X") && c2.equals("X") && c2.equals("X")
					|| a1.equals("X") && b1.equals("X") && c1.equals("X")
					|| a2.equals("X") && b2.equals("X") && c2.equals("X")
					|| a3.equals("X") && b3.equals("X") && c3.equals("X")
					|| a1.equals("X") && b2.equals("X") && c3.equals("X")
					|| a3.equals("X") && b2.equals("X") && c1.equals("X")) {
						
						break;
					}
	}System.out.println("ゲームが終了しました\n勝敗は以下の通りです");
	System.out.println(a1 + a2 + a3);
	System.out.println(b1 + b2 + b3);
	System.out.println(c1 + c2 + c3);
	
	//勝利判定
	if(a1.equals("O") && a2.equals("O") && a3.equals("O")
			|| b1.equals("O") && b2.equals("O") && b3.equals("O")
			|| c1.equals("O") && c2.equals("O") && c2.equals("O")
			|| a1.equals("O") && b1.equals("O") && c1.equals("O")
			|| a2.equals("O") && b2.equals("O") && c2.equals("O")
			|| a3.equals("O") && b3.equals("O") && c3.equals("O")
			|| a1.equals("O") && b2.equals("O") && c3.equals("O")
			|| a3.equals("O") && b2.equals("O") && c1.equals("O")){
		System.out.println("貴方が勝利しました");

	}else if(a1.equals("X") && a2.equals("X") && a3.equals("X")
	|| b1.equals("X") && b2.equals("X") && b3.equals("X")
	|| c1.equals("X") && c2.equals("X") && c2.equals("X")
	|| a1.equals("X") && b1.equals("X") && c1.equals("X")
	|| a2.equals("X") && b2.equals("X") && c2.equals("X")
	|| a3.equals("X") && b3.equals("X") && c3.equals("X")
	|| a1.equals("X") && b2.equals("X") && c3.equals("X")
	|| a3.equals("X") && b2.equals("X") && c1.equals("X")) {
		System.out.println("コンピューターが勝利しました");
	
	System.exit(0);
	
	}else if(Senko_koko == 1) {
		//じゃんけん負けの場合
		for(;;) {
			int X_select = rand.nextInt(8);
			if(X_select == 0) {
				a1 = "X";
			}else if(X_select == 1){
				a2 = "X";
			}else if(X_select == 2){
				a3 = "X";
			}else if(X_select == 3){
				b1 = "X";
			}else if(X_select == 4) {
				b2 = "X";
			}else if(X_select == 5) {
				b3 = "X";
			}else if(X_select == 6) {
				c1 = "X";
			}else if(X_select == 7) {
				c2 = "X";
			}else if(X_select == 8) {
				c3 = "X";
			}
			
			System.out.println(a1 + a2 + a3);
			System.out.println(b1 + b2 + b3);
			System.out.println(c1 + c2 + c3);
			
			System.out.println("入力してください");
			
			String sentaku = scan.next();
				if(sentaku.equals("a1")) {
					a1 = "O";
				}else if(sentaku.equals("a2")){
					a2 = "O";
				}else if(sentaku.equals("a3")){
					a3 = "O";
				}else if(sentaku.equals("b1")){
					b1 = "O";
				}else if(sentaku.equals("b2")) {
					b2 = "O";
				}else if(sentaku.equals("b3")) {
					b3 = "O";
				}else if(sentaku.equals("c1")) {
					c1 = "O";
				}else if(sentaku.equals("c2")) {
					c2 = "O";
				}else if(sentaku.equals("c3")) {
					c3 = "O";
				}else {System.out.println("正常な入力ではありません");}		
				
				if(a1.equals("O") && a2.equals("O") && a3.equals("O")
				|| b1.equals("O") && b2.equals("O") && b3.equals("O")
				|| c1.equals("O") && c2.equals("O") && c2.equals("O")
				|| a1.equals("O") && b1.equals("O") && c1.equals("O")
				|| a2.equals("O") && b2.equals("O") && c2.equals("O")
				|| a3.equals("O") && b3.equals("O") && c3.equals("O")
				|| a1.equals("O") && b2.equals("O") && c3.equals("O")
				|| a3.equals("O") && b2.equals("O") && c1.equals("O")
				|| a1.equals("X") && a2.equals("X") && a3.equals("X")
				|| b1.equals("X") && b2.equals("X") && b3.equals("X")
				|| c1.equals("X") && c2.equals("X") && c2.equals("X")
				|| a1.equals("X") && b1.equals("X") && c1.equals("X")
				|| a2.equals("X") && b2.equals("X") && c2.equals("X")
				|| a3.equals("X") && b3.equals("X") && c3.equals("X")
				|| a1.equals("X") && b2.equals("X") && c3.equals("X")
				|| a3.equals("X") && b2.equals("X") && c1.equals("X")) {
					
					break;
				}
}System.out.println("ゲームが終了しました\\n勝敗は以下の通りです");
System.out.println(a1 + a2 + a3);
System.out.println(b1 + b2 + b3);
System.out.println(c1 + c2 + c3);

//勝利判定
if(a1.equals("O") && a2.equals("O") && a3.equals("O")
		|| b1.equals("O") && b2.equals("O") && b3.equals("O")
		|| c1.equals("O") && c2.equals("O") && c2.equals("O")
		|| a1.equals("O") && b1.equals("O") && c1.equals("O")
		|| a2.equals("O") && b2.equals("O") && c2.equals("O")
		|| a3.equals("O") && b3.equals("O") && c3.equals("O")
		|| a1.equals("O") && b2.equals("O") && c3.equals("O")
		|| a3.equals("O") && b2.equals("O") && c1.equals("O")){
	System.out.println("貴方が勝利しました");

}else if(a1.equals("X") && a2.equals("X") && a3.equals("X")
|| b1.equals("X") && b2.equals("X") && b3.equals("X")
|| c1.equals("X") && c2.equals("X") && c2.equals("X")
|| a1.equals("X") && b1.equals("X") && c1.equals("X")
|| a2.equals("X") && b2.equals("X") && c2.equals("X")
|| a3.equals("X") && b3.equals("X") && c3.equals("X")
|| a1.equals("X") && b2.equals("X") && c3.equals("X")
|| a3.equals("X") && b2.equals("X") && c1.equals("X")) {
	System.out.println("コンピューターが勝利しました");
}
}
	
	
}

	}}