public class DiamondExercises {

    public void isoscelesTriangle(int n){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                stringBuilder.append(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                stringBuilder.append("*");
            }
            stringBuilder.append("\n");
        }
        System.out.print(stringBuilder.toString());
    }

    public void diamond(int n){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n ; i++){
            for (int j = 0; j < n - i - 1; j++) {
                stringBuilder.append(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                stringBuilder.append("*");
            }
            stringBuilder.append("\n");
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n - i - 1; j++) {
                stringBuilder.append(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                stringBuilder.append("*");
            }
            stringBuilder.append("\n");
        }
        System.out.print(stringBuilder.toString());
    }


    public void diamondWithName(int n, String name) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++) {
                stringBuilder.append(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                stringBuilder.append("*");
            }
            stringBuilder.append("\n");
        }
        stringBuilder.append(name + "\n");
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n - i - 1; j++) {
                stringBuilder.append(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                stringBuilder.append("*");
            }
            stringBuilder.append("\n");
        }
        System.out.print(stringBuilder.toString());
    }

}
