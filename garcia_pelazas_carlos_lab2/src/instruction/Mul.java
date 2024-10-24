package instruction;

import virtualmachine.State;

public class Mul extends AbstractInstruction{

	public Mul() {
	}

	@Override
	protected void doExecute(State state) {
		push(state, pop(state) * pop(state));
		
	}
	
	protected void push(State state, int value) {
		state.getStack()[state.getSp()] = value;
		state.setSp(state.getSp()+1);
	}

	protected int pop(State state) {
		state.setSp(state.getSp()-1);
		return state.getStack()[state.getSp()];
	}

}
