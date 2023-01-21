package day_178;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href = "https://leetcode.com/problems/restore-ip-addresses/">
 * 93. Restore IP Addresses </a>
 * <p>
 * A valid IP address consists of exactly four integers separated by single dots. Each integer is between 0 and 255 (inclusive) and cannot have leading zeros.
 * <p>
 * For example, "0.1.2.201" and "192.168.1.1" are valid IP addresses, but "0.011.255.245", "192.168.1.312" and "192.168@1.1" are invalid IP addresses.
 * <p>
 * Given a string s containing only digits, return all possible valid IP addresses that can be formed by inserting dots into s. You are not allowed to reorder or remove any digits in s. You may return the valid IP addresses in any order.
 */

public class RestoreIPAddresses {
    List<String> ans = new ArrayList<>();
    String str;
    public List<String> restoreIpAddresses(String s) {
        str = s;
        insertDot("", 0, 0);
        return ans;
    }

    void insertDot(String path, int index, int dots) {
        if (dots > 4)
            return;

        if (dots == 4 && index >= str.length()) {
            ans.add(path.substring(0, path.length() - 1));
            return;
        }

        for (int length = 1; length <= 3 && index + length <= str.length(); length++) {
            String num = str.substring(index, index + length);

            if (num.charAt(0) == '0' && length != 1)
                break;

            else if (Integer.parseInt(num) <= 255) {
                insertDot(path + str.substring(index, index + length) + ".", index + length, dots + 1);
            }
        }
    }

}
