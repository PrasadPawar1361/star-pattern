public class patternS {
  
    public static void main(String[] args){

        int height =6;

        for(int i = 0; i<=height; i++){
            
            if(i == 0 || i == 3 || i == 6){
                System.out.println("*******");
            }
             
            else if(i == 1 || i == 2){
               
                System.out.println("*"); 
            }

                     
            else{
               
                System.out.println("      *"); 
            }
        
         
             
          }
        }
    }

