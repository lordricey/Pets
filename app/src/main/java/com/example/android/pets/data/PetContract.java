package com.example.android.pets.data;

import android.provider.BaseColumns;

public class PetContract {
    private PetContract() {}

    public static abstract class PetEntry implements BaseColumns {
        public static final String TABLE_NAME = "pets";
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_NAME = "price";
        public static final String COLUMN_BREED = "style";
        public static final String COLUMN_GENDER = "in_stock";
        public static final String COLUMN_WEIGHT = "description";


        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
    }
}
