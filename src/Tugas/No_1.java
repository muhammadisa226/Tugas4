package Tugas;

/**
 *
 * @author Muhammad Isa
 */
public class No_1 {
     public  static  void insertionsort(int []A){
         for(int i=1; i<A.length; i++){
          int key = A[i];
          int j = i-1;
          while ((j>= 0) &&  (A[j]>key)){
          A[j +1] = A[j];
          j--;
          }
          A[j + 1]= key;
          }
        
    }
     public  static  void tampil(int []data){
         
     for(int i=0; i<data.length; i++){
                System.out.print(data[i]+ " ");
     }
     System.out.println();
     }
    
    public static void main(String[] args) {
        System.out.println("Pengurutan Menggunakan InsertionSort");
        int data[] = {25,7,9,13,3};
        System.out.println("Data Sebelum Diurutkan : "); 
           No_1.tampil(data);
           No_1.insertionsort(data);
           System.out.println("Data Sesudah Diurutkan : ");
           No_1.tampil(data);
           System.out.println();
            System.out.print("Muhammad Isa NUruddin");
           

    }
    
}
