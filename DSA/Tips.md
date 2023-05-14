-   Recursion - Global variable alternative.

        int[] counter = {0};
        dfs(root,counter);



-   Very large binary String to Decimal. (left->right)

        (2 * 0) + 1 = 1 
        (2 * 1) + 1 = 3
        (2 * 3) + 1 = 7
        (2 * 7) + 1 = 15

        int currentBit = s.charAt(i) == '0'? 0 : 1;
        sum = (sum * 2) + currentBit;



-   Fibbinary Numbers - No consecutive 1s in binary  – O(1).

        1010            1011
        >101            >101
        ----            ----
        0000            0001
        if ((n & (n >> 1)) == 0)


-   Total count of Fibbinary Numbers of n-bit length = (n+2)th of fibonacci series.


-   Fibonacci

        if(x <= 1){
            return x;
        }
        return (x-1) + fib(x-2);


-   Factorial(n) trailing zeros

        Count of 5s in prime factors of n!
        ans = floor(n/5) + floor(n/25) + floor(n/125) ...

-   Remove duplicates in array - O(nlogn) - Inset in a TreeSet
