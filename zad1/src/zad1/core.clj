(ns zad1.core)
;; defn -- definiuje funkcje
;; let -- definiuje zmienne lokalne
;; reduce -- redukuje liste do jednej wartosci
;; map -- mapuje funkcje na liste
;; range -- tworzy liste liczb
;; inc -- inkrementuje liczbe
;; println -- wypisuje na ekran
;; % -- argument funkcji
;; (* % %) -- kwadrat argumentu
;; (+ % %) -- suma argumentow
;; (- % %) -- roznica argumentow
;; (defn nazwa [argumenty] (ciało))
;; (let [nazwa wartość] (ciało))
;; (reduce funkcja lista)
;; (map funkcja lista)
;; (range od do)
;; (inc liczba)
;; (println argument)
;; % argument
;; (* argument argument)
;; (+ argument argument)
;; (- argument argument)
;; (defn sum-of-squares [n] (reduce + (map #(* % %) (range 1 (inc n)))))
(defn sum-of-squares [n]
  (reduce + (map #(* % %) (range 1 (inc n)))))
;; (println (sum-of-squares 10))
(defn square-of-sum [n]
  (let [sum (reduce + (range 1 (inc n)))]
    (* sum sum)))
;; (println (square-of-sum 10))
;; (println (- (square-of-sum 10) (sum-of-squares 10)))=>2640
(println "Wynik wynosi"(- (square-of-sum 100) (sum-of-squares 100)) )
