//import java io.file;
import java.io.FileReader;
import java.util.Scanner;

public class PredefinedException {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            int[] arr = {1,2,3,4};
            int i,b;
            FileReader fr = new FileReader("abc.txt");
            i = sc.nextInt();
            b = sc.nextInt();
            System.out.println(arr[i]);
            System.out.println(arr[i]/b);
        } catch (ArithmeticException e){
           System.out.println("Exception caught is " + e.getMessage()); 
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception caught is " + e.getMessage());
        }
        catch(Exception e){
            System.out.println("File not found");
        }
        finally{
            sc.close();
            System.out.println("Finally executed");
        }
    }
}
