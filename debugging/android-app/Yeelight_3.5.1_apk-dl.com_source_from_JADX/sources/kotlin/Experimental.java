package kotlin;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.Retention;
import kotlin.annotation.Target;

@SinceKotlin(version = "1.2")
@Target(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS})
@Retention(AnnotationRetention.BINARY)
@java.lang.annotation.Target({ElementType.ANNOTATION_TYPE})
@DeprecatedSinceKotlin(errorSince = "1.6", warningSince = "1.4")
@Deprecated(message = "Please use RequiresOptIn instead.")
@java.lang.annotation.Retention(RetentionPolicy.CLASS)
public @interface Experimental {

    public enum Level {
        WARNING,
        ERROR
    }

    Level level() default Level.ERROR;
}
