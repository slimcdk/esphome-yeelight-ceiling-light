package com.google.p107ar.sceneform.rendering;

import androidx.annotation.Nullable;
import com.google.android.filament.Material;

/* renamed from: com.google.ar.sceneform.rendering.MaterialInternalDataGltfImpl */
public class MaterialInternalDataGltfImpl extends MaterialInternalData {
    @Nullable
    private final Material filamentMaterial;

    MaterialInternalDataGltfImpl(Material material) {
        this.filamentMaterial = material;
    }

    /* access modifiers changed from: package-private */
    public Material getFilamentMaterial() {
        Material material = this.filamentMaterial;
        if (material != null) {
            return material;
        }
        throw new IllegalStateException("Filament Material is null.");
    }

    /* access modifiers changed from: protected */
    public void onDispose() {
    }
}
