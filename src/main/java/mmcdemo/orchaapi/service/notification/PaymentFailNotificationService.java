package mmcdemo.orchaapi.service.notification;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import mmcdemo.orchaapi.LoggerDelegate;

public class PaymentFailNotificationService implements JavaDelegate {
	
	private final Logger LOGGER = Logger.getLogger(LoggerDelegate.class.getName());

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info("IN PaymentFailNotificationService... ");

	}

}
