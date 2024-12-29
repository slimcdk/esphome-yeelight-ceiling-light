package com.miot.service.common.manager;

import android.content.Context;
import android.os.RemoteException;
import com.miot.common.config.AppConfiguration;
import com.miot.common.device.Device;
import com.miot.common.people.People;
import com.miot.service.common.manager.store.MiotStore;
import com.miot.service.connection.wifi.WifiAccount;
import com.miot.service.manager.discovery.impl.DeviceFactory;
import com.miot.service.manager.discovery.impl.MiotWanDevice;
import com.p022mi.iot.service.manager.ControllerManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;

public class ServiceManager {
    private static volatile ServiceManager sInstance;
    private AccountManager mAccountManager;
    private AppConfiguration mAppConfig;
    /* access modifiers changed from: private */
    public Context mContext;
    /* access modifiers changed from: private */
    public ControllerManager mControllerManager;
    private DeviceManager mDeviceManager;
    private DeviceManipulator mDeviceManipulator;
    /* access modifiers changed from: private */
    public ThreadPoolExecutor mExecutor;
    private MiPushManager mPushManager;
    /* access modifiers changed from: private */
    public MiotStore mStore;

    public class AccountManager {
        /* access modifiers changed from: private */
        public Map<String, Device> mDevices = new HashMap();
        private Runnable mLoadTask = new Runnable() {
            public void run() {
                if (AccountManager.this.mPeople != null && AccountManager.this.mDevices.size() == 0) {
                    for (MiotWanDevice createFrom : ServiceManager.this.mStore.loadDeviceList()) {
                        Device createFrom2 = DeviceFactory.createFrom(ServiceManager.this.mContext, createFrom);
                        if (createFrom2 != null) {
                            AccountManager.this.mDevices.put(createFrom2.getDeviceId(), createFrom2);
                        }
                    }
                }
            }
        };
        /* access modifiers changed from: private */
        public People mPeople;
        private WifiAccount mWifiAccount;

        public AccountManager() {
            this.mWifiAccount = new WifiAccount(ServiceManager.this.mContext);
            this.mPeople = ServiceManager.this.mStore.loadPeople();
            ServiceManager.this.mExecutor.execute(this.mLoadTask);
        }

        public synchronized void clearDeviceList() {
            this.mDevices.clear();
        }

        public void deletePeople() {
            this.mPeople = null;
            this.mDevices.clear();
            ServiceManager.this.mExecutor.execute(new Runnable() {
                public void run() {
                    ServiceManager.this.mStore.deletePeople();
                }
            });
        }

        public synchronized Device getDevice(String str) {
            return this.mDevices.get(str);
        }

        public People getPeople() {
            return this.mPeople;
        }

        public WifiAccount getWifiAccount() {
            return this.mWifiAccount;
        }

        public void savePeople(People people) {
            this.mPeople = people;
            try {
                ServiceManager.this.mControllerManager.stop();
                ServiceManager.this.mControllerManager.start(ServiceManager.this.getAppConfig());
            } catch (RemoteException e) {
                e.printStackTrace();
            }
            ServiceManager.this.mExecutor.execute(new Runnable() {
                public void run() {
                    ServiceManager.this.mStore.savePeople(AccountManager.this.mPeople);
                }
            });
        }

        public synchronized void updateDeviceList(List<Device> list) {
            this.mDevices.clear();
            for (Device next : list) {
                this.mDevices.put(next.getDeviceId(), next);
            }
        }
    }

    private ServiceManager() {
    }

    public static ServiceManager getInstance() {
        if (sInstance == null) {
            synchronized (ServiceManager.class) {
                if (sInstance == null) {
                    sInstance = new ServiceManager();
                }
            }
        }
        return sInstance;
    }

    public void deletePeople() {
        this.mPushManager.stop(this.mContext);
        this.mAccountManager.deletePeople();
    }

    public AppConfiguration getAppConfig() {
        return this.mAppConfig;
    }

    public Context getContext() {
        return this.mContext;
    }

    public ControllerManager getControllerManager() {
        return this.mControllerManager;
    }

    public Device getDevice(String str) {
        return this.mAccountManager.getDevice(str);
    }

    public DeviceManager getDeviceManager() {
        return this.mDeviceManager;
    }

    public DeviceManipulator getDeviceManipulator() {
        return this.mDeviceManipulator;
    }

    public People getPeople() {
        return this.mAccountManager.getPeople();
    }

    public MiPushManager getPushManager() {
        return this.mPushManager;
    }

    public WifiAccount getWifiAccount() {
        AccountManager accountManager = this.mAccountManager;
        if (accountManager == null) {
            return null;
        }
        return accountManager.getWifiAccount();
    }

    public void init(Context context, ThreadPoolExecutor threadPoolExecutor) {
        Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        this.mExecutor = threadPoolExecutor;
        this.mStore = new MiotStore(applicationContext);
        this.mDeviceManager = new DeviceManager(this.mContext);
        this.mAccountManager = new AccountManager();
        this.mDeviceManipulator = new DeviceManipulator();
        if (this.mPushManager == null) {
            this.mPushManager = new MiPushManager(this.mContext);
        }
        this.mControllerManager = new ControllerManager(this.mContext);
    }

    public boolean isDemoApp() {
        AppConfiguration appConfiguration = this.mAppConfig;
        if (appConfiguration == null) {
            return false;
        }
        Long appId = appConfiguration.getAppId();
        return appId.equals(2882303761517532465L) || appId.equals(2882303761517461087L);
    }

    public void postRunnable(Runnable runnable) {
        this.mExecutor.execute(runnable);
    }

    public void saveDeviceList(List<MiotWanDevice> list) {
        this.mStore.saveDeviceList(list);
    }

    public void savePeople(People people) {
        this.mAccountManager.savePeople(people);
        if (people != null) {
            this.mPushManager.start();
        }
    }

    public void setAppConfig(AppConfiguration appConfiguration) {
        this.mAppConfig = appConfiguration;
        if (getPeople() != null) {
            this.mPushManager.start();
        }
        try {
            this.mControllerManager.stop();
            this.mControllerManager.start(appConfiguration);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void setPushManager(MiPushManager miPushManager) {
        this.mPushManager = miPushManager;
    }

    public boolean subscribeTopic(String str, String str2) {
        return this.mPushManager.subscribe(str, str2);
    }

    public boolean unsubscribeTopic(String str, String str2) {
        return this.mPushManager.unsubscribe(str, str2);
    }

    public void updateDeviceList(List<Device> list) {
        this.mAccountManager.updateDeviceList(list);
    }
}
