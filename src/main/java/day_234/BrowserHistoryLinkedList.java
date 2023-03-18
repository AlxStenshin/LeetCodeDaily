package day_234;

import java.util.LinkedList;

/**
 * <a href = "https://leetcode.com/problems/design-browser-history/">
 * 1472. Design Browser History </a>
 * <p>
 * You have a browser of one tab where you start on the homepage and you can visit another url, get back in the history number of steps or move forward in the history number of steps.
 * <p>
 * Implement the BrowserHistory class:
 * <p>
 * <b>BrowserHistory(string homepage) </b>Initializes the object with the homepage of the browser.
 * <p>
 * <b>void visit(string url)</b> Visits url from the current page. It clears up all the forward history.
 * <p>
 * <b>string back(int steps)</b> Move steps back in history. If you can only return x steps in the history and steps > x, you will return only x steps. Return the current url after moving back in history at most steps.
 * <p>
 * <b>string forward(int steps)</b> Move steps forward in history. If you can only forward x steps in the history and steps > x, you will forward only x steps. Return the current url after forwarding in history at most steps.
 */

public class BrowserHistoryLinkedList {
    private final LinkedList<String> history;

    private int currentIndex;

    public BrowserHistoryLinkedList(String homepage) {
        history = new LinkedList<>();
        history.addFirst(homepage);
    }

    public void visit(String url) {
        history.add(++currentIndex, url);

        int countToRemove = history.size() - 1 - currentIndex;
        while(countToRemove > 0) {
            history.removeLast();
            countToRemove --;
        }
    }

    public String back(int steps) {
        currentIndex -= steps;
        return history.get(Math.max(0, currentIndex));
    }

    public String forward(int steps) {
        if(steps + currentIndex > history.size() - 1) {
            currentIndex = history.size() - 1;
            return history.getLast();
        }

        currentIndex += steps;
        return history.get(currentIndex);
    }
}
