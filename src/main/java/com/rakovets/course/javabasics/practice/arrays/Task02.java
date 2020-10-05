package com.rakovets.course.javabasics.practice.arrays;

import com.rakovets.course.javabasics.util.StandardInputTask;

<<<<<<< HEAD
import java.math.BigDecimal;
import java.math.RoundingMode;

=======
>>>>>>> e35675c... feat: add tasks for theme 'Arrays'
/**
 * Разработать программу для электронного дневника:
 * которая работает с отметками по всем предметам.
 *
 * @author Dmitry Rakovets
 * @version 1.0
 */
public class Task02 extends StandardInputTask {
    public static void main(String[] args) {
        // Ввод данных осуществляется в Standard Input, для проверки различных вариантов входных параметров
        int countDisciplines = INPUT_SCANNER.nextInt();
        int countSemesters = INPUT_SCANNER.nextInt();
        int[][] marks = nextArray(countDisciplines, countSemesters);

        // Вызов методов
        getAverageMark(marks);
        getMinMark(marks);
        getMaxMark(marks);
    }

    /**
     * Возвращает средне арифметическую отметку за весь период обучения с округлением до 2 знаков.
     *
     * @param marks отметки
     * @return средняя арифметическая отметка
     */
    static double getAverageMark(int[][] marks) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
<<<<<<< HEAD
        double average = 0;
        double sum = 0;
        for(int i = 0; i<marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                sum += marks[i][j];
                average = sum / (marks.length * marks[i].length);
            }
        }
        return new BigDecimal((double) average).setScale(2, RoundingMode.HALF_DOWN).doubleValue();
=======
        return 0.0;
>>>>>>> e35675c... feat: add tasks for theme 'Arrays'
    }

    /**
     * Возвращает минимальную отметку за весь период обучения.
     *
     * @param marks отметки
     * @return минимальная отметка
     */
    static int getMinMark(int[][] marks) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
<<<<<<< HEAD
        int minZnach = marks[0][0];
        for (int i = 0; i < marks.length; i++) {
            for(int j = 0; j < marks[i].length; j++) {
                if (minZnach > marks[i][j]) {
                    minZnach = marks[i][j];
                }
            }
        }
        return minZnach;
=======
        return 0;
>>>>>>> e35675c... feat: add tasks for theme 'Arrays'
    }

    /**
     * Возвращает максимальну отметку за весь период обучения.
     *
     * @param marks отметки
     * @return максимальная отметка
     */
    static int getMaxMark(int[][] marks) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
<<<<<<< HEAD
        int maxZnach = marks[0][0];
        for (int i = 0; i < marks.length; i++) {
            for(int j = 0; j < marks[i].length; j++) {
                if (maxZnach < marks[i][j]) {
                    maxZnach = marks[i][j];
                }
            }
        }
        return maxZnach;
=======
        return 0;
>>>>>>> e35675c... feat: add tasks for theme 'Arrays'
    }

    private static int[][] nextArray(int countDisciplines, int countSemesters) {
        int[][] marks = new int[countDisciplines][countSemesters];
        for (int i = 0; i < countDisciplines; i++) {
            for (int j = 0; j < countSemesters; j++) {
                marks[i][j] = INPUT_SCANNER.nextInt();
            }
        }
        return marks;
    }
}