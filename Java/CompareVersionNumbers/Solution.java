package Java.CompareVersionNumbers;

public class Solution {
    public static int compareVersion(String version1, String version2) {
        StringBuilder version1sb = new StringBuilder();
        StringBuilder version2sb = new StringBuilder();
        String[] version1Parts = version1.split("\\.");
        String[] version2Parts = version2.split("\\.");

        int v1Counter = 0;
        int v2Counter = 0;

        int maxParts = Math.max(version1Parts.length, version2Parts.length);
        for (int i = 0; i < maxParts; i++) {
            int current1 = (i < version1Parts.length) ? Integer.parseInt(version1Parts[i]) : 0; // check that we're not out of bounds
            int current2 = (i < version2Parts.length) ? Integer.parseInt(version2Parts[i]) : 0; // on either part array, if we are, default to 0

            if (current1 > current2) {
                return 1;
            } else if (current2 > current1) {
                return -1;
            }
        }
        return 0; // versions are equal
    }

    public static void main(String[] args) {
        System.out.println(compareVersion("7.5.2.4", "7.5.3"));
    }
}