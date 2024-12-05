package fylesystem.outputs.filter;

import java.io.IOException;

import fylesystem.Output;

public class MD5Filter extends AbstractFilter {
	
	int byteCounter = 0;

	public MD5Filter(Output output) {
		super(output);
	}
	
	public String getHash() {
		//return Integer.toHexString(byteCounter);
		return String.format("%032x", byteCounter);

	}

	@Override
	public void write(char c) throws IOException {
		byteCounter += 2;
		next.write(c);

	}

}
