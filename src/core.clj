(ns read-json-files.core
  (:require [clojure.data.json :as json]))


(defn main [file-a file-b]
  (def a (json/read-str (slurp file-a)))
  (def b (json/read-str (slurp file-b))))

(def args
  (if (= 2 (count *command-line-args*))
    *command-line-args*
    (concat *command-line-args* *command-line-args*)))
(apply main args)
  
