/**
 * Created by novy on 18.10.14.
 */

var app = angular.module('AngularSpringApp', ['ngRoute']);

app.config(['$routeProvider', function($routeProvider) {

    $routeProvider.when('/teams', {
        templateUrl: 'teams/layout',
        controller: teamController

    });

    $routeProvider.otherwise(
        { redirectTo: '/teams' }
    );

}]);

app.controller(teamController);