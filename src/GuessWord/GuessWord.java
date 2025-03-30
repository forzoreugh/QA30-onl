package GuessWord;

import java.util.Random;
import java.util.Scanner;

    public class GuessWord {
        public static void main(String[] args){

            startGame();


            // 1. Поздравительное сообщение и приглашение сыграть в игру
            // 2. Если мы принимаем это приглашение, то играем
            // 2.1. Если не принимаем, пока
            // 3. Если играем, то - задаем инструкцию
            // 4. Создадим определенный массив слов, которые будем хранить в массиве
            // 5. После этого, через использование класса Рендом, выберем одно случайно слово
            // 6. Выбрали случайное слово, теперь надо пригласить пользователя угадать это слово
            // 7. Слово угадывается - полностью или по буквам
            // 8. Если по буквам, проверить существует ли такая бука и вывести на экран какую букву отгадали
            // 8.1. Если букву не отгадали, сказать, что такой буквы нет и продолжить отгадаывание
            // 9. Если была попытка угадывания слова полностью, проверить угадали - если да, победа и запрашиваем
            // ХОТИТЕ ЛИ ВЫ СНОВА СЫГРАТЬ В ИГРУ
            // 9.1. Если слово не угадано - сообщаем эту информацию и продолжаем.
            // 10. Рано или поздно, все буквы будут отгаданы - тогда ПОБЕДА и запрашиваем хотите ли вы снова играть
            // Если нет, прощайте, если да, все ЗАНОВО.
        }

        public static void startGame(){
            getIntroductoryMsg();

            if (playGame()){
                getInstructions();

                // getRandomWord() метод принимает результат работы метода words()
                // сам метод words() просто создаем массив с данными
                // а вот метод getRandomWords из этого массива берет случайное значение и возвращает
                // в переменную String hiddenWord

                // Вызвал метод words() который массив со словами
                // Потом пробросил этот массив в getRandomWord()
                // Вернул строчку и через метод toCharArray() трансформировал его в массив символов
                char[] hiddenWord = getRandomWord(words()).toCharArray();

                System.out.println("*****************************************************************************");
                System.out.println("ИИ сгенерировал для вас скрытое слово. Пришло время начать игру.");
                System.out.println("Ваше загаданное слово: ".toUpperCase());
                showWord(hiddenWord);
                System.out.println("*****************************************************************************");

                while(true) {
                    System.out.print("Пожалуйста, введите БУКВУ или ЦЕЛОЕ СЛОВО, чтобы угадать: ");

                    String input = input().nextLine();

                    // ДОБАВИТЬ! А что если я ничего не ввел? Сделать проверку и дать мне возможность
                    // ДОБАВИТЬ! Исправить свою ошибку!
                    if (input.length() == 1) {
// String s = "dkdbd&&dgs", sub = "&&";
//if (s.indexOf(sub) != -1)


                        // Если я ввел ОДНУ БУКВУ
                        // 1. Проверить, есть ли такая буква
                        // Если нету, продолжаем
                        // Если есть, показать ее в слове, а остальные буквы оставить скрытыми
                        // Например: Banana, я ввел букву - а
                        // На экране должно появится: *а*а*а
                        // Если отгадали еще букву - b, ba*a*a
                        // И продолжаем вводить буквы
                        // Следует проверить не закончились ли буквы у вас
                        // Если все буквы отгаданы - проверка статуса и ВЫ ПОБЕДИЛИ

                        // ДОБАВИТЬ МЕХАНИЗМ ПОВТОРА ИГРЫ. Т.Е. ЕСЛИ Я ПОБЕДИЛ, НЕ ПРОСТО ЗАКОНЧИТЬ ИГРУ
                        // А СПРОСИТЬ МЕНЯ: МОЖЕТ ЕЩЕ? ДА, ЗАНОВО ВСЕ, НЕТ - ПРОЩАЙТЕ и ПРОГРАММА ЗАКАНЧИВАЕТСЯ!!!!
                    } else if (input.length() > 1) {
                        // Если я ввел слово
                        // String.valueOf() -> превращает значения в строчку
                        // после этого .equalsIgnoreCase(_значение) - проверить слова на совпадение
                        // без учета регистра
                        if (checkWord(input, hiddenWord)){
                            System.out.println("YOU HAVE GUESSED THE WORD. YOU HAVE WON!");
                            return;
                        } else {
                            System.out.println("YOU MISSED!");
                        }
                    }
                }
            } else {
                System.out.println("\nYou said NO. GOODBYEEEEE!".toUpperCase());
            }
        }

        public static void getIntroductoryMsg(){
            System.out.println("Приветствуем Вас в игре ПОЛЕ ЧУДЕС!. Компьютер случайным образом выберет слово, " +
                    "а Вы должны его угадать!.");
            System.out.println("Если Вы угадает слово - Ваш приз АВТОМОБИЛЬ!!!");
        }

        public static boolean playGame(){
            System.out.println();
            System.out.print("Ну что, готов играть? (y - ДА, иная буква - НЕТ): ");

            return input().nextLine().equalsIgnoreCase("y");
        }

        public static void getInstructions(){
            System.out.println("\nИИ создал набор скрытых слов. Он сохранил эти слова в массиве.");
            System.out.println("Случайное число было сгенерировано для случайного выбора слова из массива.");
            System.out.println("Вам необходимо угадать слово сразу, либо по БУКВЕ");
        }

        public static String[] words(){
            return new String[]{
                    "Яблоко", "Апельсин", "Автомобиль", "Ящик", "Колесо",
                    "Работник", "Парашют", "Тренировка", "Барабан", "Самолет",
                    "Синхрофазатрон", "Дверь", "Собака", "Кошка", "Хлеб",
                    "Предохранитель", "Велосипед", "Ошибка", "Приветствие", "Луна"
            };
        }

        public static String getRandomWord(String[] hiddenWords){
            // верни мне массив hiddenWords[создай случайное число от 0 до длины массива]
            // если массив длиной в 20 элементов - то случайное число буде от 0 до 20, 0-19
            return hiddenWords[new Random().nextInt(0, hiddenWords.length)];
        }

        public static void showWord(char[] word){
            for (char letter : word){
                System.out.print(letter + "\t");
            }
            System.out.println();
        }

        public static boolean checkWord(String input, char[] word){
            return String.valueOf(word).equalsIgnoreCase(input);
        }

        public static Scanner input(){
            return new Scanner(System.in);
        }
    }