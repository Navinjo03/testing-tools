package webAutomationDriver.waits.impl;

import com.webAutomationDriver.waits.service.TimeLimits;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TimeLimitsImpl implements TimeLimits {

    private final WebDriver.Timeouts timeouts;

    public TimeLimitsImpl(final WebDriver.Timeouts timeouts) {
        this.timeouts = timeouts;
    }

    @Override
    public TimeLimits implicityWaits(long time, TimeUnit unit) {
        return this;
    }

    @Override
    public TimeLimits implicityWaits(Duration duration) {
        return TimeLimits.super.implicityWaits(duration);
    }

    @Override
    public TimeLimits setScriptTimeout(long time, TimeUnit unit) {
        return this;
    }
}
