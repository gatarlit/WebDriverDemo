package pageObjects;

import java.util.Arrays;
import java.util.List;

public interface ProductsPageObjects {
	String productTitle = "PRODUCTS";
	String filterAZ = "NAME (A TO Z)";
	
	
	
	List<String> productNameListExp = Arrays.asList("Sauce Labs Backpack", "Sauce Labs Bike Light", "Sauce Labs Bolt T-Shirt",
			"Sauce Labs Fleece Jacket", "Sauce Labs Onesie", "Test.allTheThings() T-Shirt (Red)");
	List<String> productDescListExp = Arrays.asList(
			"carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.",
			"A red light isn't the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included.",
			"Get your testing superhero on with the Sauce Labs bolt T-shirt. From American Apparel, 100% ringspun combed cotton, heather gray with red bolt.",
			"It's not every day that you come across a midweight quarter-zip fleece jacket capable of handling everything from a relaxing day outdoors to a busy day at the office.",
			"Rib snap infant onesie for the junior automation engineer in development. Reinforced 3-snap bottom closure, two-needle hemmed sleeved and bottom won't unravel.",
			"This classic Sauce Labs t-shirt is perfect to wear when cozying up to your keyboard to automate a few tests. Super-soft and comfy ringspun combed cotton.");
	List<String> productPriceListExp = Arrays.asList("$29.99", "$9.99", "$15.99", "$49.99", "$7.99", "$15.99");
	
	String productTitleClassName = "title";
	String filterClassName = "active_option";
	String addSauceLabsBoltTshirtID = "add-to-cart-sauce-labs-bolt-t-shirt";
	String addSauceLabsBikeLightID = "add-to-cart-sauce-labs-bike-light";
	String removeSauceLabsBoltTshirtID = "remove-sauce-labs-bolt-t-shirt";
	String removeSauceLabsBikeLightID = "remove-sauce-labs-bike-light";
	String shoppingCartBadgeClass = "shopping_cart_badge";
	String imageSrc = "/static/media/sauce-backpack-1200x1500.34e7aa42.jpg";
	String shoppingCartContainerID = "shopping_cart_container";
	String sauceLabsBpID = "item_4_title_link";

}
