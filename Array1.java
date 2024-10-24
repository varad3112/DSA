import java.util.*;
class Array1{
    public static void main(String args[]){
        int arr[] = new int[100];
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements must present in array(0-100):");
        int n = sc.nextInt();
        System.out.print("Enter"+n+" elements and press enter:");
        for(int i=0;i<n;i++){ 
            arr[i]=sc.nextInt();
        }
            System.out.println("Array elements are :");
        for(int i=0;i<n;i++){
            System.out.println("\t"+arr[i]);
        }


        System.out.println("Third element is:");
        sc.close();
        
    }
}