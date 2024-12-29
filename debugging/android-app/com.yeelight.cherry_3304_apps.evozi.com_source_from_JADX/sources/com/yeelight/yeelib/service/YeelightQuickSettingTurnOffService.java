package com.yeelight.yeelib.service;

import android.os.Handler;
import android.os.Looper;
import android.service.quicksettings.TileService;
import android.widget.Toast;
import androidx.annotation.RequiresApi;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.p152f.C9775d;
import com.yeelight.yeelib.p153g.C9840j;
import com.yeelight.yeelib.p185d.C7563a;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;

@RequiresApi(api = 24)
public class YeelightQuickSettingTurnOffService extends TileService {
    public static final String TAG = YeelightQuickSettingTurnOffService.class.getSimpleName();

    public void onClick() {
        C9775d.m23684t().mo31613k(new C9840j("type_group", (String) null, C7563a.TURN_OFF_ALL, (String) null), new C9775d.C9783h() {
            public void tokenOauthFailed() {
                new Thread() {
                    public void run() {
                        new Handler(Looper.getMainLooper()).post(new Runnable() {
                            public void run() {
                                YeelightQuickSettingTurnOffService yeelightQuickSettingTurnOffService = YeelightQuickSettingTurnOffService.this;
                                Toast.makeText(yeelightQuickSettingTurnOffService, yeelightQuickSettingTurnOffService.getText(R$string.account_login_ouath_failed_info), 0).show();
                            }
                        });
                    }
                }.start();
                BaseActivity.m24384U(YeelightQuickSettingTurnOffService.this);
            }
        });
    }

    public void onStartListening() {
    }

    public void onStopListening() {
    }

    public void onTileAdded() {
    }

    public void onTileRemoved() {
    }
}
