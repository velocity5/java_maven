package tutorial_java;
import java.lang.reflect.Array;
import java.util.Arrays;

public class reverseArray {
	public static void main(String[] args) {
//		int[] ArrayOrigin = {2,3,1,4,5};
//		// khoi tao tu 2 bien tro len se ngan cach = dau phay
//		for (int i = 0, j = ArrayOrigin.length - 1; i < j; i++, j--){
//			int temp = ArrayOrigin[i];
//			ArrayOrigin[i] = ArrayOrigin[j];
//			ArrayOrigin[j] = temp;
//		}
//		System.out.println("Reverse array is: ");
//		System.out.println(Arrays.toString(ArrayOrigin));

		int[] mang10 = {0,2,3,1,4,6,5,7};
		int[] mang9 = mang10;
		mang9[4] = 10;
		System.out.println(Arrays.toString(mang9));
		System.out.println(Arrays.toString(mang10));
	}
}
