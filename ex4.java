public class ex4 {
	public static void main(String[] args) {
		
		int var1 =20;
		int var2 =43;
	
		String StrA="first";
        String StrB="seccond";
        String StrC=StrA+StrB;
        
        int var3 =var1/var2;
		int var4 =var1*var1;
        
        
        if(var3 < var4) {
        	
        	System.out.println("var3 is less than or equal to var4");
        	
        }
        
        else {
        	
        	System.out.println("var3 is more then var4");
        	
        }
        
        if(StrA.equals(StrC)) {
        	
        	System.out.println("strings are equal ​");
        	
        }
         else {
        	
        	System.out.println("Strings arent equal");
        
       }
      
	} // end of class
} //end of main
