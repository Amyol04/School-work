public class myFirstArrayPorject {
 public static void main(String[] args) {
	 
	 //CREATE AN ARRAY W/O INITILISING
	 //FILLED ARRAY POSITION [0],[1],[2],[3]
	 String[] cars = {"volvo","Skoda" ,"Porche","VW"};
	 int[] ages = {12 , 5 , 35, 25, 16};
	 
	 // read value at index position
	 System.out.println("Arrray potiton 1 contains:" +cars[0]);
	 
	 // updating a value at an index position 
	 cars[1] = "mercedes";
	 
	 System.out.println("Array posotion 2 has changed to: "+ cars[1]);
	 
	 // length of array
	 System.out.println("Size of array " +cars.length);
	 
	 Arrays.sort(ages);
	 
	 for(int i = 0; 1 < ages.length; i++) {
		 
		 System.out.println("Cars element "+ i+ "is"+ ages[i]);
		 
		 
	 } // end for 
	
 } // end of main
} // end of class
