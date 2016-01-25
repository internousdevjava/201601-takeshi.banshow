import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 */
import java.io.InputStreamReader;

/**
 * @author internous
 *
 */
public class KisoKadai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

//		Yomikomi("C:\\Users\\internous\\Desktop\\banshow\\test\\test.txt");

		for(int i = 0; i < 1;){

			String str = "";

			System.out.println("テキストファイルメニューだよ！\n");
			System.out.println("新規作成は[ 1 ]、すでにあるテキストの編集は[ 2 ]");
			System.out.println("終了は[ 3 ]を入力してね♪");

			try{

				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

				str = br.readLine();

			}catch(IOException e){

				System.out.println("Exception :" + e);
			}

			if( str.equals( "1" ) ){

				System.out.println("新規作成するね♪");

				//新規メソッド起動
				SinkiFile();

			}else if( str.equals( "2" ) ){

				System.out.println("既にあるファイルを編集しようね♪");
				String henshu = "";
				System.out.println("テキスト内容を全て消して書き直すなら[ 1 ]\n");
				System.out.println("テキスト内容に追記したかったら[ 2 ]とかの1以外を押してね♪");

				try{

					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

					henshu = br.readLine();

				}catch(IOException e){

					System.out.println("Exception :" + e);

				}

				if( henshu.equals( "1" ) ){

					System.out.println("オッケー♪書き直しだね\n");

					Uwagaki();

				}else{

					System.out.println("オッケー♪追記だね\n");

					Tuika();

				}

			}else if ( str.equals( "3" ) ){

				System.out.println("おっけー！またね～♪");

				break;

			}else{

				System.out.println("文字が違うよ；；");

			}
		}

	}

	//ファイル一覧メソッド
	public static void Itiran(String pass){

		  File targetfile = new File( pass );

		  String[] filelist = targetfile.list();

		  for (int i = 0 ; i < filelist.length ; i++){

			  System.out.println(filelist[i]);

		  }
	  }

	//テキスト読み込みメソッド
	public static void Yomikomi( String pass ){

	    try{

	        File file = new File( pass );

	        if (checkBeforeReadfile(file)){

	          BufferedReader br = new BufferedReader(new FileReader(file));

	          String str = null;

	            System.out.println("以下テキスト内容");
	            System.out.println("---------( 枠 )------------\n");

	          while((str = br.readLine()) != null){

		            System.out.println( str );

	          }

	            System.out.println("---------( 枠 )------------\n");

	          br.close();

	        }else{

	          System.out.println("ファイルが見つからないか開けません");

	        }

	      }catch(FileNotFoundException e){

	        System.out.println(e);

	      }catch(IOException e){

	        System.out.println(e);

	      }
	}
	//上を全て読み込んだか判断するメソッド
	private static boolean checkBeforeReadfile(File file){

	      if (file.exists()){

	    	  if (file.isFile() && file.canRead()){

	    		  return true;

	    	  }
	      }

	      return false;

	}

	//テキスト上書きメソッド
	  public static void Uwagaki(){

			for( int i = 0; i < 1; ){

				System.out.println( "何処のテキストファイルを上書きしよっか？" );
				System.out.println( "↓例だよ\n" );
				System.out.println( "C:\\Users\\internous\\Desktop\\banshow\\test\\test.txt" );
				System.out.println( "注意！！必ず各フォルダー名の間に \\\\ をつけてね(＞A＜)！\n" );
				System.out.println( "規定に入れた人は[ 何も入力せず ]にエンターキーを押してね♪" );
				System.out.println( "↓入力" );

				String pass = GetKey();

				if( pass.equals( "" ) ){

					System.out.println( "ファイルの名前を教えてね" );
					System.out.println( "下が例だよ！test.txtってファイルに設定しようとしてるの♪[ ファイル名.txt ]\n " );
					System.out.println( "test.txt\n" );
					System.out.println( "↓入力" );

					String filename = GetKey();

					for( int j = 0; j < 1; ){

						try{

							File file = new File("C:\\Users\\internous\\Desktop\\banshow\\test\\" + filename );

							if (checkBeforeWritefile(file)){

								BufferedWriter bw = new BufferedWriter(new FileWriter(file));

								System.out.println( "C:\\Users\\internous\\Desktop\\banshow\\test\\" + filename + "に書き込むね\n" );
								System.out.println( "↓内容" );

								String  UserW = GetKey();

								bw.write( UserW );
								bw.newLine();

								bw.close();

								Yomikomi( "C:\\Users\\internous\\Desktop\\banshow\\test\\" + filename );

								System.out.println( "上の内容で良ければ[ 1 ]" );
								System.out.println( "上の内容を書き直したければ[ 1 ]以外を押してね♪" );

								String ShinnkiKakikomi = GetKey();

								if( ShinnkiKakikomi.equals( "1" )){
									System.out.println( "テキストの上書き完了！！" );
									break;


								}else{
									System.out.println( "オッケー♪レッツもう一回！" );

								}

							}else{

								System.out.println( "ファイル名間違ってるかも" );
								System.out.println( "もう一度入力してみて～(TAT)" );

								break;

							}

						}catch(IOException e){

							System.out.println(e);

						}

					}

					break;
				}else{

					for( int j = 0; j < 1; ){

						try{

							File file = new File( pass );

							if (checkBeforeWritefile(file)){

								BufferedWriter bw = new BufferedWriter(new FileWriter(file));

								System.out.println( pass + "に書き込むね\n" );
								System.out.println( "↓内容" );

								String  UserW = GetKey();

								bw.write( UserW );
								bw.newLine();

								bw.close();

								Yomikomi( pass );

								System.out.println( "上の内容で良ければ[ 1 ]" );
								System.out.println( "上の内容を書き直したければ[ 1 ]以外を押してね♪" );

								String ShinnkiKakikomi = GetKey();

								if( ShinnkiKakikomi.equals( "1" )){

									System.out.println( "テキストの上書き完了！！" );

									break;

								}else{

									System.out.println( "オッケー♪レッツもう一回！" );

								}

							}else{

								System.out.println( "ファイル名間違ってるかも" );
								System.out.println( "もう一度入力してみて～(TAT)" );

								break;

							}

						}catch(IOException e){

							System.out.println(e);

						}
					}


				}
				break;
			}
	  }
	//上を全て書き込んだか判断するメソッド
	private static boolean checkBeforeWritefile(File file){

		if (file.exists()){

			if (file.isFile() && file.canWrite()){

				return true;

			}
		}

		return false;

	}

	//テキスト追加メソッド
	public static void Tuika(){

		for( int i = 0; i < 1;){

			System.out.println( "何処のテキストファイルを追記しよっか？" );
			System.out.println( "↓例だよ\n" );
			System.out.println( "C:\\Users\\internous\\Desktop\\banshow\\test\\test.txt" );
			System.out.println( "注意！！必ず各フォルダー名の間に \\\\ をつけてね(＞A＜)！\n" );
			System.out.println( "規定に入れた人は[ 何も入力せず ]にエンターキーを押してね♪" );
			System.out.println( "↓入力" );

			String pass = GetKey();

			if( pass.equals( "" ) ){

				System.out.println( "ファイルの名前を教えてね" );
				System.out.println( "下が例だよ！test.txtってファイルに設定しようとしてるの♪[ ファイル名.txt ]\n " );
				System.out.println( "test.txt\n" );
				System.out.println( "↓入力" );

				String filename = GetKey();

				for( int j = 0; j < 1; ){

					try{
						File file = new File("C:\\Users\\internous\\Desktop\\banshow\\test\\" + filename );

						if (checkBeforeTuikaWritefile(file)){

							FileWriter filewriter = new FileWriter(file, true);

							System.out.println( "C:\\Users\\internous\\Desktop\\banshow\\test\\" + filename + "に書き込むね\n" );
							System.out.println( "↓内容" );

							String  UserW = GetKey();

							filewriter.write( UserW + "\n");

							filewriter.close();

							Yomikomi( "C:\\Users\\internous\\Desktop\\banshow\\test\\" + filename );

							System.out.println( "上の内容で良ければ[ 1 ]" );
							System.out.println( "上の内容を書き足したければ[ 1 ]以外を押してね♪" );

							String TuikaKakikomi = GetKey();

							if( TuikaKakikomi.equals( "1" )){

								System.out.println( "テキストの追記完了！！" );

								break;

							}else{

								System.out.println( "オッケー♪レッツもう一行！" );

							}

						}else{

							System.out.println( "ファイル名間違ってるかも" );
							System.out.println( "もう一度入力してみて～(TAT)" );

							break;

						}

					}catch(IOException e){

						System.out.println(e);

					}
				}

				break;

			}else{

				for( int j = 0; j < 1; ){

					try{
						File file = new File( pass );

						if (checkBeforeTuikaWritefile(file)){

							FileWriter filewriter = new FileWriter(file, true);

							System.out.println( pass + "に書き込むね\n" );
							System.out.println( "↓内容" );

							String  UserW = GetKey();

							filewriter.write( UserW + "\n");

							filewriter.close();

							Yomikomi( pass );

							System.out.println( "上の内容で良ければ[ 1 ]" );
							System.out.println( "上の内容を書き足したければ[ 1 ]以外を押してね♪" );

							String ShinnkiKakikomi = GetKey();

							if( ShinnkiKakikomi.equals( "1" )){

								System.out.println( "テキストの追記完了！！" );

								break;

							}else{

								System.out.println( "オッケー♪レッツもう一行！" );

							}

						}else{

							System.out.println( "ファイル名間違ってるかも" );
							System.out.println( "もう一度入力してみて～(TAT)" );

							break;

						}

					}catch(IOException e){

						System.out.println(e);

					}
				}

				break;

			}
		}
	}

	//上の補助
	private static boolean checkBeforeTuikaWritefile(File file){

		if (file.exists()){

			if (file.isFile() && file.canWrite()){

				return true;
			}
		}

		return false;

	}

	//ファイルを新規作成するメソッド
	public static void SinkiFile(){

	 	System.out.println( "テキストファイルをどこにしよっか？" );
		System.out.println( "現在の場所で良かったら何も入力せずにエンターキーを" );
		System.out.println( "指定したかったら適当に何か入力してね" );
		System.out.println( "↓入力" );

		String kitei = "";

		try{

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			kitei = br.readLine();

		}catch(IOException e){

			System.out.println("Exception :" + e);
		}

		for( int i = 0; i < 1; ){

			String str = "";

			if( kitei.equals( "" ) ){

				String basho = "./";

			 	System.out.println( "では！ファイルの名前を教えてね" );
				System.out.println( "下が例だよ！test.txtってファイルに設定しようとしてるの[ ファイル名.txt ]\n " );
				System.out.println( "test.txt\n" );
				System.out.println( "↓入力" );


				try{


					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

					str = br.readLine();

				}catch(IOException e){

					System.out.println("Exception :" + e);

				}

				File targetfile = new File( basho + "\\" + str );

				try{

					if (targetfile.createNewFile()){

						System.out.println( "ファイルを作ったよ！えっへん♪" );

						break;

					}else{

						System.out.println( "そのファイルは既に有るか、名前を入れ間違ってるかも" );

					}

				}catch( IOException e ){

					System.out.println( e );

				}

			}else{

				//ディレクトリを新規作成するメソッド起動
				String basho = SinkiDir();

			 	System.out.println( "では！ファイルの名前を教えてね" );
				System.out.println( "下が例だよ！\ntest.txtってファイルに設定しようとしてるの[ ファイル名.txt ]\n " );
				System.out.println( "test.txt\n" );
				System.out.println( "↓入力" );

				try{

					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

					str = br.readLine();

				}catch(IOException e){

					System.out.println("Exception :" + e);

				}

				File targetfile = new File( basho + "\\" + str );

				try{

					if (targetfile.createNewFile()){

						System.out.println( "ファイルを作ったよ！えっへん♪" );

						break;

					}else{

					      System.out.println("ファイルの作成に失敗しちゃったよ(TAT)");
					      System.out.println("名前の入力を失敗しちゃったのか");
					      System.out.println("既に作ってあるかのどっちかだよb");
					      System.out.println("作ってあったかも！って思って、「新規作成を終了」なら[ 1 ]を押してね♪");
					      System.out.println("名前の入力をもう一度したかったら[ 2 ]とか1以外を入れてね♪");
						  System.out.println("↓入力");

						  String str2 = "";

							try{

								BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

								str2 = br.readLine();

							}catch(IOException e){

								System.out.println("Exception :" + e);

							}

							if( str2.equals( "1" ) ){

								System.out.println("ファイル作成完了♪\n");
							      System.out.println( "今入力した名前は:" + str );

							      break;

							}else{

							      System.out.println("レッツもう一回♪\n");

							}
					}

				}catch( IOException e ){

					System.out.println( e );

				}
			}
		}
	}

	//ディレクトリを新規作成するメソッド
	public static String SinkiDir(){

		for( int i = 0; i < 1; ){
			System.out.println( "ファイルを作りたいフォルダの場所を設定しておくれ～" );
			System.out.println( "下が例だよ！testってフォルダを設定しようとしてるの\n" );
			System.out.println( "c:\\\\Users\\\\internous\\\\Desktop\\\\banshow\\\\test\n" );
			System.out.println( "注意！！必ず各フォルダー名の間に \\\\ をつけてね(＞A＜)！" );
			System.out.println( "↓入力" );

			String pass = "";

			pass = GetKey();

			File newfile = new File( pass );

		    if (newfile.mkdirs()){

		      System.out.println("その場所は無かったから作ったよ！えっへん♪");
		      System.out.println();

		      return pass;

		    }else{

		      System.out.println("フォルダの作成に失敗しちゃったよ(TAT)");
		      System.out.println("場所の入力失敗しちゃったのか");
		      System.out.println("既に作ってあるかのどっちかだよb");
		      System.out.println("作ってあったかも！って思って、次の「ファイルの名前をつけに行く」なら[ 1 ]を押してね♪");
		      System.out.println("場所の入力をもう一度したかったら[ 2 ]とか1以外を入れてね♪");
			  System.out.println("↓入力");

				String str2 = "";

				str2 = GetKey();

				if( str2.equals( "1" ) ){

				      System.out.println( "今入力したのは:" + pass );
				      System.out.println("そっかそっかおっけー♪\n");

				      return pass;

				}else{

				      System.out.println("レッツもう一回♪\n");

				}
		    }
		}
		return "";
	}

	//パスを取得するメソッド
	public static void GetPass(){

		  File targetfile = new File("test.txt");

	      String path = targetfile.getAbsolutePath();

	      System.out.println("取得したFileパスは：" + path);

	  }

	//ファイルかディレクトリか調べるメソッド
	public static void Hantei(){

		    File cdirectory = new File( "c:\\" );

		    File[] filelist = cdirectory.listFiles();

		    for (int i = 0 ; i < filelist.length; i++){

		    	if (filelist[i].isFile()){

		    		System.out.println("[F]" + filelist[i].getName());

		    	}else if (filelist[i].isDirectory()){

		    		System.out.println("[D]" + filelist[i].getName());

		    	}else{

		    		System.out.println("[?]" + filelist[i].getName());

		    	}
		    }
	  }

	//ファイルの存在確認と削除メソッド
	public static void Delete(){

		    File file = new File("c:\\test");

		    if (file.exists()){

		    	if (file.delete()){

		    		System.out.println("ファイルを削除しました");

		    	}else{

		    		System.out.println("ファイルの削除に失敗しました");

		    	}

		    }else{

		    	System.out.println("ファイルが見つかりません");

		    }
		  }

	//読み取り専用にするメソッド

	//読み込み専用にする
	public static void YomikomiSenyou(){

		    File file = new File("c:¥¥tmp¥¥test.txt");

		    checkPermission(file);

		    if (file.setReadOnly()){

		    	System.out.println("ファイルを読み取り専用にしました");

		    }else{

		    	System.out.println("読み取り専用に変更が失敗しました");

		    }

		    checkPermission(file);

	}

	//上を補助
	private static void checkPermission(File file){

		    if (file.canRead()){

		    	System.out.println("ファイルは読み込み可能です");

		    }

		    if (file.canWrite()){

		    	System.out.println("ファイルは書き込み可能です");

		    }
		  }

	//キーボード入力するメソッド
	private static String GetKey(){

		String pass = "";

		try{

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			pass = br.readLine();

		}catch(IOException e){

			System.out.println("Exception :" + e);

		}

		return pass;

	}

}
