package com.yeelight.yeelib_tasker.p196ui;

import android.annotation.TargetApi;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib_tasker.R$id;
import com.yeelight.yeelib_tasker.R$menu;
import com.yeelight.yeelib_tasker.R$string;
import p011c.p101f.p102a.C1255a;

/* renamed from: com.yeelight.yeelib_tasker.ui.AbstractPluginActivity */
public abstract class AbstractPluginActivity extends BaseActivity {

    /* renamed from: b */
    private boolean f20208b = false;

    @TargetApi(11)
    /* renamed from: W */
    private void m25881W() {
        getActionBar().setSubtitle(C1255a.m3241a(getApplicationContext(), getIntent(), getString(R$string.plugin_name)));
    }

    @TargetApi(14)
    /* renamed from: X */
    private void m25882X() {
        getActionBar().setDisplayHomeAsUpEnabled(true);
        try {
            getActionBar().setIcon(getPackageManager().getApplicationIcon(getCallingPackage()));
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    @TargetApi(11)
    /* renamed from: Y */
    private void m25883Y() {
        CharSequence charSequence;
        try {
            charSequence = getPackageManager().getApplicationLabel(getPackageManager().getApplicationInfo(getCallingPackage(), 0));
        } catch (PackageManager.NameNotFoundException unused) {
            charSequence = null;
        }
        if (charSequence != null) {
            setTitle(charSequence);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public boolean mo33408V() {
        return this.f20208b;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 11) {
            m25883Y();
        } else {
            setTitle(C1255a.m3241a(getApplicationContext(), getIntent(), getString(R$string.plugin_name)));
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R$menu.twofortyfouram_locale_help_save_dontsave, menu);
        if (Build.VERSION.SDK_INT >= 11) {
            m25881W();
        }
        if (Build.VERSION.SDK_INT < 14) {
            return true;
        }
        m25882X();
        return true;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (16908332 == itemId) {
            finish();
            return true;
        } else if (R$id.twofortyfouram_locale_menu_dontsave == itemId) {
            this.f20208b = true;
            finish();
            return true;
        } else if (R$id.twofortyfouram_locale_menu_save != itemId) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            finish();
            return true;
        }
    }
}
