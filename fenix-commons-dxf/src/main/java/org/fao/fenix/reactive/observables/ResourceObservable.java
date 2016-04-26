package org.fao.fenix.reactive.observables;

import org.fao.fenix.commons.msd.dto.full.MeIdentification;
import org.fao.fenix.reactive.observables.resource.ResourceSignal;
import rx.Observable;
import rx.Subscriber;

public class ResourceObservable implements Observable.OnSubscribe<ResourceSignal> {

    public void init(MeIdentification metadata) throws Exception {

    }

    @Override
    public void call(Subscriber<? super ResourceSignal> subscriber) {
        System.out.println("Into the call");
    }
}
