package com.google.p107ar.sceneform.p108ux;

import android.view.View;
import androidx.annotation.Nullable;

/* renamed from: com.google.ar.sceneform.ux.PlaneDiscoveryController */
public class PlaneDiscoveryController {
    @Nullable
    private View planeDiscoveryView;

    public PlaneDiscoveryController(@Nullable View view) {
        this.planeDiscoveryView = view;
    }

    public void hide() {
        View view = this.planeDiscoveryView;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public void setInstructionView(View view) {
        this.planeDiscoveryView = view;
    }

    public void show() {
        View view = this.planeDiscoveryView;
        if (view != null) {
            view.setVisibility(0);
        }
    }
}
