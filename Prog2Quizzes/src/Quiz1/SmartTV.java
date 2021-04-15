package Quiz1;
import java.util.*;
public class SmartTV {

	Scanner in = new Scanner(System.in);
	String brand, model, screen;
	char youtube, browser, ShareScreen;
	int price,WarrantyPeriod;
	
	public void setBrand() {
		System.out.println("Please enter the brand of the smart TV :");
		this.brand=in.nextLine();
	}
	
	public void setModel() {
		System.out.println("Please enter the model of the smart TV :");
		this.model=in.nextLine();
	}
	
	public void setScreen() {
		System.out.println("Please enter the type of screen of the smart TV :");
		this.screen=in.nextLine();
	}
	
	public void setYoutube() {
		System.out.println("Can this smart TV open the YouTube?");
		this.youtube=in.next().charAt(0);
	}
	
	public void setBrowser() {
		System.out.println("Can this smart TV open the browser?");
		this.browser=in.next().charAt(0);
	}
	
	public void setShareScreen() {
		System.out.println("Can this smart TV use to share screen?");
		this.ShareScreen=in.next().charAt(0);
	}
	
	public void setWarrantyPeriod() {
		System.out.println("How long is the warranty period for this smart TV?");
		this.WarrantyPeriod=in.nextInt();
	}
	
	public void setPrice() {
		System.out.println("Please enter the price of the smart Tv :");
		this.price=in.nextInt();
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public String getScreen() {
		return this.screen;
	}
	
	public char getYoutube() {
		return this.youtube;
	}
	
	public char getBrowser() {
		return this.browser;
	}
	
	public char getShareScreen() {
		return this.ShareScreen;
	}
	
	public int getWarrantyPeriod() {
		return this.WarrantyPeriod;
	}
	
	public int getPrice() {
		return this.price;
	}
}
