package interpreter.ast;

import java.util.*;

import interpreter.visitor.Visitor;

public class Program implements Node {
    
    public List<Statement> statements;
    
    public Program(List<Statement> program) {
        this.statements = program;
    }
    
    public List<Statement> getStatements(){
    	return new ArrayList<>(statements);
    }
    
    public Object accept(Visitor v, Object o) {
		return v.visit(this, o);
	}

}
