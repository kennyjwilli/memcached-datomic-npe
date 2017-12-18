# Issue with Datomic & Memcached

Open a REPL, load `memcached-npe.core`, and run this:

```clojure
(clojurewerkz.spyglass.client/bin-connection "localhost:11211")
```