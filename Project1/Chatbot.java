import java.util.*;
 public class Chatbot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        if (a.equalsIgnoreCase ("hey") || 
         a.equalsIgnoreCase("hii") || 
         a.equalsIgnoreCase("Hey") ||
         a.equalsIgnoreCase("Hii") || 
         a.equalsIgnoreCase("Hello") ||
         a.equalsIgnoreCase("hello") || 
         a.equalsIgnoreCase("namaste") || 
         a.equalsIgnoreCase("Namaste)") ) {
            System.out.println("Hey.. how are you?");
        } else if
            (a.equalsIgnoreCase("i am fine") ||
             a.equalsIgnoreCase("i am fine."))
             System.out.println("ohh! It's good to know that you are fine. im' fine too thank you for asking me..\n would you like me to tell you a joke?");
           else if 
           (a.equalsIgnoreCase("i'm fine, how are you?")) {
                System.out.println("ohh! It's good to know that you are fine. im' fine too thank you for asking me..\n would you like me to tell you a joke?");
            } else if 
                (a.equalsIgnoreCase("yes tell me a joke") ||
                a.equalsIgnoreCase("i want to listen a joke")) {
                    System.out.println("Yeah sure.. Here it is.\n1.Student: Can I go to the bathroom?\nTeacher: It is May\nstudent: No, it is April, but I still gotta go.\n2. I told my computer I needed a break.\n Now it will not stop sending me KitKat ads.\n");
                }
            
             else if (a.equalsIgnoreCase("no.. i am not fine i am sad.") ||
            a.equalsIgnoreCase("i am not feeling well")||
            a.equalsIgnoreCase("my mood is too off") ||
            a.equalsIgnoreCase("i am not fine")) {
                System.out.println("ohh dear! no problem \n i am here to lighten up your mood \nlet me tell you some jokes \n here it is.\n1. Student: Can I go to the bathroom? \nTeacher: It is May.\n Student: No, it is April, but I still gotta go.\n2.I told my computer I needed a break.\nNow it will not stop sending me KitKat ads.\n");
            }
        
    }
} 