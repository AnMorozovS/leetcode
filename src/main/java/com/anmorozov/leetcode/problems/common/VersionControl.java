package com.anmorozov.leetcode.problems.common;

public class VersionControl {

    int badVersion;

    public VersionControl(int badVersion) {
        this.badVersion = badVersion;
    }

    public boolean isBadVersion(int currentVersion) {

        boolean result = badVersion <= currentVersion;
        System.out.printf("call isBadVersion(%d) -> %s\n", currentVersion, result);
        if (badVersion == currentVersion) {
            System.out.printf("Then %d is the first bad version.\n", currentVersion);
        }
        return result;
    }

}
