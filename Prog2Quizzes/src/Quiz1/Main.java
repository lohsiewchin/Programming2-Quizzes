package Quiz1;

public class Main {

	public static void main(String[] args) {

		SmartTV p = new SmartTV();
		SmartTV s = new SmartTV();
		
		System.out.println("==========PANASONIC===========");
		p.setBrand();
		p.setModel();
		p.setScreen();
		p.setYoutube();
		p.setBrowser();
		p.setShareScreen();
		p.setWarrantyPeriod();
		p.setPrice();
		
		System.out.println("Brand : " + p.getBrand());
		System.out.println("Model : " + p.getModel());
		System.out.println("Screen : " + p.getScreen());
		System.out.println("Youtube : " + p.getYoutube());
		System.out.println("Browser : " + p.getBrowser());
		System.out.println("Share acreen : " + p.getShareScreen());
		System.out.println("Warranty period : " + p.getWarrantyPeriod());
		System.out.println("Price : RM" + p.getPrice());
		System.out.println();
		
		System.out.println("==========SHARP===========");
		s.setBrand();
		s.setModel();
		s.setScreen();
		s.setYoutube();
		s.setBrowser();
		s.setShareScreen();
		s.setWarrantyPeriod();
		s.setPrice();
		
		System.out.println("Brand : " + s.getBrand());
		System.out.println("Model : " + s.getModel());
		System.out.println("Screen : " + s.getScreen());
		System.out.println("Youtube : " + s.getYoutube());
		System.out.println("Browser : " + s.getBrowser());
		System.out.println("Share acreen : " + s.getShareScreen());
		System.out.println("Warranty period : " + s.getWarrantyPeriod());
		System.out.println("Price : RM" + s.getPrice());
	}

}
