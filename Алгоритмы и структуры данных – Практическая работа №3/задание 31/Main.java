
public class Main {

    public static void main(String[] args) {
        int[] distances = {50, 55, 57, 58, 60};
        int maxDistance = 175;
        int numCities = 3;

        int result = chooseBestSum(maxDistance, numCities, distances);
        System.out.println(result);
    }

    public static int chooseBestSum(int maxDistance, int numCities, int[] distances) {
        int bestSum = 0;


        for (int i = 0; i < distances.length; i++) {
            for (int j = i + 1; j < distances.length; j++) {
                for (int k = j + 1; k < distances.length; k++) {
                    int currentSum = distances[i] + distances[j] + distances[k];


                    if (currentSum <= maxDistance) {
                        bestSum = Math.max(bestSum, currentSum);
                    }
                }
            }
        }

        return bestSum > 0 ? bestSum : -1;
    }
}