package com.chaithdridi.dotcomgame;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Arrays;

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
	    	  System.out.println(Arrays.toString(location));
	    	  for(int j=i;j<this.location.length;j++) {
	    		  //while the j is different from the last element then swap the elements
	    		  	if(j!=(this.location.length-1)) {
	    		  		this.location[j]=this.location[j+1];
	    		  		//if equal the last element then he takes 0
	    		  		//that last element will make sure we swap a zero with the last swap
	    		  	}else {
	    		  		this.location[j]=0;
	    		  	}
		    		  	      		  
	    	  }
	    	  System.out.println(Arrays.toString(location));
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