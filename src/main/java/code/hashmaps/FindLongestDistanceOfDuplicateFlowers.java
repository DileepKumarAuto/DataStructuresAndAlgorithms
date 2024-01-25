package code.hashmaps;

import java.util.HashMap;

public class FindLongestDistanceOfDuplicateFlowers {
    public static int longestDistance(String[] flowers, String target) {
        HashMap<String, Integer> flowerIndexMap = new HashMap<>();
        int finalMaximumDistance = -1;

        for (int i = 0; i < flowers.length; i++) {
            String flower = flowers[i];

            if (flowerIndexMap.containsKey(flower)) {
                int startIndex = flowerIndexMap.get(flower);
                int currentDistance = i - startIndex;
                // Compare with the finalMaximumDistance and update if necessary
                finalMaximumDistance = Math.max(finalMaximumDistance, currentDistance);
            }
            // Update the flower's index in the map
            flowerIndexMap.put(flower, i);
        }

        return finalMaximumDistance;
    }

    public static void main(String[] args) {
        String[] flowers = {"rose", "rose", "lily", "jasmine", "lily"};
        String target = "rose";

        int distance = longestDistance(flowers, target);

        if (distance != -1) {
            System.out.println("The longest distance between occurrences of '" + target + "' is: " + distance);
        } else {
            System.out.println("'" + target + "' not found or there are less than two occurrences.");
        }
    }
}