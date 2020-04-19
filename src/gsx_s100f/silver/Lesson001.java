package gsx_s100f.silver;

/**
 * コンパイルエラーと勘違いしそうになるソースコード
 * メインメソッド実装クラスとしては正しくないコードに見えるが、
 * 冷静に考えると普通によくあるクラスなのでコンパイルは正常終了する。
 * メインメソッドとして呼び出すと当然実行時エラー。
 * @author nameless
 */
public class Lesson001 {

	public static void main(String args) {
		// public static void main(String[] args)のオーバーロードになるだけで
		// 特に問題のないメソッド
	}

}
