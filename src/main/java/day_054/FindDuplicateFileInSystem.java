package day_054;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * <a href=https://leetcode.com/problems/find-duplicate-file-in-system/">
 *     609. Find Duplicate File in System</a>
 * <p>
 * Given a list paths of directory info, including the directory path, and all the files with contents in this directory,
 * return all the duplicate files in the file system in terms of their paths. You may return the answer in any order.
 * <p>
 * A group of duplicate files consists of at least two files that have the same content.
 * <p>
 * A single directory info string in the input list has the following format:
 * "root/d1/d2/.../dm f1.txt(f1_content) f2.txt(f2_content) ... fn.txt(fn_content)"
 * <p>
 * It means there are n files (f1.txt, f2.txt ... fn.txt) with content (f1_content, f2_content ... fn_content)
 * respectively in the directory "root/d1/d2/.../dm". Note that n >= 1 and m >= 0. If m = 0,
 * it means the directory is just the root directory.
 * <p>
 * The output is a list of groups of duplicate file paths. For each group,
 * it contains all the file paths of the files that have the same content.
 * A file path is a string that has the following format:
 * "directory_path/file_name.txt"
 * <p>
 * Given n non-negative integers representing an elevation map where the width of each bar is 1,
 * compute how much water it can trap after raining.
 */

public class FindDuplicateFileInSystem {
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> files = new HashMap<>();

        for (String path : paths) {
            String[] split = path.split(" ");
            String directory = split[0];
            for (int i = 1; i < split.length; i++) {
                String file = split[i];
                String content = file.substring(file.indexOf('(') + 1, file.indexOf(')'));
                String name = file.substring(0, file.indexOf('('));

                if (files.containsKey(content)) {
                    List<String> f = files.get(content);
                    List<String> updated = new ArrayList<>(f);
                    updated.add(directory + "/" + name);
                    files.put(content, updated);
                } else {
                    files.put(content, List.of(directory + "/" + name));
                }
            }
        }
        return files.values().stream()
                .filter(strings -> strings.size() > 1)
                .collect(Collectors.toList());
    }
}
