(ns left-pad.core)

(defn leftPad
  "Adds left padding to a string."
  ([st]
   (leftPad st (-> (count st) (* 2) )))
  ([st len]
   (leftPad st len " "))
  ([st len ch]
   (apply str (concat (take (- len (count st)) (repeat ch)) st)))
  )
