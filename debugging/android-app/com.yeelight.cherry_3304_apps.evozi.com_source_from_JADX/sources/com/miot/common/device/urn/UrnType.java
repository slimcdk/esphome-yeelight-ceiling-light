package com.miot.common.device.urn;

import android.os.Parcelable;

public interface UrnType extends Parcelable {
    @Deprecated
    String getClassType();

    String getDomain();

    String getName();

    @Deprecated
    String getSubType();

    Type getType();

    String getUUID();
}
