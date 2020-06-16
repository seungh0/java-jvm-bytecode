package me.will;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class App {

	@Test
	public void test() {
		assertThat(new Moja().pullOut(), is("Rabbit"));
	}

}
