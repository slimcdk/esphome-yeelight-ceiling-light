package com.google.p017ar.sceneform.rendering;

import androidx.annotation.Nullable;
import com.google.android.filament.Texture;
import com.google.p017ar.core.annotations.UsedByNative;
import com.google.p017ar.sceneform.rendering.Texture;
import com.google.p017ar.sceneform.resources.SharedReference;
import com.google.p017ar.sceneform.utilities.AndroidPreconditions;

@UsedByNative("material_java_wrappers.h")
/* renamed from: com.google.ar.sceneform.rendering.TextureInternalData */
public class TextureInternalData extends SharedReference {
    @Nullable
    private Texture filamentTexture;
    private final Texture.Sampler sampler;

    @UsedByNative("material_java_wrappers.h")
    public TextureInternalData(com.google.android.filament.Texture texture, Texture.Sampler sampler2) {
        this.filamentTexture = texture;
        this.sampler = sampler2;
    }

    /* access modifiers changed from: package-private */
    public com.google.android.filament.Texture getFilamentTexture() {
        com.google.android.filament.Texture texture = this.filamentTexture;
        if (texture != null) {
            return texture;
        }
        throw new IllegalStateException("Filament Texture is null.");
    }

    /* access modifiers changed from: package-private */
    public Texture.Sampler getSampler() {
        return this.sampler;
    }

    /* access modifiers changed from: protected */
    public void onDispose() {
        AndroidPreconditions.checkUiThread();
        IEngine engine = EngineInstance.getEngine();
        com.google.android.filament.Texture texture = this.filamentTexture;
        this.filamentTexture = null;
        if (texture != null && engine != null && engine.isValid()) {
            engine.destroyTexture(texture);
        }
    }
}
