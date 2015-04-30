package practice;

public class ReplaceAWithThe {
 public static void main(String[] args){
	String input = "This is a sentence a English";
	 String[] inputSplit = input.split(" a ");
	 input = inputSplit[0];
	 for(int i=1; i<=inputSplit.length-1; i++) {
	    input += " the "+inputSplit[i];
	 }
	 System.out.println(input);
	 
 }
}
