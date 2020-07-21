package com.chaithdridi.dotcomgame;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


class DotCom{
	  int[] location;
	  int numberOfHit = 0,guess =0;
	  Map<Integer,Integer> catched=new HashMap<Integer,Integer>();
	  String checkYourself(String getUserGuess){
	    String result = "miss";
	    try {
	    	guess = Integer.parseInt(getUserGuess);
	    }catch(NumberFormatException e) {
	    	System.out.println("Please enter a number");
	    	return null;
	    }
	    
	    for( int i = 0;i<this.location.length;i++){
	      if (this.location[i] == guess){
	    	  //add the element to the array
	    	  catched.put(guess,1);
	    	  //delete the element by shifting the elements 
	    	  for(int j=i;j<this.location.length-1;j++) {
	    		  this.location[j]=this.location[j+1];
	    	  }
	        numberOfHit++;
	        result = "hit";
	        break;
	      }else {
    	  	//go throw the array and see if any key match with the element
	    	  for(Map.Entry m:catched.entrySet()){  
	    		   //System.out.println(m.getKey()+" "+m.getValue());  
	    		  	if(m.getKey()==(Integer)guess) {
	    		  		result = "you already hited it";
	    		  	}
	    		  }    
	      }
	    }
	    if(numberOfHit==this.location.length){
	          result = "kill";
	     }

	    System.out.println(result);
	    return result;
	  } 
	  void setLocation(int[] loc){
	    location = loc;
	  }
	}