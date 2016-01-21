/**
 *
 */

/**
 * @author internous
 *
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class KisoKadai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		Random rnd = new Random();

		//自由に変える範囲
		int kotae = rnd.nextInt( 100 ) + 1;

		int c = 0;

		for( int i = 0; i < 1; ){

			String str = "";

			c++;

			try{


				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

				System.out.print("1～100の数字を半角で入力してください   ⇒  ");

				str = br.readLine();

			}catch(IOException e){
				System.out.println("Exception :" + e);
			}

//			int kotae = 12;
			int answer = Integer.parseInt(str);

			//答えより入力値が高い分岐
			if( kotae < answer ){

//				System.out.println( "答えは( " + kotae + " )だよ"  );


				System.out.println( "入力したのは( " + answer + " )だね"  );

				System.out.println( "うーん、値が大きすぎるよ" + "\n" );

				int hinto;

				hinto = answer - kotae;

				String s_hint = Integer.toString( hinto );

				int keta = s_hint.length();

				int hanni = ( int ) Math.pow( 10, keta );


				System.out.println( "--------------ヒント!--------------" );

				System.out.println(  hanni +  "以内の数字を引くと答えだよ" );

			//入力値より答えの値が高い分岐
			}else if( kotae > answer ){


//				System.out.println( "答えは( " + kotae + " )だよ"  );


				System.out.println( "入力したのは( " + answer + " )だね"  );

				System.out.println( "うーん、値が小さすぎるよ" + "\n" );


				int hinto;

				hinto = kotae - answer;

				String s_hint = Integer.toString( hinto );

				int keta = s_hint.length();

				int hanni = ( int ) Math.pow( 10, keta );


				System.out.println( "--------------ヒント!--------------" );

				System.out.println(  hanni +  "以内の数字を足すと答えだよ" );

			//正解の分岐
			}else{


				System.out.println( "入力したのは( " + answer + " )だね"  );

				System.out.println( "おめでとう正解でーす♪" );
				System.out.println("        _＿_  %");
				System.out.println("   γ´      ｀ヽ");
				System.out.println("   i  ●   ●  i");
				System.out.println("''∩. ¨ ∇ ¨ .|   "+ c + "回目で正解だったなっしー");
				System.out.println("  ヽ ────‐ν");
				System.out.println("  │廿  ∞     .|");
				System.out.println("  ├――――――.|");
				System.out.println("   ヽ＿:´｀:.＿丿");

				break;

			}

		}
	}

}
