package com.yeelight.cherry.p141ui.fragment;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.annotation.Nullable;
import com.google.p017ar.core.AugmentedImageDatabase;
import com.google.p017ar.core.Config;
import com.google.p017ar.core.Session;
import com.google.p017ar.sceneform.p018ux.ArFragment;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.yeelight.cherry.ui.fragment.AugmentedImageFragment */
public class AugmentedImageFragment extends ArFragment {
    /* renamed from: z */
    private boolean m17357z(Config config, Session session) {
        InputStream open;
        if ((getContext() != null ? getContext().getAssets() : null) == null) {
            return false;
        }
        try {
            open = getContext().getAssets().open("database.imgdb");
            AugmentedImageDatabase deserialize = AugmentedImageDatabase.deserialize(session, open);
            if (open != null) {
                open.close();
            }
            config.setAugmentedImageDatabase(deserialize);
            return true;
        } catch (IOException unused) {
            return false;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* access modifiers changed from: protected */
    public Config getSessionConfiguration(Session session) {
        Config sessionConfiguration = super.getSessionConfiguration(session);
        if (!m17357z(sessionConfiguration, session)) {
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
