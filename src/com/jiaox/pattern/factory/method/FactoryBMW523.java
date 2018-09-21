package com.jiaox.pattern.factory.method;
/**
 * 具体工厂    生产BMW523
 * @author Administrator
 *
 */
public class FactoryBMW523 implements FactoryBMW{

	@Override
	public BMW523 createBMW() {
		return new BMW523();
	}

}
