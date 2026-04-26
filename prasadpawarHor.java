public class prasadpawarHor {
    

    public static void main(String[] args) throws Exception {

        int n = 7; 
        int wait = 1000; 

        for (int i = 0; i < n; i++) {

            // -------- P --------
            if (i == 0 || i == 3)
                System.out.print("PPPPP    ");
            else if (i == 1 || i == 2)
                System.out.print("P   P    ");
            else
                System.out.print("P        ");

            // -------- R --------
            if (i == 0 || i == 3)
                System.out.print("RRRRR    ");
            else if (i == 1 || i == 2)
                System.out.print("R   R    ");
            else if (i == 4)
                System.out.print("R  R     ");
            else
                System.out.print("R   R    ");

            // -------- A --------
            if (i == 0)
                System.out.print(" AAA     ");
            else if (i == 3)
                System.out.print("AAAAA    ");
            else
                System.out.print("A   A    ");

            // -------- S --------
            if (i == 0 || i == 3 || i == 6)
                System.out.print("SSSSS   ");
            else if (i == 4 || i == 5)
                System.out.print("     S  ");
            else
                System.out.print("S       ");

            // -------- A --------
            if (i == 0)
                System.out.print(" AAA     ");
            else if (i == 3)
                System.out.print("AAAAA    ");
            else
                System.out.print("A   A    ");

            // -------- D --------
            if (i == 0 || i == 6)
                System.out.print("DDDD     ");
            else if (i == 1 || i == 5)
                System.out.print("D   D    ");
            else
                System.out.print("D    D   ");

            // -------- P --------

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

            // -------- W --------

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
                


            System.out.println(); // next row
         
    Thread.sleep(wait); // 1 sec delay after each row
     }
    }
}