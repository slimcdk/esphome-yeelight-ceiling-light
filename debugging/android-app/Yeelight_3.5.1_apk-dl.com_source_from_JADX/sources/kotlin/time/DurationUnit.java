package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import org.jetbrains.annotations.NotNull;

@SinceKotlin(version = "1.6")
@WasExperimental(markerClass = {ExperimentalTime.class})
public enum DurationUnit {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);
    
    @NotNull
    private final TimeUnit timeUnit;

    private DurationUnit(TimeUnit timeUnit2) {
        this.timeUnit = timeUnit2;
    }

    @NotNull
    public final TimeUnit getTimeUnit$kotlin_stdlib() {
        return this.timeUnit;
    }
}
