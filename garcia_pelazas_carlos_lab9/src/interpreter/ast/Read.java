package interpreter.ast;

import interpreter.visitor.Visitor;

public class Read implements Statement {
	
	public Variable variable;

	public Read(Variable variable) {
		this.variable = variable;
	}
	
	public Object accept(Visitor v, Object o) {
		return v.visit(this, o);
	}


	public Variable getVariable() {
		return variable;
	}
	
	
}
