import java.io.File;  // Import the File class
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1{
  
  public static void main(String[] args){
    try{
      File fileObject = new File("input.txt");
      Scanner reader = new Scanner(fileObject);
      int finalAnswer = 0;
     
      while (reader.hasNextLine()){
        int line = Integer.parseInt(reader.nextLine());
        Double tempAnswer = 0.0;
        tempAnswer = (Math.floor(line/3) - 2);
        finalAnswer += tempAnswer ;
        while(true){
          tempAnswer = ((Math.floor(tempAnswer/3)) - 2);
          if (tempAnswer > 0){
            finalAnswer += tempAnswer;
          }else{
            break;
          }
        }
        System.out.println(finalAnswer);
        
      }
      
      
      System.out.println("The final answer is " + finalAnswer);
      
      reader.close();
    }catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }

}//class
