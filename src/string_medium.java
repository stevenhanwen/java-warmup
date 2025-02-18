public class string_medium {
    // Given a string, return a string where for every char in the original, there are two chars.

    public static String doubleChar(String str) {
        StringBuilder newStr = new StringBuilder(str); 
        // abc
        for (int i = 0; i < str.length(); i++) {
            System.out.println("i = " + i);
            int insertPosition = i * 2 + 1; 
            newStr.insert(insertPosition, str.charAt(i)); 
            System.out.println(newStr);
        }
        System.out.println(newStr);
        return newStr.toString(); 
    }

    // Return the number of times that the string "hi" appears anywhere in the given string.

    public static int countHi(String str) {
        int count = 0; 

        for (int i = 0; i < str.length(); i++) {
            if (i == str.length() - 1) {
                break; 
            }
            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') {
                count++; 
            }
        }
        System.out.println("final count = " + count);
        return count; 
    }
    
    // Return true if the string "cat" and "dog" appear the same number of times in the given string.

    public static boolean catDog(String str) {
        int countDog = 0; 
        int countCat = 0; 

         if (str.length() < 2) {
             System.out.println("equal");
             return true; 
        }
        for (int i = 0; i < str.length(); i++) {
            
            if (i == str.length() - 2) {
                break; 
            }
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'a' && str.charAt(i + 2) == 't') {
                countCat++; 
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if (i == str.length() - 2) {
                break; 
            }
            if (str.charAt(i) == 'd' && str.charAt(i + 1) == 'o' && str.charAt(i + 2) == 'g') {
                countDog++; 
            }
        }

        System.out.println("countDog = " + countDog + ", countCat = " + countCat);
        if (countCat == countDog) {
            System.out.println("equal");
            return true; 
        }
        
        System.out.println("not equal");
        return false; 

    }

    public static boolean catDogSubString(String str) {

        int countDog = 0; 
        int countCat = 0; 

        if (str.length() < 2) {
            System.out.println("equal");
            return true; 
        }

        for (int i = 0; i < str.length(); i++) {
            
            if (i == str.length() - 2) {
                break; 
            }
            if (str.substring(i, i + 3).equals("cat")) {
                countCat++; 
            }

            if (str.substring(i, i + 3).equals("dog")) {
                countDog++; 
            }

        }

        if (countCat == countDog) {
            System.out.println("equal");
            return true; 
        }
        
        System.out.println("not equal");
        return false; 
    
    }

    // Return the number of times that the string "code" appears anywhere in the given string, 
    // except we'll accept any letter for the 'd', so "cope" and "cooe" count.

    public static int countCode(String str) {

        int count = 0; 

        if (str.length() < 4) {
            return count; 
       }
        for (int i = 0; i < str.length(); i++) {
            if (i == str.length() - 3) {
                break; 
            }
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o'
            && str.charAt(i + 3) == 'e') {
                count++; 
            }
        }
        System.out.println("final count = " + count);
        return count; 

    }

    // Given two strings, return true if either of the strings appears at the very end of the other string,
    // ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). 
    // Note: str.toLowerCase() returns the lowercase version of a string.

    public static boolean endOther(String a, String b) {
        a = a.toLowerCase(); 
        b = b.toLowerCase(); 
        int bLength = b.length(); 
        int aLength = a.length(); 

        // Sets String a as the longer String 
        if (aLength < bLength) {
            String temp = a; 
            a = b; 
            b = temp; 
        }

        // resets string length in case string switched 
        bLength = b.length(); 
        aLength = a.length(); 

        System.out.println("after switching, a is: " + a + ", and b is: " + b );
        

        if (a.substring(aLength - bLength).equals(b)) {
            return true; 
        }
    
        return false; 
    }

    // A sandwich is two pieces of bread with something in between. Return the string that is between 
    // the first and last appearance of "bread" in the given string, 
    // or return the empty string "" if there are not two pieces of bread.

    

    public static String getSandwich(String str) {
        int countOfBread = 0; 
        int endOfFirstBread = 0; 
        int beginningOfLastBread = 0;

        if (str.length() < 10) {
            System.out.println("");
            return ""; 
       }

        //search for the first bread from beginning of string
        for (int i = 0; i < str.length(); i++) {

            // if i reaches the end of the string, there cannot be "bread" 
            if (i == str.length() - 4) {
                break; 
            }

            //find the first bread, break
            if (str.substring(i, i + 5).equals("bread")) {
                countOfBread++; 
                endOfFirstBread = i + 4; 
                break; 
            }
        }

        // search for the first first bread from the end of the string
        // NOTE: i must be after the first bread
        for (int i = str.length() - 1; i > endOfFirstBread; i--) {

            // if i reaches end of first bread, there cannot be another "bread" . 
            if (i == endOfFirstBread + 4) {
                break; 
            }
            // find the first bread, break
            if (str.substring(i - 4, i + 1).equals("bread")) {
                countOfBread++; 
                beginningOfLastBread = i - 4; 
                break; 
            }
        }

        // there is a sandwich because there are two breads
        if (countOfBread == 2) {

            System.out.println(str.substring(endOfFirstBread + 1, beginningOfLastBread)); 
            return str.substring(endOfFirstBread + 1, beginningOfLastBread); 
        }

        System.out.println("");
        return ""; 
    }


}
