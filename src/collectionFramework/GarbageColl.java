package collectionFramework;

import java.lang.ref.WeakReference;

public class GarbageColl {
	public static void main(String[] args) {
//		Phone obj = new Phone("Apple", "16 Pro Max");         // Strong Reference
//		System.out.println(obj);
		
		WeakReference<Phone> obj = new WeakReference<>(new Phone("Apple", "16 Pro Max"));  // Weak Reference
		System.out.println(obj.get());
		System.gc();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(obj.get());
	}

}
class Phone{
	
	public String brand;
	
	public String model;
	

	public Phone(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}


	@Override
	public String toString() {
		return "Phone [brand=" + brand + ", model=" + model + "]";
	}
	
	
}
