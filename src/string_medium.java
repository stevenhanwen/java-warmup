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

}
