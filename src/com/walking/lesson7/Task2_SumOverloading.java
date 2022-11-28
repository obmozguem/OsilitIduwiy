package com.walking.lesson7;
/*Реализовать методы «вычисления суммы» для всех примитивных типов, кроме void. Возвращать:
Для числовых типов — тот же тип. Даже если это ведет к потере точности. При угрозе потери данных — выводить сообщение
 в консоль и возвращать текущий результат (для byte, short, int);
Для boolean — определение истинности всех переданных параметров, принимая то, что их стоит объединять через логическое И;
Для char — строку, полученную в результате конкатенации всех переданных параметров.
Количество параметров может быть любым. Используйте перегрузку — у всех методов должны быть одинаковые названия.
Примечание: это задача без вариантов, методы для всех типов должны быть реализованы в одной программе.
ДОДЕЛАТЬ С ПЕРЕПОЛНЕНИЕМ
*/

public class Task2_SumOverloading {
    public static void main(String[] args) {
        System.out.println(sum((byte) 120, (byte) 2, (byte) 130));
        System.out.println(sum((short) 1, (short) -5, (short) 2));
        System.out.println(sum(45, 96, 45));
        System.out.println(sum(47L, 25L, 8L));
        System.out.println(sum(true, false, true));
        System.out.println(sum('a', 'b', 'c'));
    }

    static byte sum(byte... bytes) {
        byte result = 0;
        for (byte b : bytes) {
            result += b;
            if (result > Byte.MAX_VALUE) {
                System.out.println("Угроза переполнения byte. Значение до переполнения: " + (result - b));
                result -=b;
                return result;
            }
            if (result < Byte.MIN_VALUE) {
                System.out.println("Угроза переполнения byte. Значение до переполнения: " + (result + b));
                return result;
            }
        }
        return result;
    }

    static short sum(short... shorts) {
        short result = 0;
        for (short s : shorts) {
            result += s;
            if (result > Short.MAX_VALUE) {
                System.out.println("Угроза переполнения byte. Значение до переполнения: " + (result - s));
                return result;
            }
            if (result < Short.MIN_VALUE) {
                System.out.println("Угроза переполнения byte. Значение до переполнения: " + (result + s));
                return result;
            }
        }
        return result;
    }

    static int sum(int... ints) {
        int result = 0;
        for (int i : ints) {
            result += i;
            if (result > Integer.MAX_VALUE) {
                System.out.println("Угроза переполнения byte. Значение до переполнения: " + (result - i));
                return result;
            }
            if (result < Integer.MIN_VALUE) {
                System.out.println("Угроза переполнения byte. Значение до переполнения: " + (result + i));
                return result;
            }
        }
        return result;
    }

    static long sum(long... longs) {
        long result = 0;
        for (long l : longs) {
            result += l;
            if (result > Long.MAX_VALUE) {
                System.out.println("Угроза переполнения byte. Значение до переполнения: " + (result - l));
            }
            if (result < Long.MIN_VALUE) {
                System.out.println("Угроза переполнения byte. Значение до переполнения: " + (result + l));
            }
        }
        return result;
    }

    static boolean sum(boolean... booleans) {
        boolean result = true;
        for (boolean b : booleans) {
            if (!b) {
                result = false;
                return result;
            }
        }
        return result;
    }

    static String sum(char... chars) {
        String result = "";
        for (char ch : chars) {
            result += ch;
        }
        return result;
    }
}
