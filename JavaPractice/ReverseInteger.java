package practice;

public class ReverseInteger {
	public int reverse(int x) {
        if(x>Integer.MAX_VALUE || x<Integer.MIN_VALUE)
        return 0;
        boolean flag=false;
        int n;
        int s=0;
        if(x<0){
            x=-x;
            flag=true;
        }
        while(x>0){
            n=x%10;
            s=s*10+n;
            x=x/10;
        }
        if(flag)
        s=0-s;
        return s;
        
    }
	public static void main(String[] args){
		ReverseInteger r1=new ReverseInteger();
		int result=r1.reverse(153423646);
		System.out.println(result);
	}

}
