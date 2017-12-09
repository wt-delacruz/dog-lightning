package azevedorafaela.cucumbermaven.steps;

import java.io.IOException;
import com.google.inject.Inject;

import azevedorafaela.cucumbermaven.support.DriverFactory;
import azevedorafaela.cucumbermaven.support.Support;
import azevedorafaela.cucumbermaven.support.World;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	@Inject
	private World world;
	
	@Before
	public void beforeScenario() throws IOException {
		world.driver = new DriverFactory().getManager();
		world.support = new Support();
		world.support.getProperties();
	}

	@After
	public void afterScenario() {
		world.driver.quit();
	}
}
