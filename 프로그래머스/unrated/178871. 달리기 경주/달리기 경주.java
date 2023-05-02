import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
            HashMap<String, Integer> map = new HashMap<>();
            for(int i = 0; i < players.length; i++) {
                map.put(players[i], i);
            }

            for(String player : callings) {
                int ownRank = map.get(player);
                String beforePlayer = players[ownRank - 1];

                players[ownRank - 1] = player;
                players[ownRank] = beforePlayer;

                map.put(player, ownRank - 1);
                map.put(beforePlayer, ownRank);
            }

        return players;
    }
}