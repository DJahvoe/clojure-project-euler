(ns p1-multiples-of-3-or-5)

(reduce + (filter
           (fn [x] (or (= (mod x 3) 0) (= (mod x 5) 0)))
           (take 1000 (range))))

(macroexpand-1 '(->> (range)
                     (take 1000)
                     (filter (fn [x] (or (= (mod x 3) 0) (= (mod x 5) 0))))
                     (reduce +)))

(->> (range)
     (take 1000)
     (filter (fn [x] (or (= (mod x 3) 0) (= (mod x 5) 0))))
     (reduce +))