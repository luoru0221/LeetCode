import java.util.Scanner;

/**
 * �ж�һ�������Ƿ��ǻ�����
 * @author ����0221
 *
 */
public class LeetCode9 {

	public boolean isPalindrome(int x) {
		String str = x+"";
		for(int i=0,j=str.length()-1;i<str.length();i++,j--) {
			if(str.charAt(i) != str.charAt(j))
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		LeetCode9 demo = new LeetCode9();
		Scanner input = new Scanner(System.in);
		while(input.hasNext()) {
			int x = input.nextInt();
			System.out.println(demo.isPalindrome(x));
		}
		input.close();
	}

}
