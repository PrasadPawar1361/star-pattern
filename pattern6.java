public class pattern6{
    public static void main (String args[]){
        for(int i=0; i<=5; i++){           // forloop for row increment
            for(int j=4; j>=i; j--){       // forloop for col space (" ")
                System.out.print(" ");  

            }
            for(int k = 0; k<=i; k++){       //loop for str 
                System.out.print("*");
                if(k<i){                   // if for str
                    System.out.print("*"); 
                }
            }
        System.out.println(" ");
        }
    }
}