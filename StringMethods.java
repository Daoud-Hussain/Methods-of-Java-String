import java.util.*;
public class StringMethods{
	public static void main(String[] args) {
        //In case to take input from user, Uncomment the following line of code
        /*
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String myName = input.next();
        */

        String myName = "Daoud";

        /*The length() returns the length of a string object i.e. the number of characters stored in an object*/
        System.out.println(myName.length());  //Returns 5


        /* The toLowerCase() method converts a string to lower case letters.*/
        System.out.println(myName.toLowerCase());  //Returns daoud


        /*The toUpperCase() method converts a string to upper case letters.*/
        System.out.println(myName.toUpperCase());  //Returns DAOUD


        /*The substring(int beginIndex, int endIndex) method of the String class. 
        It returns a new string that is a substring of this string.*/
        System.out.println(myName.substring(2));  //Return oud  , It'll return all the characters after 2 index


        /*We can also used substring for a specific range*/
        System.out.println(myName.substring(0,2));  //Return Da


        /* The Java string replace() method will replace a character or substring with another character or string.
        Following example replaces a character with another character*/
        System.out.println(myName.replace('a' , 'u'));  //Return Duoud


        /*Following example replaces a character with another character */
        System.out.println(myName.replace("aou" , "awoo"));  //Return Dawood


        /*Java String startsWith() method is used to check the prefix of string.
         It verifies if given string starts with argument string or not.
        You cannot pass a string in it. It always works with "D"
        You cannot use 'D' */
        System.out.println(myName.startsWith("D"));  //Return true


        /*The Java String endsWith() method is used to check whether the string
         is ending with user-specified substring or not.
        You cannot pass a string in it. It always works with "D"
        You cannot use 'D'*/
        System.out.println(myName.endsWith("D"));  //Return false as myName ends with 'd'


        /*The Java charAt() method returns a character at a specific 
        index position in a string.charAt() returns a single character.
         It does not return a range of characters*/
        System.out.println(myName.charAt(3));  //Returns u


        /*The indexOf() method returns the position of the first occurrence
         of specified character(s) in a string. If you have multiple required characters, 
         It'll consider the first character*/
        System.out.println(myName.indexOf('d'));  //Returns 4


        /*The lastIndexOf() method returns the position of the last occurrence
        of specified character(s) in a string. It works oppositely to indexOf()*/
        System.out.println(myName.lastIndexOf('D'));  //Returns 0


        /* The trim() method in java checks this Unicode value before and
        after the string, if it exists then removes the spaces and returns the omitted string
        The Unicode value of space character is '\u0020'.*/
        System.out.println("     Daoud     ".trim());  //Returns Daoud  , without any space


        /*In java equals() method compares the two given strings based on the data/content of the string.
         If all the contents of both the strings are same then it returns true.
         If all characters are not matched then it returns false.*/
        System.out.println(myName.equals("daoud"));  //Returns false
     

        /*The equalsIgnoreCase() method of the String class compares two strings
         irrespective of the case (lower or upper) of the string. This method always returns a boolean value*/
        System.out.println(myName.equalsIgnoreCase("dAOuD"));  //Returns true

		
        /*The compareTo() method compares two strings lexicographically. The comparison is based on the
         Unicode value of each character in the strings. A value less than 0 is returned if the string
         is less than the other string (less characters) and a value greater than 0 if the 
         string is greater than the other string (more characters).
        */
        System.out.println(myName.compareTo("Daoud"));  //Returns 0 as  the string is equal to the other string.

		
        /*It also works as same as in the case of compareTo() but it ignores the capital and lower case while comparing*/
        System.out.println(myName.compareToIgnoreCase("dAOuD"));  //Returns 0 as  the string is equal to the other string.

		
        /*The Java String concat() method concatenates one string to the end of another string.*/
        System.out.println(myName.concat(" Hussain"));  //Returns Daoud Hussain


	}
}
