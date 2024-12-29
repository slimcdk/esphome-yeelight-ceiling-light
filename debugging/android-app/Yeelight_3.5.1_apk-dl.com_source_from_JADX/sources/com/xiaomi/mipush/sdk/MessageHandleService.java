package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.miot.common.ReturnCode;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.mipush.sdk.PushMessageHandler;
import com.xiaomi.push.C4516al;
import com.xiaomi.push.C4667eo;
import com.xiaomi.push.C4678ey;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MessageHandleService extends BaseService {

    /* renamed from: a */
    private static ConcurrentLinkedQueue<C4440a> f7400a = new ConcurrentLinkedQueue<>();

    /* renamed from: a */
    private static ExecutorService f7401a = new ThreadPoolExecutor(1, 1, 15, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: com.xiaomi.mipush.sdk.MessageHandleService$a */
    public static class C4440a {

        /* renamed from: a */
        private Intent f7402a;

        /* renamed from: a */
        private PushMessageReceiver f7403a;

        public C4440a(Intent intent, PushMessageReceiver pushMessageReceiver) {
            this.f7403a = pushMessageReceiver;
            this.f7402a = intent;
        }

        /* renamed from: a */
        public Intent mo28530a() {
            return this.f7402a;
        }

        /* renamed from: a */
        public PushMessageReceiver m12563a() {
            return this.f7403a;
        }
    }

    /* renamed from: a */
    protected static void m12557a(Context context, Intent intent) {
        if (intent != null) {
            m12559b(context);
        }
    }

    /* renamed from: a */
    static void m12558a(Context context, C4440a aVar) {
        String[] stringArrayExtra;
        if (aVar != null) {
            try {
                PushMessageReceiver a = aVar.mo28530a();
                Intent a2 = aVar.mo28530a();
                int intExtra = a2.getIntExtra(PushMessageHelper.MESSAGE_TYPE, 1);
                if (intExtra == 1) {
                    PushMessageHandler.C4449a a3 = C4463am.m12625a(context).mo28651a(a2);
                    int intExtra2 = a2.getIntExtra("eventMessageType", -1);
                    if (a3 == null) {
                        return;
                    }
                    if (a3 instanceof MiPushMessage) {
                        MiPushMessage miPushMessage = (MiPushMessage) a3;
                        if (!miPushMessage.isArrivedMessage()) {
                            a.onReceiveMessage(context, miPushMessage);
                        }
                        if (miPushMessage.getPassThrough() == 1) {
                            C4667eo.m13689a(context.getApplicationContext()).mo29050a(context.getPackageName(), a2, (int) ReturnCode.E_ACTION_ARGUMENT_INVALID, (String) null);
                            C4408b.m12484e("begin execute onReceivePassThroughMessage from " + miPushMessage.getMessageId());
                            a.onReceivePassThroughMessage(context, miPushMessage);
                            return;
                        } else if (miPushMessage.isNotified()) {
                            if (intExtra2 == 1000) {
                                C4667eo.m13689a(context.getApplicationContext()).mo29050a(context.getPackageName(), a2, 1007, (String) null);
                            } else {
                                C4667eo.m13689a(context.getApplicationContext()).mo29050a(context.getPackageName(), a2, 3007, (String) null);
                            }
                            C4408b.m12484e("begin execute onNotificationMessageClicked from　" + miPushMessage.getMessageId());
                            a.onNotificationMessageClicked(context, miPushMessage);
                            return;
                        } else {
                            C4408b.m12484e("begin execute onNotificationMessageArrived from " + miPushMessage.getMessageId());
                            a.onNotificationMessageArrived(context, miPushMessage);
                            return;
                        }
                    } else if (a3 instanceof MiPushCommandMessage) {
                        MiPushCommandMessage miPushCommandMessage = (MiPushCommandMessage) a3;
                        C4408b.m12484e("begin execute onCommandResult, command=" + miPushCommandMessage.getCommand() + ", resultCode=" + miPushCommandMessage.getResultCode() + ", reason=" + miPushCommandMessage.getReason());
                        a.onCommandResult(context, miPushCommandMessage);
                        if (TextUtils.equals(miPushCommandMessage.getCommand(), C4678ey.COMMAND_REGISTER.f8040a)) {
                            a.onReceiveRegisterResult(context, miPushCommandMessage);
                            PushMessageHandler.m12588a(context, miPushCommandMessage);
                            if (miPushCommandMessage.getResultCode() != 0) {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (intExtra == 3) {
                    MiPushCommandMessage miPushCommandMessage2 = (MiPushCommandMessage) a2.getSerializableExtra(PushMessageHelper.KEY_COMMAND);
                    C4408b.m12484e("(Local) begin execute onCommandResult, command=" + miPushCommandMessage2.getCommand() + ", resultCode=" + miPushCommandMessage2.getResultCode() + ", reason=" + miPushCommandMessage2.getReason());
                    a.onCommandResult(context, miPushCommandMessage2);
                    if (TextUtils.equals(miPushCommandMessage2.getCommand(), C4678ey.COMMAND_REGISTER.f8040a)) {
                        a.onReceiveRegisterResult(context, miPushCommandMessage2);
                        PushMessageHandler.m12588a(context, miPushCommandMessage2);
                        if (miPushCommandMessage2.getResultCode() != 0) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (intExtra == 5) {
                    if (PushMessageHelper.ERROR_TYPE_NEED_PERMISSION.equals(a2.getStringExtra(PushMessageHelper.ERROR_TYPE)) && (stringArrayExtra = a2.getStringArrayExtra(PushMessageHelper.ERROR_MESSAGE)) != null) {
                        C4408b.m12484e("begin execute onRequirePermissions, lack of necessary permissions");
                        a.onRequirePermissions(context, stringArrayExtra);
                        return;
                    }
                    return;
                } else {
                    return;
                }
                C4483i.m12781b(context);
            } catch (RuntimeException e) {
                C4408b.m12478a((Throwable) e);
            }
        }
    }

    public static void addJob(Context context, C4440a aVar) {
        if (aVar != null) {
            f7400a.add(aVar);
            m12559b(context);
            startService(context);
        }
    }

    /* renamed from: b */
    private static void m12559b(Context context) {
        if (!f7401a.isShutdown()) {
            f7401a.execute(new C4503z(context));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m12560c(Context context) {
        try {
            m12558a(context, f7400a.poll());
        } catch (RuntimeException e) {
            C4408b.m12478a((Throwable) e);
        }
    }

    public static void startService(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, MessageHandleService.class));
        C4516al.m12857a(context).mo28733a((Runnable) new C4502y(context, intent));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo28523a() {
        ConcurrentLinkedQueue<C4440a> concurrentLinkedQueue = f7400a;
        return concurrentLinkedQueue != null && concurrentLinkedQueue.size() > 0;
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onStart(Intent intent, int i) {
        super.onStart(intent, i);
    }
}
