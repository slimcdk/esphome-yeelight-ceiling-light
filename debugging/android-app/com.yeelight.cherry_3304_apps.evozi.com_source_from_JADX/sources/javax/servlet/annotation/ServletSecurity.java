package javax.servlet.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Inherited
@Documented
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ServletSecurity {

    /* renamed from: javax.servlet.annotation.ServletSecurity$a */
    public enum C4486a {
        PERMIT,
        DENY
    }

    /* renamed from: javax.servlet.annotation.ServletSecurity$b */
    public enum C4487b {
        NONE,
        CONFIDENTIAL
    }

    HttpMethodConstraint[] httpMethodConstraints() default {};

    HttpConstraint value() default @HttpConstraint;
}
