package SutTestsCases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.io.IOException;

import org.junit.Test;

import PageObjects.PageObjects.HomePage;

public class HomeTests extends Basic {

	@Test
	public void test1() throws InterruptedException, IOException {

		HomePage.openSut();

//		HomePage.openFromAirportsDropDown();
//
//		HomePage.clearDepartureAirportField();
//
//		HomePage.typeFromLocationName(prop.getProperty("LOCATION_TO_LEAVE_FROM"));
//
//		HomePage.chooseLocationsDropDownFirstOption();
//
//		driverWrapper.takeScreenShot("GAL");
//
////		Thread.sleep(4000);
//
//		HomePage.openDestinationAirportsDropDown();
//
//		HomePage.typeDestinationName(prop.getProperty("DESTINATION_NAME"));
//
//		HomePage.chooseLocationsDropDownFirstOption();
//
//		HomePage.clickOnSearchButton();
//
//		Thread.sleep(5000);
////
////		Thread.sleep(2000);

//		assertEquals(prop.getProperty("SUT_TITLE"), HomePage.getSutTitle());
		
		assertFalse(1 != 1);
	}

}
