package com.miot.common.timer;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CrontabTime implements Parcelable {
    public static final Parcelable.Creator<CrontabTime> CREATOR = new Parcelable.Creator<CrontabTime>() {
        public CrontabTime createFromParcel(Parcel parcel) {
            return new CrontabTime(parcel);
        }

        public CrontabTime[] newArray(int i) {
            return new CrontabTime[i];
        }
    };
    private String mDay = "*";
    private List<DayOfWeek> mDayOfWeeks = new ArrayList();
    private int mHour;
    private int mMinute;
    private String mMonth = "*";

    public CrontabTime() {
    }

    protected CrontabTime(Parcel parcel) {
        this.mMinute = parcel.readInt();
        this.mHour = parcel.readInt();
        this.mDay = parcel.readString();
        this.mMonth = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.mDayOfWeeks = arrayList;
        parcel.readList(arrayList, DayOfWeek.class.getClassLoader());
    }

    public static CrontabTime parse(String str) {
        CrontabTime crontabTime = new CrontabTime();
        if (str != null) {
            String[] split = str.split(" ");
            if (split.length == 5) {
                if ("*".equals(split[0])) {
                    crontabTime.setMinute(-1);
                } else {
                    crontabTime.setMinute(Integer.valueOf(split[0]).intValue());
                }
                if ("*".equals(split[1])) {
                    crontabTime.setHour(-1);
                } else {
                    crontabTime.setHour(Integer.valueOf(split[1]).intValue());
                }
                crontabTime.setDay(split[2]);
                crontabTime.setMonth(split[3]);
                if ("*".equals(split[4])) {
                    crontabTime.setDayOfWeeks(Arrays.asList(DayOfWeek.values()));
                    return crontabTime;
                }
                for (String valueOf : split[4].split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
                    try {
                        DayOfWeek valueOf2 = DayOfWeek.valueOf(Integer.valueOf(valueOf).intValue());
                        if (valueOf2 != null) {
                            crontabTime.addDayOfWeek(valueOf2);
                        }
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                }
                return crontabTime;
            }
        }
        return null;
    }

    public void addDayOfWeek(DayOfWeek dayOfWeek) {
        this.mDayOfWeeks.add(dayOfWeek);
    }

    public int describeContents() {
        return 0;
    }

    public String getDay() {
        return this.mDay;
    }

    public List<DayOfWeek> getDayOfWeeks() {
        return this.mDayOfWeeks;
    }

    public int getHour() {
        return this.mHour;
    }

    public int getMinute() {
        return this.mMinute;
    }

    public String getMonth() {
        return this.mMonth;
    }

    public void removeDayOfWeek(DayOfWeek dayOfWeek) {
        this.mDayOfWeeks.remove(dayOfWeek);
    }

    public void setDay(String str) {
        this.mDay = str;
    }

    public void setDayOfWeeks(List<DayOfWeek> list) {
        this.mDayOfWeeks = list;
    }

    public void setHour(int i) {
        this.mHour = i;
    }

    public void setMinute(int i) {
        this.mMinute = i;
    }

    public void setMonth(String str) {
        this.mMonth = str;
    }

    public String toString() {
        String str = "*";
        if (this.mDayOfWeeks.size() != 7) {
            int size = this.mDayOfWeeks.size();
            int i = 0;
            for (DayOfWeek next : this.mDayOfWeeks) {
                if (i == 0) {
                    str = Integer.toString(next.value());
                } else {
                    str = str + next.value();
                }
                if (i < size - 1) {
                    str = str + Constants.ACCEPT_TIME_SEPARATOR_SP;
                }
                i++;
            }
        }
        return String.format("%d %d %s %s %s", new Object[]{Integer.valueOf(getMinute()), Integer.valueOf(getHour()), getDay(), getMonth(), str});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mMinute);
        parcel.writeInt(this.mHour);
        parcel.writeString(this.mDay);
        parcel.writeString(this.mMonth);
        parcel.writeList(this.mDayOfWeeks);
    }
}
