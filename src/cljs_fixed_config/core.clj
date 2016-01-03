(ns cljs-fixed-config.core
  (:require [cheshire.core :as json]))

(defmacro load-config
  [config-filename]
  (slurp (clojure.java.io/resource config-filename)))
