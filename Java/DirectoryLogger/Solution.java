package Java.DirectoryLogger;

import java.util.Objects;
import java.util.Stack;
/*
Leetcode Easy - 1598. Crawler Log Folder

The Leetcode file system keeps a log each time some user performs a change folder operation.

The operations are described below:

"../" : Move to the parent folder of the current folder. (If you are already in the main folder, remain in the same folder).
"./" : Remain in the same folder.
"x/" : Move to the child folder named x (This folder is guaranteed to always exist).
You are given a list of strings logs where logs[i] is the operation performed by the user at the ith step.

The file system starts in the main folder, then the operations in logs are performed.

Return the minimum number of operations needed to go back to the main folder after the change folder operations.
 */

public class Solution {
    public static void main(String[] args) {
        String[] input = {"d1/","d2/","../","d21/","./"};
        String[] input2 = {"d1/","d2/","./","d3/","../","d31/"};
        System.out.println(minOperations(input2));
    }

    public static int minOperations(String[] logs) {
        Stack<String> history = new Stack<>();

        for (int i = 0; i < logs.length; i++) {
            if (Objects.equals(logs[i], "./")){
                continue;
            } else if (Objects.equals(logs[i], "../")){
                if (history.size() != 0){
                    history.pop();
                }
            } else {
                history.push(logs[i]);
            }
        }

        return history.size();
    }
}
