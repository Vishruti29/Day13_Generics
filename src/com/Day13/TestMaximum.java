package com.Day13;
import java.util.Scanner;
public class TestMaximum {
        public static void main(String[] args){
            TestMaximum greatestNumber = new TestMaximum();

            System.out.println(" Enter size of array : ");
            int options = new Scanner(System.in).nextInt();

            greatestNumber.passinteger(options);
            greatestNumber.passfloat(options);
            greatestNumber.passString(options);
        }
            void passinteger(int size ){
            Scanner userinput = new Scanner(System.in);
            Integer[] nums= new Integer[size];
            System.out.println(" Enter elements of integer array : ");
            for (int k = 0 ; k <  size ; k++){
                nums[k] = userinput.nextInt();
            }
            TestMaximum greatestNumber = new TestMaximum();
            greatestNumber.maxvalue(nums);
        }
            void passfloat(int size){
            Scanner userinput = new Scanner(System.in);
            Float[] numsf = new Float[size];
            System.out.println("Enter elements of float array");
            for (int k = 0 ; k <  size; k++){
                numsf[k] = userinput.nextFloat();
            }
            TestMaximum greatestNumber = new TestMaximum();
            greatestNumber.maxvalue(numsf);
    }
            void passString(int size){
            Scanner userinput = new Scanner(System.in);
            String[] numsS = new String[size];
            System.out.println("Enter elements of String array");
            for (int k = 0 ; k <  size; k++){
            numsS[k] = userinput.nextLine();
            }
            TestMaximum greatestNumber = new TestMaximum();
            greatestNumber.maxvalue(numsS);

    }
        public <T extends Comparable<T> >void maxvalue(T[] array){
            for (int i=0;i<array.length;i++){
                for (int j=i+1;j< array.length;j++){
                    if (array[i].compareTo(array[j])<0){
                        T store;
                        store=array[i];
                        array[i]=array[j];
                        array[j]=store;
                    }
                }
            }
            System.out.println("Greatest element is : " +array[0]);

        }
}