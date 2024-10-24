package instruction;

import virtualmachine.Instruction;
import virtualmachine.State;

public class JumpGreater implements Instruction{
	
	private int ipPosition;
	
	public JumpGreater(Integer value) {
		this.ipPosition = value;
	}

	@Override
	public void execute(State state) {
		int b = pop(state);
		int a = pop(state);
		if (a > b)
			state.setIp(ipPosition);
		else
			state.setIp(state.getIp()+1);
		
	}
	
	private int pop(State state) {
		state.setSp(state.getSp()-1);
		return state.getStack()[state.getSp()];
	}
	

}
