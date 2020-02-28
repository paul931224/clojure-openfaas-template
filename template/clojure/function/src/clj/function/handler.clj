(ns function.handler)

(defn handler [req]
  {:status 200
   :body "Hello, dsaClojure."
   :headers {}})

(def app
  (-> handler))
