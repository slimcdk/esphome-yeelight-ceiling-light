package com.google.p017ar.sceneform.rendering;

import com.google.android.filament.Material;
import com.google.p017ar.sceneform.resources.SharedReference;

/* renamed from: com.google.ar.sceneform.rendering.MaterialInternalData */
abstract class MaterialInternalData extends SharedReference {
    MaterialInternalData() {
    }

    /* access modifiers changed from: package-private */
    public abstract Material getFilamentMaterial();
}