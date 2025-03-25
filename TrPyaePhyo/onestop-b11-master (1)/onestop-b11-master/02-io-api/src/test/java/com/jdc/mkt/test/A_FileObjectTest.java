package com.jdc.mkt.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.IOException;
import java.net.URI;

import org.junit.jupiter.api.Test;

public class A_FileObjectTest {
	
	@Test
	void directoryAndReadWriteTest() {
		File f = new File("C:\\Users\\Nann Nann\\OneDrive\\Desktop\\folderOne\\folderTwo");
		//File f1 =new File(f,"hello.txt");
		assertTrue(f.mkdirs());
		assertFalse(f.isHidden());
		assertTrue(f.isAbsolute());
		assertFalse(f.isDirectory());
		assertTrue(f.isFile());
		
		f.delete();
		
		//File f1 = new File(f,"test.txt");
		//f1.createNewFile();
		//f1.setReadable(true);
		//f1.setWritable(false);
		
		
		
	}
	//@Test
	void createFileTest()throws IOException {
	//File f1 = new File("Hello.txt");
	File f = new File("C:\\Users\\Nann Nann\\OneDrive\\Desktop\\nang");
	File f1 =new File(f,"hello.txt");
	
	assertFalse(f1.exists());
	
	f1.createNewFile();
	assertTrue(f1.exists());
	
	//will delete on end of execution wherever code exists
	f1.deleteOnExit();
	//assertFalse(f1.exists());
	assertTrue(f1.exists());
	
	//URI
	URI uri = f1.toURI();
	File f2 = new File(uri);
	
	f2.createNewFile();
	assertTrue(f2.exists());
	
	

}
}
