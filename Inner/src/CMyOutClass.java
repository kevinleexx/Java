public class CMyOutClass {
	public int outVar;

	public CMyOutClass() {
	}

	public CMyOutClass(int i) {
		outVar = i;
	}

	class CMyInnerClass {
		private int innerVar;

		public CMyInnerClass() {
		}

		public CMyInnerClass(int i) {
			innerVar = i;
		}

		public void innerShow(String str) {
			System.out.print(str + ",run innner func. outVa" + outVar + "\n");
			System.out.print(str + ",run innner func. innerVa" + innerVar
					+ "\n");
		}
	}
}
