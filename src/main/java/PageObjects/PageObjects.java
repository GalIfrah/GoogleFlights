package PageObjects;

import org.openqa.selenium.WebElement;

import Infrastructure.GenericPageObject;
import Infrastructure.Locators;


public class PageObjects {

	public static class HomePage extends GenericPageObject {

		static final String SUT = "https://www.google.com/flights?hl=en";
		static final String FROM_FIELD = "//div[@class='gws-flights-form__location-text gws-flights__flex-filler gws-flights__ellipsize gws-flights-form__input-target']/span/span";
		static final String DESTINATION_FIELD = "//div[@class='gws-flights__flex-box gws-flights__align-center']/div[3]/div[2]/span";
		static final String SEARCH_FIELD = "//destination-picker/div/div/div[2]/input";
		static final String FIRST_OPTION = "//ul[@class='sbsb_b']/li[1]";
		static final String FIELDS_LOADER = "//div[@class='gws-flights__modal-underlay gws-flights__modal-underlay-transparent']";
		static final String FIRST_OPTION_TEXT_AREA = "//ul[@class='sbsb_b']/li[1]/div/div[@class='fsapp-option-content']";
		static final String SEARCH_BUTTON = "//floating-action-button[@class='gws-flights-form__search-button flt-form-sb gws-flights-fab__mini']";
		
		public static void openSut() {

			driverWrapper.open(SUT);
		}

		
		public static void openFromAirportsDropDown() {

			driverWrapper.findElementBy(Locators.XPATH, FROM_FIELD).click();
			
		}

		
		public static void clearDepartureAirportField(){

			WebElement search_field = driverWrapper.findElementBy(Locators.XPATH, SEARCH_FIELD);

			
			driverWrapper.clearField(search_field);
			
		}

		
		public static void typeFromLocationName(String location_name) {

			WebElement search_field = driverWrapper.findElementBy(Locators.XPATH, SEARCH_FIELD);

		
			search_field.sendKeys(location_name);

			
		}
		
		
		public static void chooseLocationsDropDownFirstOption(){
			
			driverWrapper.findElementBy(Locators.XPATH, FIRST_OPTION).click();
		}
		
		
		public static String getDropDownFirstOptionText(){
			
			return driverWrapper.findElementBy(Locators.XPATH, FIRST_OPTION_TEXT_AREA).getText();

		}


		public static void openDestinationAirportsDropDown() {
			
			if (driverWrapper.waitForInvisibility(FIELDS_LOADER)) {
				
				
				driverWrapper.findElementBy(Locators.XPATH, DESTINATION_FIELD).click();
			}
			
			
			driverWrapper.hover(DESTINATION_FIELD);
		}

		
		public static void clearDepartureAirportField(String location_name) {

			WebElement search_field = driverWrapper.findElementBy(Locators.XPATH, DESTINATION_FIELD);

			
			search_field.sendKeys(location_name);
		}

		
		public static String getSutTitle() {

			return driverWrapper.getTitle();

		}
		
		
		public static void typeDestinationName(String destination_name) {

			WebElement search_field = driverWrapper.findElementBy(Locators.XPATH, SEARCH_FIELD);

		
			search_field.sendKeys(destination_name);

			
		}
		
		
		public static void clickOnSearchButton() {
			
			
			if (driverWrapper.waitForInvisibility(FIELDS_LOADER)) {
				
				
				driverWrapper.findElementBy(Locators.XPATH, SEARCH_BUTTON).click();
			}
			
		}
	}

}
