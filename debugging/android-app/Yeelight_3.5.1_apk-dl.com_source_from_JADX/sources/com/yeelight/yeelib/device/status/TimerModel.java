package com.yeelight.yeelib.device.status;

import android.content.Context;
import android.content.res.Resources;
import com.miot.service.manager.timer.TimerCodec;
import com.yeelight.yeelib.R$string;
import java.io.Serializable;
import java.util.Calendar;
import p051j4.C9189e;

public class TimerModel implements Serializable {
    public static final int ALARM_TYPE_DAYREPEAT = 2;
    public static final int ALARM_TYPE_SINGLE = 1;
    public static final int ALARM_TYPE_WEEKREPEAT = 3;
    public static final String GRADUAL = "gradual";
    public static final String HOUR = "hour";
    public static final String MINUTE = "minute";
    public static final String ON_OFF = "on_off";
    public static final String REPEAT = "repeat";
    private static final long serialVersionUID = 8995897892639088747L;
    private int deviceModelId;
    private boolean enable;
    private int gradual;
    private int hour;

    /* renamed from: id */
    private int f12710id;
    private boolean isSetUp = false;
    private int minute;
    private int mode;
    private String name;
    private int on_off;
    private String repeat;
    private String[] repeatArray;
    private int second;
    private int status;
    private int syncId;
    private int syncToAlarm;
    private int syncToPhone;

    public static String getAlarmRepeatDays(Context context, String str) {
        Resources resources;
        int i;
        char[] charArray = str.toCharArray();
        String[] strArr = {context.getString(R$string.common_text_repeat_7), context.getString(R$string.common_text_repeat_1), context.getString(R$string.common_text_repeat_2), context.getString(R$string.common_text_repeat_3), context.getString(R$string.common_text_repeat_4), context.getString(R$string.common_text_repeat_5), context.getString(R$string.common_text_repeat_6)};
        String str2 = "";
        for (int i2 = 0; i2 < charArray.length; i2++) {
            char c = charArray[i2];
            C9189e.m22138a("timer", "getdays:" + c + " =>" + strArr[i2]);
            if (c == '1') {
                str2 = str2 + strArr[i2] + " ";
            }
        }
        if (str.equals("0111110")) {
            resources = context.getResources();
            i = R$string.common_text_repeat_weekday;
        } else if (!str.equals("1000001")) {
            return str2;
        } else {
            resources = context.getResources();
            i = R$string.common_text_repeat_weekend;
        }
        return resources.getString(i);
    }

    public static String reverse(String str) {
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            str2 = str.charAt(i) + str2;
        }
        return str2;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof TimerModel)) {
            return false;
        }
        TimerModel timerModel = (TimerModel) obj;
        return timerModel.syncId == this.syncId && timerModel.enable == this.enable && timerModel.on_off == this.on_off && timerModel.hour == this.hour && timerModel.minute == this.minute && timerModel.gradual == this.gradual && timerModel.mode == this.mode && timerModel.repeat.equals(this.repeat);
    }

    public long getActionTime(boolean z) {
        if (!this.enable) {
            return -1;
        }
        if (this.on_off != (z ? 3 : 4)) {
            return -1;
        }
        Calendar instance = Calendar.getInstance();
        instance.set(11, this.hour);
        instance.set(12, this.minute);
        instance.set(13, this.second);
        int i = this.mode;
        if (i == 1) {
            instance.set(5, Integer.parseInt(this.repeat));
            if (instance.getTimeInMillis() - System.currentTimeMillis() > 43200000) {
                return -1;
            }
            return instance.getTimeInMillis();
        } else if (i == 2) {
            if (instance.getTimeInMillis() < System.currentTimeMillis()) {
                instance.add(5, 1);
            }
            if (instance.getTimeInMillis() - System.currentTimeMillis() > 43200000) {
                return -1;
            }
            return instance.getTimeInMillis();
        } else if (i != 3) {
            return -1;
        } else {
            String repeat2 = getRepeat();
            int i2 = instance.get(7) - 1;
            int i3 = 0;
            while (true) {
                if (i3 >= 7) {
                    break;
                } else if (repeat2.codePointAt((i3 + i2) % 7) == 49) {
                    instance.add(5, i3);
                    break;
                } else {
                    i3++;
                }
            }
            if (instance.getTimeInMillis() - System.currentTimeMillis() > 43200000) {
                return -1;
            }
            return instance.getTimeInMillis();
        }
    }

    public int getDeviceModelId() {
        return this.deviceModelId;
    }

    public int getGradual() {
        return this.gradual;
    }

    public int getHour() {
        return this.hour;
    }

    public int getId() {
        return this.f12710id;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getMode() {
        return this.mode;
    }

    public String getName() {
        return this.name;
    }

    public long getNextOffTime() {
        return getActionTime(false);
    }

    public long getNextOnTime() {
        return getActionTime(true);
    }

    public int getOn_off() {
        return this.on_off;
    }

    public String getRepeat() {
        while (this.repeat.length() < 7) {
            this.repeat = TimerCodec.DISENABLE + this.repeat;
        }
        return reverse(this.repeat);
    }

    public String[] getRepeatArray() {
        return this.repeatArray;
    }

    public String getRepeatStr(Context context) {
        int i;
        if (getMode() == 1) {
            i = R$string.common_text_repeat_once;
        } else if (getMode() != 2) {
            return getAlarmRepeatDays(context, getRepeat());
        } else {
            i = R$string.common_text_repeat_everyday;
        }
        return context.getString(i);
    }

    public int getSecond() {
        return this.second;
    }

    public int getStatus() {
        return this.status;
    }

    public int getSyncId() {
        return this.syncId;
    }

    public int getSyncToAlarm() {
        return this.syncToAlarm;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public boolean isSetUp() {
        return this.isSetUp;
    }

    public void setDeviceModelId(int i) {
        this.deviceModelId = i;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public void setGradual(int i) {
        this.gradual = i;
    }

    public void setHour(int i) {
        this.hour = i;
    }

    public void setId(int i) {
        this.f12710id = i;
    }

    public void setMinute(int i) {
        this.minute = i;
    }

    public void setMode(int i) {
        this.mode = i;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOn_off(int i) {
        this.on_off = i;
    }

    public void setRepeat(String str) {
        this.repeat = str;
    }

    public void setRepeatArray(String[] strArr) {
        this.repeatArray = strArr;
    }

    public void setSecond(int i) {
        this.second = i;
    }

    public void setSetUp() {
        this.isSetUp = true;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setSyncId(int i) {
        this.syncId = i;
    }

    public void setSyncToAlarm(int i) {
        this.syncToAlarm = i;
    }
}
