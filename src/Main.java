import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


         try {
        Developer developer = new Developer(8, "Zeynep", 26, 400000);
            System.out.println(developer);

        } catch (AgeException e) {
             System.out.println(e.getMessage());
         }
        }

    }

