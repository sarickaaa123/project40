package project39;

import java.util.Scanner; // Додадено за користење на Scanner класата

	class Min {
	    int min;

	    // Метод за пресметување на минимум од два броја
	    void minFun(int n1, int n2) {
	        min = n1; // Претпоставен минимум
	        if (min > n2) {
	            min = n2;
	        }
	        System.out.println("Од броевите " + n1 + " и " + n2 + " помал е " + min);
	    }

	    // Метод за пресметување на минимум од три броја
	    void minFun(int n1, int n2, int n3) {
	        min = n1; // Претпоставен минимум
	        if (min > n2) {
	            min = n2;
	        }
	        if (min > n3) {
	            min = n3;
	        }
	        System.out.println("Од броевите " + n1 + " " + n2 + " " + n3 + " најмал е " + min);
	    }

	    // Метод за пресметување на аритметичка средина
	    void calculateAverage(int[] numbers) {
	        int sum = 0;
	        for (int num : numbers) {
	            sum += num;
	        }
	        double average = (double) sum / numbers.length;
	        System.out.println("Аритметичката средина на броевите е: " + average);
	    }

	    public static void main(String[] args) {
	        Min najmal = new Min(); // Креирање на објект од класата

	        // Внесување на број на броеви што корисникот сака да ги внесе
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Внесете колку броеви сакате да внесете: ");
	        int count = scanner.nextInt();

	        // Внесување на броевите
	        int[] numbers = new int[count];
	        for (int i = 0; i < count; i++) {
	            System.out.print("Внесете број #" + (i + 1) + ": ");
	            numbers[i] = scanner.nextInt();
	        }

	        // Повик на методот за пресметување на аритметичка средина
	        najmal.calculateAverage(numbers);

	        // Затворање на Scanner објектот
	        scanner.close();
	    }
	}

