import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
public class KisoKadai3 {

	public static void main(String args[]) throws IOException{
		System.out.println("ファイル名を入力してください");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		String x = br.readLine();
		File dir=new File(new file.getParent());

		if(!dir.exists()){
			System.out.println("フォルダがありません。:"+file.getAbsolutePath());
			dir.mkdirs();
			System.out.println("作成成功");
		} else {
			System.out.println("フォルダは既に存在します。");
		}

		if(file.exists()){
			System.out.println("ファイルは既に存在します。\n" + file.getAbsolutePath());
		}else{
			System.out.println("ファイルは存在しません。\n"+file.getAbsolutePath());
			try{
				if (file.createNewFile()){
					System.out.println("作成成功");
				}else{
					System.out.println("作成失敗");
				}
			}catch(IOException e){
				System.out.println(e);
			}
		}



		int end = 0;
		while(end==0){

			System.out.println("\n\n--メニュー--\n\n 1:読み込み\n 2:書き込み\n99:終了\nを入力してください");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			int nu = 0;

			if(str.matches("^[0-9]+$")){
				nu=Integer.parseInt(str);
			}else{
				System.out.println("\n----------\n半角数値でメニューを選択してください。\n----------\n");
			}

			if(nu==99){
				System.out.println("終了");
				break;
			}
			if(nu==1){
				System.out.println("ファイルを読む");
				try{
					FileReader filereader = new FileReader(file.getAbsolutePath());

					int ch;
					while((ch = filereader.read()) != -1){
						System.out.print((char)ch);
					}

					filereader.close();
				}catch(FileNotFoundException e){
					System.out.println(e);
				}catch(IOException e){
					System.out.println(e);
				}
			}
			if(nu==2){
				System.out.println("ファイルを書く");
				try {
					boolean mode = false;
					System.out.println("モードの設定。1:追記、2:上書き");
					BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
					String str2 = br2.readLine();
					// モードを決める
					switch (str2) {
					case "1":
						mode = true;
						break;
					case "2":
						mode = false;
					default:
						break;
					}
					//出力先を作成する
					FileWriter fw = new FileWriter(file.getAbsolutePath(), mode);
					PrintWriter pw = new PrintWriter(new BufferedWriter(fw));

					//内容を指定する
					BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
					String str3 = br3.readLine();
					pw.println(str3);

					//ファイルに書き出す
					pw.close();

					//終了メッセージを画面に出力する
					System.out.println("出力が完了しました。");

				} catch (IOException ex) {
					//例外時処理
					ex.printStackTrace();
				}

			}
		}
		System.out.println("--処理終了--");
	}
}


