package com.company;

public class ArrayUtility {

    /**
     * Вернуть сумму элементов массива
     *
     *  Пример 1.: При вызове метода с аргументами old array = {1}, результат 1
     *  Пример 2.: При вызове метода с аргументами old array = {1, 2, 9, 10}, результат 22
     */
    public static int  returnArrayElementsSum(int[] arrays)
    {
        int a = 0;

        for(int i=0; i<arrays.length; i++)
        {
            a = a + arrays[i];
        }
        return a;
    }

    /**
     * Задача метода получить на вход массив и еще одно число,
     * на выхоже вернуть новый массив, включающий все старые значения массива + новое значение
     *
     *  Пример 1.: При вызове метода с аргументами old array = {1}, newValue=2, результат {1, 2}
     *  Пример 2.: При вызове метода с аргументами old array = {1, 2, 9, 10}, newValue=3, результат {1, 2, 9, 10, 3}
     */
    public static int[] appendNewValue(int[] oldArray, int newValue)
    {
        int[] newArray= new int[oldArray.length + 1];
        for(int i=0; i<oldArray.length; i++)
        {
            newArray[i] = oldArray[i];
        }
        newArray[oldArray.length] = newValue;   // либо newArray[newArray.length - 1] = newValue;
        return newArray;
    }

    /**
     * Задача метода получить на вход массив и еще одно число,
     * на выхоже вернуть новый массив, включающий все старые значения массива + новое значение
     *
     *  Пример 1.: При вызове метода с аргументами old array = {1}, newValue=2, secondNewValue=3, результат {1, 2, 3}
     *  Пример 2.: При вызове метода с аргументами
     *      old array = {1, 2, 9, 10}, newValue=3, secondNewValue = 10000, результат {1, 2, 9, 10, 3, 10000}
     */
    public static int[] appendNew2Values(int[] oldArray, int newValue, int secondNewValue)
    {
        //return appendNewValue(appendNewValue(oldArray, newValue), secondNewValue); - другой варант того же

        int[] result;
        result = appendNewValue(oldArray, newValue);
        result = appendNewValue(result, secondNewValue);
        return result;

//        int[] newArray = appendNewValue(oldArray,newValue);
//        newArray = appendNewValue(newArray,secondNewValue);
//        return newArray;
    }

    /**
     * Задача метода получить на вход 2 массива,
     * на выхоже вернуть новый массив, включающий все значения обоих массивов
     *
     *  Пример 1.: При вызове метода с аргументами oldArray1 = {1, 2}, oldArray1 = {1, 3}, результат {1, 2, 1, 3}
     *  Пример 2.: При вызове метода с аргументами oldArray1 = {1, 2}, oldArray1 = {}, результат {1, 2}
     */
    public static int[] appendNewValues(int[] oldArray1, int[] oldArray2)
    {
        int[] newArray = new int[oldArray1.length + oldArray2.length];
        for (int i = 0; i < oldArray1.length; i++) {
            newArray[i] = oldArray1[i];
        }
        for (int i = 0; i < oldArray2.length; i++) {
            newArray[i + oldArray1.length] = oldArray2[i];
        }
        return newArray;
    }

    /**
     * Задача метода получить на вход массив и еще одно число,
     * на выхоже вернуть новый массив, в котором не будет значений равных value
     *
     *  Пример 1.: При вызове метода с аргументами old array = {1, 1, 1, 1}, value=2, результат {1, 1, 1, 1}
     *  Пример 1.: При вызове метода с аргументами old array = {2, 100, 12, 2}, value=2, результат {100, 12}
     */
    public static int[] deleteAllSameValuesFromArray(int[] oldArray, int value) {
        int count = 0;
        for (int i = 0; i < oldArray.length; i++) {
            if (oldArray[i] == value) {
                count++;
            }
        }
        int y = 0;
        int[] newArray = new int[oldArray.length - count];
        for (int i = 0; i < oldArray.length; i++) {
            if (oldArray[i] != value) {
                newArray[y] = oldArray[i];
                y++;
            }

        }
        return newArray;
    }

