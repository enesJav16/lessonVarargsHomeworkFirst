import java.util.Arrays;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random random1 =new Random();
        int a= random1.nextInt(1,10);
        int[] b=new int[5];
        for (int i = 0; i < b.length; i++) {
            b[i]= random1.nextInt(1,10);
        }
        System.out.println(Arrays.toString(b));
        System.out.println(a);
        System.out.println(contains(a,b));

    }
    public static boolean contains(int a , int...b) {
        boolean k =false;
        for (int i = 0; i < b.length; i++) {
            if(b[i]==a){
                k=true;
            }
        }
        return k;
    }
}