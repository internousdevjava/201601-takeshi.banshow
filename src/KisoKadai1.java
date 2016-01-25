/**
 *
 */

/**
 * @author internous
 *
 */
public class KisoKadai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//自由にレンジを変える縦と横の長さ
		int tate = 9;
		int yoko = 9;
		int y = 0;

		for( int i = 0; i < tate; i++ ){

			y++;

			int x = 0;

			for( int j = 0; j < yoko; j++ ){

				x++;

				if( x * y < 10 ){

					System.out.print( "0"  + y * x + " " );

				}else{

					System.out.print( y * x + " " );

				}

			}

			System.out.println();

		}

	}

}
