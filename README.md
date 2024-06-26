# TZ2 by Maxim Romanov, student of group 232 of the Bachelor's educational program Business Informatics HSE Graduate School of Business
![Java CI with Maven](https://github.com/MaxonMalutka/TZ2/actions/workflows/maven.yml/badge.svg)

## Описание

Этот проект на Java предназначен для чтения данных из текстовых файлов и выполнения различных операций, таких как поиск минимального и максимального значений, суммирование и умножение элементов. Проект также включает тестирование производительности этих операций с использованием JUnit, а также проведение тестов экстремальных случаев.

## Содержание

- [Описание](#описание)
- [Требования](#Требования)
- [Установка](#Установка)
- [Использование](#Использование)
- [Тестирование](#Тестирование)
- [График](#График)
- [Интеграция CI-системы в Telegram](#Telegram)
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

## График

![time_graph](https://github.com/MaxonMalutka/TZ2/assets/167713178/98037933-4eac-45e8-9287-d01967ecd47b)

График зависимости выполнения функции _sum (ось Y) от количества данных в файле (ось X) имеет вид линейной регрессии. График построен на 100 измерениях, среди результатов которых наблюдается выбросы. Это объясняется тем, что при большом количестве данных кэш переполняется и происходит обращение к оперативной памяти, из-за чего время выполнения функции увеличивается (также возможно, что паралллельно какие-то другие программы/процессы забирали ресурсы процессора, однако во время проведения измерений влияние этого фактора я старался минимизировать). 

## Telegram 

В проект также интегрирована CI-система. Результаты тестов присылаются ботом в чат в телеграмме, ссылка на который находится ниже:
https://t.me/TZ2Maxontests
