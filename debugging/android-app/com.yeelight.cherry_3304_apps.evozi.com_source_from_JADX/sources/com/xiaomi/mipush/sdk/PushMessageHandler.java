package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.IBinder;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.mipush.sdk.MessageHandleService;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.push.C4662fb;
import com.xiaomi.push.C4668fg;
import com.xiaomi.push.C4743hq;
import com.xiaomi.push.C4776iw;
import com.xiaomi.push.C4937t;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class PushMessageHandler extends BaseService {

    /* renamed from: a */
    private static List<MiPushClient.ICallbackResult> f6848a = new ArrayList();

    /* renamed from: a */
    private static ThreadPoolExecutor f6849a = new ThreadPoolExecutor(1, 1, 15, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: b */
    private static List<MiPushClient.MiPushClientCallback> f6850b = new ArrayList();

    /* renamed from: com.xiaomi.mipush.sdk.PushMessageHandler$a */
    interface C4029a extends Serializable {
    }

    /* renamed from: a */
    protected static void mo22778a() {
        synchronized (f6850b) {
            f6850b.clear();
        }
    }

    /* renamed from: a */
    public static void m10774a(long j, String str, String str2) {
        synchronized (f6850b) {
            for (MiPushClient.MiPushClientCallback onInitializeResult : f6850b) {
                onInitializeResult.onInitializeResult(j, str, str2);
            }
        }
    }

    /* renamed from: a */
    public static void m10775a(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, PushMessageHandler.class));
        try {
            context.startService(intent);
        } catch (Exception e) {
            C3989b.m10669a(e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m10776a(Context context, Intent intent) {
        C3989b.m10680c("addjob PushMessageHandler " + intent);
        if (intent != null) {
            m10790c(context, intent);
            m10775a(context);
        }
    }

    /* renamed from: a */
    private static void m10777a(Context context, Intent intent, ResolveInfo resolveInfo) {
        try {
            MessageHandleService.addJob(context.getApplicationContext(), new MessageHandleService.C4020a(intent, (PushMessageReceiver) C4937t.m15867a(context, resolveInfo.activityInfo.name).newInstance()));
            MessageHandleService.m10749a(context, new Intent(context.getApplicationContext(), MessageHandleService.class));
        } catch (Throwable th) {
            C3989b.m10678a(th);
        }
    }

    /* renamed from: a */
    protected static void m10778a(Context context, MiPushCommandMessage miPushCommandMessage) {
        synchronized (f6848a) {
            for (MiPushClient.ICallbackResult next : f6848a) {
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
    public static void m10779a(Context context, MiPushMessage miPushMessage) {
        synchronized (f6850b) {
            for (MiPushClient.MiPushClientCallback next : f6850b) {
                if (m10785a(miPushMessage.getCategory(), next.getCategory())) {
                    next.onReceiveMessage(miPushMessage.getContent(), miPushMessage.getAlias(), miPushMessage.getTopic(), miPushMessage.isNotified());
                    next.onReceiveMessage(miPushMessage);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m10780a(Context context, C4029a aVar) {
        if (aVar instanceof MiPushMessage) {
            m10779a(context, (MiPushMessage) aVar);
        } else if (aVar instanceof MiPushCommandMessage) {
            MiPushCommandMessage miPushCommandMessage = (MiPushCommandMessage) aVar;
            String command = miPushCommandMessage.getCommand();
            String str = null;
            if (C4668fg.COMMAND_REGISTER.f8633a.equals(command)) {
                List<String> commandArguments = miPushCommandMessage.getCommandArguments();
                if (commandArguments != null && !commandArguments.isEmpty()) {
                    str = commandArguments.get(0);
                }
                m10774a(miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), str);
            } else if (C4668fg.COMMAND_SET_ALIAS.f8633a.equals(command) || C4668fg.COMMAND_UNSET_ALIAS.f8633a.equals(command) || C4668fg.COMMAND_SET_ACCEPT_TIME.f8633a.equals(command)) {
                m10782a(context, miPushCommandMessage.getCategory(), command, miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), miPushCommandMessage.getCommandArguments());
            } else if (C4668fg.COMMAND_SUBSCRIBE_TOPIC.f8633a.equals(command)) {
                List<String> commandArguments2 = miPushCommandMessage.getCommandArguments();
                if (commandArguments2 != null && !commandArguments2.isEmpty()) {
                    str = commandArguments2.get(0);
                }
                Context context2 = context;
                m10781a(context2, miPushCommandMessage.getCategory(), miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), str);
            } else if (C4668fg.COMMAND_UNSUBSCRIBE_TOPIC.f8633a.equals(command)) {
                List<String> commandArguments3 = miPushCommandMessage.getCommandArguments();
                if (commandArguments3 != null && !commandArguments3.isEmpty()) {
                    str = commandArguments3.get(0);
                }
                Context context3 = context;
                m10788b(context3, miPushCommandMessage.getCategory(), miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), str);
            }
        }
    }

    /* renamed from: a */
    protected static void m10781a(Context context, String str, long j, String str2, String str3) {
        synchronized (f6850b) {
            for (MiPushClient.MiPushClientCallback next : f6850b) {
                if (m10785a(str, next.getCategory())) {
                    next.onSubscribeResult(j, str2, str3);
                }
            }
        }
    }

    /* renamed from: a */
    protected static void m10782a(Context context, String str, String str2, long j, String str3, List<String> list) {
        synchronized (f6850b) {
            for (MiPushClient.MiPushClientCallback next : f6850b) {
                if (m10785a(str, next.getCategory())) {
                    next.onCommandResult(str2, j, str3, list);
                }
            }
        }
    }

    /* renamed from: a */
    protected static void m10783a(MiPushClient.ICallbackResult iCallbackResult) {
        synchronized (f6848a) {
            if (!f6848a.contains(iCallbackResult)) {
                f6848a.add(iCallbackResult);
            }
        }
    }

    /* renamed from: a */
    protected static void m10784a(MiPushClient.MiPushClientCallback miPushClientCallback) {
        synchronized (f6850b) {
            if (!f6850b.contains(miPushClientCallback)) {
                f6850b.add(miPushClientCallback);
            }
        }
    }

    /* renamed from: a */
    protected static boolean m10785a(String str, String str2) {
        return (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) || TextUtils.equals(str, str2);
    }

    /* renamed from: b */
    protected static void m10786b() {
        synchronized (f6848a) {
            f6848a.clear();
        }
    }

    /* renamed from: b */
    protected static void m10787b(Context context, Intent intent) {
        try {
            ResolveInfo resolveInfo = null;
            if ("com.xiaomi.mipush.sdk.WAKEUP".equals(intent.getAction())) {
                C4070n.m10970a(context, intent, (Uri) null);
            } else if ("com.xiaomi.mipush.SEND_TINYDATA".equals(intent.getAction())) {
                C4743hq hqVar = new C4743hq();
                C4776iw.m15224a(hqVar, intent.getByteArrayExtra("mipush_payload"));
                C3989b.m10680c("PushMessageHandler.onHandleIntent " + hqVar.mo25277d());
                MiTinyDataClient.upload(context, hqVar);
            } else if (1 == PushMessageHelper.getPushMode(context)) {
                if (m10786b()) {
                    C3989b.m10681d("receive a message before application calling initialize");
                    return;
                }
                C4029a a = C4044an.m10813a(context).mo22900a(intent);
                if (a != null) {
                    m10780a(context, a);
                }
            } else if ("com.xiaomi.mipush.sdk.SYNC_LOG".equals(intent.getAction())) {
                Logger.uploadLogFile(context, false);
            } else {
                Intent intent2 = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
                intent2.setPackage(context.getPackageName());
                intent2.putExtras(intent);
                List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent2, 32);
                if (queryBroadcastReceivers != null) {
                    Iterator<ResolveInfo> it = queryBroadcastReceivers.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ResolveInfo next = it.next();
                        if (next.activityInfo != null && next.activityInfo.packageName.equals(context.getPackageName()) && PushMessageReceiver.class.isAssignableFrom(C4937t.m15867a(context, next.activityInfo.name))) {
                            resolveInfo = next;
                            break;
                        }
                    }
                }
                if (resolveInfo != null) {
                    m10777a(context, intent2, resolveInfo);
                    return;
                }
                C3989b.m10681d("cannot find the receiver to handler this message, check your manifest");
                C4662fb.m14151a(context).mo25060a(context.getPackageName(), intent, "11");
            }
        } catch (Exception e) {
            C3989b.m10678a((Throwable) e);
            C4662fb.m14151a(context).mo25060a(context.getPackageName(), intent, "9");
        } catch (Throwable th) {
            C3989b.m10678a(th);
            C4662fb.m14151a(context).mo25060a(context.getPackageName(), intent, "10");
        }
    }

    /* renamed from: b */
    protected static void m10788b(Context context, String str, long j, String str2, String str3) {
        synchronized (f6850b) {
            for (MiPushClient.MiPushClientCallback next : f6850b) {
                if (m10785a(str, next.getCategory())) {
                    next.onUnsubscribeResult(j, str2, str3);
                }
            }
        }
    }

    /* renamed from: b */
    public static boolean m10789b() {
        return f6850b.isEmpty();
    }

    /* renamed from: c */
    private static void m10790c(Context context, Intent intent) {
        if (intent != null && !f6849a.isShutdown()) {
            f6849a.execute(new C4043am(context, intent));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean m10791a() {
        ThreadPoolExecutor threadPoolExecutor = f6849a;
        return (threadPoolExecutor == null || threadPoolExecutor.getQueue() == null || f6849a.getQueue().size() <= 0) ? false : true;
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onStart(Intent intent, int i) {
        super.onStart(intent, i);
        m10790c(getApplicationContext(), intent);
    }
}
