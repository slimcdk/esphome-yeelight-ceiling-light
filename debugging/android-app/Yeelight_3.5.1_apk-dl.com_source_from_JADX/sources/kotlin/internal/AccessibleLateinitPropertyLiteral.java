package kotlin.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.SinceKotlin;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.Retention;

@SinceKotlin(version = "1.2")
@Target({ElementType.PARAMETER})
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.VALUE_PARAMETER})
@Retention(AnnotationRetention.BINARY)
@java.lang.annotation.Retention(RetentionPolicy.CLASS)
public @interface AccessibleLateinitPropertyLiteral {
}
