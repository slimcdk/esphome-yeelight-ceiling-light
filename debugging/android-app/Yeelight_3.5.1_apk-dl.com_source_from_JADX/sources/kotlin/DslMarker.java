package kotlin;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.MustBeDocumented;
import kotlin.annotation.Retention;
import kotlin.annotation.Target;

@MustBeDocumented
@SinceKotlin(version = "1.1")
@Target(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS})
@Retention(AnnotationRetention.BINARY)
@Documented
@java.lang.annotation.Target({ElementType.ANNOTATION_TYPE})
@java.lang.annotation.Retention(RetentionPolicy.CLASS)
public @interface DslMarker {
}
