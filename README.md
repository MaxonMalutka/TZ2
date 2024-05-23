![Tests](https://github.com/MaxonMalutka/TZ2/workflows/maven.yml/badge.svg)
# TZ2 by Maxim Romanov, student of group 232 of the Bachelor's educational program Business Informatics HSE Graduate School of Business

## Описание

Этот проект на Java предназначен для чтения данных из текстовых файлов и выполнения различных операций, таких как поиск минимального и максимального значений, суммирование и умножение элементов. Проект также включает тестирование производительности этих операций с использованием JUnit, а также проведение тестов экстремальных случаев.

## Содержание

- [Описание](#описание)
- [Требования](#Требования)
- [Установка](#Установка)
- [Использование](#Использование)
- [Тестирование](#Тестирование)

## Требования

- Java 8 или новее
- Apache Maven 3.6.0 или новее
- JUnit 4.12 или новее

## Установка

1. Склонируйте репозиторий:
   ```sh
   git clone https://github.com/MaxonMalutka/TZ2.git
   cd TZ2
   ```

2. Установите зависимости с помощью Maven:
   ```sh
   mvn clean install
   ```

## Использование

1. Поместите ваш текстовый файл 'myfile.txt' с данными в папку src/main/resources/.

2. Запустите основной класс проекта:
   ```sh
   mvn exec:java -Dexec.mainClass="tz2.Main" -Dexec.args="src/main/resources/myfile.txt"
   ```
3. Класс Main выполнит следующие операции над данными из файла:

  - Поиск минимального значения
  - Поиск максимального значения
  - Получение значения суммы всех чисел из файла
  - Получение значения произведения всех чисел из файла

## Тестирование
Проект включает тесты на JUnit для проверки правильности выполнения операций, измерения их производительности и тестирования экстремальных случаев содержимого файла.

1. Чтобы запустить тесты, используйте команду:
```sh
mvn test
```
2. Тесты находятся в файле TestMain.java и включают:

- testfuncs(): Проверяет правильность выполнения операций на примере файла test1.txt.
- performancetest(): Измеряет время выполнения операций при увеличении размера входного файла (test2.txt и test3.txt).
- singleelementtest(): Проверяет работу операций на файле с одним элементом (test4.txt).
- *(технический)graphic(): Выполняет тестирование производительности для нескольких файлов и выводит время выполнения операций в наносекундах.
