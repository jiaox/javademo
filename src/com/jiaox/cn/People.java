package com.jiaox.cn;

public class People {
	 public People()   
	    {                 
	    }  
	      
	    public People(String id, String name, String address)   
	    {         
	        this.id = id;  
	        this.name = name;  
	        this.address = address;  
	    }  
	  
	    private String id;  
	    private String name;  
	    private String address;  
	      
	    public String getId() {  
	        return id;  
	    }  
	  
	    public void setId(String id) {  
	        this.id = id;  
	    }  
	  
	    public String getName() {  
	        return name;  
	    }  
	  
	    public void setName(String name) {  
	        this.name = name;  
	    }  
	  
	    public String getAddress() {  
	        return address;  
	    }  
	  
	    public void setAddress(String address) {  
	        this.address = address;  
	    }  
	      
	    public String toString()  
	    {  
	        return "ID:" + this.id + " Name:" + this.name + " Address:" + this.address;  
	    }  
}
