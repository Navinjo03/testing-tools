package webAutomationDriver.waits.service;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public interface TimeLimits {

    TimeLimits implicityWaits(final long time, final TimeUnit unit);

    default TimeLimits implicityWaits(final Duration duration) {
        return this.implicityWaits(duration.toMillis(), TimeUnit.MICROSECONDS);
    }

    TimeLimits setScriptTimeout(final long time, final TimeUnit unit);

}
