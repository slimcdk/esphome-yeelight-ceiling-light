package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.miot.common.ReturnCode;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.mipush.sdk.PushMessageHandler;
import com.xiaomi.push.C4498ai;
import com.xiaomi.push.C4662fb;
import com.xiaomi.push.C4668fg;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MessageHandleService extends BaseService {

    /* renamed from: a */
    private static ConcurrentLinkedQueue<C4020a> f6833a = new ConcurrentLinkedQueue<>();

    /* renamed from: a */
    private static ExecutorService f6834a = new ThreadPoolExecutor(1, 1, 15, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: com.xiaomi.mipush.sdk.MessageHandleService$a */
    public static class C4020a {

        /* renamed from: a */
        private Intent f6835a;

        /* renamed from: a */
        private PushMessageReceiver f6836a;

        public C4020a(Intent intent, PushMessageReceiver pushMessageReceiver) {
            this.f6836a = pushMessageReceiver;
            this.f6835a = intent;
        }

        /* renamed from: a */
        public Intent mo22785a() {
            return this.f6835a;
        }

        /* renamed from: a */
        public PushMessageReceiver m10754a() {
            return this.f6836a;
        }
    }

    /* renamed from: a */
    protected static void m10749a(Context context, Intent intent) {
        if (intent != null) {
            m10750b(context);
        }
    }

    public static void addJob(Context context, C4020a aVar) {
        if (aVar != null) {
            f6833a.add(aVar);
            m10750b(context);
            startService(context);
        }
    }

    /* renamed from: b */
    private static void m10750b(Context context) {
        if (!f6834a.isShutdown()) {
            f6834a.execute(new C4032ab(context));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m10751c(Context context) {
        String[] stringArrayExtra;
        try {
            C4020a poll = f6833a.poll();
            if (poll != null) {
                PushMessageReceiver a = poll.mo22785a();
                Intent a2 = poll.mo22785a();
                int intExtra = a2.getIntExtra(PushMessageHelper.MESSAGE_TYPE, 1);
                if (intExtra == 1) {
                    PushMessageHandler.C4029a a3 = C4044an.m10813a(context).mo22900a(a2);
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
                            C4662fb.m14151a(context.getApplicationContext()).mo25059a(context.getPackageName(), a2, (int) ReturnCode.E_ACTION_ARGUMENT_INVALID, (String) null);
                            C3989b.m10669a("begin execute onReceivePassThroughMessage from " + miPushMessage.getMessageId());
                            a.onReceivePassThroughMessage(context, miPushMessage);
                            return;
                        } else if (miPushMessage.isNotified()) {
                            if (intExtra2 == 1000) {
                                C4662fb.m14151a(context.getApplicationContext()).mo25059a(context.getPackageName(), a2, 1007, (String) null);
                            } else {
                                C4662fb.m14151a(context.getApplicationContext()).mo25059a(context.getPackageName(), a2, 3007, (String) null);
                            }
                            C3989b.m10669a("begin execute onNotificationMessageClicked from　" + miPushMessage.getMessageId());
                            a.onNotificationMessageClicked(context, miPushMessage);
                            return;
                        } else {
                            a.onNotificationMessageArrived(context, miPushMessage);
                            return;
                        }
                    } else if (a3 instanceof MiPushCommandMessage) {
                        MiPushCommandMessage miPushCommandMessage = (MiPushCommandMessage) a3;
                        C3989b.m10669a("begin execute onCommandResult, command=" + miPushCommandMessage.getCommand() + ", resultCode=" + miPushCommandMessage.getResultCode() + ", reason=" + miPushCommandMessage.getReason());
                        a.onCommandResult(context, miPushCommandMessage);
                        if (TextUtils.equals(miPushCommandMessage.getCommand(), C4668fg.COMMAND_REGISTER.f8633a)) {
                            a.onReceiveRegisterResult(context, miPushCommandMessage);
                            PushMessageHandler.m10778a(context, miPushCommandMessage);
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
                    C3989b.m10669a("(Local) begin execute onCommandResult, command=" + miPushCommandMessage2.getCommand() + ", resultCode=" + miPushCommandMessage2.getResultCode() + ", reason=" + miPushCommandMessage2.getReason());
                    a.onCommandResult(context, miPushCommandMessage2);
                    if (TextUtils.equals(miPushCommandMessage2.getCommand(), C4668fg.COMMAND_REGISTER.f8633a)) {
                        a.onReceiveRegisterResult(context, miPushCommandMessage2);
                        PushMessageHandler.m10778a(context, miPushCommandMessage2);
                        if (miPushCommandMessage2.getResultCode() != 0) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (intExtra == 5) {
                    if (PushMessageHelper.ERROR_TYPE_NEED_PERMISSION.equals(a2.getStringExtra(PushMessageHelper.ERROR_TYPE)) && (stringArrayExtra = a2.getStringArrayExtra(PushMessageHelper.ERROR_MESSAGE)) != null) {
                        C3989b.m10669a("begin execute onRequirePermissions, lack of necessary permissions");
                        a.onRequirePermissions(context, stringArrayExtra);
                        return;
                    }
                    return;
                } else {
                    return;
                }
                C4063h.m10956b(context);
            }
        } catch (RuntimeException e) {
            C3989b.m10678a((Throwable) e);
        }
    }

    public static void startService(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, MessageHandleService.class));
        C4498ai.m13271a(context).mo24725a((Runnable) new C4031aa(context, intent));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo22778a() {
        ConcurrentLinkedQueue<C4020a> concurrentLinkedQueue = f6833a;
        return concurrentLinkedQueue != null && concurrentLinkedQueue.size() > 0;
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onStart(Intent intent, int i) {
        super.onStart(intent, i);
    }
}
