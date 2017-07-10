public class inner {
	public static void main(String args[]) {
		CMyOutClass.CMyInnerClass innerX = (new CMyOutClass(10).new CMyInnerClass(
				20));
		CMyOutClass outY = new CMyOutClass(100);

		CMyOutClass.CMyInnerClass innerY = outY.new CMyInnerClass(200);
		innerX.innerShow("8");
		innerY.innerShow("9");

	}
}
