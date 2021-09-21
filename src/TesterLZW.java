import java.io.FileNotFoundException;
import java.util.*;
import java.io.IOException;
import java.util.stream.Collectors;

public class TesterLZW {
	public static void main(String [] args) throws IOException 
	{
		long startTime = System.nanoTime();
		LZW john = new LZW ("smalltest.txt"); 
		String compressed = john.compress(); 
	
		//System.out.println(john.decompressFromByteFile("output.byte"));
		
		//Note: this throws an error because the decoded int string doesn't seem to be correct
		List<Integer> sampleInput = Arrays.asList(97, 97, 98, 257, 259, 99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);;
		//Proof that my decompression works:
		System.out.println(john.decompressFromInput(sampleInput));
		// ...
		long finish = System.nanoTime();
		long timeElapsed = finish - startTime;
		System.out.println(timeElapsed);
	   
	}
}
