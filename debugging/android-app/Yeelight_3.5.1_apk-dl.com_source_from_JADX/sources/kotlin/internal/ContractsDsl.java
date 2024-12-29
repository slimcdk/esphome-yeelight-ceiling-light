package kotlin.internal;

import java.lang.annotation.RetentionPolicy;
import kotlin.SinceKotlin;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.Retention;

@SinceKotlin(version = "1.2")
@Retention(AnnotationRetention.BINARY)
@java.lang.annotation.Retention(RetentionPolicy.CLASS)
public @interface ContractsDsl {
}
