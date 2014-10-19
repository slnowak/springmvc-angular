/**
 * Created by novy on 18.10.14.
 */

var teamController = function($scope, $http) {

    $scope.viewAllTeams = function() {

        $http.get('teams/all.json').success(function(response) {
            $scope.teams = response;
        })
    };

    $scope.addTeam = function(team) {

        $http.post('teams', team).success(function(request) {
            $scope.viewAllTeams()
        }).error(function(request, code) {
            alert(code)
        })

    };

    $scope.viewAllTeams();

};