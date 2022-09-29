package steps;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks extends baseclass {

	@AfterStep
	public void afterStep(Scenario scenario) {		
		if(scenario.isFailed()) {
			scenario.attach(getByteScreenshot(), "image/png", "");	
		}
	}

}