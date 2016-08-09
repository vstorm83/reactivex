package org.vstorm83;

import rx.Observable;
import rx.Observable.OnSubscribe;
import rx.Subscriber;
import rx.functions.Action1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        Observable<String> test = Observable.create(new OnSubscribe<String>() {
            @Override
            public void call(Subscriber<? super String> subscriber) {
                subscriber.onNext("test");
            }
        });
        
        test.subscribe(new Action1<String>() {

            @Override
            public void call(String t) {
                System.out.println(t);
            }
        });
        
        System.in.read();
    }
}
