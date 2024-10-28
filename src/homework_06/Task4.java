package homework_06;

public class Task4 {
        public static void main(String[] args) {
            int a = 8;
            int b = 3;
            boolean result;

            result = (a + b) > 10;
            System.out.println("Result 1: " + result);//true, так как вскобка математическая операция будет равна
                                                    // 11, а 11 > 10, то условие является истенное

            result = (a - b) == 5;
            System.out.println("Result 2: " + result);// По той же аналогии 8-3 = 5, что так же является истенно(true)

            result = (a * b) != 24;
            System.out.println("Result 3: " + result);//false, 8 * 3 = 24,но главное в этом выражение "!",
                                                     // автоматически условие становится ложно

            result = (a / b) >= 2;
            System.out.println("Result 4: " + result);//true, потому что в данном уравнение указаны два условия больше или
                                                      //равно, одно из условий становится истенно то и все условие будет истенно

            result = !(a % b == 2);
            System.out.println("Result 5: " + result);// остаток от деления равен 2, в условии указано 2==2, но перед скобками
                                                      // стоит Логическое не, то и само выражение в результате будет ложно(false)
        }
    }

