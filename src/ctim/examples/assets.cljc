(ns ctim.examples.assets
  (:require [ctim.schemas.common :as c]))

(def asset-maximal
  {:id                  "http://ex.tld/ctia/asset/asset-61884b14-e273-4930-a5ff-dcce69207724"
   :type                "asset"
   :schema_version      c/ctim-schema-version
   :revision            1
   :external_ids        ["http://ex.tld/ctia/asset/asset-61884b14-e273-4930-a5ff-dcce69207724"]
   :description         "description"
   :short_description   "short description"
   :external_references [{:source_name "source"
                          :external_id "T1061"
                          :url         "https://ex.tld/wiki/T1061"
                          :hashes      ["#section1"]
                          :description "Description text"}]
   :timestamp           #inst "2016-02-11T00:40:48.212-00:00"
   :language            "language"
   :tlp                 "green"
   :source              "source"
   :source_uri          "http://example.com/asset"
   :asset_type          "device"
   :title               "CBROZEFS-DH-123"
   :valid_time          {:start_time #inst "2020-01-11T00:40:48.212-00:00"
                         :end_time   #inst "2525-01-01T00:00:00.000-00:00"}})

(def asset-minimal
  {:id             "http://ex.tld/ctia/asset/asset-61884b14-e273-4930-a5ff-dcce69207724"
   :type           "asset"
   :schema_version c/ctim-schema-version
   :asset_type     "device"
   :source         "a source"
   :valid_time     {}})

(def new-asset-maximal asset-maximal)

(def new-asset-minimal asset-minimal)

;;;;;;;;;;;;;;;;;;;;;;
;; Asset Properties ;;
;;;;;;;;;;;;;;;;;;;;;;

(def asset-properties-maximal
  {:id                  "http://ex.tld/ctia/asset-properties/asset-properties-97c3dbb5-6deb-4eed-b6d7-b77fa632cc7b"
   :type                "asset-properties"
   :schema_version      c/ctim-schema-version
   :revision            1
   :external_ids        ["http://ex.tld/ctia/asset-properties/asset-properties-97c3dbb5-6deb-4eed-b6d7-b77fa632cc7b"]
   :source              "cisco:unified_connect"
   :source_uri          "http://example.com/asset-properties"
   :external_references [{:source_name "source"
                          :external_id "T1061"
                          :url         "https://ex.tld/wiki/T1061"
                          :hashes      ["#section1"]
                          :description "Description text"}]
   :timestamp           #inst "2016-02-11T00:40:48.212-00:00"
   :language            "language"
   :tlp                 "green"

   :valid_time  {:start_time #inst "2020-01-11T00:40:48.212-00:00"
                 :end_time   #inst "2525-01-01T00:00:00.000-00:00"}
   :asset_ref   "http://ex.tld/ctia/asset/asset-61884b14-e273-4930-a5ff-dcce69207724"
   })

(def asset-properties-minimal
  {:id             "http://ex.tld/ctia/asset-properties/asset-properties-97c3dbb5-6deb-4eed-b6d7-b77fa632cc7b"
   :type           "asset-properties"
   :schema_version c/ctim-schema-version
   :source         "cisco:unified_connect"
   :valid_time     {}
   :asset_ref      "http://ex.tld/ctia/asset/asset-61884b14-e273-4930-a5ff-dcce69207724"
   })

(def new-asset-properties-maximal asset-properties-maximal)

(def new-asset-properties-minimal asset-properties-minimal)
