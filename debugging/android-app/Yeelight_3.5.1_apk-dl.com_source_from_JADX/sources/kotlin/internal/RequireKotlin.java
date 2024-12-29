package kotlin.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import kotlin.DeprecationLevel;
import kotlin.SinceKotlin;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.Repeatable;
import kotlin.annotation.Retention;
import kotlin.annotation.Target;
import kotlin.jvm.internal.RepeatableContainer;

@SinceKotlin(version = "1.2")
@Target(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY, AnnotationTarget.CONSTRUCTOR, AnnotationTarget.TYPEALIAS})
@Repeatable
@java.lang.annotation.Repeatable(Container.class)
@Retention(AnnotationRetention.SOURCE)
@java.lang.annotation.Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@java.lang.annotation.Retention(RetentionPolicy.SOURCE)
public @interface RequireKotlin {

    @Target(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY, AnnotationTarget.CONSTRUCTOR, AnnotationTarget.TYPEALIAS})
    @Retention(AnnotationRetention.SOURCE)
    @RepeatableContainer
    @java.lang.annotation.Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
    @java.lang.annotation.Retention(RetentionPolicy.SOURCE)
    public @interface Container {
        RequireKotlin[] value();
    }

    int errorCode() default -1;

    DeprecationLevel level() default DeprecationLevel.ERROR;

    String message() default "";

    String version();

    RequireKotlinVersionKind versionKind() default RequireKotlinVersionKind.LANGUAGE_VERSION;
}
