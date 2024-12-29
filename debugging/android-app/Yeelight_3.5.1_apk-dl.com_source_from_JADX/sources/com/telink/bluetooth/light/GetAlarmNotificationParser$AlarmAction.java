package com.telink.bluetooth.light;

public enum GetAlarmNotificationParser$AlarmAction {
    OFF(0),
    ON(1),
    SCENE(2);
    
    private final int value;

    private GetAlarmNotificationParser$AlarmAction(int i) {
        this.value = i;
    }

    public static GetAlarmNotificationParser$AlarmAction valueOf(int i) {
        for (GetAlarmNotificationParser$AlarmAction getAlarmNotificationParser$AlarmAction : values()) {
            if (i == getAlarmNotificationParser$AlarmAction.getValue()) {
                return getAlarmNotificationParser$AlarmAction;
            }
        }
        return null;
    }

    public int getValue() {
        return this.value;
    }
}
