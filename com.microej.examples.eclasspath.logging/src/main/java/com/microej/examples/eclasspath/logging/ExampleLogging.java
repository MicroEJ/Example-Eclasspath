/*
 * Java
 *
 * Copyright 2011-2019 MicroEJ Corp. All rights reserved.
 * For demonstration purpose only.
 * MicroEJ Corp. PROPRIETARY. Use is subject to license terms.
 */
package com.microej.examples.eclasspath.logging;

import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/**
 * Print some messages using the logger.
 */
public class ExampleLogging {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger("com.microej.examples");
		logger.setLevel(Level.WARNING);

		logger.warning("Uses default handler.");

		logger.log(Level.SEVERE, "Same as calling severe(). Displayed because SEVERE > WARNING.");
		logger.info("Not displayed because INFO < WARNING.");

		logger.setLevel(Level.SEVERE);
		logger.warning("Not displayed because the logger's level has been increased and WARNING < SEVERE");

		logger.setLevel(Level.ALL);
		logger.addHandler(new Handler() {
			@Override
			public void publish(LogRecord record) {
				System.out.println("new handler: " + record.getMessage());
			}

			@Override
			public void close() throws SecurityException {
				// Nothing to do.

			}

			@Override
			public void flush() {
				// Nothing to do.

			}
		});
		logger.warning("Uses the new handler and default one.");
	}

}

