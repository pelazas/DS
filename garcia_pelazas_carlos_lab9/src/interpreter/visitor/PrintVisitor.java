package interpreter.visitor;

import interpreter.ast.*;

public class PrintVisitor implements Visitor{

	@Override
	public Object visit(Program p, Object o) {
		for (Statement s: p.getStatements()) {
			s.accept(this, o);
		}
		return null;
	}

	@Override
	public Object visit(Print pr, Object o) {
		System.out.print("print ");
		pr.getExpression().accept(this, o);
		System.out.println(";");
		return null;
	}

	@Override
	public Object visit(Assignment a, Object o) {
		a.getVariable().accept(this, o);
		System.out.print(" = ");
		a.getExpression().accept(this, o);
		System.out.println(";");
		return null;
	}

	@Override
	public Object visit(Division d, Object o) {
		d.getLeft().accept(this, o);
		System.out.print(" / ");
		d.getRight().accept(this, o);
		return null;
	}

	@Override
	public Object visit(IntegerLiteral i, Object o) {
		System.out.print(i.getValue());
		return null;
	}

	@Override
	public Object visit(Product prod, Object o) {
		prod.getLeft().accept(this, o);
		System.out.print(" * ");
		prod.getRight().accept(this, o);
		return null;
	}

	@Override
	public Object visit(Read r, Object o) {
		System.out.print("read ");
		r.getVariable().accept(this, o);
		System.out.println(";");
		return null;
	}

	@Override
	public Object visit(Sum s, Object o) {
		s.getLeft().accept(this, o);
		System.out.print(" + ");
		s.getRight().accept(this, o);
		return null;
	}

	@Override
	public Object visit(Variable p, Object o) {
		System.out.print(p.getName());
		return null;
	}

}
