package me.will;

public class App {

	public static void main(String[] args) {
		ClassLoader classLoader = App.class.getClassLoader();
		System.out.println(classLoader); //sun.misc.Launcher$AppClassLoader@18b4aac2
		System.out.println(classLoader.getParent()); //sun.misc.Launcher$ExtClassLoader@1b6d3586
		System.out.println(classLoader.getParent().getParent()); // null (native)
	}

}
