package com.example.administrator.crimeintent;

/**
 * Created by XyL on 2016/5/12.
 */
public class CrimeDbSchema {

    public static final class CrimeTable {

        // 定义数据库的表名
        public static final String NAME = "crimes";

        public static final class Cols {
            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String DATE = "date";
            public static final String SOLVED = "solved";
            public static final String SUSPECT = "suspect";
        }
    }
}
