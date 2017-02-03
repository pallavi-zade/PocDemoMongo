app.controller('loginController',[
    '$scope',
    '$location', 
    function (
        $scope, 
        $location
       ) {
       
        $scope.login = function () {
              $location.path('/home');
        };
}]);