package fylesystem.outputs.filter;

import java.io.IOException;

import fylesystem.Output;

public abstract class AbstractFilter implements Output {
	
	protected Output next;
	
	public AbstractFilter(Output output) {
		this.next = output;
	}
	

	@Override
	public void open() throws IOException {
		next.open();

	}


	@Override
	public void close() throws IOException {
		next.close();

	}

}
