package instruction;

import virtualmachine.Instruction;
import virtualmachine.State;

public abstract class AbstractInstruction implements Instruction {
	
	public AbstractInstruction() {
		
	}

	@Override
	public void execute(State state) {
		doExecute(state);
		state.setIp(state.getIp()+1);
	}
	
	protected abstract void doExecute(State state);

}
