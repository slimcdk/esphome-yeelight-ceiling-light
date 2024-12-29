package com.xiaomi.push.service;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioAttributes;
import android.net.Uri;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4554bk;
import com.xiaomi.push.C4747h;
import com.xiaomi.push.C4773hw;
import com.xiaomi.push.C4830m;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.xiaomi.push.service.at */
public class C4885at {

    /* renamed from: a */
    private static final boolean f9482a = Log.isLoggable("NCHelper", 3);

    /* renamed from: a */
    private static int m15275a(NotificationChannel notificationChannel) {
        int i = 0;
        try {
            i = ((Integer) C4554bk.m13021b((Object) notificationChannel, "getUserLockedFields", new Object[0])).intValue();
            if (f9482a) {
                m15284a("isUserLockedChannel:" + i + " " + notificationChannel);
            }
        } catch (Exception e) {
            C4408b.m12467a("NCHelper", "is user locked error" + e);
        }
        return i;
    }

    @TargetApi(26)
    /* renamed from: a */
    private static NotificationChannel m15276a(String str, NotificationChannel notificationChannel) {
        NotificationChannel notificationChannel2 = new NotificationChannel(str, notificationChannel.getName(), notificationChannel.getImportance());
        notificationChannel2.setDescription(notificationChannel.getDescription());
        notificationChannel2.enableVibration(notificationChannel.shouldVibrate());
        notificationChannel2.enableLights(notificationChannel.shouldShowLights());
        notificationChannel2.setSound(notificationChannel.getSound(), notificationChannel.getAudioAttributes());
        notificationChannel2.setLockscreenVisibility(notificationChannel.getLockscreenVisibility());
        return notificationChannel2;
    }

    /* renamed from: a */
    private static SharedPreferences m15277a(Context context) {
        return context.getSharedPreferences("mipush_channel_copy_sp", 0);
    }

    @TargetApi(26)
    /* renamed from: a */
    public static String m15278a(C4893ax axVar, String str, CharSequence charSequence, String str2, int i, int i2, String str3, String str4) {
        String a = axVar.mo29978a(str);
        boolean z = f9482a;
        if (z) {
            m15284a("createChannel: appChannelId:" + a + " serverChannelId:" + str + " serverChannelName:" + charSequence + " serverChannelDesc:" + str2 + " serverChannelNotifyType:" + i + " serverChannelName:" + charSequence + " serverChannelImportance:" + i2 + " channelSoundStr:" + str3 + " channelPermissions:" + str4);
        }
        NotificationChannel notificationChannel = new NotificationChannel(a, charSequence, i2);
        notificationChannel.setDescription(str2);
        boolean z2 = false;
        notificationChannel.enableVibration((i & 2) != 0);
        if ((i & 4) != 0) {
            z2 = true;
        }
        notificationChannel.enableLights(z2);
        if ((i & 1) == 0) {
            notificationChannel.setSound((Uri) null, (AudioAttributes) null);
        } else if (!TextUtils.isEmpty(str3)) {
            if (str3.startsWith("android.resource://" + axVar.mo29979a())) {
                notificationChannel.setSound(Uri.parse(str3), Notification.AUDIO_ATTRIBUTES_DEFAULT);
            }
        }
        if (z) {
            m15284a("create channel:" + notificationChannel);
        }
        m15283a(axVar, notificationChannel, str4);
        return a;
    }

