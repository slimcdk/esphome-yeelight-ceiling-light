package com.google.p017ar.sceneform.p018ux;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.p017ar.core.AugmentedFace;
import com.google.p017ar.core.Pose;
import com.google.p017ar.core.TrackingState;
import com.google.p017ar.sceneform.FrameTime;
import com.google.p017ar.sceneform.Node;
import com.google.p017ar.sceneform.Scene;
import com.google.p017ar.sceneform.SkeletonNode;
import com.google.p017ar.sceneform.math.Quaternion;
import com.google.p017ar.sceneform.math.Vector3;
import com.google.p017ar.sceneform.rendering.Material;
import com.google.p017ar.sceneform.rendering.ModelRenderable;
import com.google.p017ar.sceneform.rendering.Renderable;
import com.google.p017ar.sceneform.rendering.RenderableDefinition;
import com.google.p017ar.sceneform.rendering.Texture;
import com.google.p017ar.sceneform.rendering.Vertex;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.ar.sceneform.ux.AugmentedFaceNode */
public class AugmentedFaceNode extends Node {
    private static final int FACE_MESH_RENDER_PRIORITY = Math.max(0, 3);
    private static final String FACE_MESH_TEXTURE_MATERIAL_PARAMETER = "texture";
    private static final String TAG = "AugmentedFaceNode";
    @Nullable
    private AugmentedFace augmentedFace;
    @Nullable
    private Material defaultFaceMeshMaterial;
    private final RenderableDefinition faceMeshDefinition;
    private final Node faceMeshNode;
    @Nullable
    private Material faceMeshOccluderMaterial;
    @Nullable
    private ModelRenderable faceMeshRenderable;
    @Nullable
    private Texture faceMeshTexture;
    private final SkeletonNode faceRegionsSkeletonNode;
    @Nullable
    private Material overrideFaceMeshMaterial;
    private final ArrayList<RenderableDefinition.Submesh> submeshes;
    private final ArrayList<Integer> triangleIndices;
    private final ArrayList<Vertex> vertices;

    public AugmentedFaceNode() {
        this.vertices = new ArrayList<>();
        this.triangleIndices = new ArrayList<>();
        this.submeshes = new ArrayList<>();
        Node node = new Node();
        this.faceMeshNode = node;
        node.setParent(this);
        SkeletonNode skeletonNode = new SkeletonNode();
        this.faceRegionsSkeletonNode = skeletonNode;
        skeletonNode.setParent(this);
        for (AugmentedFace.RegionType boneNameForRegion : AugmentedFace.RegionType.values()) {
            Node node2 = new Node();
            node2.setParent(this.faceRegionsSkeletonNode);
            this.faceRegionsSkeletonNode.setBoneAttachment(boneNameForRegion(boneNameForRegion), node2);
        }
        this.faceMeshDefinition = RenderableDefinition.builder().setVertices(this.vertices).setSubmeshes(this.submeshes).build();
    }

    public AugmentedFaceNode(AugmentedFace augmentedFace2) {
        this();
        this.augmentedFace = augmentedFace2;
    }

    private static String boneNameForRegion(AugmentedFace.RegionType regionType) {
        return regionType.name();
    }

    private static <T> T checkNotNull(@Nullable T t) {
        Objects.requireNonNull(t);
        return t;
    }

    @Nullable
    private Material getFaceMeshMaterial() {
        Material material = this.overrideFaceMeshMaterial;
        return material != null ? material : this.defaultFaceMeshMaterial;
    }

