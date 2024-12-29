package com.miot.common.utils;

import java.util.UUID;

public class UUIDUtils {
    public static final String UUID_FORMAT = "0000%04x-0000-1000-8000-00805f9b34fb";

    public static UUID makeUUID(int i) {
        return UUID.fromString(String.format("0000%04x-0000-1000-8000-00805f9b34fb", new Object[]{Integer.valueOf(i)}));
    }
}
