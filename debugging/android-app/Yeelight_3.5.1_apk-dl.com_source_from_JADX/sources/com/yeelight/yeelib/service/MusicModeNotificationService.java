package com.yeelight.yeelib.service;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.yeelight.cherry.p141ui.activity.MainActivity;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$mipmap;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.C6119c;
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.managers.C8282n;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p051j4.C9205u;

public class MusicModeNotificationService extends Service {
    private static final String TAG = "NotificationService";
    final String CHANNEL_ID = "yeelight.cherry.mus";
    final String CHANNEL_NAME = "Music Mode";
    private Map<String, C3012e> mMusicDevices;
    private NotificationManager notificationManager;

    @RequiresApi(api = 26)
    private void showNotification() {
        String str;
        Class<MainActivity> cls = MainActivity.class;
        try {
            int i = MainActivity.f10688y;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            cls = null;
        }
        PendingIntent activity = PendingIntent.getActivity(this, 0, new Intent(this, cls), C9205u.m22204a(0));
        Intent intent = new Intent(this, MusicModeNotificationService.class);
        intent.putExtra("clearAll", true);
        PendingIntent service = PendingIntent.getService(this, 0, intent, C9205u.m22204a(0));
        NotificationChannel notificationChannel = new NotificationChannel("yeelight.cherry.mus", "Music Mode", 2);
        notificationChannel.setSound((Uri) null, Notification.AUDIO_ATTRIBUTES_DEFAULT);
        this.notificationManager.createNotificationChannel(notificationChannel);
        Notification.MediaStyle mediaStyle = new Notification.MediaStyle();
        mediaStyle.setShowActionsInCompactView(new int[]{0});
        if (this.mMusicDevices.size() == 1) {
            Iterator<Map.Entry<String, C3012e>> it = this.mMusicDevices.entrySet().iterator();
            str = it.hasNext() ? ((C3012e) it.next().getValue()).mo23210U() : "";
        } else {
            str = String.format(getString(R$string.scene_bundle_list_device_num), new Object[]{Integer.valueOf(this.mMusicDevices.size())});
        }
        startForeground(1000, new Notification.Builder(this, "yeelight.cherry.mus").setSmallIcon(R$mipmap.ic_launcher).setContentTitle(getString(R$string.music_mode)).setContentText(str + " " + getString(R$string.common_text_status_subtitle_music_flow)).setContentIntent(activity).setActions(new Notification.Action[]{new Notification.Action.Builder(Icon.createWithResource(this, R$drawable.icon_yeelight_common_close), "Cancle", service).build()}).setStyle(mediaStyle).build());
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        this.mMusicDevices = new HashMap();
        this.notificationManager = (NotificationManager) getSystemService("notification");
    }

    @RequiresApi(api = 24)
    public void onDestroy() {
        super.onDestroy();
        stopForeground(true);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onStartCommand(intent, i, i2);
        }
        if (intent != null) {
            String stringExtra = intent.getStringExtra("com.yeelight.cherry.device_id");
            if (intent.getBooleanExtra("clearAll", false)) {
                for (Map.Entry<String, C3012e> value : this.mMusicDevices.entrySet()) {
                    C3012e eVar = (C3012e) value.getValue();
                    if (eVar != null) {
                        if (eVar instanceof C6119c) {
                            int i3 = 0;
                            while (true) {
                                C6119c cVar = (C6119c) eVar;
                                if (i3 >= cVar.mo31753K1().size()) {
                                    break;
                                }
                                if (eVar.mo23229n0(21)) {
                                    C8282n.m19569s(this).mo35229B((WifiDeviceBase) cVar.mo31753K1().get(i3), false);
                                }
                                i3++;
                            }
                        } else {
                            C8282n.m19569s(this).mo35229B((WifiDeviceBase) eVar, false);
                        }
                    }
                }
                stopSelf();
                return super.onStartCommand(intent, i, i2);
            } else if (TextUtils.isEmpty(stringExtra)) {
                return super.onStartCommand(intent, i, i2);
            } else {
                if (intent.getBooleanExtra("removeDeviceInNotification", false)) {
                    this.mMusicDevices.remove(stringExtra);
                    if (this.mMusicDevices.size() == 0) {
                        stopSelf();
                    }
                } else {
                    this.mMusicDevices.put(stringExtra, (C3012e) YeelightDeviceManager.m7794j0(stringExtra));
                }
                showNotification();
            }
        }
        return super.onStartCommand(intent, i, i2);
    }
}
