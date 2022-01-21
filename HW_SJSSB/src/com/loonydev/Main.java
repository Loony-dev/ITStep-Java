package com.loonydev;

import java.util.*;

public class Main {

    // -- Global
    private static Scanner mScanner;

    // -- StringBuilder Task
    private static final String[] mSurnames = {"Иванов", "Смирнов", "Кузнецов", "Попов", "Васильев", "Петров", "Соколов", "Михайлов", "Новиков", "Фёдоров"};
    private static final String[] mNames = {"Андрей", "Антон", "Артём", "Евгений", "Лев", "Марк", "Александр", "Дмитрий", "Виктор", "Давид"};
    private static final String[] mPatronymic = {"Максимович", "Владиславович", "Витальевич", "Васильевич", "Игоревич", "Саныч", "Федорович", "Юрьевич", "Ярославович", "Романович"};

    public static void main(String[] args) {
        mScanner = new Scanner(System.in);

        System.out.println("Enter task id:\n1 - Split task\n2 - Name generator(StringBuilder)\n3 - Join task\n4 - Second split task");

        switch (mScanner.nextInt()) {
            case 1: splitTask(); break;
            case 2: stringBuilderTask(); break;
            case 3: joinTask(); break;
            case 4: splitTaskTwo(); break;
            default:
                System.out.println("Error: Invalid task id");
        }
    }

    public static void splitTask() {
        String[][] words = new String[0][];
        String tmp;

        while (!Objects.equals(tmp = mScanner.nextLine(), "/end")) {
            words = Arrays.copyOf(words, words.length + 1);
            words[words.length - 1] = tmp.split(" ");
        }

        for (String[] word : words) {
            for (String s : word)
                System.out.print(s + "\t\t");

            System.out.println();
        }
    }

    public static void joinTask() {
        String srcString = "Keep.calm.and.listen.to.ROCK";
        String outString = String.join(" ", srcString.split("\\."));

        System.out.println(outString);
    }

    public static void stringBuilderTask() {
        ArrayList<FullNameData> generatedFullNames = new ArrayList<>();

        for (int i = 0; i < mSurnames.length; i++)
            generatedFullNames.add(new FullNameData(mSurnames[(int)(Math.random() * mSurnames.length)], mNames[(int)(Math.random() * mNames.length)], mPatronymic[(int)(Math.random() * mPatronymic.length)]));

        for (int i = 0; i < generatedFullNames.size(); i++) {
            FullNameData data = generatedFullNames.get(i);
            StringBuilder result = new StringBuilder();

            result.append(i + 1).append("\t");
            result.append(data.getSurname()).append("\t");
            result.append(data.getName()).append("\t");
            result.append(data.getPatronymic()).append("\t");

            System.out.println(result);
        }
    }

    public static void splitTaskTwo() {
        String str = "Падение Гипериона#Маракотова бездна#Молли Мун и волшебная "
                + "книга гипноза#451 градус по Фаренгейту#Планета Ка-Пэкс#"
                + "Цветы для Элджернона#Собачье сердце#Кукольных дел мастер#"
                + "Пикник на обочине#Марсианские хроники#Понедельник начинается "
                + "в субботу#Марсианин#Трудно быть богом";

        String[] splitStr = str.split("#");

        for (int i = 0; i < splitStr.length; i++)
            splitStr[i] = "* " + splitStr[i];

        for (String result : splitStr)
            System.out.println(result);
    }
}
