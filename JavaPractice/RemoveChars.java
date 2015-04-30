
public class RemoveChars {
	public String remove(String str,String remove){
		char[] s=str.toCharArray();
		char[] r=remove.toCharArray();
		boolean[] flags=new boolean[128];
		int i=0,dst=0;
		for(i=0;i<r.length;i++)
			flags[r[i]]=true;
		for(i=0;i<flags.length;i++)
			System.out.println(flags[i]);
		for(i=0;i<s.length;i++)
		{ if(!flags[s[i]])
			s[dst++]=s[i];
		}
		return new String(s,0,dst);
	}
	public static void main(String[] args){
		String s="abhishanga";
		String r="aeiou";
		RemoveChars n1=new RemoveChars();
		String result=n1.remove(s,r);
		System.out.println(result);
	}
}
