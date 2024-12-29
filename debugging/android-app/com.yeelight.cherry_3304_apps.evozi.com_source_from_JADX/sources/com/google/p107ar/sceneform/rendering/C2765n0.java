package com.google.p107ar.sceneform.rendering;

import androidx.annotation.Nullable;
import com.google.android.filament.Material;
import com.google.p107ar.sceneform.utilities.AndroidPreconditions;

/* renamed from: com.google.ar.sceneform.rendering.n0 */
class C2765n0 extends MaterialInternalData {
    @Nullable

    /* renamed from: a */
    private Material f5336a;

    C2765n0(Material material) {
        this.f5336a = material;
    }

    /* access modifiers changed from: package-private */
    public Material getFilamentMaterial() {
        Material material = this.f5336a;
        if (material != null) {
            return material;
        }
        throw new IllegalStateException("Filament Material is null.");
    }

    /* access modifiers changed from: protected */
    public void onDispose() {
        AndroidPreconditions.checkUiThread();
        IEngine engine = EngineInstance.getEngine();
        Material material = this.f5336a;
        this.f5336a = null;
        if (material != null && engine != null && engine.isValid()) {
            engine.destroyMaterial(material);
        }
    }
}
