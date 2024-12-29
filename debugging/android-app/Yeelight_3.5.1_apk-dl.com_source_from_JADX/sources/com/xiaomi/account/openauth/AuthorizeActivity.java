package com.xiaomi.account.openauth;

import android.app.ActionBar;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

public class AuthorizeActivity extends AuthorizeActivityBase {
    @Deprecated
    public static int RESULT_CANCEL = AuthorizeActivityBase.RESULT_CANCEL;
    @Deprecated
    public static int RESULT_FAIL = AuthorizeActivityBase.RESULT_FAIL;
    @Deprecated
    public static int RESULT_SUCCESS = AuthorizeActivityBase.RESULT_SUCCESS;
    private ImageView mBackImageView;
    private ProgressBar mProgressBar;
    private MenuItem mRefreshItem;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!isFinishing() && !super.isMiddleActivityMode()) {
            final WebView webView = super.getWebView();
            ActionBar actionBar = getActionBar();
            if (actionBar != null) {
                actionBar.setDisplayOptions(16);
                actionBar.setCustomView(C4399R.layout.actionbar_custom);
                ImageView imageView = (ImageView) actionBar.getCustomView().findViewById(C4399R.C4401id.back_iv);
                this.mBackImageView = imageView;
                imageView.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View view) {
                        if (webView.canGoBack()) {
                            webView.goBack();
                        } else {
                            AuthorizeActivity.this.setResultAndFinish(AuthorizeActivity.RESULT_CANCEL, (Bundle) null);
                        }
                    }
                });
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            relativeLayout.addView(webView, new ViewGroup.LayoutParams(-1, -1));
            ProgressBar progressBar = new ProgressBar(this, (AttributeSet) null, 16842872);
            this.mProgressBar = progressBar;
            relativeLayout.addView(progressBar, new ViewGroup.LayoutParams(-1, -2));
            setContentView(relativeLayout);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (!isFinishing() && !super.isMiddleActivityMode()) {
            MenuItem add = menu.add("refresh");
            this.mRefreshItem = add;
            add.setIcon(17301629);
            this.mRefreshItem.setShowAsActionFlags(2);
            this.mRefreshItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                public boolean onMenuItemClick(MenuItem menuItem) {
                    AuthorizeActivity.this.refreshWebView();
                    return true;
                }
            });
            this.mRefreshItem.setVisible(false);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onHideErrorUI() {
        MenuItem menuItem = this.mRefreshItem;
        if (menuItem != null) {
            menuItem.setVisible(false);
        }
    }

    /* access modifiers changed from: protected */
    public void onHideProgress() {
        ProgressBar progressBar = this.mProgressBar;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    public void onShowErrorUI() {
        MenuItem menuItem = this.mRefreshItem;
        if (menuItem != null) {
            menuItem.setVisible(true);
        }
    }

    /* access modifiers changed from: protected */
    public void onShowProgress() {
        ProgressBar progressBar = this.mProgressBar;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    public void onUpdateProgress(int i) {
        ProgressBar progressBar = this.mProgressBar;
        if (progressBar != null) {
            progressBar.setProgress(i);
        }
    }
}
