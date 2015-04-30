import java.io.*;
public class OnesComplement {
	

	

	String binaryComplement(int n){

	char c;
	int i = 0;
	StringBuffer buf = new StringBuffer();
	while(Math.pow(2,i) < n){
	i++;
	}
	i--;
	while(i>=0){
	int re = (n>>i)&1;
	if(re == 1){
	c = '0';
	}else{
	c = '1';
	}
	buf.append(c);
	i--;
	}
	System.out.println("Complement is: "+buf.toString());
	return buf.toString();
	}

	int stringToInteger(int n){
	String complement = this.binaryComplement(n);

	int len = complement.length(), result = 0, i = 0;
	--len;
	while(len >= 0){
	int temp = complement.charAt(len)-'0';
	result += Math.pow(2,i)*temp;
	i++;
	len--;
	}
	return result;
	}

	public static void main(String[] love) throws IOException{
	OnesComplement obj = new OnesComplement();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the Number");
	int n = Integer.parseInt(br.readLine());

	int result = obj.stringToInteger(n);

	System.out.println("Result is: "+ result);
	}
	
}
