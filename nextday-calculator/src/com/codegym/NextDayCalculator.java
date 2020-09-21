package com.codegym;

public class NextDayCalculator {
    public static int[] findNextDay(int[] day) {
        int[] arrNextDay = day;
        int lastDay = getLastDay(day, arrNextDay);
        if (day[1] == 12) {
            updateDayInLastMonth(arrNextDay, lastDay);
        } else {
            updateDayExceptLastMonth(arrNextDay, lastDay);
        }
        return arrNextDay;
    }

    private static int getLastDay(int[] day, int[] arrNextDay) {
        int lastDay;
        switch (arrNextDay[1]) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                lastDay = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                lastDay = 30;
                break;
            case 2:
                if (isLeapYear(day[2])) {
                    lastDay = 29;
                } else {
                    lastDay = 28;
                }
                break;
            default:
                lastDay = -1;
        }
        return lastDay;
    }

    public static boolean isLeapYear(int year) {
        boolean isRight = false;
        boolean isDivisionBy4 = year % 4 == 0;
        boolean isDivisionBy100 = year % 100 == 0;
        boolean isDivisionBy400 = year % 400 == 0;

        if (isDivisionBy4) {
            if (isDivisionBy100) {
                if (isDivisionBy400) {
                    isRight = true;
                }
            } else {
                isRight = true;
            }
        }
        return isRight;
    }

    public static void updateDayExceptLastMonth(int[] arr, int lastDay) {
        if (arr[0] == lastDay) {
            arr[0] = 1;
            arr[1]++;
        } else {
            arr[0]++;
        }
    }

    public static void updateDayInLastMonth(int[] arr, int lastDay) {
        if (arr[0] == lastDay) {
            arr[0] = 1;
            arr[1] = 1;
            arr[2]++;
        } else {
            arr[0]++;
        }
    }
}
