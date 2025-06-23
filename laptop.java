package prog;
public class laptop {
	private String sh;
	private double price;
	private String type;
	public laptop(String sh,double price,String type) {
		this.sh=sh;
		this.price=price;
		this.type=type;
	}
	public String getSh() {
		return sh;
	}
	public void setSh(String sh) {
		this.sh = sh;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
