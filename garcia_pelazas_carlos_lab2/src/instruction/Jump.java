package instruction;

import virtualmachine.Instruction;
import virtualmachine.State;

public class Jump implements Instruction{
	
	private int ipPosition;
	
	public Jump(Integer value) {
		this.ipPosition = value;
	}

	@Override
	public void execute(State state) {
		state.setIp(ipPosition);
	}

}
