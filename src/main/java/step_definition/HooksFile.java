package step_definition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksFile {
	
	@Before
	public void tearUp() {
		System.out.println("this is to be executed first");
	}
	
	@After
	public void tearDown() {
		System.out.println("this is to be executed afterwards");
	}

}
