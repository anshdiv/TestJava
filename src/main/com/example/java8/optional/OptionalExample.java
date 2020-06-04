package main.com.example.java8.optional;

import java.util.Optional;

import main.com.example.UIUtils;

public class OptionalExample {

	public static void main(String... arg) {

		UIUtils.addSection("isPresent()");
		Optional<String> opt = Optional.of("Java");
		System.out.println("Java is Present : " + opt.isPresent());
		
		UIUtils.addSection("get()");
		System.out.println("Get Value : " + opt.get());
		
		UIUtils.addSection("ofNullable()");
		opt = Optional.ofNullable(null);
		System.out.println("Java is Present : " + opt.isPresent());

		UIUtils.addSection("orElse()");
		String nullName = null;
		String name = Optional.ofNullable(nullName).orElse("john");
		System.out.println(name);

		UIUtils.addSection("orElseGet()");
		name = Optional.ofNullable(nullName).orElseGet(() -> "John");
		System.out.println(name);

		UIUtils.addSection("filter");
		Integer year = 2020;
		Optional<Integer> yearOptional = Optional.of(year);
		boolean is2016 = yearOptional.filter(y -> y == 2020).isPresent();
		System.out.println("Is 2020 Present : " + is2016);

		Integer price = 20;
		UIUtils.addSection("Check Range using filters");
		boolean isExistInRange = Optional.ofNullable(price).filter(p -> p >= 10).filter(p -> p <= 15).isPresent();
		System.out.println("Is Price in between 10-15 : " + isExistInRange);

		UIUtils.addSection("orElseThrow");
		Optional.ofNullable(nullName).orElseThrow(IllegalArgumentException::new);

	}
}
