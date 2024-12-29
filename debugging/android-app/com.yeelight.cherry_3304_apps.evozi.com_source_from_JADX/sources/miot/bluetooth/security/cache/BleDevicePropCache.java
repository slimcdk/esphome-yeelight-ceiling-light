package miot.bluetooth.security.cache;

import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.inuker.bluetooth.library.BluetoothContext;
import com.inuker.bluetooth.library.model.BleGattProfile;
import com.inuker.bluetooth.library.utils.BluetoothLog;
import com.inuker.bluetooth.library.utils.ByteUtils;
import com.miot.service.qrcode.ScanBarcodeActivity;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

public class BleDevicePropCache implements IBlePropCacher {
    private static final String PREFS_TAG = "ble_device_prop_cache";
    /* access modifiers changed from: private */
    public static final Executor SERIAL_EXECUTOR = new SerialExecutor();
    private static BleDevicePropCache sInstance;
    private String mCurrentTag;
    private HashMap<String, BleDeviceProp> mPropCache = new HashMap<>();
    private SharedPreferences mSharedPreferences;

    private abstract class BleCacheTask extends AsyncTask<Void, Void, Void> {
        private BleCacheTask() {
        }

        /* access modifiers changed from: protected */
        public Void doInBackground(Void... voidArr) {
            doInBackground();
            return null;
        }

        /* access modifiers changed from: package-private */
        public abstract void doInBackground();
    }

    private interface IPropGetter<T> {
        T getProp(BleDeviceProp bleDeviceProp);
    }

    private interface IPropSetter {
        boolean setProp(BleDeviceProp bleDeviceProp);
    }

    public interface IPropTraverse {
        boolean onTraverse(String str, BleDeviceProp bleDeviceProp);
    }

    private abstract class PropSetter implements IPropSetter {
        private String name;

        PropSetter(String str) {
            this.name = str;
        }

        public String toString() {
            return "PropSetter{name='" + this.name + '\'' + '}';
        }
    }

    private static class SerialExecutor implements Executor {
        Runnable mActive;
        final ArrayDeque<Runnable> mTasks;

        private SerialExecutor() {
            this.mTasks = new ArrayDeque<>();
        }

        public synchronized void execute(final Runnable runnable) {
            this.mTasks.offer(new Runnable() {
                public void run() {
                    try {
                        runnable.run();
                    } finally {
                        SerialExecutor.this.scheduleNext();
                    }
                }
            });
            if (this.mActive == null) {
                scheduleNext();
            }
        }

        /* access modifiers changed from: protected */
        public synchronized void scheduleNext() {
            Runnable poll = this.mTasks.poll();
            this.mActive = poll;
            if (poll != null) {
                AsyncTask.THREAD_POOL_EXECUTOR.execute(poll);
            }
        }
    }

    private BleDevicePropCache() {
    }

    private void executeCacheTask(final BleCacheTask bleCacheTask) {
        BluetoothContext.post(new Runnable() {
            public void run() {
                bleCacheTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            }
        });
    }

    private void executeSerialCacheTask(final BleCacheTask bleCacheTask) {
        BluetoothContext.post(new Runnable() {
            public void run() {
                bleCacheTask.executeOnExecutor(BleDevicePropCache.SERIAL_EXECUTOR, new Void[0]);
            }
        });
    }

    public static BleDevicePropCache getInstance() {
        if (sInstance == null) {
            synchronized (BleDevicePropCache.class) {
                if (sInstance == null) {
                    sInstance = new BleDevicePropCache();
                }
            }
        }
        return sInstance;
    }

    private static String getPrefsTag() {
        return "prefs_tag_device_cache";
    }

    private <T> T getProp(String str, IPropGetter<T> iPropGetter, T t) {
        if (TextUtils.isEmpty(str)) {
            return t;
        }
        synchronized (this.mPropCache) {
            BleDeviceProp bleDeviceProp = this.mPropCache.get(str);
            if (bleDeviceProp == null) {
                return t;
            }
            T prop = iPropGetter.getProp(bleDeviceProp);
            return prop;
        }
    }

