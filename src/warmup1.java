public class warmup1 {



  // Given two int values, return their sum. 
  // Unless the two values are the same, then return double their sum.

  public static int sumDouble(int a, int b) {
    if (a == b){
      return 2 * (a + b); 
    }
    return a + b; 
  }

  
  // We have two monkeys, a and b, and the parameters 
  // aSmile and bSmile indicate if each is smiling. 
  // We are in trouble if they are both smiling or 
  // if neither of them is smiling. Return true if we are in trouble.
  public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
  if (aSmile && bSmile) {
    return true; 
  } else if (!aSmile && !bSmile){
    return true;
  } 

  return false; 
}


  public String delDel(String str) {
  
    if (str.length() >= 4 && str.substring (1, 4) == "del") {
      String front = str.substring (0,1); 
      String back = str.substring (4); 
      return front + back; 
    }
    
    return str; 
    
  }


  // Given a non-empty string and an int N, 
  // return the string made starting with char 0, 
  // and then every Nth char of the string. 
  // So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
  // happiness --> hpies  
  public static String everyNth(String str, int n) {
    String newStr = ""; 
    int index = 0; 
    for (int i = 0; i < str.length(); i += n){
      
      newStr += str.substring(index, index + 1); 
      System.out.println(newStr);
      index += n; 
    }
    System.out.println(newStr);
    return newStr; 
    
  }

  // this one uses StringBuilder to be more efficient
  public static String everyNthStringBuild(String str, int n) {
  
    StringBuilder newStr = new StringBuilder(""); 
    for (int i = 0; i < str.length(); i += n){
      
      newStr.append(str.charAt(i)); 
      System.out.println(newStr);
    }
    System.out.println(newStr);
    return newStr.toString(); 
    
  }
  


 

  public static boolean stringE(String str) {
    int count = 0; 
    for (int i = 0; i < str.length(); i++) {
      char temp = str.charAt(i); 
      System.out.println(temp);
      if (temp == 'e') {
        count = count + 1; 
      }
      System.out.println("i-th count = " + count + ", i = " + i);
    }

    System.out.println("final count = " + count);
    
    if (count > 0 && count < 4){
      return true; 
    }
    
    return false; 
  }
  
}