package interpreter.ast;

import interpreter.visitor.Visitor;

public class Division implements Expression {
	public Expression left, right;

	public Division(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}
	
	public Object accept(Visitor v, Object o) {
		return v.visit(this, o);
	}

	public Expression getLeft() {
		return left;
	}

	public Expression getRight() {
		return right;
	}
	
	
}
