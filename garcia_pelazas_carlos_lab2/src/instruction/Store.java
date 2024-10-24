package instruction;

import virtualmachine.State;

public class Store extends AbstractInstruction{

	public Store() {
	}

	@Override
	protected void doExecute(State state) {
		int value = pop(state);
		int address = pop(state);
		state.getMemory()[address] = value;
	}

	protected int pop(State state) {
		state.setSp(state.getSp()-1);
		return state.getStack()[state.getSp()];
	}

}
