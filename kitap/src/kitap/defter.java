
package kitap;
import java.util.Scanner; 
public class defter extends okul{
    
    
    
    
    
   
            Scanner sc = new Scanner(System.in); 

    private  int P ;
     public  defter (int kitap , int defter ,int p){
         super(kitap , defter);
         P=p;
     }
   public void print(){
        super.printkitap();
        System.out.println("numara :"+this.P);
    }
    public  void fiayt(){
        
        int fiyat =super.getKitap()*5000;
        System.out.println("fiyat ="+fiyat);
    }
    
  
       public int defterhesap( int defter){
      
        int sonuc=defter*10000*2/3;
       
     return sonuc;
    }
     
    
}

    
    
    

