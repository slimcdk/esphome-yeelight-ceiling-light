package kotlin.contracts;

import java.lang.annotation.Documented;
import java.lang.annotation.RetentionPolicy;
import kotlin.RequiresOptIn;
import kotlin.SinceKotlin;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.MustBeDocumented;
import kotlin.annotation.Retention;

@MustBeDocumented
@SinceKotlin(version = "1.3")
@Documented
@RequiresOptIn
@Retention(AnnotationRetention.BINARY)
@java.lang.annotation.Retention(RetentionPolicy.CLASS)
public @interface ExperimentalContracts {
}
