package com.automation.steps;

import cucumber.api.java.*;
import static com.automation.utils.DriverUtils.*;

public class Hooks {

	@Before
	public void setUp() {
		getDriver();
		
	}

	@After
	public void teardown() {
		tearDown();
		
	}
}
