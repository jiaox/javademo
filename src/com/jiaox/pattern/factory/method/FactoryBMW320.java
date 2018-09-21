package com.jiaox.pattern.factory.method;

/**
 * 具体工厂    生产BMW320
 * @author Administrator
 *
 */
public class FactoryBMW320 implements FactoryBMW{

	@Override
	public BMW320 createBMW() {
		return new BMW320();
	}

}
