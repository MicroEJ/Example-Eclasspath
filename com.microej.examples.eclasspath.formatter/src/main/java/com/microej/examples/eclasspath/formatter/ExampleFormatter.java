/*
 * Java
 *
 * Copyright 2017-2019 MicroEJ Corp. All rights reserved.
 * For demonstration purpose only.
 * MicroEJ Corp. PROPRIETARY. Use is subject to license terms.
 */
package com.microej.examples.eclasspath.formatter;

import java.util.Formatter;

/**
 * This example prints some messages using the formatter.
 */
public class ExampleFormatter {
	public static void main(String[] args) {

		// String format
		System.out.println("String");
		System.out.println(format("the %s jumped over the %s, %d times", "cow", "moon", Integer.valueOf(2)));

		// Number format
		System.out.println("\nNumber");
		System.out.println(format(".%03d.", Integer.valueOf(1)));
		System.out.println(format(".%3d.", Integer.valueOf(1)));
		System.out.println(format("'%.1f'", Double.valueOf(10.3456)));

		// Scientific example
		System.out.println("\nScientific");
		System.out.println(format("e = %+10.4f", Double.valueOf(Math.E)));

		// Computer sciences example
		System.out.println("\nComputer sciences");
		System.out.println(format("%x", Integer.valueOf(255)));
	}

	/**
	 * Returns a formatted string using the specified format string and arguments.
	 *
	 * @param format
	 *            A format string.
	 * @param args
	 *            Arguments referenced by the format specifiers in the format string.
	 *
	 * @return A formatted string.
	 */
	public static String format(String format, Object... args) {
		return new Formatter().format(format, args).toString();
	}
}
