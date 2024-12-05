package fylesystem.outputs.filter;

import java.io.IOException;

import fylesystem.Output;

public class EncryptFilter extends AbstractFilter {

	public EncryptFilter(Output output) {
		super(output);
	}

	@Override
	public void write(char c) throws IOException {
		this.next.write((char) (c+1));

	}

}
