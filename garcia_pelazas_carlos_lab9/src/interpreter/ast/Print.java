package interpreter.ast;

import interpreter.visitor.Visitor;

public class Print implements Statement {

	public Expression expression;

	public Print(Expression expression) {
		this.expression = expression;
	}
	
	public Object accept(Visitor v, Object o) {
		return v.visit(this, o);
	}

	public Expression getExpression() {
		return expression;
		
	}
}
