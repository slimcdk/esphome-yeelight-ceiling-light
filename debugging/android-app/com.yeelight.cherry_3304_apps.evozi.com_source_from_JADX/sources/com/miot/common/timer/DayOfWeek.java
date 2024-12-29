package com.miot.common.timer;

public enum DayOfWeek {
    SUNDAY(0),
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6);
    
    private int value;

    private DayOfWeek(int i) {
        this.value = 0;
        this.value = i;
    }

    public static DayOfWeek valueOf(int i) {
        switch (i) {
            case 0:
                return SUNDAY;
            case 1:
                return MONDAY;
            case 2:
                return TUESDAY;
            case 3:
                return WEDNESDAY;
            case 4:
                return THURSDAY;
            case 5:
                return FRIDAY;
            case 6:
                return SATURDAY;
            default:
                return null;
        }
    }

    public int value() {
        return this.value;
    }
}
