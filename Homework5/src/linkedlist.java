
public class linkedlist {
	node head;
	node tail;

	public linkedlist() {
		head = null;
		tail = null;
	}

	public void append(int n) {
		node node = new node(n);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			tail = node;
		}
	}


	public double mean() {
		node t = head;
		double sum = 0;
		int length = 0;
		while (t != null) {
			sum += t.value;
			length++;
			t = t.next;
		}
		return (sum / length);
	}
   
	public double s_deviation() {
		return sdev(this.mean());
	}

	public double sdev(double mean) {
		node t = head;
		double sum = 0;
		int length = 0;
		while (t != null) {
			sum += Math.pow(mean - t.value, 2);
			length++;
			t = t.next;
		}
		return Math.pow(sum / length, .5);
	}
}
