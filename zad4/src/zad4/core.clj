(ns zad4.core)

(defn powerset [collection]
  (if (empty? collection)
    #{#{}}
    (let [first (first collection)                          ; pierwszy element
          rest (rest collection)                            ;reszta elementów
          subsets (powerset rest)                          ; podzbiory reszty
          new-subsets (for [subset subsets]               ; nowe podzbiory
                        (conj subset first))]              ; dodajemy pierwszy element
                        (concat subsets new-subsets))))                       ; łączymy podzbiory
;;sposób działania
;; algorytm wybiera element i dopisuje go do każdego podzbioru
;; następnie łączy podzbiory
;; jeśli zbiór jest pusty zwraca zbiór zawierający pusty zbiór
;; dopisanie 3 jakiego kolejnego elementu do zbioru
;; #{#{1} #{2} #{1 2}} -> #{#{1} #{2} #{1 2} #{3} #{1 3} #{2 3} #{1 2 3}}
;; Przykładowe użycie
(println (powerset #{1 2 3}))