    /* access modifiers changed from: private */
    public void reloadPropCache() {
        String prefsTag = getPrefsTag();
        BluetoothLog.m10338v(String.format("BleDevicePropCache.reloadPropCache, tag = %s", new Object[]{prefsTag}));
        if (TextUtils.isEmpty(prefsTag)) {
            this.mPropCache.clear();
            this.mSharedPreferences = null;
        } else if (!prefsTag.equalsIgnoreCase(this.mCurrentTag)) {
            this.mCurrentTag = prefsTag;
            long currentTimeMillis = System.currentTimeMillis();
            SharedPreferences sharedPreferences = BluetoothContext.get().getSharedPreferences(this.mCurrentTag, 0);
            this.mSharedPreferences = sharedPreferences;
            Map<String, ?> all = sharedPreferences.getAll();
            HashMap hashMap = new HashMap();
            for (Map.Entry next : all.entrySet()) {
                BleDeviceProp fromJson = BleDeviceProp.fromJson((String) next.getValue());
                if (fromJson != null) {
                    hashMap.put(next.getKey(), fromJson);
                }
            }
            synchronized (this.mPropCache) {
                this.mPropCache.clear();
                this.mPropCache.putAll(hashMap);
            }
            BluetoothLog.m10339w(String.format("BleDevicePropCache load takes %dms", new Object[]{Long.valueOf(System.currentTimeMillis() - currentTimeMillis)}));
        }
    }

