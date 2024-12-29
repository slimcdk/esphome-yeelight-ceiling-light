package com.telink.bluetooth.light;

public enum GetAlarmNotificationParser$AlarmStatus {
    ENABLE(1),
    DISABLE(0);
    
    private final int value;

    private GetAlarmNotificationParser$AlarmStatus(int i) {
        this.value = i;
    }

    public static GetAlarmNotificationParser$AlarmStatus valueOf(int i) {
        for (GetAlarmNotificationParser$AlarmStatus getAlarmNotificationParser$AlarmStatus : values()) {
            if (i == getAlarmNotificationParser$AlarmStatus.getValue()) {
                return getAlarmNotificationParser$AlarmStatus;
            }
        }
        return null;
    }

    public int getValue() {
        return this.value;
    }
}
