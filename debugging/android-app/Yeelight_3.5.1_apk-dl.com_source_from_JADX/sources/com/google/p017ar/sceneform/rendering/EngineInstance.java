package com.google.p017ar.sceneform.rendering;

import android.opengl.EGLContext;
import androidx.annotation.Nullable;
import com.google.android.filament.Engine;
import com.google.android.filament.Filament;
import com.google.ar.sceneform.assets.Loader;

/* renamed from: com.google.ar.sceneform.rendering.EngineInstance */
public class EngineInstance {
    @Nullable
    private static IEngine engine = null;
    private static boolean filamentInitialized = false;
    @Nullable
    private static EGLContext glContext = null;
    private static boolean headlessEngine = false;

    private static void createEngine() {
        if (engine == null || glContext == null) {
            if (!filamentInitialized) {
                try {
                    Filament.init();
                    filamentInitialized = true;
                } catch (UnsatisfiedLinkError e) {
                    if (Loader.loadUnifiedJni()) {
                        filamentInitialized = true;
                    } else {
                        throw e;
                    }
                }
            }
            EGLContext makeContext = GLHelper.makeContext();
            glContext = makeContext;
            engine = new FilamentEngineWrapper(Engine.create((Object) makeContext));
            if (glContext == null) {
                throw new IllegalStateException("Filament Engine creation has failed.");
            }
        }
    }

    private static void createHeadlessEngine() {
        if (engine == null) {
            engine = new HeadlessEngineWrapper();
        }
    }

    public static void destroyEngine() {
        EGLContext eGLContext = glContext;
        if (eGLContext != null) {
            GLHelper.destroyContext(eGLContext);
            glContext = null;
        }
        IEngine iEngine = engine;
        if (iEngine != null) {
            iEngine.destroy();
            engine = null;
        }
    }

    public static void disableHeadlessEngine() {
        headlessEngine = false;
    }

    public static void enableHeadlessEngine() {
        headlessEngine = true;
    }

    public static IEngine getEngine() {
        if (!headlessEngine) {
            createEngine();
        } else {
            createHeadlessEngine();
        }
        IEngine iEngine = engine;
        if (iEngine != null) {
            return iEngine;
        }
        throw new IllegalStateException("Filament Engine creation has failed.");
    }

    public static EGLContext getGlContext() {
        createEngine();
        EGLContext eGLContext = glContext;
        if (eGLContext != null) {
            return eGLContext;
        }
        throw new IllegalStateException("Filament Engine creation has failed.");
    }

    public static boolean isHeadlessMode() {
        return headlessEngine;
    }
}
