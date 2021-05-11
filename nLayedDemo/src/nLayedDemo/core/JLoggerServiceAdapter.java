package nLayedDemo.core;

import nLayedDemo.JLogger.JLoggerManager;

public class JLoggerServiceAdapter implements LoggerService{

	@Override
	public void logToSystem(String message) {
		JLoggerManager manager=new JLoggerManager();
		manager.log(message);
	}

}
