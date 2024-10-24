package instruction;

import virtualmachine.State;

public class Sub extends AbstractInstruction{

	public Sub() {
	}

	@Override
	protected void doExecute(State state) {
		int b = pop(state);
		int a = pop(state);
		push(state, a - b);
		
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
