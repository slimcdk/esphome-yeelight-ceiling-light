package org.fourthline.cling.binding.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({})
@Retention(RetentionPolicy.RUNTIME)
public @interface UpnpServiceId {
    String namespace() default "upnp-org";

    String value();
}
