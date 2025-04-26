import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

2class EveryThirdGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество игроков: ");
        int numberOfPlayers = scanner.nextInt();

        System.out.print("Введите номер игрока, с которого начинается игра: ");
        int startingPlayer = scanner.nextInt();

        List<Integer> players = new ArrayList<>();
        for (int i = 1; i <= numberOfPlayers; i++) {
            players.add(i);
        }

        List<Integer> eliminatedPlayers = new ArrayList<>();
        int index = (startingPlayer - 1) % players.size();

        while (players.size() > 1) {
            eliminatedPlayers.add(players.remove(index));
        }

        int winner = players.get(0);
        eliminatedPlayers.add(winner);

        // Выводим результат
        System.out.println("Выбывшие игроки: " + eliminatedPlayers);
    }
}