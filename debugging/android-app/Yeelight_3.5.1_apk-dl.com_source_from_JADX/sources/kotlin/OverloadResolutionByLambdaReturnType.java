package kotlin;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.Retention;
import kotlin.experimental.ExperimentalTypeInference;

@SinceKotlin(version = "1.4")
@Target({ElementType.METHOD})
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FUNCTION})
@Retention(AnnotationRetention.BINARY)
@ExperimentalTypeInference
@java.lang.annotation.Retention(RetentionPolicy.CLASS)
public @interface OverloadResolutionByLambdaReturnType {
}
