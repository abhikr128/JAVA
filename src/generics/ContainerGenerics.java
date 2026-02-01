package generics;

public class ContainerGenerics<T> implements Container<T>{

	private T item;
	
	public void add(T item) {
		this.item = item;
	}

	public T get() {
		return item;
	}

}
