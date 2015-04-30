package practice;
class PermutationsOfAWord{
	
	StringBuffer name;
	
	PermutationsOfAWord(StringBuffer string){
		name = string;
	}

	void swap(int i, int n){
		char temp = this.name.charAt(i);
		this.name.setCharAt(i, this.name.charAt(n));
		this.name.setCharAt(n, temp);
	}

	void permute(int i, int n){
		int j;

		if(i == n){
			if (wellordered(this.name))
				System.out.println(this.name);
		}
		else{
			for(j=i; j<n; j++){
				swap(i, j);
				permute((i+1), n);
				swap(i, j);
			}
		}
	}
	boolean wellordered(StringBuffer s){
		for(int i=0;i<s.length()-1;i++){
			if(s.charAt(i)>s.charAt(i+1))
				return false;
		}
		return true;
		
	}

	public static void main(String[] love){
		PermutationsOfAWord obj = new PermutationsOfAWord(new StringBuffer("abc"));
		obj.permute(0, obj.name.length());
	}
}