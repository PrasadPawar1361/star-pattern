public class pattern9 {
    
    public static void main(String[] args){
        int n = 5;

        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= n; j++){

                if(i == (n/2)+1 || j == (n/2)+1){ // to find the mid line this is trick fro patterns.
                System.out.print("@ ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }
}
