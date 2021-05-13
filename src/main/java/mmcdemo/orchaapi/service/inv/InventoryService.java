package mmcdemo.orchaapi.service.inv;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import mmcdemo.orchaapi.LoggerDelegate;

public class InventoryService implements JavaDelegate {
	
	private final Logger LOGGER = Logger.getLogger(LoggerDelegate.class.getName());

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info("IN InventoryService...\n ################### \n Business Logic\n ################### ");
		LOGGER.info("\n ################### \n update shipment, customer and order Database \n ###################  ");
	}

}