   /**
     * Задача метода получить на вход 2 массива,
     * на выхоже вернуть новый массив, включающий все значения обоих массивов, без повторов
     *
     *  Пример 1.: При вызове метода с аргументами oldArray1 = {1, 2}, oldArray1 = {1, 3}, результат {1, 2, 3}
     *  Пример 2.: При вызове метода с аргументами oldArray1 = {11, 2}, oldArray1 = {10000}, результат {11, 2, 10000}
     */
    public static int[] appendAllUniqueValues(int[] oldArray1, int[] oldArray2) {
        //перебрать\посчитать в каждом old массиве одинаковые эт-ты
        int numberUniqValues1 = oldArray1.length;
        for (int i = 0; i < oldArray1.length; i++) {
            int count1 = 0;
            {
                for (int j = 0; j < oldArray1.length - i; j++) {
                    if (oldArray1[i] == oldArray1[j])
                        count1++;
                }
            }
            if (count1 > 1) numberUniqValues1 = oldArray1.length - count1 + 1;
        }

        int numberUniqValues2 = oldArray2.length;
        for (int i = 0; i < oldArray2.length; i++) {
            int count2 = 0;
            {
                for (int j = 0; j < oldArray2.length - 1; j++) {
                    if (oldArray2[i] == oldArray2[j])
                        count2++;
                }
            }
            if (count2 > 1) numberUniqValues2 = oldArray2.length - count2 + 1;
        }

        //создаем новый массив на основе двух старых с длиной персчитаной
        int[] newArray = new int[(oldArray1.length - numberUniqValues1) + (oldArray2.length - numberUniqValues2)];

        //записываем в новый массив первый элемент
        oldArray1[0] = newArray[0];

        // далее записываем в него недублирующиеся значения из старого первого массива

        for (int i = 1; i < oldArray1.length; i++) {
            if (oldArray1[i] != newArray[i - 1]) {
                oldArray1[i] = newArray[i];
            }
        }

        //записываем в новый массив первый элемент из old2
        oldArray2[0] = newArray[oldArray1.length - numberUniqValues1 + 1];

        //записываем в новый массив эл-ты из недублирующиеся значения из старого второго массива
        for (int i = 1; i < oldArray2.length; i++) {
            if (oldArray2[i] != newArray[oldArray1.length - numberUniqValues1 + 1]) {
                oldArray2[i] = newArray[oldArray1.length - numberUniqValues1 + 2];
            }
        }
        // считаем дубли в новом массиве
        int numberUniqValuesNew = newArray.length;
        int dubli;
        for (int i = 0; i < newArray.length; i++) {
            dubli = 0;
            for (int j = 0; j < newArray.length - 1; j++) {
                if (newArray[i] == newArray[j])
                    dubli++;
            }
            if (dubli > 1) numberUniqValuesNew = newArray.length - dubli + 1;
        }
        // создаем массив, где будут уникальные значения
        int[] uniqArray = new int[numberUniqValuesNew];

        //записываем в уникальный массив первое значение из newArray
        newArray[0] = uniqArray[0];

        //записываем в уникальный массив недублирующиеся эл-ты из newArray массива
        for (int i = 1; i < newArray.length; i++) {
            if (newArray[i] != uniqArray[i - 1]) {
                newArray[i] = uniqArray[i];
            }
        }
        return uniqArray;
    }
        //MOE СТАРОЕ
//        int newArraySize = oldArray1.length + oldArray2.length;
//        for (int i = 0; i < oldArray1.length; i++) {
//            for (int j = 0; j < oldArray2.length; j++) {
//                if (oldArray1[i] == oldArray2[j]){
//                    newArraySize--;
//                }
//
//            }
//
//        }
//        int [] newArray = new int[newArraySize];
//        for (int i = 0; i < oldArray1.length; i++) {
//            newArray[i] = oldArray1[i];
//        }
//        for (int i = 0; i < oldArray2.length; i++) {
//
//
//            newArray[i + oldArray1.length] = oldArray2[];
//
//        }

///**
//        массив1: 1 2 4 5
//        массив2: 1 6 5 7
//        Должен получится 1 2 4 5 6 7
//
//        1. Схлопываем массив в один большой bigArray
//        2. Подсчитываем количество уникальных значений в bigArray
//        3. Создаем массив под уникальные значения uniqueArray
//        4. Добавляем в уникальный массив значения из большого массива, если их еще в нем нет
//
//*/
//        // 1. Схлопываем массив в один большой bigArray
//        int [] bigArray = new int[oldArray1.length + oldArray2.length];   //создаем большой массив под оба исходных
//        for (int i = 0; i < oldArray1.length; i++) {   //записываем в большой массив значения из old1
//            bigArray[i] = oldArray1[i];
//        }
//        for (int i = 0; i < oldArray2.length; i++) {
//            bigArray[i + oldArray2.length+1] = oldArray2[i];  //записываем в новый массив значения из old2
//            }
//
//        // 2. Подсчитываем количество уникальных значений в bigArray
//        int numberOfUniqueValues = oldArray1.length + oldArray2.length; // для начала считаем что все значения в большом массиве - уникальные
//        int counter;
//        for (int i = 0; i < bigArray.length; i++) { // берем по очереди значения в большом массиве
//            counter = 0;
//            for (int j = 0; j < bigArray.length - i; j++) { // и сравниваем их со ВСЕМИ значениями в большом массиве
//                if (bigArray[i] == bigArray[j]) counter++; // считаем количество значений (1 - уникальное, больше 1 - есть повторы)
//
//            }
//            if (counter > 1) numberOfUniqueValues = numberOfUniqueValues-counter+1; // охереть, работает!
//            // если есть повторы мы сокращаем количество уникальных значений на количество повторов. (количество повторов это все что больше counter=1)
//        }
//
//        // 4. Добавляем в уникальный массив значения из большого массива, если их еще в нем нет
//
//      int [] uniqueArray = new int[numberOfUniqueValues]; // создаем массив под уникальные значения
//        int o =0;
//        for (int i = 0; i < bigArray.length; i++) { // проверяем каждое значение из большого массива
//            counter = 0;
//
//            for (int j = 0; j < uniqueArray.length; j++) { // сравниваем это значение с каждым значением из уникального массива
//            if (bigArray[i] == uniqueArray[j]) counter++; // увеличиваем счетчик, если находим равное значение
//            }
//            if (counter == 0) { // если не нашли в уникальном массиве значение, равного текущему значению из большого массива
//                uniqueArray[o] = bigArray[i]; // то записываем это значение на позицию о (это типа каретки для уникального массива)
//                o++; // двигаем каретку вправо если записали что-то в унникальный массив
//            }
//        }
//
//        return uniqueArray;
//    }

    /**
     * Задача метода получить на вход массив и еще одно число,
     * на выхоже вернуть новый массив, в котором будет присутствовать новое значение и массив будет отсортирован по возрастанию
     *
     *  Пример 1.: При вызове метода с аргументами old array = {1, 1, 1, 1}, value=2, результат {1, 1, 1, 1, 2}
     *  Пример 1.: При вызове метода с аргументами old array = {2, 100, 12}, value=22, результат {2, 12, 22, 100}
     */
    public static int[] appendNewValueAndSort(int[] oldArray, int value)
    {
        return oldArray;
    }
}
