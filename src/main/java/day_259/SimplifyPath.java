package day_259;

import java.util.*;

/**
 * <a href = "https://leetcode.com/problems/simplify-path/">
 * 71. Simplify Path </a>
 * <p>
 * Given a string path, which is an absolute path (starting with a slash '/') to a file or directory in a Unix-style file system, convert it to the simplified canonical path.
 * <p>
 * In a Unix-style file system, a period '.' refers to the current directory, a double period '..' refers to the directory up a level, and any multiple consecutive slashes (i.e. '//') are treated as a single slash '/'. For this problem, any other format of periods such as '...' are treated as file/directory names.
 * <p>
 * The canonical path should have the following format:
 * <p>
 * The path starts with a single slash '/'.<br>
 * Any two directories are separated by a single slash '/'.<br>
 * The path does not end with a trailing '/'.<br>
 * The path only contains the directories on the path from the root directory to the target file or directory (i.e., no period '.' or double period '..')
 * <p>
 * Return the simplified canonical path.
 */

public class SimplifyPath {

    public String simplifyPath(String path) {
        Stack<String> pathStack = new Stack<>();

        for (String entry : path.split("/")) {
            if (entry.equals("..") && !(pathStack.isEmpty())) {
                pathStack.pop();
            } else if (!entry.equals(".") && !entry.equals("..") && !entry.isBlank()) {
                pathStack.push(entry);
            }
        }

        List<String> resultList = new ArrayList<>(pathStack.size());
        while (!pathStack.isEmpty()) {
            resultList.add(pathStack.pop());
        }

        Collections.reverse(resultList);

        StringBuilder simplified_path = new StringBuilder();
        for (String entry : resultList) {
            simplified_path.append("/").append(entry);
        }

        return simplified_path.length() == 0 ? "/" : simplified_path.toString();
    }

    public String simplifyPath_Deque(String path) {
        Deque<String> pathDeque = new ArrayDeque<>();
        for (String entry : path.split("/")) {
            if (!pathDeque.isEmpty()
                    && entry.equals("..")) {
                pathDeque.removeLast();
            } else if (!entry.equals(".") &&
                    !entry.isBlank()
                    && !entry.equals("..")) {
                pathDeque.addLast(entry);
            }
        }

        StringBuilder simplified_path = new StringBuilder();
        for (String entry : pathDeque) {
            simplified_path.append("/").append(entry);
        }

        return simplified_path.length() == 0 ? "/" : simplified_path.toString();
    }

}
