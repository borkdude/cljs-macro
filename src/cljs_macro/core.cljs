(ns cljs-macro.core
  (:require-macros [cljs-macro.macro :refer [defstrs]]))

(defstrs
  FOO BAR BAZ)

(.write js/document FOO BAR BAZ)
