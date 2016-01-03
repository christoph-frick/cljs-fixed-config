(defproject cljs-fixed-config "0.1.0-SNAPSHOT"
  :description "Example how to add static content at compile time in your cljs code"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.170"]
                 [cheshire "5.5.0"]]

  :plugins [[lein-cljsbuild "1.1.1"]
            [lein-figwheel "0.5.0-1"]]

  :source-paths ["src"]

  :clean-targets ^{:protect false} ["resources/public/js/compiled" "target"]

  :cljsbuild {:builds
              [{:id "dev"
                :source-paths ["src"]

                :figwheel {:on-jsload "cljs-fixed-config.core/on-js-reload"}

                :compiler {:main cljs-fixed-config.core
                           :asset-path "js/compiled/out"
                           :output-to "resources/public/js/compiled/cljs_fixed_config.js"
                           :output-dir "resources/public/js/compiled/out"
                           :source-map-timestamp true}}
               {:id "min"
                :source-paths ["src"]
                :compiler {:output-to "resources/public/js/compiled/cljs_fixed_config.js"
                           :main cljs-fixed-config.core
                           :optimizations :advanced
                           :pretty-print false}}]}

  :figwheel {:css-dirs ["resources/public/css"] })
