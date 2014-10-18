/**
 * Created by novy on 18.10.14.
 */

var teamController = function($scope, $http) {

    $scope.viewAllTeams = function() {

        $http.get('teams/all.json').success(function(response) {
            $scope.teams = response;
        })
    };

    $scope.viewAllTeams();

};