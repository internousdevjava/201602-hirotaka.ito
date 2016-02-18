import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KisoKadai1 {
	public static void main(String [] args){
		System.out.println("九九表");
		String str  = null;
		String str2 = null;
		int x;
		int y;
		boolean flg = true;

		while(flg){
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

				System.out.print("xの値を入れてください");
				str = br.readLine();

				if(isNumber(str)){
					x = Integer.parseInt(str);
					if(x >=1 && x<=100){
						System.out.println("yの数値を入れてください");
						break;
					}else{
						System.out.println("1～100までの数値を入れてください");
						continue;
					}
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		while(flg){
			try{
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				str2 = br.readLine();

				if(isNumber(str2)){
				y = Integer.parseInt(str2);
				if(y >=1 && y<=100){
					break;
				}else{
					System.out.println("入力値;1～100までの数値を入れてください");
					continue;
				}
			}else{
				System.out.println("入力値;数値を入れてください");
				continue;
			}
		}catch(Exception e){
		e.printStackTrace();
		}
	}
	x = Integer.parseInt(str);
	y = Integer.parseInt(str2);

	for(int i = 1;i <= x; i++){
System.out.println();


		for (int j = 1; j <= y; j++){
		if (i * j < 10) {
			System.out.print(" ");
		} else if (i * j < 1000) {
			System.out.print(" ");
		} else if (i * j == 10000) {
			System.out.print(" ");
		} else {
			System.out.print(" ");
		}
		System.out.print(" ");
		System.out.print(i * j);
	}

}
	}

	public static boolean isNumber(String val) {
		try{
			Integer.parseInt(val);
			return true;
		}catch(NumberFormatException nfex){
			return false;
		}
	}
}