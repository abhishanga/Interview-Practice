package practice;
import java.util.HashSet;
import java.util.Set;

public class ColorfulNumber {

	public static boolean isColorful(int number) {
		String num = String.valueOf(number);
		int length = num.length();
		int size = 1;
		Set<Integer> set = new HashSet<Integer>();
		while (size <= length) {
			for (int i = 0; i <= length - size; i++) {
				int j = size;
				int index = 0;
				int value = 1;
				while (j > 0) {
					value *= Integer.parseInt(String.valueOf(num.charAt(i
							+ index)));
					j--;
					index++;
				}
				if (set.contains(value)) {
					return false;
				} else {
					set.add(value);
				}
			}
			size++;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isColorful(236));
	}

}