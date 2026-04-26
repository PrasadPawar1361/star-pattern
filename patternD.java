public class patternD {
    public static void main(String[] args){

        int height =7;

        for(int i = 0; i<=height; i++){
            
            if(i == 0 || i == 7 ){
                System.out.println("*****");
            }
            else if(i == 1 || i==6){
                System.out.println("*     *");
            }
            else if(i == 2 || i == 5 ){
                System.out.println("*      *");
            }
                else if(i == 3 || i==4){
                System.out.println("*       *");
            }
            
            else{
                System.out.println("*"); 
            }
        }
}
}