package com.yeelight.cherry.p141ui.activity;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.annotation.RequiresApi;
import com.google.p017ar.core.HitResult;
import com.google.p017ar.core.Plane;
import com.google.p017ar.sceneform.AnchorNode;
import com.google.p017ar.sceneform.HitTestResult;
import com.google.p017ar.sceneform.NodeParent;
import com.google.p017ar.sceneform.math.Vector3;
import com.google.p017ar.sceneform.p018ux.ArFragment;
import com.google.p017ar.sceneform.p018ux.TransformableNode;
import com.google.p017ar.sceneform.rendering.Material;
import com.google.p017ar.sceneform.rendering.MaterialFactory;
import com.google.p017ar.sceneform.rendering.ModelRenderable;
import com.google.p017ar.sceneform.rendering.ShapeFactory;
import com.google.p017ar.sceneform.rendering.Texture;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import p051j4.C9193k;

/* renamed from: com.yeelight.cherry.ui.activity.ARCoreDemoActivity */
public class ARCoreDemoActivity extends BaseActivity {

    /* renamed from: a */
    ArFragment f9785a;

    /* renamed from: b */
    Button f9786b;

    /* renamed from: c */
    private ModelRenderable f9787c;

    /* renamed from: d */
    TransformableNode f9788d;

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public /* synthetic */ void m15762c0(Material material) {
        this.f9787c = ShapeFactory.makeSphere(0.1f, new Vector3(0.0f, 0.15f, 0.0f), material);
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public /* synthetic */ void m15763d0(Texture texture) {
        MaterialFactory.makeOpaqueWithTexture(this, texture).thenAccept(new C5740d(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public /* synthetic */ void m15764e0(View view) {
        TransformableNode transformableNode = this.f9788d;
        if (transformableNode != null) {
            transformableNode.setParent((NodeParent) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public /* synthetic */ void m15765f0(ModelRenderable modelRenderable) {
        this.f9787c = modelRenderable;
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public /* synthetic */ Void m15766g0(Throwable th) {
        Toast makeText = Toast.makeText(this, "Unable to load andy renderable", 1);
        makeText.setGravity(17, 0, 0);
        makeText.show();
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public /* synthetic */ void m15767h0(TransformableNode transformableNode, HitTestResult hitTestResult, MotionEvent motionEvent) {
        transformableNode.select();
        this.f9788d = transformableNode;
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public /* synthetic */ void m15768i0(HitResult hitResult, Plane plane, MotionEvent motionEvent) {
        if (this.f9787c != null) {
            AnchorNode anchorNode = new AnchorNode(hitResult.createAnchor());
            anchorNode.setParent(this.f9785a.getArSceneView().getScene());
            TransformableNode transformableNode = new TransformableNode(this.f9785a.getTransformationSystem());
            transformableNode.setParent(anchorNode);
            transformableNode.setRenderable(this.f9787c);
            transformableNode.getScaleController().setEnabled(false);
            transformableNode.select();
            this.f9788d = transformableNode;
            transformableNode.setOnTapListener(new C5728b(this, transformableNode));
        }
    }

    @RequiresApi(api = 24)
    /* renamed from: j0 */
    private void m15769j0() {
        Texture.builder().setSource(BitmapFactory.decodeResource(getResources(), 17170455)).build().thenAccept(new C5752f(this));
    }

    /* access modifiers changed from: protected */
    @RequiresApi(api = 24)
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_ar_core_demo);
        this.f9785a = (ArFragment) getSupportFragmentManager().findFragmentById(C12225R$id.ux_fragment);
        Button button = (Button) findViewById(C12225R$id.btn_delete_node);
        this.f9786b = button;
        button.setOnClickListener(new C5722a(this));
        ((ModelRenderable.Builder) ModelRenderable.builder().setSource((Context) this, Uri.parse("dysis_small.sfb"))).build().thenAccept(new C5746e(this)).exceptionally(new C5758g(this));
        m15769j0();
        this.f9785a.setOnTapArPlaneListener(new C5734c(this));
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
    }
}
