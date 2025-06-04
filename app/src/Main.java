```java
import core.RewardManager;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RewardManager manager = new RewardManager();

        System.out.print("Enter your network (MTN/Vodacom/Telkom/Cell C): ");
        String network = scanner.nextLine().trim();

        String reward = manager.claimReward(network);
       
