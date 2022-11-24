package Constants;

import java.time.Duration;

public class Constants {

	
	// Return type is Duration because int is deprecated for this method
	private static final Duration Explicitwait=Duration.ofSeconds(10);

	public static Duration getExplicitwait() {
		return Explicitwait;
	}
	
}
