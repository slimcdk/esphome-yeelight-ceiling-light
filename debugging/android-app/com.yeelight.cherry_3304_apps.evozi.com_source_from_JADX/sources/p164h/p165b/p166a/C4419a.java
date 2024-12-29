package p164h.p165b.p166a;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;
import javax.enterprise.inject.Alternative;
import p164h.p165b.p166a.p170k.p171d.C11459d;
import p164h.p165b.p166a.p170k.p171d.C11460e;
import p164h.p165b.p166a.p170k.p171d.C11461f;
import p164h.p165b.p166a.p170k.p171d.C11464i;
import p164h.p165b.p166a.p170k.p171d.C11465j;
import p164h.p165b.p166a.p170k.p171d.C11466k;
import p164h.p165b.p166a.p170k.p171d.C11469q;
import p164h.p165b.p166a.p170k.p171d.C11470r;
import p164h.p165b.p166a.p170k.p171d.C11471s;
import p164h.p165b.p166a.p170k.p171d.C11472t;
import p164h.p165b.p166a.p170k.p171d.C4438h;
import p164h.p165b.p166a.p170k.p171d.C4443p;
import p164h.p165b.p166a.p170k.p172e.C11483c;
import p164h.p165b.p166a.p170k.p172e.C11484d;
import p164h.p165b.p166a.p170k.p172e.C11486g;
import p164h.p165b.p166a.p170k.p172e.C11487h;
import p164h.p165b.p166a.p170k.p172e.C11490l;
import p164h.p165b.p166a.p170k.p172e.C11492n;
import p164h.p165b.p166a.p170k.p172e.C4444e;
import p164h.p165b.p166a.p170k.p172e.C4445j;
import p164h.p165b.p166a.p237f.p239e.C11189e;
import p164h.p165b.p166a.p237f.p239e.C11191g;
import p164h.p165b.p166a.p237f.p239e.C11192h;
import p164h.p165b.p166a.p237f.p239e.C11193i;
import p164h.p165b.p166a.p240h.C11216f;
import p164h.p165b.p166a.p240h.C11217g;
import p164h.p165b.p166a.p240h.p243r.C11245f;
import p164h.p165b.p166a.p240h.p248s.C11333m;
import p164h.p165b.p166a.p240h.p248s.C11334n;
import p164h.p165b.p166a.p240h.p252w.C11397x;
import p164h.p257c.p259b.C11495a;

@Alternative
/* renamed from: h.b.a.a */
public class C4419a implements C4424c {
    /* access modifiers changed from: private */
    public static Logger log = Logger.getLogger(C4419a.class.getName());
    private final C11484d datagramProcessor;
    private final ExecutorService defaultExecutorService;
    private final C11189e deviceDescriptorBinderUDA10;
    private final C4444e genaEventProcessor;
    private final C11217g namespace;
    private final C11191g serviceDescriptorBinderUDA10;
    private final C4445j soapActionProcessor;
    private final int streamListenPort;

    /* renamed from: h.b.a.a$a */
    public static class C4420a extends ThreadPoolExecutor {

        /* renamed from: h.b.a.a$a$a */
        class C4421a extends ThreadPoolExecutor.DiscardPolicy {
            C4421a() {
            }

            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                Logger access$000 = C4419a.log;
                access$000.info("Thread pool rejected execution of " + runnable.getClass());
                super.rejectedExecution(runnable, threadPoolExecutor);
            }
        }

        public C4420a() {
            this(new C4422b(), new C4421a());
        }

        public C4420a(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
            super(0, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 60, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory, rejectedExecutionHandler);
        }

