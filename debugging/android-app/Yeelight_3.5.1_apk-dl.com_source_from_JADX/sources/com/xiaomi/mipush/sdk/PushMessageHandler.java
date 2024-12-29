package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.IBinder;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.mipush.sdk.MessageHandleService;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.push.C4667eo;
import com.xiaomi.push.C4678ey;
import com.xiaomi.push.C4764hn;
import com.xiaomi.push.C4797it;
import com.xiaomi.push.C4994v;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class PushMessageHandler extends BaseService {

    /* renamed from: a */
    private static List<MiPushClient.ICallbackResult> f7417a = new ArrayList();

    /* renamed from: a */
    private static ThreadPoolExecutor f7418a = new ThreadPoolExecutor(1, 1, 15, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: b */
    private static List<MiPushClient.MiPushClientCallback> f7419b = new ArrayList();

    /* renamed from: com.xiaomi.mipush.sdk.PushMessageHandler$a */
    interface C4449a extends Serializable {
    }

    /* renamed from: a */
    protected static void mo28523a() {
        synchronized (f7419b) {
            f7419b.clear();
        }
    }

    /* renamed from: a */
    public static void m12584a(long j, String str, String str2) {
        synchronized (f7419b) {
            for (MiPushClient.MiPushClientCallback onInitializeResult : f7419b) {
                onInitializeResult.onInitializeResult(j, str, str2);
            }
        }
    }

    /* renamed from: a */
    public static void m12585a(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, PushMessageHandler.class));
        try {
            context.startService(intent);
        } catch (Exception e) {
            C4408b.m12464a(e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m12586a(Context context, Intent intent) {
        C4408b.m12482c("addjob PushMessageHandler " + intent);
        if (intent != null) {
            m12601c(context, intent);
            m12585a(context);
        }
    }

    /* renamed from: a */
    private static void m12587a(Context context, Intent intent, ResolveInfo resolveInfo, boolean z) {
        try {
            MessageHandleService.C4440a aVar = new MessageHandleService.C4440a(intent, (PushMessageReceiver) C4994v.m15735a(context, resolveInfo.activityInfo.name).newInstance());
            if (z) {
                MessageHandleService.m12558a(context.getApplicationContext(), aVar);
            } else {
                MessageHandleService.addJob(context.getApplicationContext(), aVar);
            }
            MessageHandleService.m12557a(context, new Intent(context.getApplicationContext(), MessageHandleService.class));
        } catch (Throwable th) {
            C4408b.m12478a(th);
        }
    }

    /* renamed from: a */
    protected static void m12588a(Context context, MiPushCommandMessage miPushCommandMessage) {
        synchronized (f7417a) {
            for (MiPushClient.ICallbackResult next : f7417a) {
                if (next instanceof MiPushClient.UPSRegisterCallBack) {
                    MiPushClient.TokenResult tokenResult = new MiPushClient.TokenResult();
                    if (!(miPushCommandMessage == null || miPushCommandMessage.getCommandArguments() == null || miPushCommandMessage.getCommandArguments().size() <= 0)) {
                        tokenResult.setResultCode(miPushCommandMessage.getResultCode());
                        tokenResult.setToken(miPushCommandMessage.getCommandArguments().get(0));
                    }
                    next.onResult(tokenResult);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m12589a(Context context, MiPushMessage miPushMessage) {
        synchronized (f7419b) {
            for (MiPushClient.MiPushClientCallback next : f7419b) {
                if (m12595a(miPushMessage.getCategory(), next.getCategory())) {
                    next.onReceiveMessage(miPushMessage.getContent(), miPushMessage.getAlias(), miPushMessage.getTopic(), miPushMessage.isNotified());
                    next.onReceiveMessage(miPushMessage);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m12590a(Context context, C4449a aVar) {
        if (aVar instanceof MiPushMessage) {
            m12589a(context, (MiPushMessage) aVar);
        } else if (aVar instanceof MiPushCommandMessage) {
            MiPushCommandMessage miPushCommandMessage = (MiPushCommandMessage) aVar;
            String command = miPushCommandMessage.getCommand();
            String str = null;
            if (C4678ey.COMMAND_REGISTER.f8040a.equals(command)) {
                List<String> commandArguments = miPushCommandMessage.getCommandArguments();
                if (commandArguments != null && !commandArguments.isEmpty()) {
                    str = commandArguments.get(0);
                }
                m12584a(miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), str);
            } else if (C4678ey.COMMAND_SET_ALIAS.f8040a.equals(command) || C4678ey.COMMAND_UNSET_ALIAS.f8040a.equals(command) || C4678ey.COMMAND_SET_ACCEPT_TIME.f8040a.equals(command)) {
                m12592a(context, miPushCommandMessage.getCategory(), command, miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), miPushCommandMessage.getCommandArguments());
            } else if (C4678ey.COMMAND_SUBSCRIBE_TOPIC.f8040a.equals(command)) {
                List<String> commandArguments2 = miPushCommandMessage.getCommandArguments();
                if (commandArguments2 != null && !commandArguments2.isEmpty()) {
                    str = commandArguments2.get(0);
                }
                Context context2 = context;
                m12591a(context2, miPushCommandMessage.getCategory(), miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), str);
            } else if (C4678ey.COMMAND_UNSUBSCRIBE_TOPIC.f8040a.equals(command)) {
                List<String> commandArguments3 = miPushCommandMessage.getCommandArguments();
                if (commandArguments3 != null && !commandArguments3.isEmpty()) {
                    str = commandArguments3.get(0);
                }
                Context context3 = context;
                m12599b(context3, miPushCommandMessage.getCategory(), miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), str);
            }
        }
    }

    /* renamed from: a */
    protected static void m12591a(Context context, String str, long j, String str2, String str3) {
        synchronized (f7419b) {
            for (MiPushClient.MiPushClientCallback next : f7419b) {
                if (m12595a(str, next.getCategory())) {
                    next.onSubscribeResult(j, str2, str3);
                }
            }
        }
    }

    /* renamed from: a */
    protected static void m12592a(Context context, String str, String str2, long j, String str3, List<String> list) {
        synchronized (f7419b) {
            for (MiPushClient.MiPushClientCallback next : f7419b) {
                if (m12595a(str, next.getCategory())) {
                    next.onCommandResult(str2, j, str3, list);
                }
            }
        }
    }

    /* renamed from: a */
    protected static void m12593a(MiPushClient.ICallbackResult iCallbackResult) {
        synchronized (f7417a) {
            if (!f7417a.contains(iCallbackResult)) {
                f7417a.add(iCallbackResult);
            }
        }
    }

    /* renamed from: a */
    protected static void m12594a(MiPushClient.MiPushClientCallback miPushClientCallback) {
        synchronized (f7419b) {
            if (!f7419b.contains(miPushClientCallback)) {
                f7419b.add(miPushClientCallback);
            }
        }
    }

    /* renamed from: a */
    protected static boolean m12595a(String str, String str2) {
        return (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) || TextUtils.equals(str, str2);
    }

    /* renamed from: b */
    protected static void m12596b() {
        synchronized (f7417a) {
            f7417a.clear();
        }
    }

    /* renamed from: b */
    private static void m12597b(Context context) {
        try {
            Intent intent = new Intent();
            intent.setPackage(context.getPackageName());
            intent.setAction("action_clicked_activity_finish");
            context.sendBroadcast(intent, C4478d.m12749a(context));
        } catch (Exception e) {
            C4408b.m12464a("callback sync error" + e);
        }
    }

    /* renamed from: b */
    protected static void m12598b(Context context, Intent intent) {
        boolean z = false;
        try {
            z = intent.getBooleanExtra("is_clicked_activity_call", z);
        } catch (Throwable th) {
            C4408b.m12464a("intent unparcel error:" + th);
        }
        try {
            ResolveInfo resolveInfo = null;
            if ("com.xiaomi.mipush.sdk.WAKEUP".equals(intent.getAction())) {
                C4490o.m12796a(context, intent, (Uri) null);
            } else if ("com.xiaomi.mipush.SEND_TINYDATA".equals(intent.getAction())) {
                C4764hn hnVar = new C4764hn();
                C4797it.m14833a(hnVar, intent.getByteArrayExtra("mipush_payload"));
                C4408b.m12482c("PushMessageHandler.onHandleIntent " + hnVar.mo29308d());
                MiTinyDataClient.upload(context, hnVar);
            } else if (1 == PushMessageHelper.getPushMode(context)) {
                if (m12596b()) {
                    C4408b.m12483d("receive a message before application calling initialize");
                    if (z) {
                        m12597b(context);
                        return;
                    }
                    return;
                }
                C4449a a = C4463am.m12625a(context).mo28651a(intent);
                if (a != null) {
                    m12590a(context, a);
                }
            } else if (!"com.xiaomi.mipush.sdk.SYNC_LOG".equals(intent.getAction())) {
                Intent intent2 = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
                intent2.setPackage(context.getPackageName());
                intent2.putExtras(intent);
                List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent2, 32);
                if (queryBroadcastReceivers != null) {
                    Iterator<ResolveInfo> it = queryBroadcastReceivers.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            ResolveInfo next = it.next();
                            ActivityInfo activityInfo = next.activityInfo;
                            if (activityInfo != null && activityInfo.packageName.equals(context.getPackageName()) && PushMessageReceiver.class.isAssignableFrom(C4994v.m15735a(context, next.activityInfo.name))) {
                                resolveInfo = next;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (resolveInfo != null) {
                    m12587a(context, intent2, resolveInfo, z);
                } else {
                    C4408b.m12483d("cannot find the receiver to handler this message, check your manifest");
                    C4667eo.m13689a(context).mo29051a(context.getPackageName(), intent, "11");
                }
            }
        } catch (Exception e) {
            C4408b.m12478a((Throwable) e);
            C4667eo.m13689a(context).mo29051a(context.getPackageName(), intent, "9");
        } catch (Throwable th2) {
            try {
                C4408b.m12478a(th2);
                C4667eo.m13689a(context).mo29051a(context.getPackageName(), intent, "10");
                if (!z) {
                    return;
                }
            } finally {
                if (z) {
                    m12597b(context);
                }
            }
        }
        if (!z) {
        }
    }

    /* renamed from: b */
    protected static void m12599b(Context context, String str, long j, String str2, String str3) {
        synchronized (f7419b) {
            for (MiPushClient.MiPushClientCallback next : f7419b) {
                if (m12595a(str, next.getCategory())) {
                    next.onUnsubscribeResult(j, str2, str3);
                }
            }
        }
    }

    /* renamed from: b */
    public static boolean m12600b() {
        return f7419b.isEmpty();
    }

    /* renamed from: c */
    private static void m12601c(Context context, Intent intent) {
        if (intent != null && !f7418a.isShutdown()) {
            f7418a.execute(new C4462al(context, intent));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean m12602a() {
        ThreadPoolExecutor threadPoolExecutor = f7418a;
        return (threadPoolExecutor == null || threadPoolExecutor.getQueue() == null || f7418a.getQueue().size() <= 0) ? false : true;
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onStart(Intent intent, int i) {
        super.onStart(intent, i);
        m12601c(getApplicationContext(), intent);
    }
}
