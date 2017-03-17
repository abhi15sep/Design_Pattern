package com.abstractfactory.design.abstractfactory;

import com.abstractfactory.design.model.Computer;

public class ComputerFactory {
	
	public static Computer getComputer(ComputerAbstractFactory factory){
		return factory.createComputer();
	}
}
