import java.util.Scanner;

class InsertArray{
    public static void main(String[] args) {
        int arr[] = new int[100];
        int i,num,n,pos;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements in array:");
        n = sc.nextInt();

        System.out.println("Enter elements of array");
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Array is:");
        for(i=0;i<n;i++){
            System.out.print(arr[i]);
        }


        System.out.println("Enter element to be inserted");
        num = sc.nextInt();

        System.out.println("Enter postion number to be inserted :");
        pos = sc.nextInt();

        if(pos<0||pos>n){
            System.out.println("position size cannot be exceeded than array size!!!");
        }

        System.out.println("Array elements after insertion are:");
        for(i=n;i>pos;i--){
            arr[i]=arr[i-1];
        }
        arr[pos]=num;
        n++;

        for(i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}