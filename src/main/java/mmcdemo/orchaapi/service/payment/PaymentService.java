package mmcdemo.orchaapi.service.payment;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import mmcdemo.orchaapi.LoggerDelegate;

public class PaymentService implements JavaDelegate {

	private final Logger LOGGER = Logger.getLogger(LoggerDelegate.class.getName());

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info("IN PaymentService...\n ################### \n Business Logic\n ################### ");
		LOGGER.info("\n ################### \n update payment, customer and order Database\n ################### ");
		
		
		// customerId, 		orderItem, 	orderID
		if (execution.getVariable("customerId") != null 
				&& execution.getVariable("orderItem") != null
				&& execution.getVariable("orderID") != null) {
			execution.setVariable("paymentCheck", true);
		} else {
			LOGGER.info("IN PaymentService...error in payment service, payment not recvd. ");
			execution.setVariable("paymentCheck", false);
		}
			
	}

}
