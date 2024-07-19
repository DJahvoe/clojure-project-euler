(ns p1-multiples-of-3-or-5)

;; Normal
(reduce + (filter
           (fn [x] (or (= (mod x 3) 0) (= (mod x 5) 0)))
           (take 1000 (range))))

;; Macro expand
(macroexpand-1 '(->> (range)
                     (take 1000)
                     (filter (fn [x] (or (= (mod x 3) 0) (= (mod x 5) 0))))
                     (reduce +)))

;; Thread last
(->> (range)
     (take 1000)
     (filter (fn [x] (or (= (mod x 3) 0) (= (mod x 5) 0))))
     (reduce +))