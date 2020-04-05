package com.company;

public class Main {
    public static void main(String[] args){
          //Task_05
        int array [] = {5,2,6,2,7};
        int x = 2;
        int [] result = ArrayUtility.deleteAllSameValuesFromArray(array,x);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
          //Task_05


        System.out.println("===== TASK 5 =====");
        int array1 [] = {2,5,3,5,1};
        int array2 [] = {4,8,5,3};
        int [] res = ArrayUtility.appendAllUniqueValues(array1,array2);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
        }

//        //Task_04
//        int array1 [] = {2,1,6};
//        int array2 [] = {3,3};
//        int [] result = ArrayUtility.appendNewValues(array1,array2);
//        for (int i = 0; i < result.length; i++) {
//            System.out.print(result[i]);
//        }

//       // Task_03
//        int array [] = {2,5,1,-2,0};
//        int b = 20;
//        int c = 10;
//        int[] result3task.ArrayUtility.appendNew2Values(array, c);
//        System.out.println(result3task);

//      //  Task_02
//
//
//        int[] newArray = ArrayUtility.appendNewValue(array,b);
//
//        for (int i = 0; i < newArray.length; i++) {
//            System.out.print(newArray[i] + ", ");
//        }




////        Task_01
//        int numbers[]={2,6,1,7,10};
//
//        System.out.println(ArrayUtility.returnArrayElementsSum(numbers));
////        this is end

//        int[] myArray = new int[10];
//        myArray[2]=111111;
//
//        for (int i=0; i<myArray.length; i++)

        //        System.out.println(args[1]);
//        System.out.println(args[2]);
//        System.out.println(args[3]);
//
//        for (int i=0; i<args.length; i++){
//            System.out.println(args[i]);
//        }
    }
}
/*
//   public static int leftResult(int a, int b)
//    {
//        //return (a+b)^2;
//        int x = a + b;
//        int y = x*x;
//        //return Math.sqrt(double x);
//        return y;
//    }
//
//    public static int rightResult(int a, int b)
//    {
//        return (a*a + 2*a*b + b*b);
//    }

        public static void main(String[] args) {

//        int a = 2;
//        int b = 3;
//
//        System.out.println("left side = " + leftResult(a, b));
//        System.out.println("right side = " + rightResult(a, b));
//        if (leftResult(a,b)==rightResult(a, b))
//        {
//            System.out.println("true");
//        }
//        else
//        {
//            System.out.println("false");
//        }
            int c = 6;
            int d = 2;
            System.out.println(Calculator.Sum(c,d));
            System.out.println(Calculator.Minus(c,d));
            System.out.println(Calculator.Multi(c,d));
            System.out.println(Calculator.Div(c,d));
    }
}

*/