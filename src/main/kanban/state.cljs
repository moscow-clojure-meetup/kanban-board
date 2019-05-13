(ns kanban.state)


(def board-id
  #uuid "163b2480-9c03-4e98-969b-b6e214978a8a")

(def queue-id
  #uuid "1ae80ca9-bd7f-4710-bd85-849498f27301")

(def card-id
  #uuid "4f426e5c-6f82-4cb1-9a33-f3f30a0e628e")

(def tag-id
  #uuid "d43e394b-712e-4aaf-ab7b-159bab7d6ed4")


(def state
  {;; Collections
   :boards {board-id {:id   board-id
                      :name "Board name"}}
   :queues {queue-id {:id   queue-id
                      :name "TODO"}}
   :cards  {card-id {:id          card-id
                     :name        "Card name"
                     :description "Card description"
                     :created     #inst "2019-05-08T08:22:37.468-00:00"}}
   :tags   {tag-id {:id    tag-id
                    :name  "important"
                    :color "#DDD"}}

   ;; Relations
   :board-queues {board-id [queue-id]}
   :queue-cards  {queue-id [card-id]}
   :card-tags    {card-id [tag-id]}

   ;; View state
   :active-board board-id
   :active-card  card-id})
