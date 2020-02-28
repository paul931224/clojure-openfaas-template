(defproject function "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :main function.main
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [ring/ring-jetty-adapter "1.8.0"]]
  :source-paths ["src/clj" "src/cljc" "src/cljs"]
  :profiles {:uberjar {:source-paths ["src/function/clj"]
                         ;:prep-tasks ["clean"
                         ;              "compile"
                                      ;["shadow" "compile" "app"]
                                      ;["shadow" "compile" "client"]]
                                      ;"compile" ["shadow" "release" "client"]]
                         :aot :all
                         :omit-source true}}

  :uberjar-name "function.jar")