    private boolean isTracking() {
        AugmentedFace augmentedFace2 = this.augmentedFace;
        return augmentedFace2 != null && augmentedFace2.getTrackingState() == TrackingState.TRACKING;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$onActivate$0(ModelRenderable modelRenderable, Throwable th) {
        if (th != null) {
            return Boolean.FALSE;
        }
        this.defaultFaceMeshMaterial = modelRenderable.getMaterial();
        updateSubmeshes();
        return Boolean.TRUE;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$onActivate$1(ModelRenderable modelRenderable, Throwable th) {
        if (th != null) {
            return Boolean.FALSE;
        }
        this.faceMeshOccluderMaterial = modelRenderable.getMaterial();
        updateSubmeshes();
        return Boolean.TRUE;
    }

    private void updateFaceMesh() {
        if (this.defaultFaceMeshMaterial != null && this.faceMeshOccluderMaterial != null) {
            updateFaceMeshVerticesAndTriangles();
            ModelRenderable modelRenderable = this.faceMeshRenderable;
            if (modelRenderable == null) {
                try {
                    ModelRenderable modelRenderable2 = (ModelRenderable) ((ModelRenderable.Builder) ModelRenderable.builder().setSource((RenderableDefinition) checkNotNull(this.faceMeshDefinition))).build().get();
                    this.faceMeshRenderable = modelRenderable2;
                    modelRenderable2.setRenderPriority(FACE_MESH_RENDER_PRIORITY);
                } catch (InterruptedException | ExecutionException unused) {
                }
                ((ModelRenderable) checkNotNull(this.faceMeshRenderable)).setShadowReceiver(false);
                ((ModelRenderable) checkNotNull(this.faceMeshRenderable)).setShadowCaster(false);
                this.faceMeshNode.setRenderable(this.faceMeshRenderable);
                return;
            }
            modelRenderable.updateFromDefinition((RenderableDefinition) checkNotNull(this.faceMeshDefinition));
        }
    }

    private void updateFaceMeshVerticesAndTriangles() {
        FloatBuffer floatBuffer;
        AugmentedFace augmentedFace2 = (AugmentedFace) checkNotNull(this.augmentedFace);
        FloatBuffer meshVertices = augmentedFace2.getMeshVertices();
        meshVertices.rewind();
        int limit = meshVertices.limit() / 3;
        FloatBuffer meshTextureCoordinates = augmentedFace2.getMeshTextureCoordinates();
        meshTextureCoordinates.rewind();
        int limit2 = meshTextureCoordinates.limit() / 2;
        FloatBuffer meshNormals = augmentedFace2.getMeshNormals();
        meshNormals.rewind();
        int limit3 = meshNormals.limit() / 3;
        if (limit == limit2 && limit == limit3) {
            this.vertices.ensureCapacity(limit);
            int i = 0;
            while (i < limit) {
                float f = meshVertices.get();
                float f2 = meshVertices.get();
                float f3 = meshVertices.get();
                float f4 = meshNormals.get();
                float f5 = meshNormals.get();
                float f6 = meshNormals.get();
                float f7 = meshTextureCoordinates.get();
                float f8 = meshTextureCoordinates.get();
                if (i < this.vertices.size()) {
                    Vertex vertex = this.vertices.get(i);
                    floatBuffer = meshVertices;
                    ((Vector3) checkNotNull(vertex.getPosition())).set(f, f2, f3);
                    ((Vector3) checkNotNull(vertex.getNormal())).set(f4, f5, f6);
                    Vertex.UvCoordinate uvCoordinate = (Vertex.UvCoordinate) checkNotNull(vertex.getUvCoordinate());
                    uvCoordinate.f3347x = f7;
                    uvCoordinate.f3348y = f8;
                } else {
                    floatBuffer = meshVertices;
                    this.vertices.add(Vertex.builder().setPosition(new Vector3(f, f2, f3)).setNormal(new Vector3(f4, f5, f6)).setUvCoordinate(new Vertex.UvCoordinate(f7, f8)).build());
                }
                i++;
                meshVertices = floatBuffer;
            }
            while (this.vertices.size() > limit) {
                ArrayList<Vertex> arrayList = this.vertices;
                arrayList.remove(arrayList.size() - 1);
            }
            ShortBuffer meshTriangleIndices = augmentedFace2.getMeshTriangleIndices();
            meshTriangleIndices.rewind();
            if (this.triangleIndices.size() != meshTriangleIndices.limit()) {
                this.triangleIndices.clear();
                this.triangleIndices.ensureCapacity(meshTriangleIndices.limit());
                while (meshTriangleIndices.hasRemaining()) {
                    this.triangleIndices.add(Integer.valueOf(meshTriangleIndices.get()));
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("AugmentedFace must have the same number of vertices, normals, and texture coordinates.");
    }

    private void updateRegionNodes() {
        for (AugmentedFace.RegionType regionType : AugmentedFace.RegionType.values()) {
            Node node = (Node) checkNotNull(this.faceRegionsSkeletonNode.getBoneAttachment(boneNameForRegion(regionType)));
            Pose regionPose = ((AugmentedFace) checkNotNull(this.augmentedFace)).getRegionPose(regionType);
            node.setWorldPosition(new Vector3(regionPose.mo16574tx(), regionPose.mo16575ty(), regionPose.mo16576tz()));
            node.setWorldRotation(Quaternion.multiply(new Quaternion(regionPose.mo16565qx(), regionPose.mo16566qy(), regionPose.mo16567qz(), regionPose.mo16564qw()), new Quaternion(new Vector3(0.0f, 1.0f, 0.0f), 180.0f)));
        }
    }

    private void updateSubmeshes() {
        Material faceMeshMaterial = getFaceMeshMaterial();
        if (this.defaultFaceMeshMaterial != null && faceMeshMaterial != null) {
            Material material = (Material) checkNotNull(faceMeshMaterial);
            this.submeshes.clear();
            this.submeshes.add(RenderableDefinition.Submesh.builder().setTriangleIndices(this.triangleIndices).setMaterial((Material) checkNotNull(this.faceMeshOccluderMaterial)).build());
            Texture texture = this.faceMeshTexture;
            if (texture != null) {
                if (material == this.defaultFaceMeshMaterial) {
                    material.setTexture("texture", texture);
                }
                this.submeshes.add(RenderableDefinition.Submesh.builder().setTriangleIndices(this.triangleIndices).setMaterial(material).build());
            }
        }
    }

    private void updateTransform() {
        Pose centerPose = ((AugmentedFace) checkNotNull(this.augmentedFace)).getCenterPose();
        setWorldPosition(new Vector3(centerPose.mo16574tx(), centerPose.mo16575ty(), centerPose.mo16576tz()));
        setWorldRotation(new Quaternion(centerPose.mo16565qx(), centerPose.mo16566qy(), centerPose.mo16567qz(), centerPose.mo16564qw()));
    }

    @Nullable
    public AugmentedFace getAugmentedFace() {
        return this.augmentedFace;
    }

    @Nullable
    public Material getFaceMeshMaterialOverride() {
        return this.overrideFaceMeshMaterial;
    }

    @Nullable
    public Texture getFaceMeshTexture() {
        return this.faceMeshTexture;
    }

    @Nullable
    public ModelRenderable getFaceRegionsRenderable() {
        Renderable renderable = this.faceRegionsSkeletonNode.getRenderable();
        if (renderable == null || (renderable instanceof ModelRenderable)) {
            return (ModelRenderable) renderable;
        }
        throw new IllegalStateException("Face Regions Renderable must be a ModelRenderable.");
    }

    public void onActivate() {
        Context context = ((Scene) checkNotNull(getScene())).getView().getContext();
        ((ModelRenderable.Builder) ModelRenderable.builder().setSource(context, C2177R.raw.sceneform_face_mesh)).build().handle(new C2182b(this));
        ((ModelRenderable.Builder) ModelRenderable.builder().setSource(context, C2177R.raw.sceneform_face_mesh_occluder)).build().handle(new C2181a(this));
    }

    public void onUpdate(FrameTime frameTime) {
        boolean isTracking = isTracking();
        this.faceMeshNode.setEnabled(isTracking);
        this.faceRegionsSkeletonNode.setEnabled(isTracking);
        if (isTracking) {
            updateTransform();
            updateRegionNodes();
            updateFaceMesh();
        }
    }

    public void setAugmentedFace(@Nullable AugmentedFace augmentedFace2) {
        this.augmentedFace = augmentedFace2;
    }

    public void setFaceMeshMaterialOverride(@Nullable Material material) {
        this.overrideFaceMeshMaterial = material;
        updateSubmeshes();
    }

    public void setFaceMeshTexture(@Nullable Texture texture) {
        this.faceMeshTexture = texture;
        updateSubmeshes();
    }

    public void setFaceRegionsRenderable(@Nullable ModelRenderable modelRenderable) {
        this.faceRegionsSkeletonNode.setRenderable(modelRenderable);
    }
}
