public class Minesweeper {

    public static void main(String[] args) {
        
        int width = Integer.parseInt(args[0]);
        int height = Integer.parseInt(args[1]);
                        
        int args_control = width * height;
        if (args.length -2 != args_control) {
            System.out.println( "ERROR: " + args_control +  " fields expected, but " + (args.length -2 )+ " specified");
            return;
        }

        int[][] field = new int[height][width];
        int mineCount = 0;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                field[i][j] = Integer.parseInt(args[2 + i * width + j]);
                if (field[i][j] == 1) {
                    mineCount++;
                }
            }
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (field[i][j] == 1) {
                    System.out.print("x ");
                } else {
                    int count = 0;
                    for (int y = Math.max(0, i - 1); y < Math.min(height, i + 2); y++) {
                        for (int x = Math.max(0, j - 1); x < Math.min(width, j + 2); x++) {
                            if (field[y][x] == 1) {
                                count++;
                            }
                        }
                    }
                    System.out.print(count + " ");
                }
            }
            System.out.println();
        }

        System.out.println(height * width + " fields, " + mineCount + " mines");
    }
}