        /* access modifiers changed from: protected */
        public void afterExecute(Runnable runnable, Throwable th) {
            super.afterExecute(runnable, th);
            if (th != null) {
                Throwable a = C11495a.m30173a(th);
                if (!(a instanceof InterruptedException)) {
                    Logger access$000 = C4419a.log;
                    access$000.warning("Thread terminated " + runnable + " abruptly with exception: " + th);
                    Logger access$0002 = C4419a.log;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Root cause: ");
                    sb.append(a);
                    access$0002.warning(sb.toString());
                }
            }
        }
    }

    /* renamed from: h.b.a.a$b */
    public static class C4422b implements ThreadFactory {

        /* renamed from: a */
        protected final ThreadGroup f7971a;

        /* renamed from: b */
        protected final AtomicInteger f7972b = new AtomicInteger(1);

        public C4422b() {
            SecurityManager securityManager = System.getSecurityManager();
            this.f7971a = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
        }

        public Thread newThread(Runnable runnable) {
            ThreadGroup threadGroup = this.f7971a;
            Thread thread = new Thread(threadGroup, runnable, "cling-" + this.f7972b.getAndIncrement(), 0);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            return thread;
        }
    }

    public C4419a() {
        this(0);
    }

    public C4419a(int i) {
        this(i, true);
    }

    protected C4419a(int i, boolean z) {
        if (!z || !C11216f.f22294a) {
            this.streamListenPort = i;
            this.defaultExecutorService = createDefaultExecutorService();
            this.datagramProcessor = createDatagramProcessor();
            this.soapActionProcessor = createSOAPActionProcessor();
            this.genaEventProcessor = createGENAEventProcessor();
            this.deviceDescriptorBinderUDA10 = createDeviceDescriptorBinderUDA10();
            this.serviceDescriptorBinderUDA10 = createServiceDescriptorBinderUDA10();
            this.namespace = createNamespace();
            return;
        }
        throw new Error("Unsupported runtime environment, use org.fourthline.cling.android.AndroidUpnpServiceConfiguration");
    }

    protected C4419a(boolean z) {
        this(0, z);
    }

    public C11483c createDatagramIO(C11487h hVar) {
        return new C11460e(new C11459d());
    }

    /* access modifiers changed from: protected */
    public C11484d createDatagramProcessor() {
        return new C11461f();
    }

    /* access modifiers changed from: protected */
    public ExecutorService createDefaultExecutorService() {
        return new C4420a();
    }

    /* access modifiers changed from: protected */
    public C11189e createDeviceDescriptorBinderUDA10() {
        return new C11192h();
    }

    /* access modifiers changed from: protected */
    public C4444e createGENAEventProcessor() {
        return new C4438h();
    }

    public C11486g createMulticastReceiver(C11487h hVar) {
        return new C11465j(new C11464i(hVar.mo36323e(), hVar.mo36322d()));
    }

    /* access modifiers changed from: protected */
    public C11217g createNamespace() {
        return new C11217g();
    }

    public C11487h createNetworkAddressFactory() {
        return createNetworkAddressFactory(this.streamListenPort);
    }

    /* access modifiers changed from: protected */
    public C11487h createNetworkAddressFactory(int i) {
        return new C11466k(i);
    }

    /* access modifiers changed from: protected */
    public C4445j createSOAPActionProcessor() {
        return new C4443p();
    }

    /* access modifiers changed from: protected */
    public C11191g createServiceDescriptorBinderUDA10() {
        return new C11193i();
    }

    public C11490l createStreamClient() {
        return new C11470r(new C11469q(getSyncProtocolExecutorService()));
    }

    public C11492n createStreamServer(C11487h hVar) {
        return new C11472t(new C11471s(hVar.mo36325g()));
    }

    public int getAliveIntervalMillis() {
        return 0;
    }

    public Executor getAsyncProtocolExecutor() {
        return getDefaultExecutorService();
    }

    public Executor getDatagramIOExecutor() {
        return getDefaultExecutorService();
    }

    public C11484d getDatagramProcessor() {
        return this.datagramProcessor;
    }

    /* access modifiers changed from: protected */
    public ExecutorService getDefaultExecutorService() {
        return this.defaultExecutorService;
    }

    public C11245f getDescriptorRetrievalHeaders(C11333m mVar) {
        return null;
    }

    public C11189e getDeviceDescriptorBinderUDA10() {
        return this.deviceDescriptorBinderUDA10;
    }

    public C11245f getEventSubscriptionHeaders(C11334n nVar) {
        return null;
    }

    public C11397x[] getExclusiveServiceTypes() {
        return new C11397x[0];
    }

    public C4444e getGenaEventProcessor() {
        return this.genaEventProcessor;
    }

    public Executor getMulticastReceiverExecutor() {
        return getDefaultExecutorService();
    }

    public C11217g getNamespace() {
        return this.namespace;
    }

    public Executor getRegistryListenerExecutor() {
        return getDefaultExecutorService();
    }

    public Executor getRegistryMaintainerExecutor() {
        return getDefaultExecutorService();
    }

    public int getRegistryMaintenanceIntervalMillis() {
        return 1000;
    }

    public Integer getRemoteDeviceMaxAgeSeconds() {
        return null;
    }

    public C11191g getServiceDescriptorBinderUDA10() {
        return this.serviceDescriptorBinderUDA10;
    }

    public C4445j getSoapActionProcessor() {
        return this.soapActionProcessor;
    }

    public ExecutorService getStreamServerExecutorService() {
        return getDefaultExecutorService();
    }

    public ExecutorService getSyncProtocolExecutorService() {
        return getDefaultExecutorService();
    }

    public boolean isReceivedSubscriptionTimeoutIgnored() {
        return false;
    }

    public void shutdown() {
        log.fine("Shutting down default executor service");
        getDefaultExecutorService().shutdownNow();
    }
}
