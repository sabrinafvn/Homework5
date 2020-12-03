
public class node {
	public double value;
	public node next;

	node(double value) {
		this.value = value;
	}

	public node(double value, node next) {
		this.value = value;
		this.next = null;
	}
}
