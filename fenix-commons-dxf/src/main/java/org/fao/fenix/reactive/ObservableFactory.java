package org.fao.fenix.reactive;

import org.fao.fenix.commons.msd.dto.full.MeIdentification;
import org.fao.fenix.reactive.observables.ResourceObservable;
import org.fao.fenix.reactive.observables.resource.ResourceSignal;
import rx.Observable;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;

@ApplicationScoped
public class ObservableFactory {
    @Inject Instance<ResourceObservable> observableInstance;

    public Observable<ResourceSignal> getObservable(MeIdentification metadata) throws Exception {
        ResourceObservable observable = observableInstance.get();
        observable.init(metadata);
        return Observable.create(observable);
    }
}
