package Yukti_C0780739_Inclassactivity;
import java.lang.reflect.Array;
import java.util.Arrays;
public class inclassActivity {
    static void display(int[] elements){
        for (int element:elements){
            System.out.print(element+" ");
        }
    }
    static void reverse(int[] elements){
        for (int i = elements.length-1;i>=0;i--){
            System.out.print(elements[i]+" ");
        }

    }
    static void ascending(int[] elements){
        Arrays.sort(elements);
        System.out.print(Arrays.toString(elements)+" ");
    }
    static void descending(int[] elements) {
        int temp = 0;

        for (int i = 0; i < elements.length; i++) {
            for (int j = i + 1; j < elements.length; j++) {
                if (elements[i] < elements[j]) {
                    temp = elements[i];
                    elements[i] = elements[j];
                    elements[j] = temp;
                }
            }
        }
        for (int i = 0; i < elements.length; i++) {
            System.out.print(elements[i] + " ");
        }
    }
    static void oddelements(int[] elements){
        for (int i =0;i<elements.length;i++){
            if (elements[i]%2!=0){
                System.out.print(elements[i]+" ");
            }
        }
    }
    static void evenelements(int[] elements){
        for (int i =0;i<elements.length;i++){
            if (elements[i]%2==0){
                System.out.print(elements[i]+" ");
            }
        }
    }
    static void sum(int[] elements){
        int sum = 0;
        for (int i=0;i<elements.length;i++){
            sum+=elements[i];
        }
        System.out.print(sum);
    }
    public static void main(String[] args){
        int[] elements = {1,2,3,4,5,6,7,8,9,7};
        display(elements);

        System.out.println("\n"+"Reverse Order:");
        reverse(elements);
        System.out.println("\n"+"Ascending Order:");
        ascending(elements);
        System.out.println("\n"+"Descending Order:");
        descending(elements);
        System.out.println(("\n"+"Odd numbers:"));
        oddelements(elements);
        System.out.println(("\n"+"Even numbers:"));
        evenelements(elements);
        System.out.println("\n"+"Sum of elements:");
        sum(elements);


    }
}
