package Demo;

public class Strings {
    public static void main(String[] args) {
         String txt ="Heyo";
         System.out.println(txt);
         
         // txt lenght.
         
         String txt2 = "12345678910";
         System.out.println("The lenght of this text is :" +txt2.length());
         
         // string methods 
               // upper
         String txt3 = "howya!";
         System.out.println(txt3.toUpperCase());
              // lower
         String txt4 = "howya!";
         System.out.println(txt4.toLowerCase());
         
         //finding string in string 
         // The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):
         String txt5 ="pls locate where `locate`occures";
         System.out.println(txt5.indexOf("locate"));
         
         //String Concatenation
         
          String Firstname ="Amy";
          String Lastname="O Leary";
          
          System.out.println(Firstname + Lastname);
          
         
    } // end of greeting
    
} // end of class