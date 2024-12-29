package com.yeelight.cherry.utils;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.RequiresApi;
import com.google.p017ar.core.AugmentedImage;
import com.google.p017ar.sceneform.AnchorNode;
import com.google.p017ar.sceneform.Node;
import com.google.p017ar.sceneform.math.Vector3;
import com.google.p017ar.sceneform.rendering.ModelRenderable;
import java.util.concurrent.CompletableFuture;

/* renamed from: com.yeelight.cherry.utils.c */
public class C6029c extends AnchorNode {

    /* renamed from: b */
    private static CompletableFuture<ModelRenderable> f12234b;

    /* renamed from: c */
    private static CompletableFuture<ModelRenderable> f12235c;

    /* renamed from: d */
    private static CompletableFuture<ModelRenderable> f12236d;

    /* renamed from: e */
    private static CompletableFuture<ModelRenderable> f12237e;

    /* renamed from: a */
    private AugmentedImage f12238a;

    @RequiresApi(api = 24)
    public C6029c(Context context) {
        if (f12234b == null) {
            f12234b = ((ModelRenderable.Builder) ModelRenderable.builder().setSource(context, Uri.parse("models/frame_upper_left.sfb"))).build();
            f12235c = ((ModelRenderable.Builder) ModelRenderable.builder().setSource(context, Uri.parse("models/frame_upper_right.sfb"))).build();
            f12237e = ((ModelRenderable.Builder) ModelRenderable.builder().setSource(context, Uri.parse("models/frame_lower_left.sfb"))).build();
            f12236d = ((ModelRenderable.Builder) ModelRenderable.builder().setSource(context, Uri.parse("models/frame_lower_right.sfb"))).build();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m17556c(AugmentedImage augmentedImage, Void voidR) {
        mo31411e(augmentedImage);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ Void m17557d(Throwable th) {
        return null;
    }

    @RequiresApi(api = 24)
    /* renamed from: e */
    public void mo31411e(AugmentedImage augmentedImage) {
        this.f12238a = augmentedImage;
        if (!f12234b.isDone() || !f12235c.isDone() || !f12237e.isDone() || !f12236d.isDone()) {
            CompletableFuture.allOf(new CompletableFuture[]{f12234b, f12235c, f12237e, f12236d}).thenAccept(new C6027a(this, augmentedImage)).exceptionally(C6028b.f12233a);
        }
        setAnchor(augmentedImage.createAnchor(augmentedImage.getCenterPose()));
        Vector3 vector3 = new Vector3();
        vector3.set(augmentedImage.getExtentX() * -0.5f, 0.0f, augmentedImage.getExtentZ() * -0.5f);
        Node node = new Node();
        node.setParent(this);
        node.setLocalPosition(vector3);
        node.setRenderable(f12234b.getNow((Object) null));
        vector3.set(augmentedImage.getExtentX() * 0.5f, 0.0f, augmentedImage.getExtentZ() * -0.5f);
        Node node2 = new Node();
        node2.setParent(this);
        node2.setLocalPosition(vector3);
        node2.setRenderable(f12235c.getNow((Object) null));
        vector3.set(augmentedImage.getExtentX() * 0.5f, 0.0f, augmentedImage.getExtentZ() * 0.5f);
        Node node3 = new Node();
        node3.setParent(this);
        node3.setLocalPosition(vector3);
        node3.setRenderable(f12236d.getNow((Object) null));
        vector3.set(augmentedImage.getExtentX() * -0.5f, 0.0f, augmentedImage.getExtentZ() * 0.5f);
        Node node4 = new Node();
        node4.setParent(this);
        node4.setLocalPosition(vector3);
        node4.setRenderable(f12237e.getNow((Object) null));
    }
}
