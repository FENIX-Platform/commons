package org.fao.fenix.reactive.observables.resource;


import org.fao.fenix.commons.msd.dto.full.MeIdentification;

import java.util.Map;

public class ResourceSignal {

    private MeIdentification metadata;
    private ResourceEvent event;
    private Map<String, Object> properties;
    private Exception error;
    private long time;


    public ResourceSignal() {
        time = System.currentTimeMillis();
    }
    public ResourceSignal(MeIdentification metadata, ResourceEvent event, Map<String, Object> properties, Exception error) {
        this.metadata = metadata;
        this.event = event;
        this.properties = properties;
        this.error = error;
        time = System.currentTimeMillis();
    }

    public MeIdentification getMetadata() {
        return metadata;
    }

    public void setMetadata(MeIdentification metadata) {
        this.metadata = metadata;
    }

    public ResourceEvent getEvent() {
        return event;
    }

    public void setEvent(ResourceEvent event) {
        this.event = event;
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }

    public Exception getError() {
        return error;
    }

    public void setError(Exception error) {
        this.error = error;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
