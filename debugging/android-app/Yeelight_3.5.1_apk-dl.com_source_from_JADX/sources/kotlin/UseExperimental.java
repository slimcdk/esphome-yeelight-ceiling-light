package kotlin;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.Retention;
import kotlin.annotation.Target;

@SinceKotlin(version = "1.2")
@Target(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.PROPERTY, AnnotationTarget.LOCAL_VARIABLE, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.CONSTRUCTOR, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER, AnnotationTarget.EXPRESSION, AnnotationTarget.FILE, AnnotationTarget.TYPEALIAS})
@Retention(AnnotationRetention.SOURCE)
@java.lang.annotation.Target({ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.LOCAL_VARIABLE})
@DeprecatedSinceKotlin(errorSince = "1.6", warningSince = "1.4")
@Deprecated(message = "Please use OptIn instead.", replaceWith = @ReplaceWith(expression = "OptIn(*markerClass)", imports = {"kotlin.OptIn"}))
@java.lang.annotation.Retention(RetentionPolicy.SOURCE)
public @interface UseExperimental {
    Class<? extends Annotation>[] markerClass();
}
