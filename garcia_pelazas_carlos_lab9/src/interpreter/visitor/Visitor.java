package interpreter.visitor;

import interpreter.ast.*;

public interface Visitor {

	Object visit(Program p, Object o);
	Object visit(Print pr, Object o);
	Object visit(Assignment a, Object o);
	Object visit(Division d, Object o);
	Object visit(IntegerLiteral i, Object o);
	Object visit(Product prod, Object o);
	Object visit(Read r, Object o);
	Object visit(Sum s, Object o);
	Object visit(Variable p, Object o);
}
