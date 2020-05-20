
package kitap;

public class okul {

   
  private int Kitap;
  private int defter;
  
    public okul(int Kitap,int defter){
        super();
        this.Kitap=Kitap;
        this.defter=defter;
    }
 
    public okul(){
       
        this.Kitap=0;
        this.defter=0;
    }
    public void printkitap (){
        
        String output ="Kitap :"+this.Kitap + "\n defter :"
                +this.defter;
        System.out.println(output);
    }
    public  int getKitap(){
        return Kitap;
    }
    public  int getdefter(){
        return  defter;
    }
    
   
    
   
}

    

