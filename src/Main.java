import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> lines = new ArrayList<>();
        String line;
        while ((line = in.nextLine()) != null && !line.isEmpty()) {
            lines.add(line);
        }
        recursive(lines, new HashMap<>(), 0);
    }

    public static int recursive(List<String> lines, Map<String, Integer> map, int i) {
        while (i < lines.size()) {
            if (lines.get(i).equals("{")) {
                i = recursive(lines, new HashMap<>(map), i + 1);
            } else if (lines.get(i).equals("}"))
                return i+1;
            else {
                String[] splitLines = lines.get(i).split("=");
                int a = 0;
                if (map.containsKey(splitLines[1])) {
                    map.put(splitLines[0], map.get(splitLines[1]));
                    System.out.println(map.get(splitLines[1]));
                } else {
                    try {
                        a = Integer.parseInt(splitLines[1]);
                    } catch (NumberFormatException e) {
                        a = 0;
                        System.out.println(0);
                    } finally {
                        map.put(splitLines[0], a);
                    }
                }
                i++;
            }
        }
        return i;
    }
}
