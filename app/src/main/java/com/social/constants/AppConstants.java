package com.social.constants;

public class AppConstants {

    public static class Fonts {
        public static final int GOTHAM_BLACK = 1;
        public static final int GOTHAM_BOLD = 2;
        public static final int GOTHAM_BOOK = 3;
        public static final int GOTHAM_LIGHT = 4;
        public static final int GOTHAM_MEDIUM = 5;
        public static final int GOTHAM_THIN = 6;
    }

    public static class BottomBar{

        public static class ViewTags{

            public static final String VIEW_TAG_HOME = "VIEW_TAG_HOME";
            public static final String VIEW_TAG_SEARCH = "VIEW_TAG_SEARCH";
            public static final String VIEW_TAG_CHANNEL = "VIEW_TAG_CHANNEL";
            public static final String VIEW_TAG_NOTIFICATION = "VIEW_TAG_NOTIFICATION";
            public static final String VIEW_TAG_PROFILE = "VIEW_TAG_PROFILE";
        }
    }

    public class Permission {
        public static final int GRANTED = 0;
        public static final int DENIED = 1;
        public static final int PERMISSION_NEVER_ASK = -1;
    }
    public static class RequestCodes {
        public static final int CAMERA_PERMISSION = 13;
        public static final int REQUEST_CAPTURE_DOCUMENT = 1001;
        public static final int CALL_REQUEST = 14;
        public static final int PERMISSIONS_CAMERA_AND_STORAGE=15;
    }
}
