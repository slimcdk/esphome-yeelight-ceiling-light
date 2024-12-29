package p164h.p165b.p166a;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
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
import p164h.p165b.p166a.p240h.C11217g;
import p164h.p165b.p166a.p240h.p243r.C11245f;
import p164h.p165b.p166a.p240h.p248s.C11333m;
import p164h.p165b.p166a.p240h.p248s.C11334n;
import p164h.p165b.p166a.p240h.p252w.C11397x;

/* renamed from: h.b.a.c */
public interface C4424c {
    C11483c createDatagramIO(C11487h hVar);

    C11486g createMulticastReceiver(C11487h hVar);

    C11487h createNetworkAddressFactory();

    C11490l createStreamClient();

    C11492n createStreamServer(C11487h hVar);

    int getAliveIntervalMillis();

    Executor getAsyncProtocolExecutor();

    Executor getDatagramIOExecutor();

    C11484d getDatagramProcessor();

    C11245f getDescriptorRetrievalHeaders(C11333m mVar);

    C11189e getDeviceDescriptorBinderUDA10();

    C11245f getEventSubscriptionHeaders(C11334n nVar);

    C11397x[] getExclusiveServiceTypes();

    C4444e getGenaEventProcessor();

    Executor getMulticastReceiverExecutor();

    C11217g getNamespace();

    Executor getRegistryListenerExecutor();

    Executor getRegistryMaintainerExecutor();

    int getRegistryMaintenanceIntervalMillis();

    Integer getRemoteDeviceMaxAgeSeconds();

    C11191g getServiceDescriptorBinderUDA10();

    C4445j getSoapActionProcessor();

    ExecutorService getStreamServerExecutorService();

    ExecutorService getSyncProtocolExecutorService();

    boolean isReceivedSubscriptionTimeoutIgnored();

    void shutdown();
}
