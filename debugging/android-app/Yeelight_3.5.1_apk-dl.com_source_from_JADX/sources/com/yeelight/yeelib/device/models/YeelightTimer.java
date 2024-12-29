package com.yeelight.yeelib.device.models;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.miot.common.timer.CrontabTime;
import com.miot.common.timer.DayOfWeek;
import com.miot.common.timer.Timer;
import com.xiaomi.mipush.sdk.Constants;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import p227x3.C11980p;

@SuppressLint({"ParcelCreator"})
public class YeelightTimer extends Timer {

    /* renamed from: d */
    private static final String f12705d = YeelightTimer.class.getSimpleName();

    /* renamed from: a */
    private CrontabTime f12706a = new CrontabTime();

    /* renamed from: b */
    private CrontabTime f12707b = new CrontabTime();

    /* renamed from: c */
    private boolean f12708c = false;

    public enum RepeatType {
        REPEAT_ONCE,
        REPEAT_EVERYDAY,
        REPEAT_WORKDAY,
        REPEAT_CUSTOM
    }

    /* renamed from: com.yeelight.yeelib.device.models.YeelightTimer$a */
    static /* synthetic */ class C6171a {

        /* renamed from: a */
        static final /* synthetic */ int[] f12709a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.yeelight.yeelib.device.models.YeelightTimer$RepeatType[] r0 = com.yeelight.yeelib.device.models.YeelightTimer.RepeatType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12709a = r0
                com.yeelight.yeelib.device.models.YeelightTimer$RepeatType r1 = com.yeelight.yeelib.device.models.YeelightTimer.RepeatType.REPEAT_ONCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12709a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.models.YeelightTimer$RepeatType r1 = com.yeelight.yeelib.device.models.YeelightTimer.RepeatType.REPEAT_EVERYDAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f12709a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.yeelight.yeelib.device.models.YeelightTimer$RepeatType r1 = com.yeelight.yeelib.device.models.YeelightTimer.RepeatType.REPEAT_WORKDAY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f12709a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.yeelight.yeelib.device.models.YeelightTimer$RepeatType r1 = com.yeelight.yeelib.device.models.YeelightTimer.RepeatType.REPEAT_CUSTOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.models.YeelightTimer.C6171a.<clinit>():void");
        }
    }

    public YeelightTimer() {
        mo31892r(true);
    }

    public YeelightTimer(Timer timer) {
        setTimerId(timer.getTimerId());
        setDeviceId(timer.getDeviceId());
        setIdentify(timer.getIdentify());
        setName(timer.getName());
        setTimerEnabled(timer.isTimerEnabled());
        setPushEnabled(timer.isPushEnabled());
        setTimerStartEnabled(timer.isTimerStartEnabled());
        setTimerEndEnabled(timer.isTimerEndEnabled());
        setStartAction(timer.getStartAction());
        setEndAction(timer.getEndAction());
        setStartTime(timer.getStartTime());
        setEndTime(timer.getEndTime());
        setSpecStartTask(timer.getSpecStartTask());
        setSpecEndTask(timer.getSpecEndTask());
        m18298m();
        mo31892r(false);
    }

    /* renamed from: a */
    private String m18292a(String str, TimeZone timeZone, TimeZone timeZone2) {
        boolean z;
        boolean z2;
        boolean z3;
        String str2;
        String str3 = str;
        String str4 = null;
        if (str3 == null || str3.equals("")) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("parse local time ");
        sb.append(str3);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("src : ");
        sb2.append(timeZone.getID());
        sb2.append(", tar : ");
        sb2.append(timeZone2.getID());
        Calendar instance = Calendar.getInstance();
        String[] split = str3.split(" |-");
        if (split[0].equals("*")) {
            split[0] = String.valueOf(instance.get(1));
            z = true;
        } else {
            z = false;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("parse local time month: ");
        sb3.append(split[1]);
        if (split[1].equals("*")) {
            split[1] = String.valueOf(instance.get(2) + 1);
            z2 = true;
        } else {
            z2 = false;
        }
        if (split[2].equals("*")) {
            split[2] = String.valueOf(instance.get(5));
            z3 = true;
        } else {
            z3 = false;
        }
        split[3] = split[3];
        String str5 = split[0] + Constants.ACCEPT_TIME_SEPARATOR_SERVER + split[1] + Constants.ACCEPT_TIME_SEPARATOR_SERVER + split[2] + " " + split[3];
        StringBuilder sb4 = new StringBuilder();
        sb4.append("input string : ");
        sb4.append(str3);
        sb4.append(", parse illegal string : ");
        sb4.append(str5);
        Date k = m18296k(str5, timeZone);
        if (k != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            simpleDateFormat.setTimeZone(timeZone2);
            str2 = simpleDateFormat.format(k);
        } else {
            str2 = null;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append("retTime : ");
        sb5.append(str2);
        if (str2 != null) {
            String[] split2 = str2.split(" |-");
            if (z) {
                split2[0] = "*";
            }
            if (z2) {
                split2[1] = "*";
            }
            if (z3) {
                split2[2] = "*";
            }
            str4 = split2[0] + Constants.ACCEPT_TIME_SEPARATOR_SERVER + split2[1] + Constants.ACCEPT_TIME_SEPARATOR_SERVER + split2[2] + " " + split2[3];
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append("output string : ");
        sb6.append(str4);
        return str4;
    }

    /* renamed from: b */
    private String m18293b(boolean z) {
        String str;
        String month;
        String day;
        String valueOf;
        CrontabTime endTime;
        if (z) {
            month = getStartTime().getMonth();
            day = getStartTime().getDay();
            valueOf = String.valueOf(getStartTime().getHour());
            endTime = getStartTime();
        } else if (isTimerEndEnabled()) {
            month = getEndTime().getMonth();
            day = getEndTime().getDay();
            valueOf = String.valueOf(getEndTime().getHour());
            endTime = getEndTime();
        } else {
            str = null;
            StringBuilder sb = new StringBuilder();
            sb.append("init get cloud time : ");
            sb.append(str);
            return str;
        }
        str = m18297l(month, day, valueOf, String.valueOf(endTime.getMinute()));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("init get cloud time : ");
        sb2.append(str);
        return str;
    }

    /* renamed from: f */
    private String m18294f(boolean z) {
        String str;
        String month;
        String day;
        String valueOf;
        CrontabTime crontabTime;
        if (z) {
            month = this.f12706a.getMonth();
            day = this.f12706a.getDay();
            valueOf = String.valueOf(this.f12706a.getHour());
            crontabTime = this.f12706a;
        } else if (isTimerEndEnabled()) {
            month = this.f12707b.getMonth();
            day = this.f12707b.getDay();
            valueOf = String.valueOf(this.f12707b.getHour());
            crontabTime = this.f12707b;
        } else {
            str = null;
            StringBuilder sb = new StringBuilder();
            sb.append("get local time : ");
            sb.append(str);
            return str;
        }
        str = m18297l(month, day, valueOf, String.valueOf(crontabTime.getMinute()));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("get local time : ");
        sb2.append(str);
        return str;
    }

    /* renamed from: i */
    public static RepeatType m18295i(CrontabTime crontabTime) {
        if (!TextUtils.equals(crontabTime.getMonth(), "*") || !TextUtils.equals(crontabTime.getDay(), "*")) {
            return RepeatType.REPEAT_ONCE;
        }
        List<DayOfWeek> dayOfWeeks = crontabTime.getDayOfWeeks();
        return dayOfWeeks.size() == 7 ? RepeatType.REPEAT_EVERYDAY : (dayOfWeeks.size() != 5 || dayOfWeeks.contains(DayOfWeek.SATURDAY) || dayOfWeeks.contains(DayOfWeek.SUNDAY)) ? RepeatType.REPEAT_CUSTOM : RepeatType.REPEAT_WORKDAY;
    }

    /* renamed from: k */
    private Date m18296k(String str, TimeZone timeZone) {
        if (str == null) {
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        simpleDateFormat.setTimeZone(timeZone);
        StringBuilder sb = new StringBuilder();
        sb.append("getTimeData : ");
        sb.append(str);
        try {
            return simpleDateFormat.parse(str);
        } catch (ParseException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getTimeDate parse error, inputdate : ");
            sb2.append(str);
            sb2.append(", error info : ");
            sb2.append(e);
            return null;
        }
    }

    /* renamed from: l */
    private String m18297l(String str, String str2, String str3, String str4) {
        return Calendar.getInstance().get(1) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + str2 + " " + str3 + Constants.COLON_SEPARATOR + str4 + ":00";
    }

    /* renamed from: m */
    private void m18298m() {
        String str;
        List arrayList;
        CrontabTime crontabTime;
        DayOfWeek dayOfWeek;
        List arrayList2;
        CrontabTime crontabTime2;
        int i = 1;
        String b = m18293b(true);
        String b2 = m18293b(false);
        String a = m18292a(b, TimeZone.getTimeZone("Asia/Shanghai"), TimeZone.getDefault());
        String a2 = m18292a(b2, TimeZone.getTimeZone("Asia/Shanghai"), TimeZone.getDefault());
        StringBuilder sb = new StringBuilder();
        sb.append("init local start time : ");
        sb.append(a);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("init local end time : ");
        sb2.append(a2);
        m18300q(a, true);
        m18300q(a2, false);
        String str2 = "";
        if (m18295i(getStartTime()) == RepeatType.REPEAT_ONCE) {
            crontabTime = this.f12706a;
            arrayList = getStartTime().getDayOfWeeks();
        } else {
            Calendar instance = Calendar.getInstance();
            String str3 = String.valueOf(instance.get(1)) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + String.valueOf(instance.get(2) + 1) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + String.valueOf(instance.get(5)) + " " + b.split(" |-")[3];
            Date k = m18296k(str3, TimeZone.getTimeZone("Asia/Shanghai"));
            if (k != null) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                simpleDateFormat.setTimeZone(TimeZone.getDefault());
                str = simpleDateFormat.format(k);
            } else {
                str = str2;
            }
            int intValue = Integer.valueOf(str3.split(" |-")[2]).intValue();
            int intValue2 = Integer.valueOf(str.split(" |-")[2]).intValue();
            int i2 = intValue != intValue2 ? (intValue2 <= intValue ? intValue - intValue2 != 1 : intValue2 - intValue == 1) ? 1 : -1 : 0;
            arrayList = new ArrayList();
            if (i2 != 0) {
                for (DayOfWeek value : getStartTime().getDayOfWeeks()) {
                    int value2 = value.value() + i2;
                    if (value2 == -1) {
                        dayOfWeek = DayOfWeek.SATURDAY;
                    } else if (value2 == 7) {
                        dayOfWeek = DayOfWeek.SUNDAY;
                    } else {
                        arrayList.add(DayOfWeek.valueOf(value2));
                    }
                    value2 = dayOfWeek.value();
                    arrayList.add(DayOfWeek.valueOf(value2));
                }
            } else {
                arrayList.addAll(getStartTime().getDayOfWeeks());
            }
            crontabTime = this.f12706a;
        }
        crontabTime.setDayOfWeeks(arrayList);
        if (isTimerEndEnabled()) {
            if (m18295i(getEndTime()) == RepeatType.REPEAT_ONCE) {
                crontabTime2 = this.f12707b;
                arrayList2 = getEndTime().getDayOfWeeks();
            } else {
                Calendar instance2 = Calendar.getInstance();
                String str4 = String.valueOf(instance2.get(1)) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + String.valueOf(instance2.get(2) + 1) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + String.valueOf(instance2.get(5)) + " " + b2.split(" |-")[3];
                Date k2 = m18296k(str4, TimeZone.getTimeZone("Asia/Shanghai"));
                if (k2 != null) {
                    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    simpleDateFormat2.setTimeZone(TimeZone.getDefault());
                    str2 = simpleDateFormat2.format(k2);
                }
                int intValue3 = Integer.valueOf(str4.split(" |-")[2]).intValue();
                int intValue4 = Integer.valueOf(str2.split(" |-")[2]).intValue();
                if (intValue3 == intValue4) {
                    i = 0;
                } else if (intValue4 <= intValue3 ? intValue3 - intValue4 == 1 : intValue4 - intValue3 != 1) {
                    i = -1;
                }
                arrayList2 = new ArrayList();
                if (i != 0) {
                    for (DayOfWeek value3 : getEndTime().getDayOfWeeks()) {
                        int value4 = value3.value() + i;
                        if (value4 == -1) {
                            value4 = DayOfWeek.SATURDAY.value();
                        } else if (value4 == 7) {
                            value4 = DayOfWeek.SUNDAY.value();
                        }
                        arrayList2.add(DayOfWeek.valueOf(value4));
                    }
                } else {
                    arrayList2.addAll(getEndTime().getDayOfWeeks());
                }
                crontabTime2 = this.f12707b;
            }
            crontabTime2.setDayOfWeeks(arrayList2);
        }
    }

    /* renamed from: p */
    private void m18299p(String str, boolean z) {
        CrontabTime crontabTime;
        String str2;
        if (str != null && !str.equals("")) {
            String[] split = str.split(" |-|:");
            try {
                split[1] = String.valueOf(Integer.parseInt(split[1]));
            } catch (Exception unused) {
            }
            try {
                split[2] = String.valueOf(Integer.parseInt(split[2]));
            } catch (Exception unused2) {
            }
            if (z) {
                getStartTime().setMonth(split[1]);
                getStartTime().setDay(split[2]);
                getStartTime().setHour(Integer.valueOf(split[3]).intValue());
                crontabTime = getStartTime();
                str2 = split[4];
            } else {
                getEndTime().setMonth(split[1]);
                getEndTime().setDay(split[2]);
                getEndTime().setHour(Integer.valueOf(split[3]).intValue());
                crontabTime = getEndTime();
                str2 = split[4];
            }
            crontabTime.setMinute(Integer.valueOf(str2).intValue());
        }
    }

    /* renamed from: q */
    private void m18300q(String str, boolean z) {
        CrontabTime crontabTime;
        String str2;
        if (str != null && !str.equals("")) {
            String[] split = str.split(" |-|:");
            if (z) {
                this.f12706a.setMonth(split[1]);
                this.f12706a.setDay(split[2]);
                this.f12706a.setHour(Integer.valueOf(split[3]).intValue());
                crontabTime = this.f12706a;
                str2 = split[4];
            } else {
                this.f12707b.setMonth(split[1]);
                this.f12707b.setDay(split[2]);
                this.f12707b.setHour(Integer.valueOf(split[3]).intValue());
                crontabTime = this.f12707b;
                str2 = split[4];
            }
            crontabTime.setMinute(Integer.valueOf(str2).intValue());
        }
    }

    /* renamed from: c */
    public C11980p[] mo31884c() {
        try {
            JSONArray specEndTask = getSpecEndTask();
            if (specEndTask != null) {
                if (specEndTask.length() >= 1) {
                    C11980p[] pVarArr = new C11980p[specEndTask.length()];
                    for (int i = 0; i < specEndTask.length(); i++) {
                        pVarArr[i] = new C11980p(specEndTask.getJSONObject(i));
                    }
                    return pVarArr;
                }
            }
            return null;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: d */
    public CrontabTime mo31885d() {
        return this.f12707b;
    }

    /* renamed from: e */
    public CrontabTime mo31886e() {
        return this.f12706a;
    }

    /* renamed from: g */
    public long mo31887g() {
        if (!isTimerEnabled() || !isTimerEndEnabled()) {
            return -1;
        }
        long currentTimeMillis = System.currentTimeMillis();
        int i = Calendar.getInstance().get(11);
        int i2 = Calendar.getInstance().get(12);
        RepeatType i3 = m18295i(getStartTime());
        int i4 = C6171a.f12709a[i3.ordinal()];
        if (i4 == 1) {
            try {
                String l = m18297l(String.valueOf(Integer.valueOf(this.f12707b.getMonth()).intValue()), String.valueOf(Integer.valueOf(this.f12707b.getDay()).intValue()), String.valueOf(this.f12707b.getHour()), String.valueOf(this.f12707b.getMinute()));
                StringBuilder sb = new StringBuilder();
                sb.append("target off time string: ");
                sb.append(l);
                long time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(l).getTime();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("target off time stamp: ");
                sb2.append(time);
                if (currentTimeMillis >= time || time - currentTimeMillis > 43200000) {
                    return -1;
                }
                return time;
            } catch (Exception e) {
                e.printStackTrace();
                return -1;
            }
        } else if (i4 != 2 && i4 != 3 && i4 != 4) {
            return -1;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Repeat type: ");
            sb3.append(i3.name());
            int i5 = Calendar.getInstance().get(5);
            int hour = this.f12707b.getHour();
            int minute = this.f12707b.getMinute();
            String l2 = m18297l(String.valueOf(Calendar.getInstance().get(2) + 1), String.valueOf(i5), String.valueOf(hour), String.valueOf(minute));
            StringBuilder sb4 = new StringBuilder();
            sb4.append("target off time string: ");
            sb4.append(l2);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            try {
                Date parse = simpleDateFormat.parse(l2);
                int i6 = ((hour * 60) + minute) - ((i * 60) + i2);
                GregorianCalendar gregorianCalendar = new GregorianCalendar();
                gregorianCalendar.setTime(parse);
                if (i6 < 0) {
                    gregorianCalendar.add(5, 1);
                }
                StringBuilder sb5 = new StringBuilder();
                sb5.append("target off time string converted: ");
                sb5.append(simpleDateFormat.format(gregorianCalendar.getTime()));
                long time2 = mo31885d().getDayOfWeeks().contains(DayOfWeek.valueOf(gregorianCalendar.get(7) - 1)) ? gregorianCalendar.getTime().getTime() : -1;
                StringBuilder sb6 = new StringBuilder();
                sb6.append("target off time stamp: ");
                sb6.append(time2);
                if (currentTimeMillis >= time2 || time2 - currentTimeMillis > 43200000) {
                    return -1;
                }
                return time2;
            } catch (ParseException e2) {
                e2.printStackTrace();
                return -1;
            }
        }
    }

    /* renamed from: h */
    public long mo31888h() {
        if (!isTimerEnabled() || !isTimerStartEnabled()) {
            return -1;
        }
        long currentTimeMillis = System.currentTimeMillis();
        int i = Calendar.getInstance().get(11);
        int i2 = Calendar.getInstance().get(12);
        RepeatType i3 = m18295i(getStartTime());
        int i4 = C6171a.f12709a[i3.ordinal()];
        if (i4 == 1) {
            String l = m18297l(String.valueOf(Integer.valueOf(this.f12706a.getMonth()).intValue()), String.valueOf(Integer.valueOf(this.f12706a.getDay()).intValue()), String.valueOf(this.f12706a.getHour()), String.valueOf(this.f12706a.getMinute()));
            StringBuilder sb = new StringBuilder();
            sb.append("target on time string: ");
            sb.append(l);
            long time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(l).getTime();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("target on time stamp: ");
            sb2.append(time);
            if (currentTimeMillis >= time || time - currentTimeMillis > 43200000) {
                return -1;
            }
            return time;
        } else if (i4 != 2 && i4 != 3 && i4 != 4) {
            return -1;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Repeat type: ");
            sb3.append(i3.name());
            int i5 = Calendar.getInstance().get(5);
            int hour = this.f12706a.getHour();
            int minute = this.f12706a.getMinute();
            String l2 = m18297l(String.valueOf(Calendar.getInstance().get(2) + 1), String.valueOf(i5), String.valueOf(hour), String.valueOf(minute));
            StringBuilder sb4 = new StringBuilder();
            sb4.append("target on time string: ");
            sb4.append(l2);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            try {
                Date parse = simpleDateFormat.parse(l2);
                int i6 = ((hour * 60) + minute) - ((i * 60) + i2);
                GregorianCalendar gregorianCalendar = new GregorianCalendar();
                gregorianCalendar.setTime(parse);
                if (i6 < 0) {
                    gregorianCalendar.add(5, 1);
                }
                StringBuilder sb5 = new StringBuilder();
                sb5.append("target on time string converted: ");
                sb5.append(simpleDateFormat.format(gregorianCalendar.getTime()));
                long time2 = mo31886e().getDayOfWeeks().contains(DayOfWeek.valueOf(gregorianCalendar.get(7) - 1)) ? gregorianCalendar.getTime().getTime() : -1;
                StringBuilder sb6 = new StringBuilder();
                sb6.append("target on time stamp: ");
                sb6.append(time2);
                if (currentTimeMillis >= time2 || time2 - currentTimeMillis > 43200000) {
                    return -1;
                }
                return time2;
            } catch (ParseException e) {
                e.printStackTrace();
                return -1;
            }
        }
    }

    /* renamed from: j */
    public C11980p[] mo31889j() {
        try {
            JSONArray specStartTask = getSpecStartTask();
            if (specStartTask != null) {
                if (specStartTask.length() >= 1) {
                    C11980p[] pVarArr = new C11980p[specStartTask.length()];
                    for (int i = 0; i < specStartTask.length(); i++) {
                        pVarArr[i] = new C11980p(specStartTask.getJSONObject(i));
                    }
                    return pVarArr;
                }
            }
            return null;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: n */
    public boolean mo31890n() {
        return this.f12708c;
    }

    /* renamed from: o */
    public void mo31891o() {
        String str;
        List arrayList;
        CrontabTime startTime;
        DayOfWeek dayOfWeek;
        List arrayList2;
        CrontabTime endTime;
        int i = 1;
        String f = m18294f(true);
        String f2 = m18294f(false);
        String a = m18292a(f, TimeZone.getDefault(), TimeZone.getTimeZone("Asia/Shanghai"));
        String a2 = m18292a(f2, TimeZone.getDefault(), TimeZone.getTimeZone("Asia/Shanghai"));
        StringBuilder sb = new StringBuilder();
        sb.append("set cloud start time : ");
        sb.append(a);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("set cloud end time : ");
        sb2.append(a2);
        m18299p(a, true);
        m18299p(a2, false);
        String str2 = "";
        if (m18295i(this.f12706a) == RepeatType.REPEAT_ONCE) {
            startTime = getStartTime();
            arrayList = this.f12706a.getDayOfWeeks();
        } else {
            Calendar instance = Calendar.getInstance();
            String str3 = String.valueOf(instance.get(1)) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + String.valueOf(instance.get(2) + 1) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + String.valueOf(instance.get(5)) + " " + f.split(" |-")[3];
            Date k = m18296k(str3, TimeZone.getDefault());
            if (k != null) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
                str = simpleDateFormat.format(k);
            } else {
                str = str2;
            }
            int intValue = Integer.valueOf(str3.split(" |-")[2]).intValue();
            int intValue2 = Integer.valueOf(str.split(" |-")[2]).intValue();
            int i2 = intValue2 != intValue ? (intValue2 <= intValue ? intValue - intValue2 != 1 : intValue2 - intValue == 1) ? 1 : -1 : 0;
            arrayList = new ArrayList();
            if (i2 != 0) {
                for (DayOfWeek value : this.f12706a.getDayOfWeeks()) {
                    int value2 = value.value() + i2;
                    if (value2 == -1) {
                        dayOfWeek = DayOfWeek.SATURDAY;
                    } else if (value2 == 7) {
                        dayOfWeek = DayOfWeek.SUNDAY;
                    } else {
                        arrayList.add(DayOfWeek.valueOf(value2));
                    }
                    value2 = dayOfWeek.value();
                    arrayList.add(DayOfWeek.valueOf(value2));
                }
            } else {
                arrayList.addAll(this.f12706a.getDayOfWeeks());
            }
            startTime = getStartTime();
        }
        startTime.setDayOfWeeks(arrayList);
        if (isTimerEndEnabled()) {
            if (m18295i(this.f12707b) == RepeatType.REPEAT_ONCE) {
                endTime = getEndTime();
                arrayList2 = this.f12707b.getDayOfWeeks();
            } else {
                Calendar instance2 = Calendar.getInstance();
                String str4 = String.valueOf(instance2.get(1)) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + String.valueOf(instance2.get(2) + 1) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + String.valueOf(instance2.get(5)) + " " + f2.split(" |-")[3];
                Date k2 = m18296k(str4, TimeZone.getDefault());
                if (k2 != null) {
                    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
                    str2 = simpleDateFormat2.format(k2);
                }
                int intValue3 = Integer.valueOf(str4.split(" |-")[2]).intValue();
                int intValue4 = Integer.valueOf(str2.split(" |-")[2]).intValue();
                if (intValue4 == intValue3) {
                    i = 0;
                } else if (intValue4 <= intValue3 ? intValue3 - intValue4 == 1 : intValue4 - intValue3 != 1) {
                    i = -1;
                }
                arrayList2 = new ArrayList();
                if (i != 0) {
                    for (DayOfWeek value3 : this.f12707b.getDayOfWeeks()) {
                        int value4 = value3.value() + i;
                        if (value4 == -1) {
                            value4 = DayOfWeek.SATURDAY.value();
                        } else if (value4 == 7) {
                            value4 = DayOfWeek.SUNDAY.value();
                        }
                        arrayList2.add(DayOfWeek.valueOf(value4));
                    }
                } else {
                    arrayList2.addAll(this.f12707b.getDayOfWeeks());
                }
                endTime = getEndTime();
            }
            endTime.setDayOfWeeks(arrayList2);
        }
    }

    /* renamed from: r */
    public void mo31892r(boolean z) {
        this.f12708c = z;
    }
}
