package com.inhouse.utillogging;

import java.util.logging.LogRecord;
import java.util.logging.StreamHandler;

public class CustomLogHandler extends StreamHandler {

	@Override
	public synchronized void publish(LogRecord record) {
		super.publish(record);
	}

	@Override
	public synchronized void flush() {
		super.flush();
	}

	@Override
	public synchronized void close() throws SecurityException {
		super.close();
	}
	
}
