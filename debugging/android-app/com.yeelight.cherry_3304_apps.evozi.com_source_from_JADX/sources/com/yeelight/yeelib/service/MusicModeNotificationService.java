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
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$mipmap;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.p150c.C5980c;
import com.yeelight.yeelib.p150c.C6006h;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p152f.C9802n;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MusicModeNotificationService extends Service {
    private static final String TAG = "NotificationService";
    final String CHANNEL_ID = "yeelight.cherry.mus";
    final String CHANNEL_NAME = "Music Mode";
    private Map<String, C4200i> mMusicDevices;
    private NotificationManager notificationManager;

    @RequiresApi(api = 26)
    private void showNotification() {
        Class<?> cls;
        String str;
        try {
            cls = Class.forName("com.yeelight.cherry.ui.activity.MainActivity");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            cls = null;
        }
        PendingIntent activity = PendingIntent.getActivity(this, 0, new Intent(this, cls), 0);
        Intent intent = new Intent(this, MusicModeNotificationService.class);
        intent.putExtra("clearAll", true);
        PendingIntent service = PendingIntent.getService(this, 0, intent, 0);
        NotificationChannel notificationChannel = new NotificationChannel("yeelight.cherry.mus", "Music Mode", 2);
        notificationChannel.setSound((Uri) null, Notification.AUDIO_ATTRIBUTES_DEFAULT);
        this.notificationManager.createNotificationChannel(notificationChannel);
        Notification.MediaStyle mediaStyle = new Notification.MediaStyle();
        mediaStyle.setShowActionsInCompactView(new int[]{0});
        if (this.mMusicDevices.size() == 1) {
            Iterator<Map.Entry<String, C4200i>> it = this.mMusicDevices.entrySet().iterator();
            str = it.hasNext() ? ((C4200i) it.next().getValue()).mo23397U() : "";
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
                for (Map.Entry<String, C4200i> value : this.mMusicDevices.entrySet()) {
                    C4200i iVar = (C4200i) value.getValue();
                    if (iVar != null) {
                        if (iVar instanceof C5980c) {
                            int i3 = 0;
                            while (true) {
                                C5980c cVar = (C5980c) iVar;
                                if (i3 >= cVar.mo27498K1().size()) {
                                    break;
                                }
                                if (iVar.mo23415n0(21)) {
                                    C9802n.m23790s(this).mo31663B((C6006h) cVar.mo27498K1().get(i3), false);
                                }
                                i3++;
                            }
                        } else {
                            C9802n.m23790s(this).mo31663B((C6006h) iVar, false);
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
                    this.mMusicDevices.put(stringExtra, (C4200i) C4257w.m11945h0(stringExtra));
                }
                showNotification();
            }
        }
        return super.onStartCommand(intent, i, i2);
    }
}
