package com.telink.bluetooth.light;

public enum GetAlarmNotificationParser$AlarmType {
    DAY(0),
    WEEK(1);
    
    private final int value;

    private GetAlarmNotificationParser$AlarmType(int i) {
        this.value = i;
    }

    public static GetAlarmNotificationParser$AlarmType valueOf(int i) {
        for (GetAlarmNotificationParser$AlarmType getAlarmNotificationParser$AlarmType : values()) {
            if (i == getAlarmNotificationParser$AlarmType.getValue()) {
                return getAlarmNotificationParser$AlarmType;
            }
        }
        return null;
    }

    public int getValue() {
        return this.value;
    }
}
