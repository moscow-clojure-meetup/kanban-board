(ns kanban.core
  (:require [reagent.core :as reagent]))


(defn app []
  [:section {:class "hero is-fullheight is-primary is-bold"}
   [:div {:class "hero-body"}
    [:div {:class "container has-text-centered"}
     [:h1 {:class "title"}
      "Welcome to ClojureScript course"]

     [:figure {:clss "image is-128x128"}
      [:img {:src   "/img/mclj-logo.png"
             :class "logo"}]]

     [:h2 {:class "subtitle"}
      "by Moscow Clojure Meetup"]]]])


(defn mount-root []
  (reagent/render
    [app]
    (.getElementById js/document "app")))


(defn ^:export main []
  (mount-root))
