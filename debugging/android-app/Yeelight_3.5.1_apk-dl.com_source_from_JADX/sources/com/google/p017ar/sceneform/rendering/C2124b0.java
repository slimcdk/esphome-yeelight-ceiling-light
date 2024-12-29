package com.google.p017ar.sceneform.rendering;

import androidx.annotation.Nullable;
import com.google.android.filament.Material;
import com.google.p017ar.sceneform.utilities.AndroidPreconditions;

/* renamed from: com.google.ar.sceneform.rendering.b0 */
class C2124b0 extends MaterialInternalData {
    @Nullable

    /* renamed from: a */
    private Material f3360a;

    C2124b0(Material material) {
        this.f3360a = material;
    }

    /* access modifiers changed from: package-private */
    public Material getFilamentMaterial() {
        Material material = this.f3360a;
        if (material != null) {
            return material;
        }
        throw new IllegalStateException("Filament Material is null.");
    }

    /* access modifiers changed from: protected */
    public void onDispose() {
        AndroidPreconditions.checkUiThread();
        IEngine engine = EngineInstance.getEngine();
        Material material = this.f3360a;
        this.f3360a = null;
        if (material != null && engine != null && engine.isValid()) {
            engine.destroyMaterial(material);
        }
    }
}
