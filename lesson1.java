//10.19 Даны два натуральных числа, выяснить в каком из них больше цифр, определите функцией

/*
public class lesson1{
	public static void main(String [] args){
		compare(15, 15);
	}

	static void compare(int number1, int number2){
		if (number1>number2){
			System.out.println(number1+" is bigger than "+number2);
		}
		else if (number1<number2) {
			System.out.println(number1 +" is smaller than "+ number2);
		}
		else if(number1==number2) {
			System.out.println(number1 + " is equal to "+ number2);
		}
	}
}
*/

//-----------------------------------------------------------------------------------------------------------------


//10.20 Получить шестизначное счастливое число(число из 6 цифр где сумма первых трех чисел равно последним трем)
/*
public class lesson1{
	public static void main(String[] args) {
	check_luckyNumber();
}
	

	static void check_luckyNumber(){
		for (int i=0;i<999999 ;i++ ) {
			luckyNumber(i);

		}
	}
	static void luckyNumber(int numbers){
		int m1 = numbers/100000;
		int m2 = numbers/10000%10;
		int m3 = numbers/1000%100%10;
		int m4 = numbers/100%1000%100%10;
		int m5 = numbers/10%10000%1000%100%10;
		int m6 = numbers/1%100000%10000%1000%100%10;
		if ((m1+m2+m3) == (m4 + m5+ m6)){
			System.out.println(numbers + " is luckyNumber");
		}
	}
}
*/
///Aiidyn chort///
