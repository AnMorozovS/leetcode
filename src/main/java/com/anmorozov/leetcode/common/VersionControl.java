package com.anmorozov.leetcode.common;

public class VersionControl {

    private final int badVersion;

    public VersionControl(int badVersion) {
        this.badVersion = badVersion;
    }

    public boolean isBadVersion(int currentVersion) {

        return badVersion <= currentVersion;
    }

}
