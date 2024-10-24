package virtualmachine;

import java.util.List;

public class VirtualMachine {
	
	private List<Instruction> instructions;
	private State state;
	
	public VirtualMachine(List<Instruction> instructions) {
		this.instructions = instructions;
		state = new State();
	}
	
	public void run() {
		while (state.getIp() < instructions.size()) {
			instructions.get(state.getIp()).execute(state);
		}
	}

}
