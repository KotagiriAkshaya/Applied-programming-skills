class StockSpanner {

    Stack<Integer> prices;
    Stack<Integer> spans;

    public StockSpanner() {
        prices = new Stack<Integer>();
        spans = new Stack<Integer>();
    }

    public int next(int price) {

        int span = 1;

        while (!prices.isEmpty() && prices.peek() <= price) {
            prices.pop();
            span = span + spans.pop();
        }

        prices.push(price);
        spans.push(span);

        return span;
    }
}