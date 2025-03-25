public class BinaryConvert{
	public static void main(String[] args) {
		String binaryNumber = getBinaryNumber(64);
		System.out.printf("Binary Number of %d is %s%n",64,binaryNumber);
	}
	static String  getBinaryNumber(int  data){

		StringBuilder sb = new StringBuilder();
		while( data > 0){
			sb.append(data%2);
			data = (data/2);
		}
		sb.reverse();
		//sb.insert(0,"0");
		return  sb.toString();

	}
}