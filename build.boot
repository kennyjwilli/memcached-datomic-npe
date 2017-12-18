(def project 'memcached-npe)
(def version "0.1-alpha1")

(set-env! :resource-paths #{"src"}
          :dependencies '[[org.clojure/clojure "1.9.0"]
                          [com.datomic/datomic-free "0.9.5656" :exclusions [org.slf4j/slf4j-nop]]
                          [com.taoensso/timbre "4.10.0"]
                          [com.fzakaria/slf4j-timbre "0.3.7"]
                          [org.slf4j/slf4j-api "1.7.14"]
                          [clojurewerkz/spyglass "1.2.0"]])

(task-options!
  pom {:project     project
       :version     version
       :description "FIXME: write description"
       :url         "http://example/FIXME"
       :scm         {:url "https://github.com/yourname/memcached-npe"}
       :license     {"Eclipse Public License"
                     "http://www.eclipse.org/legal/epl-v10.html"}})
