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
		System.out.println("テキストファイルメニューだよ！\n");
		System.out.println("新規作成は[ s ]、すでにあるテキストの編集は[ h ]を半角で入れてね");

		for(int i = 0; i < 1;){
			String str = "";

			try{

				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

				System.out.println("新規作成は[ s ]、すでにあるテキストの編集は[ h ]を半角で入れてね");

				str = br.readLine();

			}catch(IOException e){
				System.out.println("Exception :" + e);
			}

			if( str.equals( "s" ) ){

				System.out.println("新規作成するね♪");

				//新規メソッド起動
				SinkiFile();


			}else if( str.equals( "h" ) ){



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
	public static void Yomikomi(){

	    try{
	        File file = new File("C:\\Users\\internous\\Desktop\\banshow\\課題\\20160120kadai\\kadaiyou.txt");

	        if (checkBeforeReadfile(file)){
	          BufferedReader br = new BufferedReader(new FileReader(file));

	          String str;
	          while((str = br.readLine()) != null){
	            System.out.println(str);
	          }

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
		    try{
		      File file = new File("C:\\Users\\internous\\Desktop\\banshow\\課題\\20160120kadai\\kadaiyou.txt");

		      if (checkBeforeWritefile(file)){
		        BufferedWriter bw = new BufferedWriter(new FileWriter(file));

		        bw.write("こんにちは");
		        bw.newLine();
		        bw.write("お元気ですか？");
		        bw.newLine();

		        bw.close();
		      }else{
		        System.out.println("ファイルに書き込めません");
		      }
		    }catch(IOException e){
		      System.out.println(e);
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
		    try{
		      File file = new File("C:\\Users\\internous\\Desktop\\banshow\\課題\\20160120kadai\\kadaiyou.txt");

		      if (checkBeforeTuikaWritefile(file)){
		        FileWriter filewriter = new FileWriter(file, true);

		        filewriter.write("はい。元気です\n");
		        filewriter.write("ではまた\n");

		        filewriter.close();
		      }else{
		        System.out.println("ファイルに書き込めません");
		      }
		    }catch(IOException e){
		      System.out.println(e);
		    }
		  }

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

		  //ディレクトリを新規作成するメソッド起動
		  SinkiDir();

		  File targetfile = new File( "C:\\test" );

		  try{
			  if (targetfile.createNewFile()){

				  System.out.println( "ファイルの作成に成功しました" );

			  }else{

				  System.out.println( "ファイルの作成に失敗しました" );

			  }

		  }catch( IOException e ){

			  System.out.println( e );

		  }

	  }

	//ディレクトリを新規作成するメソッド
	public static void SinkiDir(){

		  System.out.println( "ファイルを作成したい場所を設定しておくれ～" );
		  System.out.println( "下が例だよ！test_txtてファイルに設定しようとしてるの" );
		  System.out.println( "C:\\\\Users\\\\internous\\\\Desktop\\\\banshow\\\\test_txt" );
		  System.out.println( "注意！！必ず各フォルダー名の間に \\\\ をつけてね(＞A＜)！\n" );

		  	//ファイル一覧メソッド
			String str = "";

			try{

				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

				System.out.println("新規作成は[ s ]、すでにあるテキストの編集は[ h ]を半角で入れてね");

				str = br.readLine();

			}catch(IOException e){
				System.out.println("Exception :" + e);
			}

		    File newfile = new File(str);

		    if (newfile.mkdirs()){
		      System.out.println("作成できたよ！");

		      //ファイル一覧メソッド起動
		      Itiran(str);

		    }else{
		      System.out.println("ディレクトリの作成に失敗しました");
		    }
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
	public static void main(){

		    File file = new File("c:¥¥tmp¥¥test.txt");

		    checkPermission(file);

		    if (file.setReadOnly()){
		      System.out.println("ファイルを読み取り専用にしました");
		    }else{
		      System.out.println("読み取り専用に変更が失敗しました");
		    }

		    checkPermission(file);
		  }

	//専用設定の解除メソッド( 読み取り専用にするメソッドにひもづいてる )
	private static void checkPermission(File file){

		    if (file.canRead()){
		      System.out.println("ファイルは読み込み可能です");
		    }

		    if (file.canWrite()){
		      System.out.println("ファイルは書き込み可能です");
		    }
		  }



}
