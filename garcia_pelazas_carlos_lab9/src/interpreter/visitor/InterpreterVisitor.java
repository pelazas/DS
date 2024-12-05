package interpreter.visitor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import interpreter.ast.*;


public class InterpreterVisitor implements Visitor {
	
	private Map<String, Double> map = new HashMap<String,Double>();
	private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	@Override
	public Object visit(Program p, Object o) {
		for(Statement s: p.getStatements()) {
			s.accept(this, o);
		}
		return null;

	}

	@Override
	public Object visit(Print pr, Object o) {
		System.out.println("print " + pr.getExpression().accept(this, o));
		
		return null;
	}

	@Override
	public Object visit(Assignment a, Object o) {
		Double value = (Double) a.getExpression().accept(this, o);
		String varName = a.getVariable().getName();
		map.put(varName, value);
		return null;
	}

	@Override
	public Object visit(Division d, Object o) {
		Double left = (Double) d.getLeft().accept(this, o);
		Double right = (Double) d.getLeft().accept(this, o);
		return left / right;
	}

	@Override
	public Object visit(IntegerLiteral i, Object o) {
		return Integer.parseInt( i.getValue() );
	}

	@Override
	public Object visit(Product prod, Object o) {
		Double left = (Double) prod.getLeft().accept(this, o);
		Double right = (Double) prod.getLeft().accept(this, o);
		return left * right;
	}

	@Override
	public Object visit(Read r, Object o) {
		Double value;
		try {
			System.out.println("Introduzca el valor para variable: " + r.getVariable().getName());
			value = Double.valueOf( reader.readLine() );
			
		} catch (IOException e) {
			value = (double) 0;

		}
		map.put(r.getVariable().getName(), value);
		return value;
	}

	@Override
	public Object visit(Sum s, Object o) {
		Double left = (Double) s.getLeft().accept(this, o);
		Double right = (Double) s.getLeft().accept(this, o);
		return left + right;
	}

	@Override
	public Object visit(Variable p, Object o) {
		return map.get(p.getName());
	}

}
