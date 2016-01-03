(ns cljs-fixed-config.core
  (:require-macros [cljs-fixed-config.core :as m]))

(js/console.log (js/JSON.parse (m/load-config "test.json")))
