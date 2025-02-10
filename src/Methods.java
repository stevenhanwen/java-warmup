public class Methods {

public String delDel(String str) {
  
    if (str.length() >= 4 && str.substring (1, 4) == "del") {
      String front = str.substring (0,1); 
      String back = str.substring (4); 
      return front + back; 
    }
    
    return str; 
    
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