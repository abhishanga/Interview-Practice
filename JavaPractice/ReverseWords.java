package practice;

public class ReverseWords {
	public void reverse(String s){
		if(s==null || s.length()==0)
			return;
		
		String[] arr = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = arr.length - 1; i >= 0; --i) {
			
			if (!arr[i].equals("")) {
				sb.append(arr[i]).append(" ");
			}
		}
		System.out.print(sb);
		
	}
	public static void main(String[] args){
		ReverseWords r1=new ReverseWords();
		r1.reverse("Do or do not,there is no try.");
	}

}
