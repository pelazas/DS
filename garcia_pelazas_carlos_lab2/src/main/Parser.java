package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import instruction.Add;
import instruction.Input;
import instruction.Jump;
import instruction.JumpGreater;
import instruction.Load;
import instruction.Mul;
import instruction.Output;
import instruction.Push;
import instruction.Store;
import instruction.Sub;
import virtualmachine.Instruction;

public class Parser {
	
	private List<Instruction> instructions = new ArrayList<>();

	public Parser(BufferedReader file) {
		String line;
		try {
			
		while ((line = file.readLine()) != null)
			addInstruction(line);
			
		file.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void addInstruction(String line) {
		if (line.trim().length() == 0)
			return;
		String[] sentence = line.split(" ");
		if (sentence[0].equals("push")) {
			instructions.add(new Push(Integer.parseInt( sentence[1]) ));
		} else if (sentence[0].equals("add")) {
			instructions.add(new Add());
		} else if (sentence[0].equals("sub")) {
			instructions.add( new Sub() );
		} else if (sentence[0].equals("mul")) {
			instructions.add( new Mul() );
		} else if (sentence[0].equals("jmp")) {
			instructions.add (new Jump(Integer.parseInt( sentence[1]) ));
		} else if (sentence[0].equals("jmpg")) {
			instructions.add(new JumpGreater(Integer.parseInt( sentence[1]) ));
		} else if (sentence[0].equals("load")) {
			instructions.add(new Load() );
		} else if (sentence[0].equals("store")) {
			instructions.add(new Store() );
		} else if (sentence[0].equals("input")) {
			instructions.add (new Input() );
		} else if (sentence[0].equals("output")) {
			instructions.add (new Output() );
		}
		
	}
	
	public List<Instruction> getInstructions(){
		return this.instructions;
	}

}
