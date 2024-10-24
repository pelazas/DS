package instruction;

import virtualmachine.State;

public class Add extends AbstractInstruction{

	public Add() {
	}

	@Override
	protected void doExecute(State state) {
		state.setSp(state.getSp()-1);
		int a = state.getStack()[state.getSp()];
		
		state.setSp(state.getSp()-1);
		int b = state.getStack()[state.getSp()];
		
		state.getStack()[state.getSp()] = a+b;
		state.setSp(state.getSp()+1);

	}

}
