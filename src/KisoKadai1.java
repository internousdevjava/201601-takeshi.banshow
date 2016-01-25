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

	//自由にレンジを変える縦と横の長さ
	static int tate = 9;
	static int yoko = 9;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int y = 0;

		//最大の桁数をまず出す
		int intKeta = tate * yoko;

		String mojiKeta = "" + intKeta;

		int saidaiKeta = mojiKeta.length();

		for( int i = 0; i < tate; i++ ){

			y++;

			int x = 0;

			for( int j = 0; j < yoko; j++ ){

				x++;

				if( Keta( x, y ) < saidaiKeta ){

					for( int k = 0; k < saidaiKeta - Keta( x, y ); k++ ){

						System.out.print( "0" );

					}

					System.out.print( y * x + " " );

				}else{

					System.out.print( y * x + " " );

				}

			}

			System.out.println();

		}
	}

	//縦 * 横の値の桁数を出すメソッド
	public static int Keta( int tate, int yoko ){

		int intKeta = tate * yoko;

		String mojiKeta = "" + intKeta;

		int answerKeta = mojiKeta.length();

		//デバッグ
//		System.out.println(  );
//		System.out.println( saidaiKeta );

		return answerKeta;

	}

}
