 class Fourth_bit {

	public static void main(String[] args) {
		int n = 23;
		int c = 0;
		while(n!=0)
		{
			int r = n%2;
			n = n/2;
			c++;
			if(c == 4)
				System.out.println(r); 
		}

	}

}
