package com.miot.service.manager.discovery.impl.bonjour.impl;

import android.content.Context;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import com.miot.service.manager.discovery.impl.bonjour.Bonjour;
import com.miot.service.manager.discovery.impl.bonjour.BonjourListener;
import com.miot.service.manager.discovery.impl.bonjour.impl.getter.ExtraInfoGetterFactory;
import com.miot.service.manager.discovery.impl.bonjour.impl.setter.ExtraInfoSetterFactory;
import com.miot.service.manager.discovery.impl.bonjour.serviceinfo.BonjourServiceInfo;
import com.miot.service.manager.discovery.impl.bonjour.serviceinfo.impl.BonjourServiceInfoImpl;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class AndroidBonjourImpl implements Bonjour {
    private static final String TAG = "AndroidBonjourImpl";
    private static volatile AndroidBonjourImpl instance;
    private Context context;
    /* access modifiers changed from: private */
    public JobHandler jobHandler = new JobHandler();
    /* access modifiers changed from: private */
    public BonjourListener listener = null;
    /* access modifiers changed from: private */
    public NsdManager nsdManager;

    /* renamed from: com.miot.service.manager.discovery.impl.bonjour.impl.AndroidBonjourImpl$1 */
    static /* synthetic */ class C37941 {

        /* renamed from: $SwitchMap$com$miot$service$manager$discovery$impl$bonjour$impl$AndroidBonjourImpl$JobType */
        static final /* synthetic */ int[] f6707xbdd4ad80;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.miot.service.manager.discovery.impl.bonjour.impl.AndroidBonjourImpl$JobType[] r0 = com.miot.service.manager.discovery.impl.bonjour.impl.AndroidBonjourImpl.JobType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6707xbdd4ad80 = r0
                com.miot.service.manager.discovery.impl.bonjour.impl.AndroidBonjourImpl$JobType r1 = com.miot.service.manager.discovery.impl.bonjour.impl.AndroidBonjourImpl.JobType.SERVICE_DISCOVERY_START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6707xbdd4ad80     // Catch:{ NoSuchFieldError -> 0x001d }
                com.miot.service.manager.discovery.impl.bonjour.impl.AndroidBonjourImpl$JobType r1 = com.miot.service.manager.discovery.impl.bonjour.impl.AndroidBonjourImpl.JobType.SERVICE_DISCOVERY_STOP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f6707xbdd4ad80     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.miot.service.manager.discovery.impl.bonjour.impl.AndroidBonjourImpl$JobType r1 = com.miot.service.manager.discovery.impl.bonjour.impl.AndroidBonjourImpl.JobType.SERVICE_FOUND     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f6707xbdd4ad80     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.miot.service.manager.discovery.impl.bonjour.impl.AndroidBonjourImpl$JobType r1 = com.miot.service.manager.discovery.impl.bonjour.impl.AndroidBonjourImpl.JobType.SERVICE_LOST     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f6707xbdd4ad80     // Catch:{ NoSuchFieldError -> 0x003e }
                com.miot.service.manager.discovery.impl.bonjour.impl.AndroidBonjourImpl$JobType r1 = com.miot.service.manager.discovery.impl.bonjour.impl.AndroidBonjourImpl.JobType.SERVICE_REG     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f6707xbdd4ad80     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.miot.service.manager.discovery.impl.bonjour.impl.AndroidBonjourImpl$JobType r1 = com.miot.service.manager.discovery.impl.bonjour.impl.AndroidBonjourImpl.JobType.SERVICE_UNREG     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.miot.service.manager.discovery.impl.bonjour.impl.AndroidBonjourImpl.C37941.<clinit>():void");
        }
    }

    private class DiscoverHandler implements NsdManager.DiscoveryListener {
        private DiscoverHandler() {
        }

        /* synthetic */ DiscoverHandler(AndroidBonjourImpl androidBonjourImpl, C37941 r2) {
            this();
        }

        public void onDiscoveryStarted(String str) {
        }

        public void onDiscoveryStopped(String str) {
        }

        public void onServiceFound(NsdServiceInfo nsdServiceInfo) {
            String.format("onServiceFound: %s", new Object[]{nsdServiceInfo.getServiceName().replace("\\032", " ")});
            Job job = new Job(JobType.SERVICE_FOUND);
            job.setServiceInfo(nsdServiceInfo);
            AndroidBonjourImpl.this.jobHandler.put(job);
        }

        public void onServiceLost(NsdServiceInfo nsdServiceInfo) {
            String.format("onServiceLost: %s", new Object[]{nsdServiceInfo.getServiceName().replace("\\032", " ")});
            Job job = new Job(JobType.SERVICE_LOST);
            job.setServiceInfo(nsdServiceInfo);
            AndroidBonjourImpl.this.jobHandler.put(job);
        }

        public void onStartDiscoveryFailed(String str, int i) {
            String.format("onStartDiscoveryFailed: %s %d", new Object[]{str, Integer.valueOf(i)});
        }

        public void onStopDiscoveryFailed(String str, int i) {
            String.format("onStopDiscoveryFailed: %s %d", new Object[]{str, Integer.valueOf(i)});
        }
    }

    private class Job {
        private NsdServiceInfo serviceInfo;
        private String serviceType;
        private JobType type;

        public Job(JobType jobType) {
            this.type = jobType;
        }

        public NsdServiceInfo getServiceInfo() {
            return this.serviceInfo;
        }

        public String getServiceType() {
            return this.serviceType;
        }

        public JobType getType() {
            return this.type;
        }

        public void setServiceInfo(NsdServiceInfo nsdServiceInfo) {
            this.serviceInfo = nsdServiceInfo;
        }

        public void setServiceType(String str) {
            this.serviceType = str;
        }

        public void setType(JobType jobType) {
            this.type = jobType;
        }
    }

    private class JobHandler implements Runnable {
        private static final int MAX_SERVICE_INFO = 765;
        private static final int RESOLVE_TIMEOUT = 5000;
        private static final int STOP_TIMEOUT = 5000;
        private Map<String, DiscoverHandler> discoveryHandlers;
        /* access modifiers changed from: private */
        public Map<String, BonjourServiceInfo> foundServices;
        private BlockingQueue<Job> jobQueue;
        private Map<String, RegistrationHandler> registrationHandlers;
        private Thread thread;

        public JobHandler() {
            this.thread = null;
            this.jobQueue = null;
            this.discoveryHandlers = new HashMap();
            this.foundServices = new HashMap();
            this.registrationHandlers = new HashMap();
            this.jobQueue = new ArrayBlockingQueue(MAX_SERVICE_INFO);
        }

        private void doServiceFound(final Job job) {
            AndroidBonjourImpl.this.nsdManager.resolveService(job.getServiceInfo(), new NsdManager.ResolveListener() {
                public void onResolveFailed(NsdServiceInfo nsdServiceInfo, int i) {
                    String.format("onResolveFailed: %d", new Object[]{Integer.valueOf(i)});
                }

                public void onServiceResolved(NsdServiceInfo nsdServiceInfo) {
                    "onServiceResolved serviceInfo " + nsdServiceInfo.toString();
                    String replace = nsdServiceInfo.getServiceName().replace("\\032", " ");
                    String serviceType = nsdServiceInfo.getServiceType();
                    String hostAddress = nsdServiceInfo.getHost().getHostAddress();
                    int port = nsdServiceInfo.getPort();
                    String.format("onServiceResolved: %s", new Object[]{replace});
                    BonjourServiceInfoImpl bonjourServiceInfoImpl = new BonjourServiceInfoImpl();
                    bonjourServiceInfoImpl.setName(replace);
                    bonjourServiceInfoImpl.setType(serviceType);
                    bonjourServiceInfoImpl.setIp(hostAddress);
                    bonjourServiceInfoImpl.setPort(port);
                    Map<String, String> map = ExtraInfoGetterFactory.create().get(nsdServiceInfo);
                    if (map != null) {
                        "properties: " + map.toString();
                        bonjourServiceInfoImpl.setProperties(map);
                    }
                    synchronized (JobHandler.this.foundServices) {
                        JobHandler.this.foundServices.put(replace, bonjourServiceInfoImpl);
                        String.format("foundServices is: %d", new Object[]{Integer.valueOf(JobHandler.this.foundServices.size())});
                    }
                    if (AndroidBonjourImpl.this.listener != null) {
                        AndroidBonjourImpl.this.listener.onServiceFound(bonjourServiceInfoImpl);
                    }
                    synchronized (job) {
                        job.notify();
                    }
                }
            });
            synchronized (job) {
                try {
                    job.wait(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        private void doServiceLost(Job job) {
            BonjourServiceInfo bonjourServiceInfo;
            String replace = job.getServiceInfo().getServiceName().replace("\\032", " ");
            synchronized (this.foundServices) {
                bonjourServiceInfo = this.foundServices.get(replace);
                this.foundServices.remove(replace);
                String.format("foundServices is: %d", new Object[]{Integer.valueOf(this.foundServices.size())});
            }
            if (bonjourServiceInfo != null && AndroidBonjourImpl.this.listener != null) {
                AndroidBonjourImpl.this.listener.onServiceLost(bonjourServiceInfo);
            }
        }

        private void doServiceReg(NsdServiceInfo nsdServiceInfo) {
            String format = String.format("%s@%s", new Object[]{nsdServiceInfo.getServiceName(), nsdServiceInfo.getServiceType()});
            if (!this.registrationHandlers.containsKey(format)) {
                RegistrationHandler registrationHandler = new RegistrationHandler(AndroidBonjourImpl.this, (C37941) null);
                this.registrationHandlers.put(format, registrationHandler);
                AndroidBonjourImpl.this.nsdManager.registerService(nsdServiceInfo, 1, registrationHandler);
            }
        }

        private void doServiceUnreg(NsdServiceInfo nsdServiceInfo) {
            String format = String.format("%s@%s", new Object[]{nsdServiceInfo.getServiceName(), nsdServiceInfo.getServiceType()});
            RegistrationHandler registrationHandler = this.registrationHandlers.get(format);
            if (registrationHandler != null) {
                this.registrationHandlers.remove(format);
                try {
                    AndroidBonjourImpl.this.nsdManager.unregisterService(registrationHandler);
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                }
            }
        }

        private void doStartDiscovery(String str) {
            String.format("doStartDiscovery: %s", new Object[]{str});
            if (this.discoveryHandlers.containsKey(str)) {
                String.format("%s already started", new Object[]{str});
                return;
            }
            DiscoverHandler discoverHandler = new DiscoverHandler(AndroidBonjourImpl.this, (C37941) null);
            this.discoveryHandlers.put(str, discoverHandler);
            AndroidBonjourImpl.this.nsdManager.discoverServices(str, 1, discoverHandler);
        }

        private void doStopDiscovery() {
            for (DiscoverHandler stopServiceDiscovery : this.discoveryHandlers.values()) {
                try {
                    AndroidBonjourImpl.this.nsdManager.stopServiceDiscovery(stopServiceDiscovery);
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                }
            }
            this.discoveryHandlers.clear();
            this.foundServices.clear();
        }

        public synchronized void put(Job job) {
            try {
                this.jobQueue.add(job);
            } catch (IllegalStateException e) {
                e.printStackTrace();
            }
            return;
        }

        public void run() {
            if (AndroidBonjourImpl.this.listener != null) {
                AndroidBonjourImpl.this.listener.onStarted();
            }
            while (true) {
                try {
                    Job take = this.jobQueue.take();
                    if (take.getType() != JobType.STOP) {
                        switch (C37941.f6707xbdd4ad80[take.getType().ordinal()]) {
                            case 1:
                                doStartDiscovery(take.getServiceType());
                                break;
                            case 2:
                                doStopDiscovery();
                                break;
                            case 3:
                                doServiceFound(take);
                                break;
                            case 4:
                                doServiceLost(take);
                                break;
                            case 5:
                                doServiceReg(take.getServiceInfo());
                                break;
                            case 6:
                                doServiceUnreg(take.getServiceInfo());
                                break;
                        }
                    } else {
                        this.jobQueue.clear();
                        this.discoveryHandlers.clear();
                        this.foundServices.clear();
                        this.registrationHandlers.clear();
                        if (AndroidBonjourImpl.this.listener != null) {
                            AndroidBonjourImpl.this.listener.onStopped();
                            return;
                        }
                        return;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public synchronized void start() {
            if (this.thread == null) {
                Thread thread2 = new Thread(this);
                this.thread = thread2;
                thread2.start();
            }
        }

        public synchronized void stop() {
            if (this.thread != null) {
                this.jobQueue.clear();
                this.jobQueue.add(new Job(JobType.STOP));
                try {
                    this.thread.join(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.thread = null;
            }
        }
    }

    private enum JobType {
        START,
        STOP,
        SERVICE_DISCOVERY_START,
        SERVICE_DISCOVERY_STOP,
        SERVICE_FOUND,
        SERVICE_LOST,
        SERVICE_REG,
        SERVICE_UNREG
    }

    private class RegistrationHandler implements NsdManager.RegistrationListener {
        private RegistrationHandler() {
        }

        /* synthetic */ RegistrationHandler(AndroidBonjourImpl androidBonjourImpl, C37941 r2) {
            this();
        }

        public void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
            String.format("onRegistrationFailed: %d", new Object[]{Integer.valueOf(i)});
        }

        public void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
            String.format("onServiceRegistered: %s", new Object[]{nsdServiceInfo.getServiceName()});
        }

        public void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
            String.format("onServiceUnregistered: %s", new Object[]{nsdServiceInfo.getServiceName()});
        }

        public void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
            String.format("onUnregistrationFailed: %d", new Object[]{Integer.valueOf(i)});
        }
    }

    private AndroidBonjourImpl(Context context2) {
        this.context = context2;
        this.nsdManager = (NsdManager) context2.getSystemService("servicediscovery");
    }

    public static AndroidBonjourImpl getInstance(Context context2) {
        if (instance == null) {
            synchronized (AndroidBonjourImpl.class) {
                if (instance == null) {
                    instance = new AndroidBonjourImpl(context2);
                }
            }
        }
        return instance;
    }

    public void registerService(BonjourServiceInfo bonjourServiceInfo) {
        NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
        nsdServiceInfo.setServiceName(bonjourServiceInfo.getName());
        nsdServiceInfo.setServiceType(bonjourServiceInfo.getType());
        nsdServiceInfo.setPort(bonjourServiceInfo.getPort());
        ExtraInfoSetterFactory.create().set(nsdServiceInfo, bonjourServiceInfo.getProperties());
        nsdServiceInfo.toString();
        Job job = new Job(JobType.SERVICE_REG);
        job.setServiceInfo(nsdServiceInfo);
        this.jobHandler.put(job);
    }

    public void setListener(BonjourListener bonjourListener) {
        this.listener = bonjourListener;
    }

    public void start() {
        this.jobHandler.start();
    }

    public void startDiscovery(String str) {
        Job job = new Job(JobType.SERVICE_DISCOVERY_START);
        job.setServiceType(str);
        this.jobHandler.put(job);
    }

    public void stop() {
        this.jobHandler.stop();
    }

    public void stopAllDiscovery() {
        this.jobHandler.put(new Job(JobType.SERVICE_DISCOVERY_STOP));
    }

    public void unregisterService(BonjourServiceInfo bonjourServiceInfo) {
        NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
        nsdServiceInfo.setServiceName(bonjourServiceInfo.getName());
        nsdServiceInfo.setServiceType(bonjourServiceInfo.getType());
        nsdServiceInfo.setPort(bonjourServiceInfo.getPort());
        ExtraInfoSetterFactory.create().set(nsdServiceInfo, bonjourServiceInfo.getProperties());
        nsdServiceInfo.toString();
        Job job = new Job(JobType.SERVICE_UNREG);
        job.setServiceInfo(nsdServiceInfo);
        this.jobHandler.put(job);
    }
}
