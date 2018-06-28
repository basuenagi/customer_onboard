package com.zycus.selenium.constants;

public enum Driver {
	CHROME("chrome"), FIREFOX("firefox"),IE("ie");

	Driver(String driverToTest) {
		this.driverToTest = driverToTest;

	}

	private String driverToTest;

	public String getDriverToTest() {
		return driverToTest;
	}

}
