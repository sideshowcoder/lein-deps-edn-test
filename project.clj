(defproject lein-deps-test "0.1.0-SNAPSHOT"
  :description "deps.edn in leiningen can this work"
  :url "https://sideshowcoder.com"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-tools-deps "0.4.1"]]
  :middleware [lein-tools-deps.plugin/resolve-dependencies-with-deps-edn]
  :lein-tools-deps/config {:config-files [:install :user :project]})
