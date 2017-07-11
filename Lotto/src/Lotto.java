import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Lotto {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("請輸入陣列大小：");
		int lottosize = 0;
		try {
			lottosize = Integer.parseInt(br.readLine());
			if (lottosize > 48 || lottosize < 6)
				throw new CmyException1();
		} catch (CmyException1 e) {
			e.showMessage();
			lottosize = e.changeSize();
		} catch (NumberFormatException e) {
			System.out.println("球數不為數字，設為6");
			lottosize = 6;
		} finally {
			System.out.println("樂透開獎球數為" + lottosize);
		}
		int[] lottoAry = new int[lottosize];
		System.out.println("樂透開獎實體陣列產生完畢");
		for (int i = 0; i < lottosize; i++) {
			lottoAry[i] = (int) (Math.random() * 49 + 6);
			for (int j = 0; j < i; j++) {
				if (lottoAry[i] == lottoAry[j]) {
					lottoAry[i] = (int) (Math.random() * 49 + 6);
					j = -1;
				}
			}
		}
		Arrays.sort(lottoAry);
		System.out.println("本期開獎數字為：");
		for (int a : lottoAry)
			System.out.print(a + " ");

	}

}

class CmyException1 extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CmyException1() {
		// TODO Auto-generated constructor stub
	}

	public void showMessage() {
		System.out.println("陣列大小錯誤");
	}

	public int changeSize() {
		System.out.println("陣列大小重設為6");
		return 6;
	}
}
