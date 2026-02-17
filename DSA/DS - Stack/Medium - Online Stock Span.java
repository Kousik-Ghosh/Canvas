/* https://leetcode.com/problems/online-stock-span/description/ */

class Pair{
    int price;
    int span;
    Pair(int x, int y){
        price = x;
        span = y;
    }
}

class StockSpanner {

    ArrayDeque<Pair> stack;
    public StockSpanner() {
        stack = new ArrayDeque<>();
    }
    
    public int next(int price) {
        if(stack.isEmpty()){
            stack.push(new Pair(price, 1));
            return 1;
        }else{
            int localSpan = 1;
            while(!stack.isEmpty() && stack.peek().price <= price){
                Pair temp = stack.pop();
                localSpan += temp.span; 
            }
            stack.push(new Pair(price, localSpan));
        }
        return stack.peek().span;
    }
}

/**
 * 
 */