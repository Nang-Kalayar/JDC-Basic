import java.util.Scanner;
 public class CheckMark {

 	static int myan,eng,math,chem,phy,bio;
 	public static void main(String[] args) {
 		// 75 75 77 80 82 89
 		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter myan mark: ");
 		myan = sc.nextInt();

 		System.out.println("Enter eng mark: ");
 		eng = sc.nextInt();

 		System.out.println("Enter math mark: ");
 		math = sc.nextInt();

 		System.out.println("Enter chem mark: ");
 		chem = sc.nextInt();

 		System.out.println("Enter phy mark: ");
 		phy = sc.nextInt();

 		System.out.println("Enter bio mark: ");
 		bio = sc.nextInt();
 		new CheckMark().doCheck();
 	}

 	void doCheck (){
 		boolean flag = isFail(myan,eng,math,chem, phy,bio); // true
 		if (flag) {
 			System.out.println("Sorry You Fail!, Try Again");
 		} else if (normalPass()){
 			System.out.println("You did greate job (Normal Pass)");
 		}else {
 			//local variable
 			int distinction = 0;

 			if(myan > 75){
 				distinction ++;
 			}
 			if(eng > 75){
 				distinction ++;
 			}
 			if(math > 75){
 				distinction ++;
 			}
 			if(chem > 75){ 
 				distinction ++;
 			}
 			if(phy > 75){
 				distinction ++;
 			}
 			if(bio > 75){
 				distinction ++;
 			}
 			System.out.println("Wow! Amazing, You passed the exam with %dD.".formatted(distinction));
 		}


 	}

 		static boolean isFail (int myan, int eng, int math,int chem, int phy,int bio){
 			return (myan < 40 || eng < 40  || math < 40 || chem < 40 || phy < 40 || bio <40 );
 		}
 		static boolean normalPass(){
 			return (myan < 75 && eng < 75  && math < 75 && chem < 75 && phy < 75 && bio <75 ); 

 		}
 	}