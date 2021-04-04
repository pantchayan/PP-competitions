public class April4{
    static Scanner sc = new Scanner(System.in);

    // FEILD TRIP
    public static void feildTrip()) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        int[] size = new int[10];
        
        for(int i=0;i<arr.length;i++){
            int curr = arr[i];
            size[curr]++;
        }
        boolean flag = true;
        
        for(int i=1;i<10;i++){
            if(size[i]%2==0){
                continue;
            }
            else{
                flag = false;
                break;
            }
        }
        
        
        if(flag){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }

    // Phone booth
    public static void phoneBooth() {
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        
        int space = 0;
        for(int i=0;i<n;i++){
            if(k==0) break;
            if(arr[i]==0){
                if(space==0){
                    space++;
                }
                else{
                    if(arr[i+1] == 0){
                        k--;
                    }
                    i++;
                }
            }
            else{
                space = 1;
            }
        }
        if(k==0){
            System.out.println("true");
        }
        else{
            
            System.out.println("false");
        }
    }

    // Diag and Wave Traversal
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

    // point of parity
    public static void pointOfParity() {
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        // code here
        boolean flag = false;
        for(int k=0;k<n;k++){
            
        int sum1 =0;
        int sum2 =0;
        
        for(int i=0;i<k;i++){
            sum1+=arr[i];
        }
        for(int j=n-1;j>k;j--){
            sum2+= arr[j];
        }
            
            if(sum1==sum2){
                System.out.println(k);
                flag = true;
                break;
            }
        }
        if(!flag){
            
                System.out.println("-1");
        }
    }
}
