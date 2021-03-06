package com.proofpoint.discovery;

import org.joda.time.DateTime;

import javax.inject.Provider;

public class RealTimeProvider
    implements Provider<DateTime>
{
    @Override
    public DateTime get()
    {
        return new DateTime();
    }
}
