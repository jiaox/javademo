package com.jiaox.pattern.factory.abst;

//宝马523系列  
public class FactoryBMW523 implements AbstractFactory {    
  
   @Override    
  public Engine createEngine() {      
      return new EngineB();    
  }    
  @Override    
  public Aircondition createAircondition() {    
      return new AirconditionB();    
  }    


}
