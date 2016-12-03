angular.module('app.routes', [])

.config(function($stateProvider, $urlRouterProvider) {

  // Ionic uses AngularUI Router which uses the concept of states
  // Learn more here: https://github.com/angular-ui/ui-router
  // Set up the various states which the app can be in.
  // Each state's controller can be found in controllers.js
  $stateProvider
    
  

      .state('tabsController', {
    url: '/page1',
    templateUrl: 'templates/tabsController.html',
    abstract:true
  })

  .state('createYear', {
    url: '/createyear',
    templateUrl: 'templates/createYear.html',
    controller: 'createYearCtrl'
  })

  .state('createSubject', {
    url: '/createsubject',
    templateUrl: 'templates/createSubject.html',
    controller: 'createSubjectCtrl'
  })

  .state('page7', {
    url: '/year',
    templateUrl: 'templates/page7.html',
    controller: 'page7Ctrl'
  })

  .state('tabsController.maymonaStudentMarkApp', {
    url: '/info',
    views: {
      'tab4': {
        templateUrl: 'templates/maymonaStudentMarkApp.html',
        controller: 'maymonaStudentMarkAppCtrl'
      }
    }
  })

  .state('tabsController.help', {
    url: '/help',
    views: {
      'tab5': {
        templateUrl: 'templates/help.html',
        controller: 'helpCtrl'
      }
    }
  })

  .state('listYears', {
    url: '/listyear',
resolve:{},
    templateUrl: 'templates/listYears.html',
    controller: 'listYearsCtrl'
  })

  .state('marks', {
    url: '/marks',
    templateUrl: 'templates/marks.html',
    controller: 'marksCtrl'
  })

  .state('studentMarks', {
    url: '/studentmarks',
    templateUrl: 'templates/studentMarks.html',
    controller: 'studentMarksCtrl'
  })

  .state('subjects', {
    url: '/subjects',
    templateUrl: 'templates/subjects.html',
    controller: 'subjectsCtrl'
  })

  .state('listSubjects', {
    url: '/listSubjects',
    templateUrl: 'templates/listSubjects.html',
    controller: 'listSubjectsCtrl'
  })

  .state('students', {
    url: '/students',
    templateUrl: 'templates/students.html',
    controller: 'studentsCtrl'
  })

  .state('createStudent', {
    url: '/createstudent',
    templateUrl: 'templates/createStudent.html',
    controller: 'createStudentCtrl'
  })

  .state('listStudents', {
    url: '/liststudents',
    templateUrl: 'templates/listStudents.html',
    controller: 'listStudentsCtrl'
  })

  .state('notifiations', {
    url: '/notifiations',
    templateUrl: 'templates/notifiations.html',
    controller: 'notifiationsCtrl'
  })

  .state('login', {
    url: '/login',
    templateUrl: 'templates/login.html',
    controller: 'loginCtrl'
  })

  .state('createNotification', {
    url: '/create_notification',
    templateUrl: 'templates/createNotification.html',
    controller: 'createNotificationCtrl'
  })

  .state('listNotifications', {
    url: '/list_notifications',
    templateUrl: 'templates/listNotifications.html',
    controller: 'listNotificationsCtrl'
  })

  .state('notificationDetail', {
    url: '/notification_detail',
    templateUrl: 'templates/notificationDetail.html',
    controller: 'notificationDetailCtrl'
  })

$urlRouterProvider.otherwise('/page1/info')

  

});