import java.util.Arrays;

public class largestinarray
{
  public static void main(String[] args) {

    int[] arr={ 50,23,15,14};

    Arrays.sort(arr);

    System.out.println(arr[arr.length-1]);

  }
}