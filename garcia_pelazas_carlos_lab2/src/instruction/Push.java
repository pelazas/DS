package instruction;

import virtualmachine.State;

public class Push extends AbstractInstruction{
	
	private Integer numberToPush;

	public Push( Integer number) {
		this.numberToPush = number;
	}

	@Override
	protected void doExecute(State state) {
		push(state, numberToPush);
		
	}
	
	protected void push(State state, int value) {
		state.getStack()[state.getSp()] = value;
		state.setSp(state.getSp()+1);
	}


}
