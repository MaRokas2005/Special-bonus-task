import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class bonus {
    public static void main(String[] args){
        try {
            File s = new File("bonus.txt");
            Scanner scanner = new Scanner(s);
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                for(int i = 0; i < line.length() - 1; i++) {
                    if(line.charAt(i) - '0' < 10 && line.charAt(i + 1) - '0' < 10 && line.charAt(i) - '0' > 0){
                        System.out.println(line);
                        break;
                    }
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}


