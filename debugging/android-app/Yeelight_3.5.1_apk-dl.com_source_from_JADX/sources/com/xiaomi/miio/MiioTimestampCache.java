package com.xiaomi.miio;

import java.util.HashMap;

public class MiioTimestampCache {
    private static int MAX_EXPIRE = 6;
    private static HashMap<Long, Record> records = new HashMap<>();

    static class Record {
        public long did;
        public long timemillis;

        /* renamed from: ts */
        public int f7392ts;

        Record() {
        }
    }

    public static int getTs(long j) {
        if (records.get(Long.valueOf(j)) == null) {
            return -1;
        }
        Record record = records.get(Long.valueOf(j));
        int currentTimeMillis = (int) ((System.currentTimeMillis() - record.timemillis) / 1000);
        if (currentTimeMillis > MAX_EXPIRE) {
            return -1;
        }
        return record.f7392ts + currentTimeMillis;
    }

    public static void updateTs(long j, int i) {
        Record record = records.get(Long.valueOf(j)) != null ? records.get(Long.valueOf(j)) : new Record();
        record.did = j;
        record.f7392ts = i;
        record.timemillis = System.currentTimeMillis();
        records.put(Long.valueOf(j), record);
    }
}
