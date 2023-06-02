package com.anmorozov.leetcode.problems.solutions;

import com.anmorozov.leetcode.common.VersionControl;

public class P278 extends VersionControl {

    public P278(int badVersion) {
        super(badVersion);
    }

    public int firstBadVersion(int n) {

        int currentVersion;
        int lastBadVersion = n;
        int lastGoodVersion = 1;
        while (lastGoodVersion <= lastBadVersion) {
            currentVersion = lastGoodVersion + (lastBadVersion - lastGoodVersion) / 2;
            if (super.isBadVersion(currentVersion)) {
                lastBadVersion = currentVersion - 1;
            } else {
                lastGoodVersion = currentVersion + 1;
            }
        }
        return lastGoodVersion;
    }

}
