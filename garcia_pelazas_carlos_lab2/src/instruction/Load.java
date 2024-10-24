package instruction;

import virtualmachine.State;

public class Load extends AbstractInstruction {

	public Load() {
	}

	@Override
	protected void doExecute(State state) {
		int address = pop(state);
		push(state, state.getMemory()[address]);

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
