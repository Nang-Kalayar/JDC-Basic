public class MainPair{
	public static void main(String[] args) {
		
			 Pair<String,Integer> intPair = new OrderPair<>("Sample",10);
			 Pair<String,String> strPair = new OrderPair<>("Key","Value");
			 System.out.println(intPair);
			 System.out.println(strPair);
		}
	}