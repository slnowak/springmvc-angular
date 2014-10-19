/**
 * Created by novy on 18.10.14.
 */

var teamController = function($scope, $http) {

    var viewAllTeams = function() {
        $http.get('teams').success(function(response) {
            $scope.teams = response;
        })
    };

    var clearFormTeam = function() {
        $scope.formTeam.name = '';
        $scope.formTeam.division = '';
        $scope.formTeam.rating = '';
    };

    var setEditionMode = function(editionMode) {
        $scope.editionMode = editionMode;
    };

    $scope.addTeam = function(team) {
        $http.post('teams', team).success(viewAllTeams)
    };

    $scope.updateTeam = function(team) {
        $http.put('teams/' + team.id, team).success(function(response) {
            viewAllTeams();
            clearFormTeam();
            setEditionMode(false);
        })
    };

    $scope.deleteTeam = function(team) {
        $http.delete('teams/' + team.id).success(viewAllTeams)
    };

    $scope.selectForEdition = function(team) {
        $scope.formTeam = {};
        $scope.formTeam.id = team.id;
        $scope.formTeam.name = team.name;
        $scope.formTeam.division = team.division;
        $scope.formTeam.rating = team.rating;
        setEditionMode(true);
    }

    viewAllTeams();
    setEditionMode(false)

};