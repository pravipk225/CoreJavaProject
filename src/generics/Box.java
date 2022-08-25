package generics;

public class Box<T> {
	private T length;
	public void setLength(T length) {
		this.length = length;
	}
	public T getLength() {
		return length;
	}

}
