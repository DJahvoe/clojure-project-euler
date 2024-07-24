(ns p2-even-fibonacci-numbers)

(defn fibNew
  [n]
  (->> (println n)
       [1, 2]
       (iterate (fn [[a,b]] [b (+ a b)]))))

(defn fib
  [n]
  (if (<= n 2) n (+ (fib (- n 1)) (fib (- n 2)))))

(loop [i 0]
  (when (< (fib i) 4000000)
    (println i)
    (recur (inc i))))

(->> (take 32 (iterate inc 1))
     (map fib)
     (filter (fn [x] (= (mod x 2) 0)))
     (reduce +))

