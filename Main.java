import java.util.*;
import java.util.HashMap;
import java.util.Scanner;
public class TDL {
  HashMap<Integer,String> List = new HashMap<>();
  int Done;
  public static void Add(String x){
    int i = 0;
    List.put(i,x);
    System.out.println("The new Task is Addes to List !")
    i++;
    Done = 1;
  }
  public static void Remove(int disp){
    List.remove(disp);
    System.out.print("The taka at number :"+disp+"is removed , Successfully !");
    Done = 0;
  }
    public static void main(String[] args) {
      TDL obj = new TDl();
      System.out.print("Select A Function to be performed :\n1.Add \n 2.Remove \n 3.Display");
      Scanner var1 = new Scanner(System.in);
      switch(var1){
        case 1:
          System.out.print("Enter the Task to be ADDEED !");
          Scanner tsk = new Scanner(System.in);
          obj.Add(tsk);
          if obj.Add(Done)==1{
            System.out.print("The Task is added Successfully");
          }
          break;
        case 2:
            Scanner tsk = new Scanner(System.in);
          obj.Add(tsk);
          if obj.Add(Done)==0{
            System.out.print("The Task is added Successfully");
          }
          break;
        case 3:
           System.out.println(obj.List.keySet())
          break;
        default:
        System.out.print("Galat Input Hai ..!");
      }
  }
}