    @SuppressLint({"WrongConstant"})
    @TargetApi(26)
    /* renamed from: a */
    static void m15279a(Context context, C4893ax axVar, NotificationChannel notificationChannel, int i, String str) {
        if (i > 0) {
            int a = C4747h.m14122a(context) >= 2 ? C4960e.m15545a(context.getPackageName(), str) : 0;
            NotificationChannel a2 = m15276a(notificationChannel.getId(), notificationChannel);
            if ((i & 32) != 0) {
                if (notificationChannel.getSound() != null) {
                    a2.setSound((Uri) null, (AudioAttributes) null);
                } else {
                    a2.setSound(Settings.System.DEFAULT_NOTIFICATION_URI, Notification.AUDIO_ATTRIBUTES_DEFAULT);
                }
            }
            if ((i & 16) != 0) {
                if (notificationChannel.shouldVibrate()) {
                    a2.enableVibration(false);
                } else {
                    a2.enableVibration(true);
                }
            }
            if ((i & 8) != 0) {
                if (notificationChannel.shouldShowLights()) {
                    a2.enableLights(false);
                } else {
                    a2.enableLights(true);
                }
            }
            if ((i & 4) != 0) {
                int importance = notificationChannel.getImportance() - 1;
                if (importance <= 0) {
                    importance = 2;
                }
                a2.setImportance(importance);
            }
            if ((i & 2) != 0) {
                a2.setLockscreenVisibility(notificationChannel.getLockscreenVisibility() - 1);
            }
            axVar.mo29982a(a2);
            axVar.mo29983a(notificationChannel, true);
            C4960e.m15553a(axVar.mo29979a(), notificationChannel.getId(), a, 0);
            return;
        }
        axVar.mo29982a(notificationChannel);
    }

    /* renamed from: a */
    public static void m15280a(Context context, String str) {
        if (C4830m.m14998a(context) && !TextUtils.isEmpty(str)) {
            m15288c(context, str);
            C4960e.m15547a(context, str);
        }
    }

    /* renamed from: a */
    private static void m15281a(Context context, List<String> list) {
        if (f9482a) {
            m15284a("deleteCopiedChannelRecord:" + list);
        }
        if (!list.isEmpty()) {
            SharedPreferences.Editor edit = m15277a(context).edit();
            for (String remove : list) {
                edit.remove(remove);
            }
            edit.apply();
        }
    }

    /* renamed from: a */
    static void m15282a(C4773hw hwVar) {
        Map<String, String> map;
        if (hwVar != null && (map = hwVar.f8791a) != null && map.containsKey("REMOVE_CHANNEL_MARK")) {
            hwVar.f8787a = 0;
            hwVar.f8791a.remove("channel_id");
            hwVar.f8791a.remove("channel_importance");
            hwVar.f8791a.remove("channel_name");
            hwVar.f8791a.remove("channel_description");
            hwVar.f8791a.remove("channel_perm");
            C4408b.m12464a("delete channel info by:" + hwVar.f8791a.get("REMOVE_CHANNEL_MARK"));
            hwVar.f8791a.remove("REMOVE_CHANNEL_MARK");
        }
    }

    @TargetApi(26)
    /* renamed from: a */
    private static void m15283a(C4893ax axVar, NotificationChannel notificationChannel, String str) {
        char c;
        int i;
        int i2;
        Context a = axVar.mo29979a();
        String id = notificationChannel.getId();
        String a2 = C4893ax.m15318a(id, axVar.mo29979a());
        boolean z = f9482a;
        if (z) {
            m15284a("appChannelId:" + id + " oldChannelId:" + a2);
        }
        if (!C4830m.m14998a(a) || TextUtils.equals(id, a2)) {
            NotificationChannel a3 = axVar.mo29978a(id);
            if (z) {
                m15284a("elseLogic getNotificationChannel:" + a3);
            }
            if (a3 == null) {
                axVar.mo29982a(notificationChannel);
            }
            i = 0;
            c = 0;
        } else {
            NotificationManager notificationManager = (NotificationManager) a.getSystemService("notification");
            NotificationChannel notificationChannel2 = notificationManager.getNotificationChannel(a2);
            NotificationChannel a4 = axVar.mo29978a(id);
            if (z) {
                m15284a("xmsfChannel:" + notificationChannel2);
                m15284a("appChannel:" + a4);
            }
            if (notificationChannel2 != null) {
                NotificationChannel a5 = m15276a(id, notificationChannel2);
                if (z) {
                    m15284a("copyXmsf copyXmsfChannel:" + a5);
                }
                if (a4 != null) {
                    i2 = m15275a(a4);
                    axVar.mo29983a(a5, i2 == 0);
                    c = 3;
                } else {
                    i2 = m15275a(notificationChannel2);
                    m15279a(a, axVar, a5, i2, notificationChannel2.getId());
                    c = 4;
                }
                m15287b(a, id);
                notificationManager.deleteNotificationChannel(a2);
            } else if (a4 == null) {
                if (z) {
                    m15284a("appHack createNotificationChannel:" + notificationChannel);
                }
                axVar.mo29982a(notificationChannel);
                i2 = 0;
                c = 1;
            } else if (m15280a(a, id) || !m15285a(notificationChannel, a4)) {
                i2 = 0;
                c = 0;
            } else {
                if (z) {
                    m15284a("appHack updateNotificationChannel:" + notificationChannel);
                }
                i2 = m15275a(a4);
                axVar.mo29983a(notificationChannel, i2 == 0);
                c = 2;
            }
            i = i2;
        }
        C4960e.m15548a(axVar.mo29979a(), axVar.mo29979a(), id, notificationChannel.getImportance(), str, c == 1 || c == 4 || c == 3, i);
    }

