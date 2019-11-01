import java.util.*;

public class Array{
  public static void main(String[] args) {


    /*
    int[] myArray = {3, 5, 6, 8, -3, 0};

    System.out.println(Arrays.toString(myArray));
    Arrays.sort(myArray);
    System.out.println();
    System.out.println(Arrays.toString(myArray));
    System.out.println();

    int[] myArray2 = Arrays.copyOf(myArray, 6);
    System.out.println(Arrays.toString(myArray2));
    System.out.println();

    myArray = myArray2;
    System.out.println(Arrays.toString(myArray));



    String[] names = {};

    Scanner in = new Scanner(System.in);

    for (int i = 3; i <= 0; i--){

      System.out.print("Input a name: ");
      String name = in.next();

      names = {name};



    }

     swap two array elements

    int tempA = myArray[a];
    myArray[a] = myArray[b];
    myArray[b] = tempA





    int validsize = 5;
    int[] myArray = {3, 5, 6, 8, -3};
    int[] myArray2 = Arrays.copyOf(myArray, 10);
    myArray = myArray2;

    // **Bad insert

    for(int i = validsize; i > 1; i--){
      myArray[i] = myArray[i-1];
    }

    myArray[1] = 2;
    System.out.println(Arrays.toString(myArray));


    */

    String[] arr = {"aaa", "bbb", "ccc"};
    mystery(arr);
    System.out.println(arr[0] + " " + arr.length);



  }

  public static void mystery(String[] arr){

    arr = new String[5];
    arr[0] = "ddd";

  }


}
