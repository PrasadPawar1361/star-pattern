public class patternPRASAD {
    public static void main(String[] args) throws Exception {

        
        pattern.p(6);
        Thread.sleep(2000);
        pattern.r(6);
         Thread.sleep(2000);
        pattern.a(6);
         Thread.sleep(2000);
        pattern.s(6);
         Thread.sleep(2000);
        pattern.a(6);
        Thread.sleep(2000);
        pattern.d(6);
        Thread.sleep(2000);
            
        
    }
}

class LetterThread extends Thread{
    char ch;
    int n;

    LetterThread(char ch, int n) {
        this.ch = ch;
        this.n = n;
    }

    public void run() {

      char[] name = {'P','R','A','S','A','D'};

for(char c : name){
    LetterThread t = new LetterThread(c, 6);
    t.start();
    
}

        try {
            Thread.sleep(2000); // 3 sec delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class pattern{

    static void p(int n){
        
        for(int i = 0; i<=n; i++){
            if(i==0 || i==3){
                System.out.println("PPPPPP");
            }
            else if(i==1 || i==2){
                System.out.println("P    P");
            }
            else{
                System.out.println("P");
            }
        }
    }

    static void r(int n){
        for(int i=0; i<=n; i++ ){
            if(i == 0 || i == 3){
                System.out.println("RRRRR");
            }
            else if(i == 1 || i==2){
                System.out.println("R    R");
            }
             else if(i == 4){
                System.out.println("R  R");
            }

            else{
                System.out.println("R    R");
            }
        }
    }

    static void a(int n){
        for(int i=0; i<=n; i++){
            if(i==0){
                System.out.println(" AAAA");
            }
            else if(i==3){
                System.out.println("AAAAAA");
                
            }
            else{
                System.out.println("A    A");
            }

        }
    }

    static void s(int n){
        for(int i =0; i<=n; i++){
            if(i == 0 || i == 3 || i ==6){
                System.out.println("SSSSS");
            }
            else if(i == 4 || i == 5){
            System.out.println("    S");
            }
            else{
                System.out.println("S");
            }
        }
    }

    static void d(int n){
        for(int i = 0; i<=n; i++){
            if(i == 0 || i == 6){
                System.out.println("DDDD");
            }
            else if(i == 1 || i == 5){
                System.out.println("D   D");
            }
            else {
                System.out.println("D     D");
            }
        }
    }
}