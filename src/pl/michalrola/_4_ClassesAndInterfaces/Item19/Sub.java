package pl.michalrola._4_ClassesAndInterfaces.Item19;

import java.time.Instant;

public class Sub extends Super {

	//Blank final, set by constructor
	private final Instant instant;

	Sub() {
		instant = Instant.now();
	}

	//Overriding method invoked by superclass constructor
	@Override
	public void overrideMe() {
		System.out.println(instant); // no NPE because println tolerate nulls
		dummyMethod(instant); //NPE! because we have null from Super constructor first
	}

	public void dummyMethod(Instant instant) {
		instant.getNano();
	}

	public static void main(String[] args) {
		Sub sub = new Sub();
		sub.overrideMe();

//		when comment dummyMethod(instant); will print
//		null //because overrrideMe is invoked by the Super constructor before the Sub constructor initialize instant field!
//		2020-09-17T18:50:04.751198Z

//		dummyMethod(instant); //if used in overrideMe will thrown NPE

//		Advices:
//		- prohibit subclassing if not design and documented to be safe subclassed
//		use wrapper class from Item 18
//		use "helper method"
//		final class, no accessible constructor
	}
}
