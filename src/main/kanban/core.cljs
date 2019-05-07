(ns kanban.core
  (:require [reagent.core :as r]
            [reagent.interop :refer-macros [$]]))


(defn app
  []
  [:div "Hello app!"])


(defn mount-root []
  (r/render
    [app]
    ($ js/document getElementById "app")))


(defn ^:export main []
  (mount-root))
