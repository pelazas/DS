package main;

import java.io.*;
import java.util.*;

import virtualmachine.Instruction;
import virtualmachine.VirtualMachine;

public class Main {
	

	public static void main(String[] args) throws Exception {
		BufferedReader file = new BufferedReader(new FileReader("factorial.txt"));
		Parser parser = new Parser(file);
		List<Instruction> instructions = parser.getInstructions();
		
		
		VirtualMachine vm = new VirtualMachine(instructions);
		vm.run();
	}

	
	
}
