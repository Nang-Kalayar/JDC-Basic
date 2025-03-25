public  class NumberTest{
	public static void main(String[] args) {
		for (String str : args){
			showLiterals(str);
		}
		
	}
	static void showLiterals(String str){
		int value = Integer.parseInt(str);

		String octal = getLiteralNumber(value,8);
		System.out.printf("Octal Number of %d is %s%n",267,octal);
		//Integer.decode means every type can be converted into integer.
		System.out.printf("%s=%d%n",octal,Integer.valueOf(octal,8));

		String binary = getLiteralNumber(267,2);
		System.out.printf("Binary Number of %d is %s%n",267,binary);
		System.out.printf("%s=%d%n",binary,Integer.valueOf(binary,2));

		String hax = getLiteralNumber(267,16);
		System.out.printf("Hax Number of %d is %s%n",267,hax);
		System.out.printf("%s=%d%n",hax,Integer.valueOf(hax,16));
	}
	
	static String getLiteralNumber(int data,int format){

		StringBuilder sb = new StringBuilder();
		while(data > 0){
			int remain = data % format;
			sb.append(format == 16 ? getHax(remain) : remain);
			data =(data/format);
		}
		sb.reverse();
		sb.insert(0,getPrefix(format));
		return sb.toString();

	}
	static String getHax(){
		String [] values = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
		return values[values];
	}
	static String getPrefix(int format){
		String prefix = null;
		switch(format){
		case 2:
			prefix = " ";
		case 8:
			prefix = "0";
		case 16:
			prefix = " ";
		default:
			break;
		}
		return prefix;

	}
}