    /* renamed from: a */
    private static void m15284a(String str) {
        C4408b.m12467a("NCHelper", str);
    }

    @TargetApi(26)
    /* renamed from: a */
    private static boolean m15285a(NotificationChannel notificationChannel, NotificationChannel notificationChannel2) {
        boolean z;
        boolean z2 = false;
        if (notificationChannel == null || notificationChannel2 == null) {
            return false;
        }
        boolean z3 = true;
        if (!TextUtils.equals(notificationChannel.getName(), notificationChannel2.getName())) {
            if (f9482a) {
                m15284a("appHack channelConfigLowerCompare:getName");
            }
            z = true;
        } else {
            z = false;
        }
        if (!TextUtils.equals(notificationChannel.getDescription(), notificationChannel2.getDescription())) {
            if (f9482a) {
                m15284a("appHack channelConfigLowerCompare:getDescription");
            }
            z = true;
        }
        if (notificationChannel.getImportance() != notificationChannel2.getImportance()) {
            notificationChannel.setImportance(Math.min(notificationChannel.getImportance(), notificationChannel2.getImportance()));
            if (f9482a) {
                m15284a("appHack channelConfigLowerCompare:getImportance  " + notificationChannel.getImportance() + " " + notificationChannel2.getImportance());
            }
            z = true;
        }
        if (notificationChannel.shouldVibrate() != notificationChannel2.shouldVibrate()) {
            notificationChannel.enableVibration(false);
            if (f9482a) {
                m15284a("appHack channelConfigLowerCompare:enableVibration");
            }
            z = true;
        }
        if (notificationChannel.shouldShowLights() != notificationChannel2.shouldShowLights()) {
            notificationChannel.enableLights(false);
            if (f9482a) {
                m15284a("appHack channelConfigLowerCompare:enableLights");
            }
            z = true;
        }
        boolean z4 = notificationChannel.getSound() != null;
        if (notificationChannel2.getSound() != null) {
            z2 = true;
        }
        if (z4 != z2) {
            notificationChannel.setSound((Uri) null, (AudioAttributes) null);
            if (f9482a) {
                m15284a("appHack channelConfigLowerCompare:setSound");
            }
        } else {
            z3 = z;
        }
        if (f9482a) {
            m15284a("appHack channelConfigLowerCompare:isDifferent:" + z3);
        }
        return z3;
    }

    /* renamed from: a */
    private static boolean m15286a(Context context, String str) {
        if (f9482a) {
            m15284a("checkCopeidChannel:newFullChannelId:" + str + "  " + m15277a(context).getBoolean(str, false));
        }
        return m15277a(context).getBoolean(str, false);
    }

    /* renamed from: b */
    private static void m15287b(Context context, String str) {
        if (f9482a) {
            m15284a("recordCopiedChannel:" + str);
        }
        m15277a(context).edit().putBoolean(str, true).apply();
    }

    /* renamed from: c */
    private static void m15288c(Context context, String str) {
        try {
            C4893ax a = C4893ax.m15315a(context, str);
            Set<String> keySet = m15277a(context).getAll().keySet();
            ArrayList arrayList = new ArrayList();
            for (String next : keySet) {
                if (a.mo29978a(next)) {
                    arrayList.add(next);
                    if (f9482a) {
                        m15284a("delete channel copy record:" + next);
                    }
                }
            }
            m15281a(context, (List<String>) arrayList);
        } catch (Exception unused) {
        }
    }
}
