var todayDate = new Date();
console.log('Todays Date',todayDate);

var day=todayDate.getDay();
var arrDay=['Sunday','Monday','Tuesday','Wednesday','Thursday','Friday','Saturday'];
console.log('Today=',arrDay[day]);

var month=todayDate.getMonth();
var arrMonth=['Jan','Feb','Mar','Apr','May','Jun','Jul','Aug','Sep','Oct','Nov','Dec'];
console.log('Month=',arrMonth[month]);