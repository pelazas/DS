package instruction;

import virtualmachine.State;

public class Output extends AbstractInstruction{

	public Output() {
	}

	@Override
	protected void doExecute(State state) {
		System.out.println(pop(state));
		
	}

	protected int pop(State state) {
		state.setSp(state.getSp()-1);
		return state.getStack()[state.getSp()];
	}

}
