package driverFactory;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CartPage;
import commonFunction.Product;
import commonFunction.SearchPage;
import config.AppUtil;

public class TestDrive extends AppUtil {

	@Test(priority = 0,description = "Test Get API and Validate Content")
	public void ProductVerification() {
		SearchPage frontPage=PageFactory.initElements(driver, SearchPage.class);
		frontPage.searchItems("spacex");
		frontPage.verify_product();

	}
	@Test(priority = 1,description = "Shop SpaceX-Search, Add to Cart")
	public void addQuantity() {

		Product product=PageFactory.initElements(driver,Product.class);
		product.getProductPrice();
		product.getProductDescription();
		product.addQuantity(3);
	}
	@Test(priority = 2,description = "Test Get API and Validate Cart Price")
	public void cartVerification() {
		CartPage cart=PageFactory.initElements(driver, CartPage.class);
		cart.verifyPrice(4,40);
	}
}


