package org.fourthline.cling;

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
import org.fourthline.cling.model.C10018f;
import org.fourthline.cling.model.C10019g;
import org.fourthline.cling.model.message.C10032f;
import org.fourthline.cling.model.types.C10098s;
import org.fourthline.cling.transport.impl.C10125c;
import org.fourthline.cling.transport.impl.C10126d;
import org.fourthline.cling.transport.impl.C10127e;
import org.fourthline.cling.transport.impl.C10130g;
import org.fourthline.cling.transport.impl.C10131h;
import org.fourthline.cling.transport.impl.C10132i;
import org.fourthline.cling.transport.impl.C10133j;
import org.fourthline.cling.transport.impl.C10136o;
import org.fourthline.cling.transport.impl.C10137p;
import org.fourthline.cling.transport.impl.C10138q;
import org.fourthline.cling.transport.impl.C10139r;
import org.fourthline.cling.transport.impl.C10140s;
import org.seamless.util.C10243a;
import p148d7.C8953c;
import p148d7.C8954d;
import p148d7.C8955e;
import p148d7.C8956f;
import p148d7.C8957g;
import p148d7.C8958h;
import p148d7.C8960j;
import p148d7.C8962l;
import p187m6.C9556a;
import p187m6.C9558c;
import p187m6.C9559d;
import p187m6.C9560e;
import p214t6.C10408h;
import p214t6.C10409i;

@Alternative
/* renamed from: org.fourthline.cling.a */
public class C3570a implements C10011c {
    /* access modifiers changed from: private */
    public static Logger log = Logger.getLogger(C3570a.class.getName());
    private final C8954d datagramProcessor;
    private final ExecutorService defaultExecutorService;
    private final C9556a deviceDescriptorBinderUDA10;
    private final C8955e genaEventProcessor;
    private final C10019g namespace;
    private final C9558c serviceDescriptorBinderUDA10;
    private final C8958h soapActionProcessor;
    private final int streamListenPort;

    /* renamed from: org.fourthline.cling.a$a */
    public static class C3571a extends ThreadPoolExecutor {

        /* renamed from: org.fourthline.cling.a$a$a */
        class C3572a extends ThreadPoolExecutor.DiscardPolicy {
            C3572a() {
            }

            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                Logger access$000 = C3570a.log;
                access$000.info("Thread pool rejected execution of " + runnable.getClass());
                super.rejectedExecution(runnable, threadPoolExecutor);
            }
        }

        public C3571a() {
            this(new C3573b(), new C3572a());
        }

        public C3571a(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
            super(0, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 60, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory, rejectedExecutionHandler);
        }

        /* access modifiers changed from: protected */
        public void afterExecute(Runnable runnable, Throwable th) {
            super.afterExecute(runnable, th);
            if (th != null) {
                Throwable a = C10243a.m25753a(th);
                if (!(a instanceof InterruptedException)) {
                    Logger access$000 = C3570a.log;
                    access$000.warning("Thread terminated " + runnable + " abruptly with exception: " + th);
                    Logger access$0002 = C3570a.log;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Root cause: ");
                    sb.append(a);
                    access$0002.warning(sb.toString());
                }
            }
        }
    }

    /* renamed from: org.fourthline.cling.a$b */
    public static class C3573b implements ThreadFactory {

        /* renamed from: a */
        protected final ThreadGroup f5946a;

        /* renamed from: b */
        protected final AtomicInteger f5947b = new AtomicInteger(1);

        public C3573b() {
            SecurityManager securityManager = System.getSecurityManager();
            this.f5946a = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
        }

        public Thread newThread(Runnable runnable) {
            ThreadGroup threadGroup = this.f5946a;
            Thread thread = new Thread(threadGroup, runnable, "cling-" + this.f5947b.getAndIncrement(), 0);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            return thread;
        }
    }

    public C3570a() {
        this(0);
    }

    public C3570a(int i) {
        this(i, true);
    }

    protected C3570a(int i, boolean z) {
        if (!z || !C10018f.f18492a) {
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

    protected C3570a(boolean z) {
        this(0, z);
    }

    public C8953c createDatagramIO(C8957g gVar) {
        return new C10126d(new C10125c());
    }

    /* access modifiers changed from: protected */
    public C8954d createDatagramProcessor() {
        return new C10127e();
    }

    /* access modifiers changed from: protected */
    public ExecutorService createDefaultExecutorService() {
        return new C3571a();
    }

    /* access modifiers changed from: protected */
    public C9556a createDeviceDescriptorBinderUDA10() {
        return new C9559d();
    }

    /* access modifiers changed from: protected */
    public C8955e createGENAEventProcessor() {
        return new C10130g();
    }

    public C8956f createMulticastReceiver(C8957g gVar) {
        return new C10132i(new C10131h(gVar.mo36799e(), gVar.mo36798d()));
    }

    /* access modifiers changed from: protected */
    public C10019g createNamespace() {
        return new C10019g();
    }

    public C8957g createNetworkAddressFactory() {
        return createNetworkAddressFactory(this.streamListenPort);
    }

    /* access modifiers changed from: protected */
    public C8957g createNetworkAddressFactory(int i) {
        return new C10133j(i);
    }

    /* access modifiers changed from: protected */
    public C8958h createSOAPActionProcessor() {
        return new C10136o();
    }

    /* access modifiers changed from: protected */
    public C9558c createServiceDescriptorBinderUDA10() {
        return new C9560e();
    }

    public C8960j createStreamClient() {
        return new C10138q(new C10137p(getSyncProtocolExecutorService()));
    }

    public C8962l createStreamServer(C8957g gVar) {
        return new C10140s(new C10139r(gVar.mo36801g()));
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

    public C8954d getDatagramProcessor() {
        return this.datagramProcessor;
    }

    /* access modifiers changed from: protected */
    public ExecutorService getDefaultExecutorService() {
        return this.defaultExecutorService;
    }

    public C10032f getDescriptorRetrievalHeaders(C10408h hVar) {
        return null;
    }

    public C9556a getDeviceDescriptorBinderUDA10() {
        return this.deviceDescriptorBinderUDA10;
    }

    public C10032f getEventSubscriptionHeaders(C10409i iVar) {
        return null;
    }

    public C10098s[] getExclusiveServiceTypes() {
        return new C10098s[0];
    }

    public C8955e getGenaEventProcessor() {
        return this.genaEventProcessor;
    }

    public Executor getMulticastReceiverExecutor() {
        return getDefaultExecutorService();
    }

    public C10019g getNamespace() {
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

    public C9558c getServiceDescriptorBinderUDA10() {
        return this.serviceDescriptorBinderUDA10;
    }

    public C8958h getSoapActionProcessor() {
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
