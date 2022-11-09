package day_105;

import java.util.*;

/**
 * <a href="https://leetcode.com/problems/online-stock-span/">
 *  901. Online Stock Span </a>
 * <p>
 * Design an algorithm that collects daily price quotes for some stock and returns the span of that stock's price for the current day.
 * <p>
 * The span of the stock's price today is defined as the maximum number of consecutive days (starting from today and going backward) for which the stock price was less than or equal to today's price.
 * <p>
 * For example, if the price of a stock over the next 7 days were [100,80,60,70,60,75,85], then the stock spans would be [1,1,1,2,1,4,6].
 * Implement the StockSpanner class:
 * <p>
 * StockSpanner() Initializes the object of the class.
 * <p>
 * int next(int price) Returns the span of the stock's price given that today's price is price.
 */

public class StockSpanner {

    Deque<StockSpan> deque;

    public StockSpanner() {
        deque = new ArrayDeque<>();
    }

    public int next(int price) {
        int days = 1;

        while (!deque.isEmpty() &&
                deque.peekLast().price <= price) {
            days += deque.removeLast().span;
        }

        deque.addLast(new StockSpan(price, days));

        return days;
    }

    static class StockSpan {
        int price;
        int span;

        public StockSpan(int price, int span) {
            this.price = price;
            this.span = span;
        }
    }
}
