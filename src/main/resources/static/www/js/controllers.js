angular.module('app.controllers', [])
     
.controller('menuCtrl', ['$scope', '$stateParams', // The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
function ($scope, $stateParams) {


}])
   
.controller('createYearCtrl', ['$scope', '$stateParams','$http', // The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
function ($scope, $stateParams,$http) {
	console.log('in createYearCtrl');
$scope.year={};
var url = "http://localhost:8080/year/";
$scope.createYear= function(year) {
	console.log('gfgfgfeeeeeg');
	console.log(year);
	$http.post(url, year, {headers: {'Content-Type': 'application/json'} })
        .then(function (response) {
            return response;
        });
};

}])
   
.controller('createSubjectCtrl', ['$scope', '$stateParams','$http','YearsService', // The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
function ($scope, $stateParams,$http,YearsService) {

        $scope.year={};
	YearsService.getYears().then(function(response){
      	  
          $scope.years = angular.copy(response.data);
          console.log('Years Service');
          //console.log(JSON.stringify(years));
      });

	

var url = "http://localhost:8080/subject/";
$scope.createSubject= function(subject) {
	console.log('In create subject');
	console.log(subject);
	$http.post(url, subject, {headers: {'Content-Type': 'application/json'} })
        .then(function (response) {
            return response;
        });
};
//

}])
   
.controller('page7Ctrl', ['$scope', '$stateParams', // The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
function ($scope, $stateParams) {


}])
   
.controller('maymonaStudentMarkAppCtrl', ['$scope', '$stateParams', // The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
function ($scope, $stateParams) {


}])
   
.controller('helpCtrl', ['$scope', '$stateParams', // The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
function ($scope, $stateParams) {


}])
   
.controller('listYearsCtrl', ['$scope', '$stateParams','YearsService', // The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
function ($scope, $stateParams,YearsService) {
	
	YearsService.getYears().then(function(response){
      	  
          $scope.years = angular.copy(response.data);
          console.log('Years Service');
          //console.log(JSON.stringify(years));
      });
      
//$scope.years=YearsService.getYears();

}])
   
.controller('marksCtrl', ['$scope', '$stateParams', 'MarksService',// The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
function ($scope, $stateParams,MarksService) {
 $scope.studentId=1;                         
$scope.showMarks= function(studentId) {
	console.log('In showMarks');
	console.log(studentId);
	MarksService.getMarks(studentId).then(function(response){
      	  
          $scope.marks = angular.copy(response.data);
          console.log('Marks Service');
          //console.log(JSON.stringify(years));
      });
};
                          


}])
   
.controller('studentMarksCtrl', ['$scope', '$stateParams', // The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
function ($scope, $stateParams) {


}])

.controller('subjectsCtrl', ['$scope', '$stateParams', // The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
function ($scope, $stateParams) {


}])
   
.controller('listSubjectsCtrl', ['$scope', '$stateParams','SubjectsService','YearsService', // The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
function ($scope, $stateParams,SubjectsService,YearsService) {
            $scope.year=1;
            $scope.subjects={};
	YearsService.getYears().then(function(response){
      	  
          $scope.years = angular.copy(response.data);
          console.log('Years Service');
          //console.log(JSON.stringify(years));
      });

$scope.listSubjects= function(year) {
     console.log('list Subject');
          console.log(year);

    	SubjectsService.getSubjects(year).then(function(response){
      	    console.log(JSON.stringify(response.data));
          $scope.subjects = angular.copy(response.data);
          console.log('Students Service');
          //console.log(JSON.stringify(years));
      });
}

}])
   
.controller('studentsCtrl', ['$scope', '$stateParams', // The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
function ($scope, $stateParams) {


}])
   
.controller('createStudentCtrl', ['$scope', '$stateParams' ,'$http','YearsService', // The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
function ($scope, $stateParams,$http,YearsService) {

        $scope.year={};
	YearsService.getYears().then(function(response){
      	  
          $scope.years = angular.copy(response.data);
          console.log('Years Service');
          //console.log(JSON.stringify(years));
      });

	

var url = "http://localhost:8080/student/";
$scope.createStudent= function(student) {
	console.log('In create Student');
	console.log(student);
	$http.post(url, student, {headers: {'Content-Type': 'application/json'} })
        .then(function (response) {
            return response;
        });
};
//

}])
   
.controller('listStudentsCtrl', ['$scope', '$stateParams','StudentsService','YearsService', // The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
function ($scope, $stateParams,StudentsService,YearsService) {
            $scope.year=1;
            $scope.students={};
	YearsService.getYears().then(function(response){
      	  
          $scope.years = angular.copy(response.data);
          console.log('Years Service');
          //console.log(JSON.stringify(years));
      });

$scope.listStudents= function(year) {
     console.log('listStudents');
          console.log(year);

    	StudentsService.getStudents(year).then(function(response){
      	    console.log(JSON.stringify(response.data));
          $scope.students = angular.copy(response.data);
          console.log('Students Service');
          //console.log(JSON.stringify(years));
      });
}

}])
   
.controller('notifiationsCtrl', ['$scope', '$stateParams', // The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
function ($scope, $stateParams) {


}])
   
.controller('loginCtrl', ['$scope', '$stateParams', // The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
function ($scope, $stateParams) {


}])
   
.controller('createNotificationCtrl', ['$scope', '$stateParams', // The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
function ($scope, $stateParams) {


}])
   
.controller('listNotificationsCtrl', ['$scope', '$stateParams', // The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
function ($scope, $stateParams) {


}])
   
.controller('notificationDetailCtrl', ['$scope', '$stateParams', // The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
function ($scope, $stateParams) {


}])
 