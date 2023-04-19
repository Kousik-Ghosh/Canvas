# Fibonacci
```JAVA
        static int[] mem = new int[100];
        public static int Fibonacci(int n){
            Arrays.fill(mem, -1);
            return fib(n);
        }

        private static int fib(int n){
            if(mem[n] != -1)
                return mem[n];

            if(n <= 1)
                return n;    

            mem[n] = Fibonacci(n-1) + Fibonacci(n-2);
            return mem[n];
        }
```

# GCD
```JAVA
        static int gcdItration(int a, int b){
            int small = (a <= b ? a : b);
            int gcd = 1;
            for (int i = 1; i <= small; i++) {
                if(a%i == 0 && b%i == 0){
                    gcd = i;
                }
            }
            return gcd;
        }

                OR

        static int gcd(int a, int b){
            if (a == 0)
                return b;
            return gcd(b % a, a);         
        }
```

# All Sub-String 
```JAVA
        static String[] allSubString(String s){
            String temp = "";
            String[] ans = new String[100];
            int i = 0;
            for (int startIndex = 0; startIndex < s.length(); startIndex++) {
                for (int endIndex = startIndex; endIndex < s.length(); endIndex++) {
                    for (int print = startIndex; print <= endIndex; print++) {
                        temp = temp + s.charAt(print);
                    }
                    ans[i++] = temp;
                    temp = "";
                }
            } 
            return ans;
        }
```

# String Reverse in-place
```JAVA
        public static int[] reverseInPlace(int[] arr) {
            int length = arr.length;
            int temp;
            for(int i = 0; i < length/2; i++){
                temp = arr[i];
                arr[i] = arr[length-1-i];
                arr[length-1-i] = temp;
            }
            return arr;
        }
```

# Matrix Transpose
- Square

        swap(arr[i][j], arr[j][i]);
        

- Rectangle
    *   Create a new array for length = old.height & width = old.height
    *   Read old matrix by coloumn one by one and put in a temp 1D array
    *   Now put that 1D array into rows of new matrix using "clone()";
    
```JAVA
        public static int[][] transpose(int[][] matrix) {
            int[][] ans = new int[matrix[0].length][matrix.length];
            int[] temp = new int[matrix.length];
            for(int i = 0; i < matrix[0].length; i++){
                for(int j = 0; j < matrix.length; j++){
                temp[j] =  matrix[j][i]; 
                }
                ans[i] = temp.clone();
            }

            return ans;
        }
```

# Matrix Diagonals

   /* square Matrix diagonals
    *   2 loops
    *       primary diagonal i==j
    *       secondary diagonal i+j == n-1
    *
    *   1 loop
    *        primary diagonal
    *           i=0..n -> mat[i][i]
    *      secondary diagonal
    *         k = n-1
    *        i=0..n -> mat[i][k--]
    */