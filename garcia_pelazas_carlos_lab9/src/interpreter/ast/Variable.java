package interpreter.ast;

import interpreter.visitor.Visitor;

public class Variable implements Expression {
	
	public String name;

	public Variable(String name) {
		this.name = name;
	}
	
	public Object accept(Visitor v, Object o) {
		return v.visit(this, o);
	}

	public String getName() {
		return name;
	}
	
	
}
