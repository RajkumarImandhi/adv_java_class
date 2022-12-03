package Week9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class InClassEx {

	public static void main(String[] args) throws IOException{
		System.out.println(Files.lines(Paths.get((args[0])).toAbsolutePath()).flatMap(t -> Arrays.stream(t.split(" "))).distinct().count());
	}
	
}
