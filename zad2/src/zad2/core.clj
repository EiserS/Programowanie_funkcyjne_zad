(ns zad2.core)
; implementacja wzoru na obliczenie pierwiastka sześciennego z liczby x na podstawie wzoru Herona
(defn pierwiastek-szescienny [x y]
  (/ (+ (/ x (* y y)) (* 2 y)) 3)
  )

(defn pierwiastek-szescienny-epsilon [x y epsilon]
  (if (< (abs (- y (pierwiastek-szescienny x y))) epsilon)
    y
    (pierwiastek-szescienny-epsilon x (pierwiastek-szescienny x y) epsilon)
    )
  )

(defn pierwiastek-szescienny-step [x y step]
  (if (= step 0)
    y
    (pierwiastek-szescienny-step x (pierwiastek-szescienny x y) (dec step))
    )
  )