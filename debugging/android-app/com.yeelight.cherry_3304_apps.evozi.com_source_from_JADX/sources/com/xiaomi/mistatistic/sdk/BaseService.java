package com.xiaomi.mistatistic.sdk;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.xiaomi.mistatistic.sdk.C4091a;
import com.xiaomi.mistatistic.sdk.controller.C4122f;
import com.xiaomi.mistatistic.sdk.data.StatEventPojo;
import java.util.List;

public class BaseService extends Service {
    public static final String CATEGORY = "category";
    public static final int DELETE_BY_START_END_TIME = 5;
    public static final int DELETE_BY_TS = 4;
    public static final int DELETE_OLD = 3;
    public static final String END_TIME = "endTime";
    public static final int INSERT = 1;
    public static final String KEY = "key";
    public static final String NEW_VALUE = "newValue";
    public static final String START_TIME = "startTime";
    public static final String STAT_EVENT_POJO = "StatEventPojo";
    public static final String TIME_STAMP = "timeStamp";
    public static final String TYPE = "type";
    public static final int UPDATE = 2;
    /* access modifiers changed from: private */
    public C4122f eventDAO;

    public IBinder onBind(Intent intent) {
        return new C4091a.C4092a() {
            /* renamed from: a */
            public int mo22983a() {
                return BaseService.this.eventDAO.mo23058e();
            }

            /* renamed from: a */
            public StatEventPojo mo22984a(String str, String str2) {
                return BaseService.this.eventDAO.mo23048b(str, str2);
            }

            /* renamed from: a */
            public List<StatEventPojo> mo22985a(long j) {
                return BaseService.this.eventDAO.mo23049b(j);
            }
        };
    }

    public void onCreate() {
        super.onCreate();
        C4122f.m11132a();
        this.eventDAO = new C4122f();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (!(intent == null || intent.getExtras() == null)) {
            Bundle extras = intent.getExtras();
            if (extras.containsKey("type")) {
                int i3 = extras.getInt("type");
                if (i3 == 1) {
                    this.eventDAO.mo23052b((StatEventPojo) extras.getParcelable(STAT_EVENT_POJO));
                } else if (i3 == 2) {
                    this.eventDAO.mo23053b(extras.getString(KEY), extras.getString(CATEGORY), extras.getString(NEW_VALUE));
                } else if (i3 == 3) {
                    this.eventDAO.mo23054c();
                } else if (i3 == 4) {
                    this.eventDAO.mo23057d(extras.getLong(TIME_STAMP));
                } else if (i3 == 5) {
                    this.eventDAO.mo23051b(extras.getLong(START_TIME), extras.getLong(END_TIME));
                }
            }
        }
        return 1;
    }
}
