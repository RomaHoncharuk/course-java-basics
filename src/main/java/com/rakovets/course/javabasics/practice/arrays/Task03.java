package com.rakovets.course.javabasics.practice.arrays;

import com.rakovets.course.javabasics.util.StandardInputTask;

<<<<<<< HEAD
import javax.naming.spi.DirStateFactory;
import javax.xml.transform.Result;
import java.math.BigDecimal;
import java.math.RoundingMode;

=======
>>>>>>> e35675c... feat: add tasks for theme 'Arrays'
/**
 * Разработать программу для электронного дневника:
 * которая работает с отметками по каждому предмету.
 *
 * @author Dmitry Rakovets
 * @version 1.0
 */
public class Task03 extends StandardInputTask {
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
     * Возвращает средне арифметическую отметку по предметам за весь период обучения с округлением до 2 знаков.
     *
     * @param marks отметки
     * @return средняя арифметическая отметка
     */
    static double[] getAverageMark(int[][] marks) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
<<<<<<< HEAD
        double[] massSum = new double[marks.length];
        for (int i = 0; i < marks.length; i++) {
            int average = 0;
            for (int average2 : marks[i]) {
                average += average2;
            }
            double promegytZnachenie = new BigDecimal((double) average / marks[i].length).setScale(2, RoundingMode.HALF_DOWN).doubleValue();
            massSum[i] = promegytZnachenie;
        }
        return massSum;
=======
        return null;
>>>>>>> e35675c... feat: add tasks for theme 'Arrays'
    }

    /**
     * Возвращает минимальную отметку по предметам за весь период обучения.
     *
     * @param marks отметки
     * @return минимальная отметка
     */
    static int[] getMinMark(int[][] marks) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
<<<<<<< HEAD

        int[] massivMin = new int[marks.length];
        for (int i = 0; i < marks.length; i++) {
            int  minZnak = marks[i][0];
            for (int j = 0; j < marks[i].length; j++) {
                if (minZnak > marks[i][j] ) {
                    minZnak = marks[i][j];
                }
                massivMin[i] = minZnak;
            }
        }
        return massivMin;

=======
        return null;
>>>>>>> e35675c... feat: add tasks for theme 'Arrays'
    }

    /**
     * Возвращает максимальну отметку по предметам за весь период обучения.
     *
     * @param marks отметки
     * @return максимальная отметка
     */
    static int[] getMaxMark(int[][] marks) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
<<<<<<< HEAD
        int[] massivMax = new int[marks.length];
        for (int i = 0; i < marks.length; i++) {
            int  maxZnak = marks[i][0];
            for (int j = 0; j < marks[i].length; j++) {
                if (maxZnak < marks[i][j] ) {
                    maxZnak = marks[i][j];
                }
                massivMax[i] = maxZnak;
            }
        }
        return massivMax;
=======
        return null;
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