public class arrayEx1 {
   public static void main(String[] args) {
	   
	   String[] cars = {"Toyota","BMW" ,"Porche","VW", "Audi"};
	   
	   // changes position 
	   cars[2] = "Honda Blue";
	   
	   // prints out the list 
	   for (int i = 0; i < cars.length; i++) {
           System.out.println(cars[i]);
       } //end of for
	   
	   
   } // end of main
} // end of class
