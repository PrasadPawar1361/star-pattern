public class pattern2{

public static void main (String[] args){

    int m = 10;

    for(int i = 0; i<=m; i++){

        for(int j = m; j>=i; j--){
            System.out.print("*");
        }
        System.out.println(" ");
    }
}


}