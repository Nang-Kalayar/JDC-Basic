package com.jdc.constructor.model;
 //pulic ,default modifier same package

 public  class Person{
 	
 	private String name;
 	private int age =1;
 	private String phone;
 
    public void setName(String input){
        char first = input.isEmpty() ? '\u0000' :input.charAt(0);
        boolean isSmall = first >= 65 && first <=90;
        boolean isCapital = first >=97 && first<= 122;
        if(!(isSmall || isCapital)) {
            System.out.println("please enter correct name!");
        }else {
            name = input;
        }
    }

    String getName(){
        return name;
    }  

    //Setter or mutator


    public	void setAge(int input){
 		if(input <= 0){
 			System.out.println("Age must be greater than 0.");
 		}else{
 		age = input;
            }
}
//GETTER OR ACCESSOR

    int getAge(){
        return age;
    }

    public void setPhone(String input){
        
        if (isValidPhone(input)) {
            phone = input;
        } else {
            System.out.println(" Your phone number is incorrect");
        }



 	//default constructor => constructor with no argrment(inplicit)
 	// to create class' instance
 	public Person(String name){
 		System.out.println("Person constructor...");//explicit
 	}
    boolean isValidPhone(String input){
        String prefixOne = "+959";
        String prefixTwo = "09";

        boolean result = false;

        if (input.startsWith(prefixOne) || input.startsWith(prefixTwo)){
            if(input.startsWith(prefixOne)){
                result = input.substring(4).length() == 9 ? true : false;
            }else {
                result = input.substring(2).length () == 9 ? true : false;
            }
       
     }

     return result;
    }

}