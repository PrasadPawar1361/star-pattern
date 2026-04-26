public class HorPawar {
    
    public static void main(String[] args){
        int n = 6;

        for(int i=0; i<=n; i++){

            if(i==0 || i==3)
                System.out.print("PPPPP   ");
            else if(i==1 || i==2)
                System.out.print("P   P   ");
            else 
                System.out.print("P       ");

             // -------- A --------
            if (i == 0)
                System.out.print(" AAA     ");
            else if (i == 3)
                System.out.print("AAAAA    ");
            else
                System.out.print("A   A    ");

//w
            if(i == 3)
                System.out.print("W     W     W   ");
            
            else if(i == 4)
               
                System.out.print("W   W   W   W   "); 
            
            else if(i == 5)
               
                System.out.print("W  W     W  W   "); 
            
            else if(i == 6)
               
                System.out.print("W W       W W   "); 
            
            
            else
                               
                System.out.print("W           W   "); 
            
// -------- A --------
            if (i == 0)
                System.out.print(" AAA     ");
            else if (i == 3)
                System.out.print("AAAAA    ");
            else
                System.out.print("A   A    ");

    //-------R---------

                  if(i == 0 || i == 3)
                    System.out.print("RRRRRR");
                
                else if(i == 1 || i == 2)
                    System.out.print("R     R");
                
                else if(i == 4)
                    System.out.print("R  R  ");
                
                else
                    System.out.print("R     R");
                




             System.out.println();

        }
    }
}
