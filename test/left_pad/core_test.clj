(ns left-pad.core-test
  (:require [clojure.test :refer :all]
            [left-pad.core :refer :all]))

(deftest a-test
  (testing "Testing different arguments for leftpad"
    (is (leftPad "hello" 9 "0") "0000hello")
    (is (leftPad "hello" 8) "   hello")
    (is (leftPad "hello" 1) "hello")
    (is (leftPad "woah") "    woah")
    ))
