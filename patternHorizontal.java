public class patternHorizontal {

    public static void main(String[] args) {

        int n = 7; // height

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
                System.out.print("DDDD  ");
            else if (i == 1 || i == 5)
                System.out.print("D   D ");
            else
                System.out.print("D    D");

            System.out.println(); // next row
        }
    }
    }
