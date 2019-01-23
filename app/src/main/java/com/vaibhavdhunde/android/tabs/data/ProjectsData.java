package com.vaibhavdhunde.android.tabs.data;

import java.util.ArrayList;
import java.util.List;

public class ProjectsData {
    private static List<String> mTitles = new ArrayList<String>() {{
        add("VCS Collaboration");
        add("Rect with Native Apps");
        add("AI with IOS");
        add("Chat Bot");
        add("Optimizing Server Space");
        add("Self Driving Car");
        add("UI / UX for Android");
        add("Fix issues in Android Studio 3.3");
        add("Update Material Design Guidelines");
        add("Data Science in AI");
        add("Android Things");
        add("Google Pay App");
        add("Google Home");
        add("Google Assistant");
        add("Upgrade C4CX Chip");
    }};

    private static String mDescription = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
            "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim " +
            "veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo " +
            "consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum " +
            "dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, " +
            "sunt in culpa qui officia deserunt mollit anim id est laborum.";

    private static List<Integer> mStatuses = new ArrayList<Integer>() {{
        add(1);
        add(1);
        add(2);
        add(1);
        add(3);
        add(1);
        add(2);
        add(1);
        add(2);
        add(1);
        add(3);
        add(1);
        add(1);
        add(2);
        add(1);
    }};

    public static List<String> getTitles() {
        return mTitles;
    }

    public static String getDescription() {
        return mDescription;
    }

    public static List<Integer> getStatuses() {
        return mStatuses;
    }

    public static int getCount() {
        return mTitles.size();
    }
}
