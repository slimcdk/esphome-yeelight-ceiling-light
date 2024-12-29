package javax.servlet.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.servlet.annotation.ServletSecurity;

@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface HttpMethodConstraint {
    ServletSecurity.C4486a emptyRoleSemantic() default ServletSecurity.C4486a.f8132a;

    String[] rolesAllowed() default {};

    ServletSecurity.C4487b transportGuarantee() default ServletSecurity.C4487b.f8135a;

    String value();
}
