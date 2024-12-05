package main;

import fylesystem.FileSystem;
import fylesystem.Output;
import fylesystem.outputs.*;
import fylesystem.outputs.filter.EncryptFilter;
import fylesystem.outputs.filter.MD5Filter;
import fylesystem.outputs.filter.Normalize;
import fylesystem.outputs.filter.NumberOfCharactersFilter;
import fylesystem.outputs.filter.RepeatedSpacesFilter;
import fylesystem.outputs.filter.WriteMultipleFilter;

public class Main {
	
	public static void main(String[] args) {
		
		FileSystem system = new FileSystem();
//		
//		Output disk = new Normalize(new FileOutput("copy.txt"));
//		Output internet = new EncryptFilter( new Internet("156.35.233.143"));
//		Output bluetooth = new RepeatedSpacesFilter( new EncryptFilter(new Bluetooth("César's iPhone")));
//
//		system.copyFile("private.txt", disk);
//		system.copyFile("private.txt", internet);
//		system.copyFile("private.txt", bluetooth);
//		
//		// Exercise 1
//		system.copyFile("private.txt", new Normalize(new FileOutput("a.txt")));
//		system.copyFile("private.txt", new Normalize( new EncryptFilter( new FileOutput("b.txt"))));
//		
//		// Exercise 2
//		system.copyFile("private.txt", new EncryptFilter( new Normalize(new Internet("1.1.1.1"))));
//		system.copyFile("private.txt", new EncryptFilter( new RepeatedSpacesFilter(new Internet("1.1.1.2"))));
//		system.copyFile("private.txt", new EncryptFilter( new RepeatedSpacesFilter( new Normalize(new Internet("1.1.1.3")))));
//
//		// Exercise 3
//		system.copyFile("private.txt", new NumberOfCharactersFilter( new Normalize(new Internet("1.1.1.1"))));
//
//		// Exercise 4
//		NumberOfCharactersFilter beforeNormalizing = new NumberOfCharactersFilter(internet);
//		NumberOfCharactersFilter afterNormalizing = new NumberOfCharactersFilter( new Normalize(beforeNormalizing));
//		
//		system.copyFile("private.txt", beforeNormalizing);
//		
//		System.out.println("Before normalisation there were "
//		 + beforeNormalizing.getNumberOfCharacters() + " characters");
//		
//		system.copyFile("private.txt", afterNormalizing);
//		
//		System.out.println("After normalisation, " + afterNormalizing.getNumberOfCharacters()
//		 + " characters were copied");
//		
//		// Exercise 5
//		system.copyFile("private.txt", new EncryptFilter(new WriteMultipleFilter(internet, bluetooth)));
		
		
		// Additional exercises
		
		// MODIFICATION 1
		system.copyFile("private.txt", new Normalize(new WriteMultipleFilter(new FileOutput("a.txt"), new EncryptFilter(new FileOutput("b.txt")))));
		
		// MODIFICATION 3
		MD5Filter md5 = new MD5Filter(new Internet("1.1.1.3"));
		system.copyFile("private.txt", new EncryptFilter(md5));
		System.out.println("total size hash: " + md5.getHash());
	
	}
}
