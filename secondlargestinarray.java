public class secondlargestinarray
{
  public static void main(String[] args) {

    int[] arr={ 155,11,15,94,45,89,30,96,84};
    int largest;
    int slargest= Integer.MIN_VALUE;

    largest = arr[0];


    for(int i=0;i<arr.length;i++)
    {
      if(arr[i]>largest) {
        slargest = largest;
        largest = arr[i];
      } else if (arr[i] > slargest && arr[i] != largest)
      {
        slargest=arr[i];
        
      }

    }
    System.out.println("Largest: "+ largest);
    System.out.println("Scond Largest: "+ slargest);


  }
}