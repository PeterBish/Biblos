'use-strict';
angular.
    module('authorList').
    component('authorList', {
        templateUrl: 'author/author-list.template.html',
        controller: ['$http', function authorListController($http){
            var self = this;
            $http.get('http://localhost:8080/biblos/authors/all').
                then(function(response){
                self.authors = response.data;
            });
        }]
    });