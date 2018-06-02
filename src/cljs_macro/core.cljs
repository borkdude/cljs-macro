(ns cljs-macro.core
  (:require-macros [cljs-macro.macro :refer [defstrs
                                             create-a-function]]))

(defstrs
  FOO BAR BAZ)

(create-a-function fname)

(.write js/document FOO BAR BAZ)
(.write js/document (fname 10))
