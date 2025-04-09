package de.fhws.UnitTest;

public class L14ü4_Strecke {
	 int a;
	 int b;
	 
	 public L14ü4_Strecke(int a, int b) {
		 if( a > 0 && b > 0) {
			 if(a > b) {
				 this.b=a;
				 this.a=b;
			 }else {
				 this.a = a;
				 this.b = b;
			 }
		 } else throw new IllegalArgumentException("Nur positive Zahlen");
	 }
	 
	 public boolean überschneiden(L14ü4_Strecke andere){
	        if(this.b> andere.a && andere.b> this.a) {
	        	return true;
	        }
	        else {
	        	return false;
	        }
	    }
	 
	   @Override
	    public String toString() {
	        String result;
	        if(b==a){
	             result=Integer.toString(a);

	        }else {
	             result = Integer.toString(a);
	            for (int i = 0; i < b - a; i++) {
	                result += '-';
	            }
	            result += Integer.toString(b);
	        }
	        return result;
	    }
}
