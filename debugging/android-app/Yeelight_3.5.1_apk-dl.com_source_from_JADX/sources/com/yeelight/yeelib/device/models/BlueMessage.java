package com.yeelight.yeelib.device.models;

public enum BlueMessage {
    MAIN("0000fff0-0000-1000-8000-00805f9b34fb"),
    CONTROL("0000fff1-0000-1000-8000-00805f9b34fb"),
    DELAY("0000fff2-0000-1000-8000-00805f9b34fb"),
    DELAY_QUERY("0000fff3-0000-1000-8000-00805f9b34fb"),
    DELAY_NOTIFICATION("0000fff4-0000-1000-8000-00805f9b34fb"),
    STATE_QUERY("0000fff5-0000-1000-8000-00805f9b34fb"),
    STATE_NOTIFICATION("0000fff6-0000-1000-8000-00805f9b34fb"),
    COLORFLOW("0000fff7-0000-1000-8000-00805f9b34fb"),
    NAME("0000fff8-0000-1000-8000-00805f9b34fb"),
    NAME_NOTIFICATION("0000fff9-0000-1000-8000-00805f9b34fb"),
    COLORFLOW_QUERY("0000fffa-0000-1000-8000-00805f9b34fb"),
    COLORFLOW_NOTIFICATION("0000fffb-0000-1000-8000-00805f9b34fb"),
    LIGHT_SETTING("0000fffc-0000-1000-8000-00805f9b34fb"),
    INFO("0000fffd-0000-1000-8000-00805f9b34fb"),
    PASSWD("0000fffe-0000-1000-8000-00805f9b34fb"),
    BEACON("0000ffe1-0000-1000-8000-00805f9b34fb"),
    BEACON_NOTIFICATION("0000ffe2-0000-1000-8000-00805f9b34fb");
    
    private String uuid;

    private BlueMessage(String str) {
        this.uuid = str;
    }

    public static BlueMessage getServiceType(String str) {
        BlueMessage blueMessage = MAIN;
        if (str.equalsIgnoreCase(blueMessage.getUuid())) {
            return blueMessage;
        }
        BlueMessage blueMessage2 = CONTROL;
        if (str.equalsIgnoreCase(blueMessage2.getUuid())) {
            return blueMessage2;
        }
        BlueMessage blueMessage3 = DELAY;
        if (str.equalsIgnoreCase(blueMessage3.getUuid())) {
            return blueMessage3;
        }
        BlueMessage blueMessage4 = DELAY_QUERY;
        if (str.equalsIgnoreCase(blueMessage4.getUuid())) {
            return blueMessage4;
        }
        BlueMessage blueMessage5 = DELAY_NOTIFICATION;
        if (str.equalsIgnoreCase(blueMessage5.getUuid())) {
            return blueMessage5;
        }
        BlueMessage blueMessage6 = STATE_QUERY;
        if (str.equalsIgnoreCase(blueMessage6.getUuid())) {
            return blueMessage6;
        }
        BlueMessage blueMessage7 = STATE_NOTIFICATION;
        if (str.equalsIgnoreCase(blueMessage7.getUuid())) {
            return blueMessage7;
        }
        BlueMessage blueMessage8 = NAME;
        if (str.equalsIgnoreCase(blueMessage8.getUuid())) {
            return blueMessage8;
        }
        BlueMessage blueMessage9 = NAME_NOTIFICATION;
        if (str.equalsIgnoreCase(blueMessage9.getUuid())) {
            return blueMessage9;
        }
        BlueMessage blueMessage10 = COLORFLOW_QUERY;
        if (str.equalsIgnoreCase(blueMessage10.getUuid())) {
            return blueMessage10;
        }
        BlueMessage blueMessage11 = COLORFLOW;
        if (str.equalsIgnoreCase(blueMessage11.getUuid())) {
            return blueMessage11;
        }
        BlueMessage blueMessage12 = COLORFLOW_NOTIFICATION;
        if (str.equalsIgnoreCase(blueMessage12.getUuid())) {
            return blueMessage12;
        }
        BlueMessage blueMessage13 = LIGHT_SETTING;
        if (str.equalsIgnoreCase(blueMessage13.getUuid())) {
            return blueMessage13;
        }
        BlueMessage blueMessage14 = INFO;
        if (str.equalsIgnoreCase(blueMessage14.getUuid())) {
            return blueMessage14;
        }
        BlueMessage blueMessage15 = PASSWD;
        if (str.equalsIgnoreCase(blueMessage15.getUuid())) {
            return blueMessage15;
        }
        BlueMessage blueMessage16 = BEACON;
        if (str.equalsIgnoreCase(blueMessage16.getUuid())) {
            return blueMessage16;
        }
        BlueMessage blueMessage17 = BEACON_NOTIFICATION;
        return str.equalsIgnoreCase(blueMessage17.getUuid()) ? blueMessage17 : blueMessage;
    }

    public String getUuid() {
        return this.uuid;
    }
}
