import java.util.ArrayList;
import java.util.Scanner;

// CODE FOR PP BATCH 1 CONTEST
public class Feb10 {
    static Scanner sc = new Scanner(System.in);

    // QUES 1 ====================================================

    public static void diagonalAndWaveTraversals(int n) {
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int r = n - 1;
        int c = 0;
        boolean flag = true;
        System.out.println(matrix[r][c]);
        c++;
        while (flag) {

            // negative
            while (r > 0 && c > 0) {
                System.out.println(matrix[r][c]);
                r--;
                c--;
            }
            System.out.println(matrix[r][c]);

            if (r == 0) {
                c++;
            } else {
                r--;
            }

            // positive
            while (r < n - 1 && c < n - 1) {
                System.out.println(matrix[r][c]);
                r++;
                c++;
            }

            System.out.println(matrix[r][c]);

            if (r == 0 && c == n - 1)
                break;
            if (c == n - 1) {
                r--;
            } else {
                c++;
            }

        }
    }

    // QUES 2 ====================================================

    public static void easyPattern(int n) {

        int[][] matrix = new int[n][n];

        int x = 1;

        int rowA = 0;
        int rowB = n - 1;

        int mid = n / 2;
        while (rowA < mid) {
            for (int j = 0; j < n; j++) {
                matrix[rowA][j] = x;
                x++;
            }

            for (int j = 0; j < n; j++) {
                matrix[rowB][j] = x;
                x++;
            }

            rowA++;
            rowB--;
        }

        if (n % 2 != 0 && rowA == mid) {
            for (int j = 0; j < n; j++) {
                matrix[rowA][j] = x;
                x++;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Recursive =================================================
    public static void easyPatternRecur(int n, int k) {
        if(n%2 == 0 && k == n) {
            return;
        }
        int flag = 0;
        if(n%2 ==1 && k == n - 1) {
            flag = 1;
        }
        
        for(int i = n*k + 1 ; i < n*k + 1 + n ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        if(flag==1) {
            return;
        }
        easyPatternRecur(n, k + 2);
            
        for(int i = n*(k + 1) + 1 ; i < n*(k + 1) + 1 + n ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    // QUES 3 ====================================================

    public static void madAngles(int n) {
        int star = n;
        int oStar = (2 * n) - 1;
        int oSpace = 2;
        int iSpace = 2;
        int iStar = 1;

        int x = n;
        while (x-- > 0) {
            printStars(star);

            printSpaces(oSpace);

            printStars(oStar);

            printSpaces(iSpace);

            printStars(iStar);

            printSpaces(iSpace);

            printStars(oStar);

            printSpaces(oSpace);

            printStars(star);

            System.out.println();

            oStar -= 2;
            iStar += 2;
            oSpace++;

        }

    }

    public static void printStars(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
    }

    public static void printSpaces(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(" ");
        }
    }

    // QUES 4 ====================================================

    public static void printBoardPath(int n, int m) {
        ArrayList<String> ans = new ArrayList<>();

        helper(n, m, "", ans);

        System.out.println(ans.size());

        System.out.println(ans);

        for (String a : ans) {
            System.out.println(a);
        }
    }

    public static void helper(int n, int m, String psf, ArrayList<String> ans) {
        if (n < 0)
            return;
        if (n == 0) {
            ans.add(psf);
            return;
        }
        for (int i = 1; i <= m; i++) {
            helper(n - i, m, psf + i, ans);
        }
    }

    // QUES 5 ====================================================

    public static void recursiveDilemma(int n) {
        recursiveCode(n);
    }

    public static void recursiveCode(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }

        recursiveCode(n - 1);
        System.out.print(n + " ");
        recursiveCode(n - 1);

    }

}