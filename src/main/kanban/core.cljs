(ns kanban.core
  (:require [reagent.core :as reagent]))

;; =============================================================================
;; State
;; =============================================================================

(defonce state
  (reagent/atom {}))

(def current-route
  (reagent/cursor state [:route]))

(def active-board
  (reagent/cursor state [:board]))


;; =============================================================================
;; Reducers
;; =============================================================================

(defn navigate [route]
  (reset! current-route route))

(defn set-active-board [board]
  (reset! active-board board))


;; =============================================================================
;; UI
;; =============================================================================

(defn app-home []
  [:section {:class "hero is-fullheight is-primary is-bold"}
   [:div {:class "hero-body"}
    [:div {:class "container has-text-centered"}
     [:h1 {:class "title"}
      "Welcome to ClojureScript course"]

     [:figure {:clss "image is-128x128"}
      [:img {:src   "/img/mclj-logo.png"
             :class "logo"}]]

     [:h2 {:class "subtitle"}
      "by Moscow Clojure Meetup"]

     [:button {:class    ["button" "is-large" "is-info" "is-inverted" "is-outlined"]
               :style    {:font-weight "bold"}
               :on-click #(navigate :demo)}
      "DEMO"]]]])


(defn boards []
  (let [active @active-board]
    [:<>
     [:h2 {:class "boards_title title is-4 has-text-white has-text-centered"}
      "Kanban Board"]

     [:div {:class "boards_menu"}
      [:p {:class "boards_menu-label is-size-7 has-text-grey-lighter"}
       "Boards"]

      [:ul {:class "boards_menu-list"}
       [:li
        [:a {:class ["is-size-5 has-text-white boards_menu-link"
                     (when (= active :first) "boards_menu-link-active")]
             :on-click #(set-active-board :first)}
         "First Board"]]
       [:li
        [:a {:class ["is-size-5 has-text-white boards_menu-link"
                     (when (= active :second) "boards_menu-link-active")]
             :on-click #(set-active-board :second)}
         "Second Board"]]]]]))


(defn app-navbar []
  [:nav {:class "navbar is-white app-navbar" :role "navigation" :aria-label "main navigation"}
   [:div {:class "navbar-menu"}
    [:div {:class "navbar-start"}
     [:div {:class "navbar-item"}
      [:h3 {:class "title is-5 app-navbar_board"}
       "First Board"]]]

    [:div {:class "navbar-end"}
     [:div {:class "navbar-item"}
      [:div {:class "control has-icons-left"}
       [:input {:class "input is-rounded" :type "text" :placeholder "Search"}]
       [:span {:class "icon is-small is-left"}
        [:i {:class "fas fa-search"}]]]]

     [:div {:class "navbar-item"}
      [:div {:class "buttons"}
       [:button {:class "button"}
        [:span {:class "icon is-small has-text-grey"}
         [:i {:class "fas fa-filter"}]]]

       [:button {:class "button is-info is-outlined"}
        [:span {:class "icon is-small"}
         [:i {:class "fas fa-plus"}]]]]]]]])


(defn app-cards []
  [:div {:class "app-cards"}
   [:div {:class "card app-card"}
    [:div {:class "content"}
     [:div {:class "app-card_heaer"}
      [:time {:date-time "2016-1-1"
              :class "is-size-7 has-text-grey"}
       "11:09 PM - 1 Jan 2016"]

      [:button {:class "button is-small is-text app-card_menu"}
       [:span {:class "icon is-small"}
        [:i {:class "fas fa-ellipsis-v"}]]]]

     [:p {:class "title is-6"}
      "John Smith"]]]

   [:div {:class "card app-card"}
    [:div {:class "content"}
     [:div {:class "app-card_heaer"}
      [:time {:date-time "2016-1-1"
              :class "is-size-7 has-text-grey"}
       "11:09 PM - 1 Jan 2016"]

      [:button {:class "button is-text app-card_menu"}
       [:span {:class "icon is-small"}
        [:i {:class "fas fa-ellipsis-v"}]]]]

     [:p {:class "title is-6"}
      "John Smith"]]]
   [:div {:class "card app-card"}
    [:div {:class "content"}
     [:div {:class "app-card_heaer"}
      [:time {:date-time "2016-1-1"
              :class "is-size-7 has-text-grey"}
       "11:09 PM - 1 Jan 2016"]

      [:button {:class "button is-text app-card_menu"}
       [:span {:class "icon is-small"}
        [:i {:class "fas fa-ellipsis-v"}]]]]

     [:p {:class "title is-6"}
      "John Smith"]]]
   [:div {:class "card app-card"}
    [:div {:class "content"}
     [:div {:class "app-card_heaer"}
      [:time {:date-time "2016-1-1"
              :class "is-size-7 has-text-grey"}
       "11:09 PM - 1 Jan 2016"]

      [:button {:class "button is-text app-card_menu"}
       [:span {:class "icon is-small"}
        [:i {:class "fas fa-ellipsis-v"}]]]]

     [:p {:class "title is-6"}
      "John Smith"]]]
   [:div {:class "card app-card"}
    [:div {:class "content"}
     [:div {:class "app-card_heaer"}
      [:time {:date-time "2016-1-1"
              :class "is-size-7 has-text-grey"}
       "11:09 PM - 1 Jan 2016"]

      [:button {:class "button is-text app-card_menu"}
       [:span {:class "icon is-small"}
        [:i {:class "fas fa-ellipsis-v"}]]]]

     [:p {:class "title is-6"}
      "John Smith"]]]
   [:div {:class "card app-card"}
    [:div {:class "content"}
     [:div {:class "app-card_heaer"}
      [:time {:date-time "2016-1-1"
              :class "is-size-7 has-text-grey"}
       "11:09 PM - 1 Jan 2016"]

      [:button {:class "button is-text app-card_menu"}
       [:span {:class "icon is-small"}
        [:i {:class "fas fa-ellipsis-v"}]]]]

     [:p {:class "title is-6"}
      "John Smith"]]]
   [:div {:class "card app-card"}
    [:div {:class "content"}
     [:div {:class "app-card_heaer"}
      [:time {:date-time "2016-1-1"
              :class "is-size-7 has-text-grey"}
       "11:09 PM - 1 Jan 2016"]

      [:button {:class "button is-text app-card_menu"}
       [:span {:class "icon is-small"}
        [:i {:class "fas fa-ellipsis-v"}]]]]

     [:p {:class "title is-6"}
      "John Smith"]]]
   [:div {:class "card app-card"}
    [:div {:class "content"}
     [:div {:class "app-card_heaer"}
      [:time {:date-time "2016-1-1"
              :class "is-size-7 has-text-grey"}
       "11:09 PM - 1 Jan 2016"]

      [:button {:class "button is-text app-card_menu"}
       [:span {:class "icon is-small"}
        [:i {:class "fas fa-ellipsis-v"}]]]]

     [:p {:class "title is-6"}
      "John Smith"]]]
   [:div {:class "card app-card"}
    [:div {:class "content"}
     [:div {:class "app-card_heaer"}
      [:time {:date-time "2016-1-1"
              :class "is-size-7 has-text-grey"}
       "11:09 PM - 1 Jan 2016"]

      [:button {:class "button is-text app-card_menu"}
       [:span {:class "icon is-small"}
        [:i {:class "fas fa-ellipsis-v"}]]]]

     [:p {:class "title is-6"}
      "John Smith"]]]

   [:button {:class "button is-white is-large app-card_add has-text-grey"}
    "+ add new card"]])


(defn queues []
  [:div {:class "columns queues_columns"}
   [:div {:class "column is-narrow queues_column"}
    [:div {:class "queue"}
     [:div {:class "queue_header"}
      [:h4 {:class "title is-5 is-marginless queue_name"}
       "TODO"]
      [:button {:class "button is-text queue_menu"}
       [:span {:class "icon is-small"}
        [:i {:class "fas fa-ellipsis-h"}]]]]

     [app-cards]]]

   [:div {:class "column is-narrow queues_column"}
    [:div {:class "queue"}
     [:div {:class "queue_header"}
      [:h4 {:class "title is-5 is-marginless queue_name"}
       "IN PROGRESS"]
      [:button {:class "button is-text queue_menu"}
       [:span {:class "icon is-small"}
        [:i {:class "fas fa-ellipsis-h"}]]]]

     [app-cards]]]

   [:div {:class "column is-narrow queues_column"}
    [:div {:class "queue"}
     [:div {:class "queue_header"}
      [:h4 {:class "title is-5 is-marginless queue_name"}
       "IN PROGRESS"]
      [:button {:class "button is-text queue_menu"}
       [:span {:class "icon is-small"}
        [:i {:class "fas fa-ellipsis-h"}]]]]

     [app-cards]]]

   [:div {:class "column is-narrow queues_column"}
    [:div {:class "queue"}
     [:div {:class "queue_header"}
      [:h4 {:class "title is-5 is-marginless queue_name"}
       "IN PROGRESS"]
      [:button {:class "button is-text queue_menu"}
       [:span {:class "icon is-small"}
        [:i {:class "fas fa-ellipsis-h"}]]]]

     [app-cards]]]

   [:div {:class "column is-narrow queues_column"}
    [:div {:class "queue"}
     [:div {:class "queue_header"}
      [:h4 {:class "title is-5 is-marginless queue_name"}
       "IN PROGRESS"]
      [:button {:class "button is-text queue_menu"}
       [:span {:class "icon is-small"}
        [:i {:class "fas fa-ellipsis-h"}]]]]

     [app-cards]]]])


(defn app-demo []
  [:section {:class "app-demo_container"}
   [:div {:class "app-demo_columns"}
    [:aside {:class "app-demo_boards"}
     [boards]]
    [:main {:class "app-demo_content"}
     [app-navbar]

     [:section {:class "section app-demo_queues"}
      [queues]]]]])


(defn app []
  (case @current-route
    :demo [app-demo]
    [app-home]))


;; =============================================================================
;; Starting Point
;; =============================================================================

(defn mount-root []
  (reagent/render
    [app]
    (.getElementById js/document "app")))


(defn ^:export main []
  (mount-root))


(comment
 (navigate nil))
