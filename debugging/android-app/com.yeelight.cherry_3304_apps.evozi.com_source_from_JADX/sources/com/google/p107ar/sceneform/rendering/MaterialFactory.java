package com.google.p107ar.sceneform.rendering;

import android.content.Context;
import androidx.annotation.RequiresApi;
import java.util.concurrent.CompletableFuture;

@RequiresApi(api = 24)
/* renamed from: com.google.ar.sceneform.rendering.MaterialFactory */
public final class MaterialFactory {
    private static final float DEFAULT_METALLIC_PROPERTY = 0.0f;
    private static final float DEFAULT_REFLECTANCE_PROPERTY = 0.5f;
    private static final float DEFAULT_ROUGHNESS_PROPERTY = 0.4f;
    public static final String MATERIAL_COLOR = "color";
    public static final String MATERIAL_METALLIC = "metallic";
    public static final String MATERIAL_REFLECTANCE = "reflectance";
    public static final String MATERIAL_ROUGHNESS = "roughness";
    public static final String MATERIAL_TEXTURE = "texture";

    /* renamed from: a */
    static /* synthetic */ Material m8309a(Color color, Material material) {
        material.setFloat3("color", color);
        applyDefaultPbrParams(material);
        return material;
    }

    private static void applyDefaultPbrParams(Material material) {
        material.setFloat(MATERIAL_METALLIC, 0.0f);
        material.setFloat(MATERIAL_ROUGHNESS, DEFAULT_ROUGHNESS_PROPERTY);
        material.setFloat(MATERIAL_REFLECTANCE, DEFAULT_REFLECTANCE_PROPERTY);
    }

    /* renamed from: b */
    static /* synthetic */ Material m8310b(Texture texture, Material material) {
        material.setTexture("texture", texture);
        applyDefaultPbrParams(material);
        return material;
    }

    /* renamed from: c */
    static /* synthetic */ Material m8311c(Color color, Material material) {
        material.setFloat4("color", color);
        applyDefaultPbrParams(material);
        return material;
    }

    /* renamed from: d */
    static /* synthetic */ Material m8312d(Texture texture, Material material) {
        material.setTexture("texture", texture);
        applyDefaultPbrParams(material);
        return material;
    }

    public static CompletableFuture<Material> makeOpaqueWithColor(Context context, Color color) {
        return Material.builder().setSource(context, C2722R.raw.sceneform_opaque_colored_material).build().thenApply(new C2775u(color));
    }

    public static CompletableFuture<Material> makeOpaqueWithTexture(Context context, Texture texture) {
        return Material.builder().setSource(context, C2722R.raw.sceneform_opaque_textured_material).build().thenApply(new C2778x(texture));
    }

    public static CompletableFuture<Material> makeTransparentWithColor(Context context, Color color) {
        return Material.builder().setSource(context, C2722R.raw.sceneform_transparent_colored_material).build().thenApply(new C2776v(color));
    }

    public static CompletableFuture<Material> makeTransparentWithTexture(Context context, Texture texture) {
        return Material.builder().setSource(context, C2722R.raw.sceneform_transparent_textured_material).build().thenApply(new C2777w(texture));
    }
}
