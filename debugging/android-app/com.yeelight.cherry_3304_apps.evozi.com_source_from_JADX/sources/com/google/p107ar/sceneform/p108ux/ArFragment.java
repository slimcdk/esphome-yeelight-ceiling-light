package com.google.p107ar.sceneform.p108ux;

import android.widget.Toast;
import com.google.p107ar.core.Config;
import com.google.p107ar.core.Session;
import com.google.p107ar.core.exceptions.UnavailableApkTooOldException;
import com.google.p107ar.core.exceptions.UnavailableArcoreNotInstalledException;
import com.google.p107ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.p107ar.core.exceptions.UnavailableException;
import com.google.p107ar.core.exceptions.UnavailableSdkTooOldException;
import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.ar.sceneform.ux.ArFragment */
public class ArFragment extends BaseArFragment {
    private static final String TAG = "StandardArFragment";

    public String[] getAdditionalPermissions() {
        return new String[0];
    }

    /* access modifiers changed from: protected */
    public Config getSessionConfiguration(Session session) {
        return new Config(session);
    }

    /* access modifiers changed from: protected */
    public Set<Session.Feature> getSessionFeatures() {
        return Collections.emptySet();
    }

    /* access modifiers changed from: protected */
    public void handleSessionException(UnavailableException unavailableException) {
        String str = unavailableException instanceof UnavailableArcoreNotInstalledException ? "Please install ARCore" : unavailableException instanceof UnavailableApkTooOldException ? "Please update ARCore" : unavailableException instanceof UnavailableSdkTooOldException ? "Please update this app" : unavailableException instanceof UnavailableDeviceNotCompatibleException ? "This device does not support AR" : "Failed to create AR session";
        if (str.length() != 0) {
            "Error: ".concat(str);
        } else {
            new String("Error: ");
        }
        Toast.makeText(requireActivity(), str, 1).show();
    }

    public boolean isArRequired() {
        return true;
    }
}
