'use strict';

/*Даны переменные a и b. Проверьте, что a делится без остатка на b.
Если это так - выведите 'Делится'и результат деления,
иначе выведите 'Делится с остатком' и остаток от деления. Решение реализовать в виде функции
*/
//----------------------------

function getRemainder(a, b){

	let reminder = a % b

	if (reminder != 0) {
		console.log("Делится с остатком, и остаток от деления: " + reminder)
	}else{
		console.log("Делится без остатка, результат деления: " + (a/b))
	}
}

getRemainder(16, 5)



/*
2."нарисуйте" в консоли прямоугольный треугольник из звездочек
(или плюсиков, или какого другого символа):
на первой строчке - одна звездочка, на второй две, и так далее.
 Решение оформите в виде функции, куда передаются два параметра:
 высота треугольника и символ, которым его нужно "рисовать".
 Как-то так:
 drawTriangle(7,*);
*
**
***
****
******
*/
//----------------------------


/*function drawTriangle(h, sym){
	for(let i = 0; i < h+1; i++){
		console.log(sym.repeat(i))
	}
}

drawTriangle(7, '+')
*/

function drawTriangle1(height, symbol) {
  var repeatSymbol = '';
  var i = 0;
  while (height > 0) {
    repeatSymbol += symbol;
    height--;
    console.log(repeatSymbol);
  }
}
drawTriangle1(10, '&');




/*
 Выведите столбец нечетных чисел в промежутке от 0 до 100.
*/
//----------------------------

for(var x = 0; x < 100; x++){
	if(x % 2 === 0) {
		continue;
    }
    console.log(x);
 }


/*Дано число n = 1000. Делите его на 2 столько раз, пока результат
деления не станет меньше 50. Какое число получится?
Посчитайте количество итераций, необходимых для этого.*/

/*1-вариант*/
/*var aNumber = 1000

for(i = 1;;i++){
	if (aNumber > 50){	
	    aNumber = aNumber/2;
	    continue;
    }
    console.log('Получается число: '+ aNumber + '. Для того, чтобы такой результат получить, надо было ' + i + ' раз делить на 2')
	break;
}*/

/*2-вариант*/

var num1000 = 1000;
var iterator = 1;
do {
    num1000 = num1000/2;
    iterator++;
}
while (num1000 >= 50);
console.log('Получается число: '+ num1000 + '. Для того, чтобы такой результат получить, надо было ' + iterator + ' раз делить на 2');
