public class patternR {
    public static void main(String[] args){

        int ht = 7;
        for(int i = 0; i <= ht; i++){

           
                if(i == 0 || i == 3){
                    System.out.println("*******");
                }
                else if(i == 1 || i == 2){
                    System.out.println("*     *");
                }
                else if(i == 4){
                    System.out.println("*  *  ");
                }
                else{
                    System.out.println("*     *");
                }
            }
                
            
        }

    }