    private void savePropCacheAsync(final SharedPreferences sharedPreferences, final String str, final BleDeviceProp bleDeviceProp) {
        executeSerialCacheTask(new BleCacheTask() {
            /* access modifiers changed from: package-private */
            public void doInBackground() {
                SharedPreferences sharedPreferences = sharedPreferences;
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putString(str, bleDeviceProp.toJson()).apply();
                }
            }
        });
    }

    private void setProp(String str, PropSetter propSetter) {
        setProp(str, propSetter, true);
    }

    private void setProp(String str, PropSetter propSetter, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.mPropCache) {
                BleDeviceProp bleDeviceProp = this.mPropCache.get(str);
                if (bleDeviceProp == null) {
                    bleDeviceProp = new BleDeviceProp();
                    this.mPropCache.put(str, bleDeviceProp);
                }
                if (propSetter.setProp(bleDeviceProp) && z) {
                    savePropCacheAsync(this.mSharedPreferences, str, bleDeviceProp);
                }
            }
        }
    }

    public String getEncryptedLtmk(String str) {
        return (String) getProp(str, new IPropGetter<String>() {
            public String getProp(BleDeviceProp bleDeviceProp) {
                return bleDeviceProp.getEncryptedLtmk();
            }
        }, "");
    }

    public String getEncryptedMeshBindInfo(String str) {
        return (String) getProp(str, new IPropGetter<String>() {
            public String getProp(BleDeviceProp bleDeviceProp) {
                return bleDeviceProp.getEncryptedMeshBindInfo();
            }
        }, "");
    }

    public String getEncryptedSessionKey(String str) {
        return (String) getProp(str, new IPropGetter<String>() {
            public String getProp(BleDeviceProp bleDeviceProp) {
                return bleDeviceProp.getEncryptedSession();
            }
        }, "");
    }

    public String getEncryptedToken(String str) {
        return (String) getProp(str, new IPropGetter<String>() {
            public String getProp(BleDeviceProp bleDeviceProp) {
                return bleDeviceProp.getEncryptedToken();
            }
        }, "");
    }

    public String getPropBeaconKey(String str) {
        return (String) getProp(str, new IPropGetter<String>() {
            public String getProp(BleDeviceProp bleDeviceProp) {
                return bleDeviceProp.getBeaconKey();
            }
        }, (Object) null);
    }

    public int getPropBoundStatus(String str) {
        return ((Integer) getProp(str, new IPropGetter<Integer>() {
            public Integer getProp(BleDeviceProp bleDeviceProp) {
                return Integer.valueOf(bleDeviceProp.getBoundStatus());
            }
        }, 0)).intValue();
    }

    public String getPropDesc(String str) {
        return (String) getProp(str, new IPropGetter<String>() {
            public String getProp(BleDeviceProp bleDeviceProp) {
                return bleDeviceProp.getDesc();
            }
        }, "");
    }

    public String getPropDid(String str) {
        return (String) getProp(str, new IPropGetter<String>() {
            public String getProp(BleDeviceProp bleDeviceProp) {
                return bleDeviceProp.getDid();
            }
        }, "");
    }

    public int getPropExtra(String str, final String str2, final int i) {
        return ((Integer) getProp(str, new IPropGetter<Integer>() {
            public Integer getProp(BleDeviceProp bleDeviceProp) {
                return Integer.valueOf(bleDeviceProp.getExtra(str2, i));
            }
        }, Integer.valueOf(i))).intValue();
    }

    public String getPropExtra(String str, final String str2) {
        return (String) getProp(str, new IPropGetter<String>() {
            public String getProp(BleDeviceProp bleDeviceProp) {
                return bleDeviceProp.getExtra(str2, "");
            }
        }, "");
    }

    public boolean getPropExtra(String str, final String str2, final boolean z) {
        return ((Boolean) getProp(str, new IPropGetter<Boolean>() {
            public Boolean getProp(BleDeviceProp bleDeviceProp) {
                return Boolean.valueOf(bleDeviceProp.getExtra(str2, z));
            }
        }, Boolean.valueOf(z))).booleanValue();
    }

    public BleGattProfile getPropGattProfile(String str) {
        return (BleGattProfile) getProp(str, new IPropGetter<BleGattProfile>() {
            public BleGattProfile getProp(BleDeviceProp bleDeviceProp) {
                return bleDeviceProp.getProfile();
            }
        }, (Object) null);
    }

    public String getPropModel(String str) {
        return (String) getProp(str, new IPropGetter<String>() {
            public String getProp(BleDeviceProp bleDeviceProp) {
                return bleDeviceProp.getModel();
            }
        }, "");
    }

    public String getPropName(String str) {
        return (String) getProp(str, new IPropGetter<String>() {
            public String getProp(BleDeviceProp bleDeviceProp) {
                return bleDeviceProp.getName();
            }
        }, "");
    }

    public String getPropOwnerId(String str) {
        return (String) getProp(str, new IPropGetter<String>() {
            public String getProp(BleDeviceProp bleDeviceProp) {
                return bleDeviceProp.getOwnerId();
            }
        }, "");
    }

    public int getPropProductId(String str) {
        return ((Integer) getProp(str, new IPropGetter<Integer>() {
            public Integer getProp(BleDeviceProp bleDeviceProp) {
                return Integer.valueOf(bleDeviceProp.getProductId());
            }
        }, 0)).intValue();
    }

    public byte[] getPropScanRecord(String str) {
        return (byte[]) getProp(str, new IPropGetter<byte[]>() {
            public byte[] getProp(BleDeviceProp bleDeviceProp) {
                String scanRecord = bleDeviceProp.getScanRecord();
                return TextUtils.isEmpty(scanRecord) ? ByteUtils.EMPTY_BYTES : ByteUtils.stringToBytes(scanRecord);
            }
        }, ByteUtils.EMPTY_BYTES);
    }

    public void reloadIfNeeded() {
        executeCacheTask(new BleCacheTask() {
            /* access modifiers changed from: package-private */
            public void doInBackground() {
                BleDevicePropCache.this.reloadPropCache();
            }
        });
    }

    public void removePropExtra(String str, final String str2) {
        setProp(str, new PropSetter("remove") {
            public boolean setProp(BleDeviceProp bleDeviceProp) {
                bleDeviceProp.removeExtra(str2);
                return true;
            }
        });
    }

    public void setEncryptedLtmk(String str, final String str2) {
        setProp(str, new PropSetter("encryptedLtmk") {
            public boolean setProp(BleDeviceProp bleDeviceProp) {
                if (str2.equals(bleDeviceProp.getEncryptedLtmk())) {
                    return false;
                }
                bleDeviceProp.setEncryptedLtmk(str2);
                return true;
            }
        });
    }

    public void setEncryptedMeshBindInfo(String str, final String str2) {
        setProp(str, new PropSetter("encryptedMeshBindInfo") {
            public boolean setProp(BleDeviceProp bleDeviceProp) {
                if (str2.equals(bleDeviceProp.getEncryptedMeshBindInfo())) {
                    return false;
                }
                bleDeviceProp.setEncryptedMeshBindInfo(str2);
                return true;
            }
        });
    }

    public void setEncryptedSessionKey(String str, final String str2) {
        setProp(str, new PropSetter("encryptedSession") {
            public boolean setProp(BleDeviceProp bleDeviceProp) {
                if (str2.equals(bleDeviceProp.getEncryptedSession())) {
                    return false;
                }
                bleDeviceProp.setEncryptedSession(str2);
                return true;
            }
        }, false);
    }

    public void setEncryptedToken(String str, final String str2) {
        setProp(str, new PropSetter("encryptedToken") {
            public boolean setProp(BleDeviceProp bleDeviceProp) {
                if (str2.equals(bleDeviceProp.getEncryptedToken())) {
                    return false;
                }
                bleDeviceProp.setEncryptedToken(str2);
                return true;
            }
        });
    }

    public void setPropBeaconKey(String str, final String str2) {
        setProp(str, new PropSetter("beaconKey") {
            public boolean setProp(BleDeviceProp bleDeviceProp) {
                if (str2.equalsIgnoreCase(bleDeviceProp.getBeaconKey())) {
                    return false;
                }
                bleDeviceProp.setBeaconKey(str2);
                return true;
            }
        }, false);
    }

    public void setPropBoundStatus(String str, final int i) {
        setProp(str, new PropSetter("boundStatus") {
            public boolean setProp(BleDeviceProp bleDeviceProp) {
                if (i == bleDeviceProp.getBoundStatus()) {
                    return false;
                }
                bleDeviceProp.setBoundStatus(i);
                return true;
            }
        });
    }

    public void setPropDesc(String str, final String str2) {
        setProp(str, new PropSetter("desc") {
            public boolean setProp(BleDeviceProp bleDeviceProp) {
                if (str2.equals(bleDeviceProp.getDesc())) {
                    return false;
                }
                bleDeviceProp.setDesc(str2);
                return true;
            }
        });
    }

    public void setPropDid(String str, final String str2) {
        setProp(str, new PropSetter("did") {
            public boolean setProp(BleDeviceProp bleDeviceProp) {
                if (str2.equals(bleDeviceProp.getDid())) {
                    return false;
                }
                bleDeviceProp.setDid(str2);
                return true;
            }
        });
    }

    public void setPropExtra(String str, final String str2, final int i) {
        setProp(str, new PropSetter("int extra") {
            public boolean setProp(BleDeviceProp bleDeviceProp) {
                if (i == bleDeviceProp.getExtra(str2, 0)) {
                    return false;
                }
                bleDeviceProp.setExtra(str2, i);
                return true;
            }
        });
    }

    public void setPropExtra(String str, final String str2, final String str3) {
        setProp(str, new PropSetter("String extra") {
            public boolean setProp(BleDeviceProp bleDeviceProp) {
                if (str3.equals(bleDeviceProp.getExtra(str2, ""))) {
                    return false;
                }
                bleDeviceProp.setExtra(str2, str3);
                return true;
            }
        });
    }

    public void setPropExtra(String str, final String str2, final boolean z) {
        setProp(str, new PropSetter("boolean extra") {
            public boolean setProp(BleDeviceProp bleDeviceProp) {
                if (z == bleDeviceProp.getExtra(str2, false)) {
                    return false;
                }
                bleDeviceProp.setExtra(str2, z);
                return true;
            }
        });
    }

    public void setPropGattProfile(String str, final BleGattProfile bleGattProfile) {
        setProp(str, new PropSetter("GattProfile") {
            public boolean setProp(BleDeviceProp bleDeviceProp) {
                bleDeviceProp.setProfile(bleGattProfile);
                return true;
            }
        }, false);
    }

    public void setPropModel(String str, final String str2) {
        setProp(str, new PropSetter("model") {
            public boolean setProp(BleDeviceProp bleDeviceProp) {
                if (str2.equals(bleDeviceProp.getModel())) {
                    return false;
                }
                bleDeviceProp.setModel(str2);
                return true;
            }
        });
    }

    public void setPropName(String str, final String str2) {
        setProp(str, new PropSetter("name") {
            public boolean setProp(BleDeviceProp bleDeviceProp) {
                if (str2.equals(bleDeviceProp.getName())) {
                    return false;
                }
                bleDeviceProp.setName(str2);
                return true;
            }
        });
    }

    public void setPropOwnerId(String str, final String str2) {
        setProp(str, new PropSetter("ownerId") {
            public boolean setProp(BleDeviceProp bleDeviceProp) {
                if (str2.equals(bleDeviceProp.getOwnerId())) {
                    return false;
                }
                bleDeviceProp.setOwnerId(str2);
                return true;
            }
        });
    }

    public void setPropProductId(String str, final int i) {
        setProp(str, new PropSetter(ScanBarcodeActivity.PID) {
            public boolean setProp(BleDeviceProp bleDeviceProp) {
                if (i == bleDeviceProp.getProductId()) {
                    return false;
                }
                bleDeviceProp.setProductId(i);
                return true;
            }
        });
    }

    public void setPropScanRecord(String str, final byte[] bArr) {
        if (!ByteUtils.isEmpty(bArr)) {
            setProp(str, new PropSetter("scanRecord") {
                public boolean setProp(BleDeviceProp bleDeviceProp) {
                    String byteToString = ByteUtils.byteToString(bArr);
                    if (byteToString.equalsIgnoreCase(bleDeviceProp.getScanRecord())) {
                        return false;
                    }
                    bleDeviceProp.setScanRecord(byteToString);
                    return true;
                }
            }, false);
        }
    }

    public void traverse(IPropTraverse iPropTraverse) {
        synchronized (this.mPropCache) {
            for (Map.Entry next : this.mPropCache.entrySet()) {
                if (iPropTraverse.onTraverse((String) next.getKey(), (BleDeviceProp) next.getValue())) {
                    break;
                }
            }
        }
    }
}
