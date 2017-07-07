
public class TestNum {
	public static int max(int a,int b){
		return a>b?a:b;
	}
	
	public static void swap(Number num){
		int temp = num.getNum1();
		num.setNum1(num.getNum2());
		num.setNum2(temp);
	}
}
