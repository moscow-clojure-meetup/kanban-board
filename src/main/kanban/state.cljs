(ns kanban.state)

(def state
  {;; Collections
   :boards {"brd-1" {:id   "brd-1"
                     :name "Board name"}}
   :queues {"que-1" {:id   "que-1"
                     :name "TODO"}}
   :cards  {"crd-1" {:id          "crd-1"
                     :name        "Card name"
                     :description "Card description"
                     :created     #inst "2019-05-08T08:22:37.468-00:00"}}
   :tags   {"tag-1" {:id    "tag-1"
                     :name  "important"
                     :color "#DDD"}}

   ;; Relations
   :board-queues {"brd-1" ["que-1"]}
   :queue-cards  {"que-1" ["crd-1"]}
   :card-tags    {"crd-1" ["tag-1"]}

   ;; View state
   :active-board "brd-1"
   :active-card  "crd-1"})
