package com.google.p017ar.sceneform.rendering;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.google.android.filament.Stream;
import com.google.android.filament.Texture;
import com.google.p017ar.sceneform.utilities.AndroidPreconditions;
import com.google.p017ar.sceneform.utilities.Preconditions;

/* renamed from: com.google.ar.sceneform.rendering.ExternalTexture */
public class ExternalTexture {
    private static final String TAG = "ExternalTexture";
    @Nullable
    private Stream filamentStream;
    @Nullable
    private Texture filamentTexture;
    @Nullable
    private final Surface surface;
    @Nullable
    private final SurfaceTexture surfaceTexture;

    /* renamed from: com.google.ar.sceneform.rendering.ExternalTexture$a */
    private static final class C2083a implements Runnable {
        @Nullable

        /* renamed from: a */
        private final Texture f3289a;
        @Nullable

        /* renamed from: b */
        private final Stream f3290b;

        C2083a(Texture texture, Stream stream) {
            this.f3289a = texture;
            this.f3290b = stream;
        }

        public void run() {
            AndroidPreconditions.checkUiThread();
            IEngine engine = EngineInstance.getEngine();
            if (engine != null && engine.isValid()) {
                Texture texture = this.f3289a;
                if (texture != null) {
                    engine.destroyTexture(texture);
                }
                Stream stream = this.f3290b;
                if (stream != null) {
                    engine.destroyStream(stream);
                }
            }
        }
    }

    public ExternalTexture() {
        SurfaceTexture surfaceTexture2 = new SurfaceTexture(0);
        surfaceTexture2.detachFromGLContext();
        this.surfaceTexture = surfaceTexture2;
        this.surface = new Surface(surfaceTexture2);
        initialize(new Stream.Builder().stream((Object) surfaceTexture2).build(EngineInstance.getEngine().getFilamentEngine()));
    }

    ExternalTexture(int i, int i2, int i3) {
        this.surfaceTexture = null;
        this.surface = null;
        initialize(new Stream.Builder().stream((long) i).width(i2).height(i3).build(EngineInstance.getEngine().getFilamentEngine()));
    }

    private void initialize(Stream stream) {
        if (this.filamentTexture == null) {
            IEngine engine = EngineInstance.getEngine();
            this.filamentStream = stream;
            Texture.Sampler sampler = Texture.Sampler.SAMPLER_EXTERNAL;
            Texture build = new Texture.Builder().sampler(sampler).format(Texture.InternalFormat.RGB8).build(engine.getFilamentEngine());
            this.filamentTexture = build;
            build.setExternalStream(engine.getFilamentEngine(), stream);
            ResourceManager.getInstance().getExternalTextureCleanupRegistry().register(this, new C2083a(this.filamentTexture, stream));
            return;
        }
        throw new AssertionError("Stream was initialized twice");
    }

    /* access modifiers changed from: package-private */
    public Stream getFilamentStream() {
        return (Stream) Preconditions.checkNotNull(this.filamentStream);
    }

    /* access modifiers changed from: package-private */
    public Texture getFilamentTexture() {
        return (Texture) Preconditions.checkNotNull(this.filamentTexture);
    }

    public Surface getSurface() {
        return (Surface) Preconditions.checkNotNull(this.surface);
    }

    public SurfaceTexture getSurfaceTexture() {
        return (SurfaceTexture) Preconditions.checkNotNull(this.surfaceTexture);
    }
}
