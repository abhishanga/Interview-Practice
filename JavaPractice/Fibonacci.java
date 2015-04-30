package practice;
public class Fibonacci {
	public static void generateNum(int start, int end) {
		for (int num = start; num <= end; num++) {
			printValidNum(String.valueOf(num));
		}
	}

	private static void printValidNum(String num) {
		if (num == null || num.length() < 3) {
			return;
		}
		for (int init_size = 1; init_size <= num.length() / 2; init_size++) {
			if (isValid(num, init_size,
					Integer.parseInt(num.substring(0, init_size)),
					Integer.parseInt(num.substring(init_size, 2 * init_size)))) {
				System.out.println(num);
				break;
			}
		}
	}

	private static boolean isValid(String num, int init_size, int n1, int n2) {
		int n3 = n1 + n2;
		if (num.length() == String.valueOf(n1).length()
				+ String.valueOf(n2).length() + String.valueOf(n3).length()) {
			
			if (num.substring(
					String.valueOf(n1).length() + String.valueOf(n2).length())
					.equals(String.valueOf(n3))) {
				
				return true;
			} else {
				return false;
			}
		} else if (num.length() < String.valueOf(n1).length()
				+ String.valueOf(n2).length() + String.valueOf(n3).length()) {
			return false;
		}else{
			if (num.substring(String.valueOf(n1).length() + String.valueOf(n2).length(),String.valueOf(n1).length() + String.valueOf(n2).length()+String.valueOf(n3).length())
					.equals(String.valueOf(n3))) {
				return isValid(num.substring(String.valueOf(n1).length()),init_size,n2,n3);
			} else {
				return false;
			}
		}
	}

	public static void main(String[] args) {
		generateNum(12122430,12122436);
	}

}