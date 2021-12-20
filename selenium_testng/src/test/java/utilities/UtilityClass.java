package utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;

import com.google.common.collect.Ordering;

public class UtilityClass {

	public List<String> webElementTextListToList(List<WebElement> webElementList) {
		List<String> stringList = new ArrayList<String>();
		Iterator<WebElement> itr = webElementList.iterator();
		while(itr.hasNext()) {
			stringList.add(itr.next().getText());
		}		 
		return stringList;
	}
	
	public List<String> reverseSortList(List<String> list) {
		List<String> stringList = new ArrayList<String>();
		for(int i = list.size() - 1; i >= 0; i--) {
			stringList.add(list.get(i));
		}
		return stringList;
	}

	public List<String> sortPriceAscList(List<String> priceList) {
		List<Double> list = new ArrayList<Double>();
		for(String pL : priceList) {
			list.add(Double.valueOf(pL.replace("$", "")));
		}
		list.sort(Comparator.naturalOrder());
		
		List<String> sortedList = new ArrayList<String>();
		for(double pListCurr : list) {
			sortedList.add("$" + pListCurr);
		}
		return sortedList;
	}

	public List<String> sortPriceDescList(List<String> priceList) {
		List<String> sortedList= new ArrayList<String>();
		sortedList = this.reverseSortList(this.sortPriceAscList(priceList));
		return sortedList;
	}
	
	public boolean isDisplayed(String locatorType, String locatorValue) throws NoSuchElementException {
		ElementLocator eL = new ElementLocator();
 
		boolean we = eL.getWebElement(locatorType, locatorValue).isDisplayed();
		return we;
	}

}
