package me.will;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.implementation.FixedValue;

import java.io.File;
import java.io.IOException;

import static net.bytebuddy.matcher.ElementMatchers.named;

public class App {

	public static void main(String[] args) {

		try {
			new ByteBuddy().redefine(Moja.class)
					.method(named("pullOut")).intercept(FixedValue.value("Rabbit"))
					.make().saveIn(new File("/Users/ksh98/classloadersample/target/classes/"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
