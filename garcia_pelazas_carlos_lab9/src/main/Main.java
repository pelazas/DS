package main;

import java.util.*;

import interpreter.RecursivePrint;
import interpreter.ast.*;
import interpreter.visitor.InterpreterVisitor;
import interpreter.visitor.PrintVisitor;
import interpreter.visitor.Visitor;

public class Main {
	
	public static void main(String[] args) {
		
		/*
		 	read ancho; 
		 	read alto; 
		 	area = alto * ancho / 2; 
		 	print area + 10;
		 */

		// Build the AST for the program above
		List<Statement> statements = new ArrayList<>();
		statements.add(new Read(new Variable("ancho")));	// read ancho;
		statements.add(new Read(new Variable("alto")));	// read alto;
		// area = alto * ancho / 2;
		Product prod = new Product(new Variable("alto"), new Variable("ancho"));
		statements.add(new Assignment(new Variable("area"), new Division(prod, new IntegerLiteral("2"))));
		// print area + 10;
		statements.add(new Print(new Sum(new Variable("area"), new IntegerLiteral("10"))));
		Program program = new Program(statements);

		System.out.println("\n--- Recursive print");
		RecursivePrint recursivePrint = new RecursivePrint();
		recursivePrint.visit(program);
		 
		// TO DO (1): You must implement the Visitor pattern to make this work
		System.out.println("\n--- Print with Visitor");
		Visitor printVisitor = new PrintVisitor();
		program.accept(printVisitor, null);
		
		// TO DO (2): Once you have printed the program, interpret it
		System.out.println("\n--- Interpreter Visitor");
		Visitor interpreterVisitor = new InterpreterVisitor();
		program.accept(interpreterVisitor, null);
		
		// ...
	}
}
