public class TriangleExercises {

    public void printOneAsterisk(){
        System.out.println("*");
    }

    public void horizontalLine(int n){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append("*");
        }
        System.out.println(stringBuilder.toString());
    }

    public void verticalLine(int n){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append("*\n");
        }
        System.out.println(stringBuilder.toString());
    }

    public void rightTriangle(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                stringBuilder.append("*");
            }
            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder.toString());
    }

}
