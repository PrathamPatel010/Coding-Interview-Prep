//https://leetcode.com/problems/fibonacci-number/
package Basics;

public class Fibonacci {
    public int fib(int n) {
        if(n<=1){
            return n;
        }
        int ans=0;
        int a=0;
        int b=1;
        for(int i=2;i<=n;i++){
            int sum = a+b;
            a=b;
            b=sum;
        }
        return b;
    }
}
