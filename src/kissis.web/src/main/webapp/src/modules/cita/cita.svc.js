(function (ng) {
    var mod = ng.module('citaModule');

    mod.service('citaService', ['$http', 'citaContext', function ($http, context) {
            this.fetchRecords = function () {
                var ret = $http.get(context);
                return ret;
            };
            
            this.fetchCitasLibres = function (){
                return $http.get(context + "/libres" );
            };

            this.fetchRecord = function (id) {
                return $http.get(context + "/" + id);
            };
            this.saveRecord = function (currentRecord) {
                if (currentRecord.id) {
                    return $http.put(context + "/" + currentRecord.id, currentRecord);
                } else {
                    return $http.post(context, currentRecord);
                }
            };
            this.deleteRecord = function (id) {
                return $http.delete(context + "/" + id);
            };
        }]);
})(window.angular);
