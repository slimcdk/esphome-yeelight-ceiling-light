package com.yeelight.yeelib.service;

import android.os.Handler;
import android.os.Looper;
import android.service.quicksettings.TileService;
import android.widget.Toast;
import androidx.annotation.RequiresApi;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.interaction.ActionType;
import com.yeelight.yeelib.managers.C8263d;
import com.yeelight.yeelib.models.C8316i;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;

@RequiresApi(api = 24)
public class YeelightQuickSettingTurnOnService extends TileService {
    public static final String TAG = YeelightQuickSettingTurnOnService.class.getSimpleName();

    public void onClick() {
        C8263d.m19484t().mo35189k(new C8316i("type_group", (String) null, ActionType.TURN_ON_ALL, (String) null), new C8263d.C8271h() {
            public void tokenOauthFailed() {
                new Thread() {
                    public void run() {
                        new Handler(Looper.getMainLooper()).post(new Runnable() {
                            public void run() {
                                YeelightQuickSettingTurnOnService yeelightQuickSettingTurnOnService = YeelightQuickSettingTurnOnService.this;
                                Toast.makeText(yeelightQuickSettingTurnOnService, yeelightQuickSettingTurnOnService.getText(R$string.account_login_ouath_failed_info), 0).show();
                            }
                        });
                    }
                }.start();
                BaseActivity.m19947U(YeelightQuickSettingTurnOnService.this);
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
