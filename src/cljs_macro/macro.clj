(ns cljs-macro.macro)

(defmacro defstrs
  "Defines vars with same name as environment variables"
  [& variables]
  (let [defs (for [variable variables]
               `(def ~variable
                  (str (quote ~variable))))]
    `(do ~@defs)))
