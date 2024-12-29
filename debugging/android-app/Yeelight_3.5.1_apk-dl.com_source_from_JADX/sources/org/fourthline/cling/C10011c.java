package org.fourthline.cling;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.fourthline.cling.model.C10019g;
import org.fourthline.cling.model.message.C10032f;
import org.fourthline.cling.model.types.C10098s;
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
import p214t6.C10408h;
import p214t6.C10409i;

/* renamed from: org.fourthline.cling.c */
public interface C10011c {
    C8953c createDatagramIO(C8957g gVar);

    C8956f createMulticastReceiver(C8957g gVar);

    C8957g createNetworkAddressFactory();

    C8960j createStreamClient();

    C8962l createStreamServer(C8957g gVar);

    int getAliveIntervalMillis();

    Executor getAsyncProtocolExecutor();

    Executor getDatagramIOExecutor();

    C8954d getDatagramProcessor();

    C10032f getDescriptorRetrievalHeaders(C10408h hVar);

    C9556a getDeviceDescriptorBinderUDA10();

    C10032f getEventSubscriptionHeaders(C10409i iVar);

    C10098s[] getExclusiveServiceTypes();

    C8955e getGenaEventProcessor();

    Executor getMulticastReceiverExecutor();

    C10019g getNamespace();

    Executor getRegistryListenerExecutor();

    Executor getRegistryMaintainerExecutor();

    int getRegistryMaintenanceIntervalMillis();

    Integer getRemoteDeviceMaxAgeSeconds();

    C9558c getServiceDescriptorBinderUDA10();

    C8958h getSoapActionProcessor();

    ExecutorService getStreamServerExecutorService();

    ExecutorService getSyncProtocolExecutorService();

    boolean isReceivedSubscriptionTimeoutIgnored();

    void shutdown();
}
