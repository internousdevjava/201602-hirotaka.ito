public class JissenKadai1_1 {
  public static void main(String[] args) {
        String msg = "";
        try {
          try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
          msg = "ドライバのロードに成功しました";
        } catch (ClassNotFoundException e){
          msg = "ドライバのロードに失敗しました";
        }
        System.out.println(msg);
    }
}