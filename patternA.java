public class patternA {
  
    public static void main(String[] args){

        int height =7;

        for(int i = 1; i<=height; i++){
            
            if(i == 1){
                System.out.println(" **** ");
            }
            else if(i == 4){
                System.out.println("******");
            }
            else{
                System.out.println("*    *"); 
            }
        }
    }
}


