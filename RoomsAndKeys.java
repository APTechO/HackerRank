import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RoomsAndKeys {
    
    void dfs(int source, List<List<Integer>> rooms, boolean[] visited) {
        // Mark current room as visited
        visited[source] = true;
        // For each room, explore all the rooms (neighbors) that can be accessed using the keys in the current room 
        for (int neighbor : rooms.get(source)) {
            if (!visited[neighbor]) {
                visited[neighbor] = true;
                dfs(neighbor, rooms, visited);
            }
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        // start depth first search at room 0
        dfs(0, rooms, visited);
        // after dfs, check if all rooms have been visited
        // if any room is unvisited, return false, otherwise return true
        for (int i = 0; i < rooms.size(); i++) {
            if (!visited[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        RoomsAndKeys solution = new RoomsAndKeys();

        // Example 1
        List<List<Integer>> rooms1 =  new ArrayList<>();
        rooms1.add(Arrays.asList(1)); // Room 0 contains key to room 1
        rooms1.add(Arrays.asList(2)); // Room 1 contains key to room 2
        rooms1.add(Arrays.asList(3)); // Room 2 contains key to room 3
        rooms1.add(new ArrayList<>()); // Room 3 contains no keys
        boolean result1 = solution.canVisitAllRooms(rooms1);
        System.out.println(result1);

        // Example 2
        List<List<Integer>> rooms2 =  new ArrayList<>();
        rooms2.add(Arrays.asList(1, 3)); // Room 0 contains keys to room 1 and 3
        rooms2.add(Arrays.asList(3, 0, 1)); // Room 1 contains keys to room 3, 0, and 1
        rooms2.add(Arrays.asList(2)); // Room 2 contains key to room 2
        rooms2.add(Arrays.asList(0)); // Room 3 contains key to room 0
        boolean result2 = solution.canVisitAllRooms(rooms2);
        System.out.println(result2);
    }

}