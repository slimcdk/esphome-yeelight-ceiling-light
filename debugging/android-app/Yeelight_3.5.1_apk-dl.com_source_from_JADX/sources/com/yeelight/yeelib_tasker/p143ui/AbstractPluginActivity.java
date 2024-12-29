package com.yeelight.yeelib_tasker.p143ui;

import android.annotation.TargetApi;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib_tasker.R$id;
import com.yeelight.yeelib_tasker.R$menu;
import com.yeelight.yeelib_tasker.R$string;
import p184m3.C9545a;

/* renamed from: com.yeelight.yeelib_tasker.ui.AbstractPluginActivity */
public abstract class AbstractPluginActivity extends BaseActivity {

    /* renamed from: a */
    private boolean f16353a = false;

    @TargetApi(11)
    /* renamed from: W */
    private void m21271W() {
        getActionBar().setSubtitle(C9545a.m23213a(getApplicationContext(), getIntent(), getString(R$string.plugin_name)));
    }

    @TargetApi(14)
    /* renamed from: X */
    private void m21272X() {
        getActionBar().setDisplayHomeAsUpEnabled(true);
        try {
            getActionBar().setIcon(getPackageManager().getApplicationIcon(getCallingPackage()));
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    @TargetApi(11)
    /* renamed from: Y */
    private void m21273Y() {
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
    public boolean mo36679V() {
        return this.f16353a;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 11) {
            m21273Y();
        } else {
            setTitle(C9545a.m23213a(getApplicationContext(), getIntent(), getString(R$string.plugin_name)));
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R$menu.twofortyfouram_locale_help_save_dontsave, menu);
        int i = Build.VERSION.SDK_INT;
        if (i >= 11) {
            m21271W();
        }
        if (i < 14) {
            return true;
        }
        m21272X();
        return true;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (16908332 == itemId) {
            finish();
            return true;
        } else if (R$id.twofortyfouram_locale_menu_dontsave == itemId) {
            this.f16353a = true;
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
