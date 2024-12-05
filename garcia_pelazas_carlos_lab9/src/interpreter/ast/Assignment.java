package interpreter.ast;

import interpreter.visitor.Visitor;

public class Assignment implements Statement {
	
	public Variable variable;
	public Expression expression;

	public Assignment(Variable variable, Expression expression) {
		this.variable = variable;
		this.expression = expression;
	}
	
	public Object accept(Visitor v, Object o) {
		return v.visit(this, o);
	}

	public Variable getVariable() {
		return variable;
	}

	public Expression getExpression() {
		return expression;
	}
	
	
}
