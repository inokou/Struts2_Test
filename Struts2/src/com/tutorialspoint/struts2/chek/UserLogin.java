package com.tutorialspoint.struts2.chek;

public class UserLogin implements PesonalInterface {

    @Override
    public boolean nameSet(String name) {
    	boolean ret;

        if(name.length() > 7){
			System.out.println("名前チェックOK");
			ret = true;
        }else{
	    	System.out.println("名前チェックNG");
	    	ret = false;
    	}

    	return ret;
    }


    @Override
    public boolean addressSet(String address) {
    	boolean ret;

        if(address.length() > 3){
	        System.out.println("住所チェックOK");
	        ret = true;
        }else{
	        System.out.println("住所チェックNG");
        	ret = false;
        }
    	return ret;

    }

}
