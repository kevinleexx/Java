import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lotto {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�п�J�}�C�j�p�G");
		int lottosize = 0;
		try {
			lottosize = Integer.parseInt(br.readLine());
			if (lottosize > 48 || lottosize < 6)
				throw new CmyException1();
		} catch (CmyException1 e) {
			e.showMessage();
			lottosize = e.changeSize();
		} catch (NumberFormatException e) {
			System.out.println("�y�Ƥ����Ʀr�A�]��6");
			lottosize = 6;
		} finally {
			System.out.println("�ֳz�}���y�Ƭ�" + lottosize);
		}
		int[] lottoAry = new int[lottosize];
		System.out.println("�ֳz�}������}�C���ͧ���");

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
		System.out.println("�}�C�j�p���~");
	}

	public int changeSize() {
		System.out.println("�}�C�j�p���]��6");
		return 6;
	}
}
