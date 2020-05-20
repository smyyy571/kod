
package kitap;
import java.util.Scanner;


public class test {
    
    

   
    private int kitap;
    private int deft;
    private int defp;
    
      public int KitapTest1(int c){
                   
          this.kitap=c;
          return kitap;
      }
      
      
      public int KitapTest2(int c){
                  
          this.deft=c;
          return deft;
      }
      
        public int KitapTest3(int c){
                 
          this.defp=c;
          return defp;
      }
      
     public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
    
       test a= new test();
         System.out.print("lutfen kitap sayisini giriniz :  " );
         int w=sc.nextInt();
          System.out.print("defter : ");
         int R=sc.nextInt();
         
            System.out.print(" numnara : ");
         int P=sc.nextInt();
                
         defter df =new defter( a.KitapTest1(w), a.KitapTest2(R), a.KitapTest3(P));
         okumakitap ca1 =new okumakitap(6, 2500, 4000);
         //kiaTaxi
         System.out.println("birinci sinif....");
                 
         df.print();
        df.fiayt();
        //kia Pickup
        System.out.println("ikinci sinif....");
        ca1.print();
      
         System.out.print("lutfen kitap sayisi giriniz : ");
         
         int kitapsayisi=sc.nextInt();
         System.out.println("fiyat :"+ca1.kitaphesap(kitapsayisi));      

     System.out.println("lutfen Taxi sayisi giriniz ");
       
         int deftersayi=sc.nextInt();
      
   System.out.println("fiyat :"+df.defterhesap(deftersayi)); 

  
  

     }
      
 
    
}

    
    
    

