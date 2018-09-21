package com.jiaox.pattern.factory.simple;
/**
 *  简单工厂模式  工厂类 
 * @author jiaox
 *
 */
public class Factory {
	public BMW createBMW(int type) {  
        switch (type) {  
          
        case 320:  
            return new BMW320();  
  
        case 523:  
            return new BMW523();  
  
        default:  
            break;  
        }  
        return null;  
    }
}
