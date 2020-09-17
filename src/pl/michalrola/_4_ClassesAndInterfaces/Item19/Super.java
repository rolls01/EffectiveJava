package pl.michalrola._4_ClassesAndInterfaces.Item19;

public class Super {

	//Broken - constructor invokes an overridable method
	public Super() {
		overrideMe(); // not safe
		//safe to invoke private methods, final methods, static methods
	}

	public void overrideMe() {
	}
}
