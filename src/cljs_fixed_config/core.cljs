(ns cljs-fixed-config.core
  (:require-macros [cljs-fixed-config.core :as m]))

(def test-json 
  (js/JSON.parse (m/load-config "test.json")))

(js/console.log "JSON" (aget test-json "text"))

(def test-edn 
  (cljs.reader/read-string (m/load-config "test.edn")))

(js/console.log "EDN" (:text test-edn))
