'use strict';
/*Написать регулярку на мобильные номера - требования как в юзер дате */

// var mobilePhoneNumber = "380501928270"
// var MobilePhoneValidation = /^(380)(50|63|66|67|68|91|92|93|96|97|)([0-9]{7})$/
// console.log(MobilePhoneValidation.test(mobilePhoneNumber));
// console.log(mobilePhoneNumber.search(MobilePhoneValidation));









/*На email длина емаил 6 - 12 символов до @ и потом выбирите почту mail.ru, gmail.com, ukr.net*/

// var userEmail = "mykhailo@gmail.com"
// var userEmailValidation = /^[a-z0-9._]{6,12}@(mail.ru|gmail.com|ukr.net)$/
// console.log(userEmailValidation.test(userEmail));
// console.log(userEmail.search(userEmailValidation));

var charsName1 = 'abcdefghijklmnopqrstuvwxyz1234567890';
var stringName1 = '';
for(var ii=0; ii<14; ii++){
    stringName1 += charsName1[Math.floor(Math.random() * charsName1.length)];
}

var charsName2 = 'abcdefghijklmnopqrstuvwxyz1234567890';
var stringName2 = '';
for(var ii=0; ii<10; ii++){
    stringName2 += charsName2[Math.floor(Math.random() * charsName2.length)];
}

alert(stringName1 + '@' + stringName2 +'.com');