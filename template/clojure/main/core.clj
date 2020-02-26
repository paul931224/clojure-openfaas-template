(ns main.core
  (:require [handler.core :as fh])
  (:gen-class))

(defn -main
  "Read from STDIN"
  [& args]
  (println (fh/function (slurp *in*))))