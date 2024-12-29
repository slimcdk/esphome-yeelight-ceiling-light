package com.google.android.gms.common.internal.safeparcel;

import android.os.Parcelable;
import androidx.annotation.NonNull;

public interface SafeParcelable extends Parcelable {
    @NonNull
    public static final String NULL = "SAFE_PARCELABLE_NULL_STRING";

    public @interface Class {
        @NonNull
        String creator();

        boolean doNotParcelTypeDefaultValues() default false;

        boolean validate() default false;
    }

    public @interface Constructor {
    }

    public @interface Field {
        @NonNull
        String defaultValue() default "SAFE_PARCELABLE_NULL_STRING";

        @NonNull
        String defaultValueUnchecked() default "SAFE_PARCELABLE_NULL_STRING";

        @NonNull
        String getter() default "SAFE_PARCELABLE_NULL_STRING";

        /* renamed from: id */
        int mo12312id();

        @NonNull
        String type() default "SAFE_PARCELABLE_NULL_STRING";
    }

    public @interface Indicator {
        @NonNull
        String getter() default "SAFE_PARCELABLE_NULL_STRING";
    }

    public @interface Param {
        /* renamed from: id */
        int mo12315id();
    }

    public @interface RemovedParam {
        @NonNull
        String defaultValue() default "SAFE_PARCELABLE_NULL_STRING";

        @NonNull
        String defaultValueUnchecked() default "SAFE_PARCELABLE_NULL_STRING";

        /* renamed from: id */
        int mo12318id();
    }

    public @interface Reserved {
        @NonNull
        int[] value();
    }

    public @interface VersionField {
        @NonNull
        String getter() default "SAFE_PARCELABLE_NULL_STRING";

        /* renamed from: id */
        int mo12321id();

        @NonNull
        String type() default "SAFE_PARCELABLE_NULL_STRING";
    }
}
