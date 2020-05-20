
package kitap;

import java.util.Scanner;
public class okumakitap extends okul  {
    
    
    
     Scanner sc = new Scanner(System.in); 
    private int sinif;
    
    public okumakitap(int kitap,int defter , int sinif){
        super(kitap,defter);
        this.sinif =sinif;
    }
    public  void print (){
       super.printkitap();
        System.out.println("sinif :"+this.sinif);
    }
    public  void fullRange(){
        int sayfa =this.sinif +super.getdefter() ;
        System.out.println(" sayfa :"+sayfa);
    }
    
      public int kitaphesap( int kitapsayisi){
      
        int sonuc=kitapsayisi*4;
       
     return sonuc;
    }
     
       
       
 
    
}

    
    
    
    
    
    

