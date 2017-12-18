# Issue with Datomic & Memcached

Open a REPL, load `memcached-npe.core`, and run this:

```clojure
(clojurewerkz.spyglass.client/bin-connection "localhost:11211")
```

This will throw this exception:

```
NullPointerException   clojure.lang.Reflector.invokeNoArgInstanceMember (Reflector.java:301)
                                          clojure.core/eval                       core.clj: 3206
                                                        ...                                     
                                memcached-npe.core/eval1543                      REPL Input     
                clojurewerkz.spyglass.client/bin-connection                     client.clj:   95
                   net.spy.memcached.MemcachedClient.<init>           MemcachedClient.java:  209
net.spy.memcached.DefaultConnectionFactory.createConnection  DefaultConnectionFactory.java:  209
               net.spy.memcached.MemcachedConnection.<init>       MemcachedConnection.java:  282
    net.spy.memcached.MemcachedConnection.createConnections       MemcachedConnection.java:  345
           net.spy.memcached.compat.log.AbstractLogger.info            AbstractLogger.java:  161
           net.spy.memcached.compat.log.AbstractLogger.info            AbstractLogger.java:  150
               net.spy.memcached.compat.log.Log4JLogger.log               Log4JLogger.java:   99
                              org.apache.log4j.Category.log                  Category.java:  300
                org.apache.log4j.Category.differentiatedLog                  Category.java:  186
   com.github.fzakaria.slf4j.timbre.TimbreLoggerAdapter.log                                     
                                                        ...                                     
                                    slf4j-timbre.adapter/fn                    adapter.clj:  126
                                                        ...                                     
java.lang.NullPointerException: 
```