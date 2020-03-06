import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FileHead {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the name of your file?");
        String fileName = keyboard.nextLine();

        File file = new File(fileName);

        try{
            Scanner scannerFile = new Scanner(file);
            int lineNum = 1;
            while(scannerFile.hasNext() && lineNum <= 5){
                String line = scannerFile.nextLine();
                System.out.println(line);
                lineNum += 1;
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
