package com.miot.service.manager.discovery.impl.bonjour.impl;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.miot.service.manager.discovery.impl.bonjour.Bonjour;
import com.miot.service.manager.discovery.impl.bonjour.BonjourListener;
import com.miot.service.manager.discovery.impl.bonjour.serviceinfo.BonjourServiceInfo;
import com.miot.service.manager.discovery.impl.bonjour.serviceinfo.impl.BonjourServiceInfoImpl;
import java.io.IOException;
import java.net.Inet4Address;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import javax.jmdns.C9218a;
import javax.jmdns.C9224d;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;

public class JavaBonjourImpl implements Bonjour {
    private static final String SERVICE_TYPE_SUFFIX = ".local.";
    private static final String TAG = "JavaBonjourImpl";
    private static volatile JavaBonjourImpl instance;
    /* access modifiers changed from: private */
    public Context context;
    /* access modifiers changed from: private */
    public JobHandler jobHandler = new JobHandler();
    /* access modifiers changed from: private */
    public BonjourListener listener = null;

    /* renamed from: com.miot.service.manager.discovery.impl.bonjour.impl.JavaBonjourImpl$1 */
    static /* synthetic */ class C41461 {

        /* renamed from: $SwitchMap$com$miot$service$manager$discovery$impl$bonjour$impl$JavaBonjourImpl$JobType */
        static final /* synthetic */ int[] f6865xc2b4939b;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.miot.service.manager.discovery.impl.bonjour.impl.JavaBonjourImpl$JobType[] r0 = com.miot.service.manager.discovery.impl.bonjour.impl.JavaBonjourImpl.JobType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6865xc2b4939b = r0
                com.miot.service.manager.discovery.impl.bonjour.impl.JavaBonjourImpl$JobType r1 = com.miot.service.manager.discovery.impl.bonjour.impl.JavaBonjourImpl.JobType.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6865xc2b4939b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.miot.service.manager.discovery.impl.bonjour.impl.JavaBonjourImpl$JobType r1 = com.miot.service.manager.discovery.impl.bonjour.impl.JavaBonjourImpl.JobType.SERVICE_DISCOVERY_START     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f6865xc2b4939b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.miot.service.manager.discovery.impl.bonjour.impl.JavaBonjourImpl$JobType r1 = com.miot.service.manager.discovery.impl.bonjour.impl.JavaBonjourImpl.JobType.SERVICE_DISCOVERY_STOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f6865xc2b4939b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.miot.service.manager.discovery.impl.bonjour.impl.JavaBonjourImpl$JobType r1 = com.miot.service.manager.discovery.impl.bonjour.impl.JavaBonjourImpl.JobType.SERVICE_FOUND     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f6865xc2b4939b     // Catch:{ NoSuchFieldError -> 0x003e }
                com.miot.service.manager.discovery.impl.bonjour.impl.JavaBonjourImpl$JobType r1 = com.miot.service.manager.discovery.impl.bonjour.impl.JavaBonjourImpl.JobType.SERVICE_LOST     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f6865xc2b4939b     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.miot.service.manager.discovery.impl.bonjour.impl.JavaBonjourImpl$JobType r1 = com.miot.service.manager.discovery.impl.bonjour.impl.JavaBonjourImpl.JobType.SERVICE_RESOLVED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f6865xc2b4939b     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.miot.service.manager.discovery.impl.bonjour.impl.JavaBonjourImpl$JobType r1 = com.miot.service.manager.discovery.impl.bonjour.impl.JavaBonjourImpl.JobType.SERVICE_REG     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f6865xc2b4939b     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.miot.service.manager.discovery.impl.bonjour.impl.JavaBonjourImpl$JobType r1 = com.miot.service.manager.discovery.impl.bonjour.impl.JavaBonjourImpl.JobType.SERVICE_UNREG     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.miot.service.manager.discovery.impl.bonjour.impl.JavaBonjourImpl.C41461.<clinit>():void");
        }
    }

    private class Job {
        private ServiceEvent serviceEvent;
        private ServiceInfo serviceInfo;
        private String serviceType;
        private JobType type;

        public Job(JobType jobType) {
            this.type = jobType;
        }

        public ServiceEvent getServiceEvent() {
            return this.serviceEvent;
        }

        public ServiceInfo getServiceInfo() {
            return this.serviceInfo;
        }

        public String getServiceType() {
            return this.serviceType;
        }

        public JobType getType() {
            return this.type;
        }

        public void setServiceEvent(ServiceEvent serviceEvent2) {
            this.serviceEvent = serviceEvent2;
        }

        public void setServiceInfo(ServiceInfo serviceInfo2) {
            this.serviceInfo = serviceInfo2;
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
        private static final int STOP_TIMEOUT = 5000;
        private Map<String, BonjourServiceInfo> foundServices;
        private C9218a jmdns;
        private BlockingQueue<Job> jobQueue;
        private Map<String, MyServiceListener> myListeners;
        private Map<String, ServiceInfo> regServices;
        private Thread thread;
        private WifiManager.MulticastLock wifiLock;

        public JobHandler() {
            this.wifiLock = null;
            this.jmdns = null;
            this.thread = null;
            this.jobQueue = null;
            this.myListeners = new HashMap();
            this.foundServices = new HashMap();
            this.regServices = new HashMap();
            this.jobQueue = new ArrayBlockingQueue(MAX_SERVICE_INFO);
        }

        private void doServiceFound(ServiceEvent serviceEvent) {
            C9218a aVar = this.jmdns;
            if (aVar != null) {
                aVar.mo37338B(serviceEvent.getType(), serviceEvent.getName());
            }
        }

        private void doServiceLost(ServiceEvent serviceEvent) {
            BonjourServiceInfo bonjourServiceInfo;
            if (this.jmdns != null) {
                synchronized (this.foundServices) {
                    bonjourServiceInfo = this.foundServices.get(serviceEvent.getName());
                }
                if (bonjourServiceInfo != null && JavaBonjourImpl.this.listener != null) {
                    JavaBonjourImpl.this.listener.onServiceLost(bonjourServiceInfo);
                }
            }
        }

        private void doServiceReg(ServiceInfo serviceInfo) {
            if (this.jmdns != null) {
                if (this.regServices.containsKey(serviceInfo.mo37334w())) {
                    String.format("%s already registered", new Object[]{serviceInfo.mo37334w()});
                    return;
                }
                this.regServices.put(serviceInfo.mo37334w(), serviceInfo);
                try {
                    this.jmdns.mo37342z(serviceInfo);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        private void doServiceResolved(ServiceEvent serviceEvent) {
            String name = serviceEvent.getName();
            String type = serviceEvent.getType();
            int j = serviceEvent.getInfo().mo37325j();
            Inet4Address[] f = serviceEvent.getInfo().mo37321f();
            String str = null;
            for (Inet4Address hostAddress : f) {
                str = hostAddress.getHostAddress();
                String.format("serviceResolved: %s.%s %s:%d", new Object[]{serviceEvent.getName(), serviceEvent.getType(), str, Integer.valueOf(j)});
            }
            if (str != null) {
                HashMap hashMap = new HashMap();
                Enumeration<String> o = serviceEvent.getInfo().mo37327o();
                while (o.hasMoreElements()) {
                    String nextElement = o.nextElement();
                    hashMap.put(nextElement, serviceEvent.getInfo().mo37328p(nextElement));
                }
                BonjourServiceInfoImpl bonjourServiceInfoImpl = new BonjourServiceInfoImpl();
                bonjourServiceInfoImpl.setName(name);
                bonjourServiceInfoImpl.setType(type);
                bonjourServiceInfoImpl.setIp(str);
                bonjourServiceInfoImpl.setPort(j);
                bonjourServiceInfoImpl.getProperties();
                synchronized (this.foundServices) {
                    this.foundServices.put(name, bonjourServiceInfoImpl);
                    String.format("foundServices is: %d", new Object[]{Integer.valueOf(this.foundServices.size())});
                }
                if (JavaBonjourImpl.this.listener != null) {
                    JavaBonjourImpl.this.listener.onServiceFound(bonjourServiceInfoImpl);
                }
            }
        }

        private void doServiceUnreg(String str) {
            if (this.jmdns != null) {
                if (!this.regServices.containsKey(str)) {
                    String.format("%s not registered", new Object[]{str});
                    return;
                }
                ServiceInfo serviceInfo = this.regServices.get(str);
                this.jmdns.mo37340E(serviceInfo);
                this.regServices.remove(serviceInfo);
            }
        }

        private void doStartDiscovery(String str) {
            String.format("doStartDiscovery: %s", new Object[]{str});
            if (this.jmdns != null) {
                if (this.myListeners.containsKey(str)) {
                    String.format("discovery is started: %s", new Object[]{str});
                    return;
                }
                MyServiceListener myServiceListener = new MyServiceListener(JavaBonjourImpl.this, (C41461) null);
                this.myListeners.put(str, myServiceListener);
                this.jmdns.mo37341s(str, myServiceListener);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0084, code lost:
            if (com.miot.service.manager.discovery.impl.bonjour.impl.JavaBonjourImpl.access$000(r5.this$0) == null) goto L_0x0095;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0091, code lost:
            if (com.miot.service.manager.discovery.impl.bonjour.impl.JavaBonjourImpl.access$000(r5.this$0) == null) goto L_0x0095;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
            if (com.miot.service.manager.discovery.impl.bonjour.impl.JavaBonjourImpl.access$000(r5.this$0) != null) goto L_0x000d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0049, code lost:
            if (com.miot.service.manager.discovery.impl.bonjour.impl.JavaBonjourImpl.access$000(r5.this$0) != null) goto L_0x000d;
         */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0099  */
        /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void doStartJmdns() {
            /*
                r5 = this;
                javax.jmdns.a r0 = r5.jmdns
                r1 = 0
                if (r0 == 0) goto L_0x0018
                com.miot.service.manager.discovery.impl.bonjour.impl.JavaBonjourImpl r0 = com.miot.service.manager.discovery.impl.bonjour.impl.JavaBonjourImpl.this
                com.miot.service.manager.discovery.impl.bonjour.BonjourListener r0 = r0.listener
                if (r0 == 0) goto L_0x0095
            L_0x000d:
                com.miot.service.manager.discovery.impl.bonjour.impl.JavaBonjourImpl r0 = com.miot.service.manager.discovery.impl.bonjour.impl.JavaBonjourImpl.this
                com.miot.service.manager.discovery.impl.bonjour.BonjourListener r0 = r0.listener
                r0.onStartFailed()
                goto L_0x0095
            L_0x0018:
                com.miot.service.manager.discovery.impl.bonjour.impl.JavaBonjourImpl r0 = com.miot.service.manager.discovery.impl.bonjour.impl.JavaBonjourImpl.this
                android.content.Context r0 = r0.context
                java.lang.String r2 = "wifi"
                java.lang.Object r0 = r0.getSystemService(r2)
                android.net.wifi.WifiManager r0 = (android.net.wifi.WifiManager) r0
                java.lang.String r2 = "wifilock"
                android.net.wifi.WifiManager$MulticastLock r0 = r0.createMulticastLock(r2)
                r5.wifiLock = r0
                r2 = 1
                r0.setReferenceCounted(r2)
                android.net.wifi.WifiManager$MulticastLock r0 = r5.wifiLock
                r0.acquire()
                com.miot.service.manager.discovery.impl.bonjour.impl.JavaBonjourImpl r0 = com.miot.service.manager.discovery.impl.bonjour.impl.JavaBonjourImpl.this
                android.content.Context r0 = r0.context
                byte[] r0 = r5.getLocalIpInt(r0)
                if (r0 != 0) goto L_0x004c
                com.miot.service.manager.discovery.impl.bonjour.impl.JavaBonjourImpl r0 = com.miot.service.manager.discovery.impl.bonjour.impl.JavaBonjourImpl.this
                com.miot.service.manager.discovery.impl.bonjour.BonjourListener r0 = r0.listener
                if (r0 == 0) goto L_0x0095
                goto L_0x000d
            L_0x004c:
                java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r0)     // Catch:{ UnknownHostException -> 0x0087 }
                javax.jmdns.a r3 = javax.jmdns.C9218a.m22269v(r0)     // Catch:{ IOException -> 0x007a }
                r5.jmdns = r3     // Catch:{ IOException -> 0x007a }
                r3 = 2
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.String r4 = "3.4.1"
                r3[r1] = r4
                java.lang.String r0 = r0.getHostAddress()
                r3[r2] = r0
                java.lang.String r0 = "JmDNS version: %s (%s)"
                java.lang.String.format(r0, r3)
                com.miot.service.manager.discovery.impl.bonjour.impl.JavaBonjourImpl r0 = com.miot.service.manager.discovery.impl.bonjour.impl.JavaBonjourImpl.this
                com.miot.service.manager.discovery.impl.bonjour.BonjourListener r0 = r0.listener
                if (r0 == 0) goto L_0x0095
                com.miot.service.manager.discovery.impl.bonjour.impl.JavaBonjourImpl r0 = com.miot.service.manager.discovery.impl.bonjour.impl.JavaBonjourImpl.this
                com.miot.service.manager.discovery.impl.bonjour.BonjourListener r0 = r0.listener
                r0.onStarted()
                goto L_0x0095
            L_0x007a:
                r0 = move-exception
                r0.printStackTrace()
                com.miot.service.manager.discovery.impl.bonjour.impl.JavaBonjourImpl r0 = com.miot.service.manager.discovery.impl.bonjour.impl.JavaBonjourImpl.this
                com.miot.service.manager.discovery.impl.bonjour.BonjourListener r0 = r0.listener
                if (r0 == 0) goto L_0x0095
                goto L_0x000d
            L_0x0087:
                r0 = move-exception
                r0.printStackTrace()
                com.miot.service.manager.discovery.impl.bonjour.impl.JavaBonjourImpl r0 = com.miot.service.manager.discovery.impl.bonjour.impl.JavaBonjourImpl.this
                com.miot.service.manager.discovery.impl.bonjour.BonjourListener r0 = r0.listener
                if (r0 == 0) goto L_0x0095
                goto L_0x000d
            L_0x0095:
                javax.jmdns.a r0 = r5.jmdns
                if (r0 != 0) goto L_0x00a6
                android.net.wifi.WifiManager$MulticastLock r0 = r5.wifiLock
                r0.setReferenceCounted(r1)
                android.net.wifi.WifiManager$MulticastLock r0 = r5.wifiLock
                r0.release()
                r0 = 0
                r5.wifiLock = r0
            L_0x00a6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.miot.service.manager.discovery.impl.bonjour.impl.JavaBonjourImpl.JobHandler.doStartJmdns():void");
        }

        private void doStopDiscovery() {
            if (this.jmdns != null) {
                for (Map.Entry next : this.myListeners.entrySet()) {
                    this.jmdns.mo37337A((String) next.getKey(), (C9224d) next.getValue());
                }
            }
        }

        private void doStopJmdns() {
            C9218a aVar = this.jmdns;
            if (aVar != null) {
                aVar.mo37339D();
                try {
                    this.jmdns.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                this.jmdns = null;
                WifiManager.MulticastLock multicastLock = this.wifiLock;
                if (multicastLock != null) {
                    multicastLock.setReferenceCounted(false);
                    this.wifiLock.release();
                    this.wifiLock = null;
                } else if (JavaBonjourImpl.this.listener != null) {
                    JavaBonjourImpl.this.listener.onStopped();
                }
            }
        }

        private byte[] getLocalIpInt(Context context) {
            WifiInfo connectionInfo;
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            if (wifiManager.isWifiEnabled() && (connectionInfo = wifiManager.getConnectionInfo()) != null) {
                return intToBytes(connectionInfo.getIpAddress());
            }
            return null;
        }

        private byte[] intToBytes(int i) {
            return new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)};
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
            while (true) {
                try {
                    Job take = this.jobQueue.take();
                    if (take.getType() != JobType.STOP) {
                        switch (C41461.f6865xc2b4939b[take.getType().ordinal()]) {
                            case 1:
                                doStartJmdns();
                                break;
                            case 2:
                                doStartDiscovery(take.getServiceType());
                                break;
                            case 3:
                                doStopDiscovery();
                                break;
                            case 4:
                                doServiceFound(take.getServiceEvent());
                                break;
                            case 5:
                                doServiceLost(take.getServiceEvent());
                                break;
                            case 6:
                                doServiceResolved(take.getServiceEvent());
                                break;
                            case 7:
                                doServiceReg(take.getServiceInfo());
                                break;
                            case 8:
                                doServiceUnreg(take.getServiceInfo().mo37334w());
                                break;
                        }
                    } else {
                        break;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            doStopJmdns();
            this.jobQueue.clear();
            this.myListeners.clear();
            this.foundServices.clear();
            this.regServices.clear();
        }

        public synchronized void start() {
            if (this.thread == null) {
                Thread thread2 = new Thread(this);
                this.thread = thread2;
                thread2.start();
                this.jobQueue.add(new Job(JobType.START));
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
        SERVICE_RESOLVED,
        SERVICE_REG,
        SERVICE_UNREG
    }

    private class MyServiceListener implements C9224d {
        private MyServiceListener() {
        }

        /* synthetic */ MyServiceListener(JavaBonjourImpl javaBonjourImpl, C41461 r2) {
            this();
        }

        public void serviceAdded(ServiceEvent serviceEvent) {
            Job job = new Job(JobType.SERVICE_FOUND);
            job.setServiceEvent(serviceEvent);
            JavaBonjourImpl.this.jobHandler.put(job);
        }

        public void serviceRemoved(ServiceEvent serviceEvent) {
            Job job = new Job(JobType.SERVICE_LOST);
            job.setServiceEvent(serviceEvent);
            JavaBonjourImpl.this.jobHandler.put(job);
        }

        public void serviceResolved(ServiceEvent serviceEvent) {
            Job job = new Job(JobType.SERVICE_RESOLVED);
            job.setServiceEvent(serviceEvent);
            JavaBonjourImpl.this.jobHandler.put(job);
        }
    }

    private JavaBonjourImpl(Context context2) {
        this.context = context2;
    }

    public static JavaBonjourImpl getInstance(Context context2) {
        if (instance == null) {
            synchronized (JavaBonjourImpl.class) {
                if (instance == null) {
                    instance = new JavaBonjourImpl(context2);
                }
            }
        }
        return instance;
    }

    public void registerService(BonjourServiceInfo bonjourServiceInfo) {
        ServiceInfo c = ServiceInfo.m22248c(bonjourServiceInfo.getType() + SERVICE_TYPE_SUFFIX, bonjourServiceInfo.getName(), bonjourServiceInfo.getPort(), 0, 0, bonjourServiceInfo.getProperties());
        Job job = new Job(JobType.SERVICE_REG);
        job.setServiceInfo(c);
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
        job.setServiceType(str + SERVICE_TYPE_SUFFIX);
        this.jobHandler.put(job);
    }

    public void stop() {
        this.jobHandler.stop();
    }

    public void stopAllDiscovery() {
        this.jobHandler.put(new Job(JobType.SERVICE_DISCOVERY_STOP));
    }

    public void unregisterService(BonjourServiceInfo bonjourServiceInfo) {
        ServiceInfo c = ServiceInfo.m22248c(bonjourServiceInfo.getType() + SERVICE_TYPE_SUFFIX, bonjourServiceInfo.getName(), bonjourServiceInfo.getPort(), 0, 0, bonjourServiceInfo.getProperties());
        Job job = new Job(JobType.SERVICE_UNREG);
        job.setServiceInfo(c);
        this.jobHandler.put(job);
    }
}
