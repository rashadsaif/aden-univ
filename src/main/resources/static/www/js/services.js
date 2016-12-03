angular.module('app.services', [])

 .factory('YearsService', ['$http', function ($http) {
    var years = [];
    //var url = "http://mymonah-studentmarks.herokuapp.com/year";
    var url = "http://localhost:8080/year";
    return {
      getYears: function () {
        return $http.get(url);
      }

    }
  }])
  
    .factory('StudentsService', ['$http', function ($http) {
    var students = [];
    //var url = "http://mymonah-studentmarks.herokuapp.com/year";
    var baseurl = "http://localhost:8080/student/year/";
    return {
      getStudents: function (yearId) {
           url=baseurl+yearId;
           console.log(url);
        return $http.get(url);
      }

    }
  }])

  .factory('SubjectsService', ['$http', function ($http) {
    var subjects = [];
    //var url = "http://mymonah-studentmarks.herokuapp.com/year";
    var baseurl = "http://localhost:8080/subject/year/";
    return {
      getSubjects: function (yearId) {
           url=baseurl+yearId;
           console.log(url);
        return $http.get(url);
      }

    }
  }])
  .factory('MarksService', ['$http', function ($http) {
    //var url = "http://mymonah-studentmarks.herokuapp.com/year";
    var baseurl = "http://localhost:8080/mark/student/";
    return {
      getMarks: function (studentId) {
          url=baseurl+studentId;
        return $http.get(url);
      }

    }
  }]);