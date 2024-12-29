package com.yeelight.cherry.p177ui.fragment;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.annotation.Nullable;
import com.google.p107ar.core.Config;
import com.google.p107ar.core.Session;
import com.google.p107ar.sceneform.p108ux.ArFragment;

/* renamed from: com.yeelight.cherry.ui.fragment.AugmentedImageFragment */
public class AugmentedImageFragment extends ArFragment {
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
        if (r0 != null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003d, code lost:
        throw r5;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m17314u(com.google.p107ar.core.Config r4, com.google.p107ar.core.Session r5) {
        /*
            r3 = this;
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L_0x000f
            android.content.Context r0 = r3.getContext()
            android.content.res.AssetManager r0 = r0.getAssets()
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            r1 = 0
            if (r0 != 0) goto L_0x0014
            return r1
        L_0x0014:
            android.content.Context r0 = r3.getContext()     // Catch:{ IOException -> 0x003e }
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch:{ IOException -> 0x003e }
            java.lang.String r2 = "database.imgdb"
            java.io.InputStream r0 = r0.open(r2)     // Catch:{ IOException -> 0x003e }
            com.google.ar.core.AugmentedImageDatabase r5 = com.google.p107ar.core.AugmentedImageDatabase.deserialize(r5, r0)     // Catch:{ all -> 0x0030 }
            if (r0 == 0) goto L_0x002b
            r0.close()     // Catch:{ IOException -> 0x003e }
        L_0x002b:
            r4.setAugmentedImageDatabase(r5)
            r4 = 1
            return r4
        L_0x0030:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r5 = move-exception
            if (r0 == 0) goto L_0x003d
            r0.close()     // Catch:{ all -> 0x0039 }
            goto L_0x003d
        L_0x0039:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch:{ IOException -> 0x003e }
        L_0x003d:
            throw r5     // Catch:{ IOException -> 0x003e }
        L_0x003e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p177ui.fragment.AugmentedImageFragment.m17314u(com.google.ar.core.Config, com.google.ar.core.Session):boolean");
    }

    /* access modifiers changed from: protected */
    public Config getSessionConfiguration(Session session) {
        Config sessionConfiguration = super.getSessionConfiguration(session);
        if (!m17314u(sessionConfiguration, session)) {
            Toast.makeText(getContext(), "Could not setup augmented image database", 0);
        }
        return sessionConfiguration;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (Build.VERSION.SDK_INT < 24) {
            Toast.makeText(context, "Sceneform requires Android N or later", 0);
        }
        if (Double.parseDouble(((ActivityManager) context.getSystemService("activity")).getDeviceConfigurationInfo().getGlEsVersion()) < 3.0d) {
            Toast.makeText(context, "Sceneform requires OpenGL ES 3.0 or later", 0);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        getPlaneDiscoveryController().hide();
        getPlaneDiscoveryController().setInstructionView((View) null);
        getArSceneView().getPlaneRenderer().setEnabled(false);
        return onCreateView;
    }
}
