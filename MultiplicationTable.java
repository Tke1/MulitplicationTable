import static java.lang.System.out;
import java.util.Scanner;

public class MultiplicationTable
{
    public static void printTable (int sizeOfTable){
        out.format("    ");
        for(int i = 0; i<= sizeOfTable; i++){
            out.format("%4d", i);
        }
        out.println();
        for(int i = 0 ; i<= sizeOfTable; i++){
            out.format("%4d",i);
            for(int j = 0; j <= sizeOfTable; j++) {
                out.format("%4d", i*j);
            }
            out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int sizeOfTable;
        out.println("What is the size of multiplication table you would like to print?");
        sizeOfTable = keyboard.nextInt(); 
        if (sizeOfTable > 20)
        {
            out.println("Error. Table size couldn't be greater than 20"); 
        }
        else {
            printTable(sizeOfTable);
        }
    }
}

