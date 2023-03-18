package day_234;

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

public class BrowserHistoryCustomDLL {
    private HistoryNode current;

    public BrowserHistoryCustomDLL(String homepage) {
        current = new HistoryNode(homepage);
    }

    public void visit(String url) {
        current.next = new HistoryNode(url);
        current.next.prev = current;
        current = current.next;
    }

    public String back(int steps) {
        while (steps-- > 0) {
            if (current.prev != null)
                current = current.prev;
        }
        return current.url;
    }

    public String forward(int steps) {
        while (steps-- > 0) {
            if (current.next != null)
                current = current.next;
        }
        return current.url;
    }

    static class HistoryNode {
        public final String url;
        HistoryNode prev;
        HistoryNode next;

        public HistoryNode(final String url) {
            this.url = url;
        }
    }

}

