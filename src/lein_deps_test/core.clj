(ns lein-deps-test.core
  (:require [clj-http.client :as http]))

(println (:body (http/get "https://raw.githubusercontent.com/sideshowcoder/canned/master/Makefile")))
