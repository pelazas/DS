package fylesystem.outputs.filter;

import java.io.IOException;

import fylesystem.Output;

public class WriteMultipleFilter extends AbstractFilter {
	
	private Output output2;

	public WriteMultipleFilter(Output output1, Output output2) {
		super(output1);
		this.output2 = output2;
	}
	
	@Override
	public void open() throws IOException {
		next.open();
		output2.open();

	}

	@Override
	public void write(char c) throws IOException {
		next.write(c);
		output2.write(c);
		
	}
	
	@Override
	public void close() throws IOException {
		next.close();
		output2.close();
	}

}
