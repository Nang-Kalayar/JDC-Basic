package com.jdc.cao;
import com.jdc.cao.model.Hero;
	public class MainApplication{
		public static void main(String[] args) {
		//fully qualified name
		//com.jdc.cao.model.Hero spiderman = new com.jdc.cao.model.Hero spiderman();
		//obj creation, initialization,init
		System.out.println("Hero count: " + Hero.heroCount);
		Hero.countUp();
		System.out.println("Hero count: " + Hero.heroCount);
		

		 Hero spiderman = new Hero();//Hero() means constructor
		 spiderman.name = "Spider-man";
		 spiderman.fight();
		 spiderman.countUp();
		  System.out.println(" Hero count : " + Hero.heroCount);


		 Hero ironman = new Hero();
		 ironman.name = "Iron Man";
		 ironman.fight();
		 ironman.countUp();
		 System.out.println(" Hero count : " + Hero.heroCount);
}
	
}
