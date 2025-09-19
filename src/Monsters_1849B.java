import java.util.Arrays;

public class Monsters_1849B {
    public static void main(String[] args) throws Exception {

        FastScanner fs = new FastScanner();
        int t = fs.nextInt();

        while (t-- > 0) {
            int n = fs.nextInt();
            int k = fs.nextInt();

            Monsters[] monsters = new Monsters[n];
            for (int i = 0; i < n; i++) {
                int temp = fs.nextInt();

                if (temp % k == 0) {
                    monsters[i] = new Monsters(k, i + 1);
                } else {
                    monsters[i] = new Monsters(temp % k, i + 1);
                }
            }

            Arrays.sort(monsters);

            for (int i = 0; i < n - 1; i++) {
                System.out.print(monsters[i].index + " ");
            }
            System.out.println(monsters[n - 1].index);
        }
    }
}

class Monsters implements Comparable<Monsters> {
    int health;
    int index;

    Monsters(int health, int index) {
        this.health = health;
        this.index = index;
    }

    @Override
    public int compareTo(Monsters other) {
        if (this.health != other.health) {
            return other.health - this.health;
        } else {
            return this.index - other.index;
        }
    }
}