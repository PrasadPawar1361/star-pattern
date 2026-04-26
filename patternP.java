public class patternP{
    public static void main(String[] args){

        int height =7;

        for(int i = 0; i<=height; i++){
            
            if(i == 0 || i == 3){
                System.out.println("*******");
            }
            else if(i == 1 || i == 2){
                System.out.println("*     *");
            }
            else{
                System.out.println("*"); 
            }
        }
    }
}