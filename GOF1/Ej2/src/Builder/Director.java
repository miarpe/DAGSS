package Builder;

public class Director {
	private Builder product;
	public Director(Builder b) {
		this.product=b;
	}
	public void buildProduct() {
		this.product.BuildProduct1();
	}
}
